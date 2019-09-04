layui.define(["form", "layer", "jquery","table"], function (exports) {
    var form = layui.form,
        $ = layui.jquery,
        table = layui.table,
        layer = layui.layer;

    var common = {
        /**
         * 项目url
         * @returns {string}
         */
        basePath: function () {
            return "http://localhost:88";
        },
        /**
         * 时间戳格式化函数
         * @param  {string} format    格式
         * @param  {int}    timestamp 要格式化的时间 默认为当前时间
         * @return {string}           格式化的时间字符串
         */
        myFormataDate: function (timestamp) {
            if (timestamp == null) {
                return "";
            }
            var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
            Y = date.getFullYear() + '-';
            M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
            D = date.getDate() + ' ';
            h = date.getHours() + ':';
            m = date.getMinutes() + ':';
            s = date.getSeconds();
            return Y + M + D + h + m + s;//时分秒可以根据自己的需求加上
        },
        /**
         * 弹窗提示
         * @param msg
         * @param iconIndex
         */
        alert: function (msg, iconIndex) {
            layer.alert(msg, {icon: iconIndex, title: "提示信息", offset: "t"});
        },
        topAlert: function (msg, iconIndex) {
            top.layer.alert(msg, {icon: iconIndex, title: "提示信息", offset: "t"});
        },
        msg: function (msg, code) {
            top.layer.msg(msg, {icon: code == 0 ? 1 : 2, timeout: 2000, offset: "rt"});
        },
        topMsg: function (msg, code) {
            top.layer.msg(msg, {icon: code == 0 ? 1 : 2, timeout: 2000, offset: "rt"});
        },
        /**
         * ajax封装
         * @param url
         * @param data
         * @param success
         * @param cache
         * @param async
         * @param type
         * @param dataType
         * @param timeout
         * @param error
         */
        ajax: function (url, data, success, cache, async, type, dataType, timeout, error) {
            var index;
            var cache = cache || false;//浏览器历史缓存
            var alone = alone || false;//独立提交（一次有效的提交）
            var type = type || 'post';//请求类型
            var dataType = dataType || 'json';//接收数据类型
            var timeout = timeout || 1000;
            //error(xhr,status,error) 	如果请求失败要运行的函数。
            var error = function (xhr, textStatus, errorThrown) {
                setTimeout(function () {
                    console.log("--------------------------------------" + xhr.status);
                    switch (xhr.status) {
                        case(500):
                            common.alert("服务器系统内部错误", 2);
                            break;
                        case(404):
                            common.alert("404没有找到", 2);
                            break;
                        default:
                            common.alert("未知错误", 2);
                    }
                }, 500);
            };
            //complete(xhr,status) 	请求完成时运行的函数（在请求成功或失败之后均调用，
            // 即在 success 和 error 函数之后）。
            var complete = function (xhr, status) {
                layer.close(index);
                if (status == "success") {
                    var response = JSON.parse(xhr.responseText);
                    if (response.code != 0) {
                        common.alert(response.msg, 2);
                    }
                }
            };
            //beforeSend(xhr) 	发送请求前运行的函数。
            var beforeSend = function (xhr) {
                try {
                    index = layer.load();
                } catch (e) {
                    xhr.abort();
                }
              //common.msg("Ajax,请求前")
            };
            $.ajax({
                //url 	规定发送请求的 URL。默认是当前页面。
                'url': common.basePath() + url,
                //data 	规定要发送到服务器的数据。
                'data': data,
                //type 	规定请求的类型（GET 或 POST）。
                'type': type,
                //contentType 	发送数据到服务器时所使用的内容类型。
                // 默认是："application/x-www-form-urlencoded"。
                'contentType': 'application/json',
                //timeout 	设置本地的请求超时时间（以毫秒计）。
                'timeout': timeout,
                //dataType 	预期的服务器响应的数据类型。
                'dataType': dataType,
                //async 	布尔值，表示请求是否异步处理。默认是 true。
                'async': async,
                //success(result,status,xhr) 	当请求成功时运行的函数。
                'success': success,
                // 成功失败后均调用
                'complete': complete,
                //error(xhr,status,error) 	如果请求失败要运行的函数。
                'error': error,
                //jsonpCallback 	在一个 jsonp 中规定回调函数的名称。
                'jsonpCallback': 'jsonp' + (new Date()).valueOf().toString().substr(-4),
                //beforeSend(xhr) 	发送请求前运行的函数。
                'beforeSend': beforeSend,
            });
        },
        //post方式提交
        post: function (url, data, cache, async, success) {
            console.log("--------------------------------------" + data);
            common.ajax(url, data, success, cache, async, 'post', 'json');
        },
        //get方式提交
        get: function (url, cache, async, success) {
            common.ajax(url, {}, success, cache, async, 'get', 'json');
        },
        //下载方式
        download: function (url, data, timeout, success) {
            common.ajax(url, data, success, false, true, 'post', 'json', timeout);
        },
        //根据字符长计算控件长度
        getWidth: function (text) {
            var width = "100px";
            if (text != null) {
                var splits = text.split("");
                var strlen = 0;
                for (var i = 0; i < splits.length; i++) {
                    if (splits[i].charCodeAt(i) > 255) {
                        //如果是汉字，则字符串长度加2
                        strlen += 2;
                    } else {
                        strlen++;
                    }
                }
                width = strlen * 14;
                if (width < 100) {
                    width = "100px";
                } else {
                    width = width + "px";
                }
            }
            return width;
        },
        //加载动画
        load: function () {
            var index = layer.load();
            return index;
        },
        //关闭动画
        closeLoad: function (index) {
            layer.close(index);
        },
        //表单序列化
        serializeForm: function (form) {
            var obj = new Object();
            $.each(form.serializeArray(), function (index, param) {
                if (!(param.name in obj)) {
                    obj[param.name] = param.value;
                }
            });
            return obj;
        },
        S4: function () {
            return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);
        },
        /**
         * 用于生成uuid
         * @returns {string}
         */
        guid: function () {
            return (common.S4() + common.S4() + common.S4() + common.S4() + common.S4() + common.S4() + common.S4() + common.S4());
        },
        /**
         * 将日期格式化成指定格式的字符串
         * @param date 要格式化的日期，不传时默认当前时间，也可以是一个时间戳
         * @param fmt 目标字符串格式，支持的字符有：y,M,d,q,w,H,h,m,S，默认：yyyy-MM-dd HH:mm:ss
         * @returns 返回格式化后的日期字符串
         *  formatDate(); // 2016-09-02 13:17:13
         *  formatDate(new Date(), 'yyyy-MM-dd'); // 2016-09-02
         *  // 2016-09-02 第3季度 星期五 13:19:15:792
         *  formatDate(new Date(), 'yyyy-MM-dd 第q季度 www HH:mm:ss:SSS');
         *  formatDate(1472793615764); // 2016-09-02 13:20:15
         */
        formatDate: function (date, fmt) {
            if (date == '无') {
                return '无';
            }
            date = date == undefined ? new Date() : date;
            date = typeof date == 'number' ? new Date(date) : date;
            fmt = fmt || 'yyyy-MM-dd HH:mm:ss';
            var obj =
                {
                    'y': date.getFullYear(), // 年份，注意必须用getFullYear
                    'M': date.getMonth() + 1, // 月份，注意是从0-11
                    'd': date.getDate(), // 日期
                    'q': Math.floor((date.getMonth() + 3) / 3), // 季度
                    'w': date.getDay(), // 星期，注意是0-6
                    'H': date.getHours(), // 24小时制
                    'h': date.getHours() % 12 == 0 ? 12 : date.getHours() % 12, // 12小时制
                    'm': date.getMinutes(), // 分钟
                    's': date.getSeconds(), // 秒
                    'S': date.getMilliseconds() // 毫秒
                };
            var week = ['天', '一', '二', '三', '四', '五', '六'];
            for (var i in obj) {
                fmt = fmt.replace(new RegExp(i + '+', 'g'), function (m) {
                    var val = obj[i] + '';
                    if (i == 'w') return (m.length > 2 ? '星期' : '周') + week[val];
                    for (var j = 0, len = val.length; j < m.length - len; j++) val = '0' + val;
                    return m.length == 1 ? val : val.substring(val.length - m.length);
                });
            }
            return fmt;
        },
        /**
         * 将字符串解析成日期
         * @param str 输入的日期字符串，如'2014-09-13'
         * @param fmt 字符串格式，默认'yyyy-MM-dd'，支持如下：y、M、d、H、m、s、S，不支持w和q
         * @returns 解析后的Date类型日期
         * parseDate('2016-08-11'); // Thu Aug 11 2016 00:00:00 GMT+0800
         * parseDate('2016-08-11 13:28:43', 'yyyy-MM-dd HH:mm:ss') // Thu Aug 11 2016 13:28:43 GMT+0800
         */
        parseDate: function (str, fmt) {
            fmt = fmt || 'yyyy-MM-dd';
            var obj = {y: 0, M: 1, d: 0, H: 0, h: 0, m: 0, s: 0, S: 0};
            fmt.replace(/([^yMdHmsS]*?)(([yMdHmsS])\3*)([^yMdHmsS]*?)/g, function (m, $1, $2, $3, $4, idx, old) {
                str = str.replace(new RegExp($1 + '(\\d{' + $2.length + '})' + $4), function (_m, _$1) {
                    obj[$3] = parseInt(_$1);
                    return '';
                });
                return '';
            });
            obj.M--; // 月份是从0开始的，所以要减去1
            var date = new Date(obj.y, obj.M, obj.d, obj.H, obj.m, obj.s);
            if (obj.S !== 0) date.setMilliseconds(obj.S); // 如果设置了毫秒
            return date;
        },
        /**
         * 将一个日期格式化成友好格式，比如，1分钟以内的返回“刚刚”，
         * 当天的返回时分，当年的返回月日，否则，返回年月日
         * @param {Object} date
         */
        formatDateToFriendly: function (date) {
            date = date || new Date();
            date = typeof date === 'number' ? new Date(date) : date;
            var now = new Date();
            if ((now.getTime() - date.getTime()) < 60 * 1000) return '刚刚'; // 1分钟以内视作“刚刚”
            var temp = this.formatDate(date, 'yyyy年M月d');
            if (temp == this.formatDate(now, 'yyyy年M月d')) return this.formatDate(date, 'HH:mm');
            if (date.getFullYear() == now.getFullYear()) return this.formatDate(date, 'M月d日');
            return temp;
        },
        /**
         * 将一段时长转换成友好格式，如：
         * 147->“2分27秒”
         * 1581->“26分21秒”
         * 15818->“4小时24分”
         * @param {Object} second
         */
        formatDurationToFriendly: function (second) {
            if (second < 60) return second + '秒';
            else if (second < 60 * 60) return (second - second % 60) / 60 + '分' + second % 60 + '秒';
            else if (second < 60 * 60 * 24) return (second - second % 3600) / 60 / 60 + '小时' + Math.round(second % 3600 / 60) + '分';
            return (second / 60 / 60 / 24).toFixed(1) + '天';
        },
        /**
         * 判断某一年是否是闰年
         * @param year 可以是一个date类型，也可以是一个int类型的年份，不传默认当前时间
         */
        isLeapYear: function (year) {
            if (year === undefined) year = new Date();
            if (year instanceof Date) year = year.getFullYear();
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        },
        /**
         * 获取某一年某一月的总天数，没有任何参数时获取当前月份的
         * 方式一：$.getMonthDays();
         * 方式二：$.getMonthDays(new Date());
         * 方式三：$.getMonthDays(2013, 12);
         */
        getMonthDays: function (date, month) {
            var y, m;
            if (date == undefined) date = new Date();
            if (date instanceof Date) {
                y = date.getFullYear();
                m = date.getMonth();
            } else if (typeof date == 'number') {
                y = date;
                m = month - 1;
            }
            var days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]; // 非闰年的一年中每个月份的天数
            //如果是闰年并且是2月
            if (m == 1 && this.isLeapYear(y)) return days[m] + 1;
            return days[m];
        },
        /**
         * 计算2日期之间的天数，用的是比较毫秒数的方法
         * 传进来的日期要么是Date类型，要么是yyyy-MM-dd格式的字符串日期
         * @param date1 日期一
         * @param date2 日期二
         */
        countDays: function (date1, date2) {
            var fmt = 'yyyy-MM-dd';
            // 将日期转换成字符串，转换的目的是去除“时、分、秒”
            if (date1 instanceof Date && date2 instanceof Date) {
                date1 = this.format(fmt, date1);
                date2 = this.format(fmt, date2);
            }
            if (typeof date1 === 'string' && typeof date2 === 'string') {
                date1 = this.parse(date1, fmt);
                date2 = this.parse(date2, fmt);
                return (date1.getTime() - date2.getTime()) / (1000 * 60 * 60 * 24);
            } else {
                console.error('参数格式无效！');
                return 0;
            }
        },
        returnTips: function (text) {
            setTimeout(function () {
                layui.layer.tips(text, '.layui-layer-setwin .layui-layer-close', {
                    tips: 3
                });
            }, 500);
        },
        /**
         * 改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
         * @param index
         */
        resizeLayer: function (index) {
            $(window).on("resize", function () {
                layui.layer.full(index);
            })
        },
        /**
         * 字典数据
         * @param dictTypeCode
         * @param elem
         */
        getDictData: function (dictTypeCode, elem) {
            var params = new Object();
            params.dictTypeCode = dictTypeCode;
            params.status = '0';
            common.post("/dictData/getDictDatas", JSON.stringify(params), false, true, function (res) {
                if (res.code == 0) {
                    var data = res.data;
                    var html = "";
                    for (var i = 0; i < data.length; i++) {
                        if (data[i].checkflag == '0') {
                            html += "<option value='" + data[i].dictValue + "' selected>" + data[i].dictName + "</option>"
                        } else {
                            html += "<option value='" + data[i].dictValue + "'>" + data[i].dictName + "</option>"
                        }
                    }
                    elem.append(html);
                    form.render();
                }
            });
        },
        color16:function (){//十六进制颜色随机
        var r = Math.floor(Math.random()*256);
        var g = Math.floor(Math.random()*256);
        var b = Math.floor(Math.random()*256);
        var color = '#'+r.toString(16)+g.toString(16)+b.toString(16);
        return color;
        },
        getConsole: function (elem) {
            common.get("/console", false, true, function (res) {
                if (res.code == 0) {
                    var data = res.data;
                    var html = "";
                    for (var i = 0; i < data.length; i++) {
                        html += "<option value='" + data[i].consoleid + "'>" + data[i].consolename + "</option>";
                    }
                    elem.append(html);
                    form.render();
                }
            });
        }

    };
    exports("common", common);
});