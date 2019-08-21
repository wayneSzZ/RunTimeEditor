layui.config({
    base: "../js/"
}).extend({
    common: "common"
}).use(['form', 'layer', 'common', 'table', 'laydate'], function () {
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        laydate = layui.laydate,
        table = layui.table,
        commonUtils = layui.common;

    /*
    * 初始化界面
    * */

    /*
    * 获取台号列表
    * */
    window.getConsole = function (elem) {
        commonUtils.get("/console", false, true, function (res) {
            alert("初始化台",6);
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
    };
    /*
    * 获取车站列表
    * */
    window.getStation = function (consoleId,elem) {
        var params = new Object();
        params.consoleId = consoleId;
        params.status = '0';
        commonUtils.post("/station",JSON.stringify(params),false,true,function (res) {
            if(res.code==0){
                var data = res.data;
                var html = "<option value='0' selected>全部</option>";
                for(var i = 0; i < data.length; i++){
                    html += "<option value='"+data[i].stationid+"'>"+data[i].staionname+"</option>"
                }
                elem.empty();
                elem.append(html);
                form.render();
            }
        });
    };
    window.initData = function(){

        getConsole($('#consoleId'));
        getStation(1,$('#stationId'));
    }
    initData();

/*    $("#consoleId").change(function () {
        var options=$("#consoleId option:selected ");

        var consoleId =  options.val();
        alert(consoleId,1);
        getStation(consoleId,$('.stationId'));
    });*/

    /*
    * 调度台下拉条改变时，车站列表同时刷新
    * */
    form.on('select(consoleFilter)', function(data){
        var options=$("#consoleId option:selected ");

        var consoleId =  options.val();

        getStation(consoleId,$('#stationId'));
    });



    /*
    * 保存区间运行时分到磁盘
    * */
    $("#saveruntime").click(function () {
        var param = new Object();
        param.status = 0;
        commonUtils.post("/saveruntime",JSON.stringify(param),false,true,function (res) {
            if (res.code == 0){
                commonUtils.alert("保存成功",6);
            }
        })
    })

    /*
    * 点击查询按钮，查询区间运行时分，以table方式展现
    * */
    $("#selectBtn").click(function () {

        var options = $("#consoleId option:selected");
        var consoleId = options.val();
        options = $("#stationId option:selected");
        var stationId = options.val();
        var param = new Object();
        param.consoleId = consoleId;
        param.stationId = stationId;
        param.status = '0';
        var html = '';
        commonUtils.post("/runtime",JSON.stringify(param),false,true,function (res) {
            if(res.code == 0){
                var runtimes = res.data;
                var color1 = "#d9d6c3";
                var color2 = "#d1c7b7";
                var color3 = "#73b9a2";
                var color4 = "#65c294";
                for (i=0; i<runtimes.length ;i++){
                    switch((Math.floor(i/8)%4)) {
                        case 0:html+= '<tr style="background-color: '+color1+'">' ; break;
                        case 1:html+= '<tr style="background-color: '+color2+'">';  break;
                        case 2:html+= '<tr style="background-color: '+color3+'">';  break;
                        case 3:html+= '<tr style="background-color: '+color4+'">';  break;
                    }

                    html+='<td >'+runtimes[i].absname+'</td>'
                    html+='<td >'+runtimes[i].absnumber+'</td>'
                    html+='<td >'+runtimes[i].inentry+'</td>'
                    html+='<td >'+runtimes[i].fromstaid+'</td>'
                    html+='<td >'+runtimes[i].fromstaname+'</td>'
                    html+='<td >'+runtimes[i].tostaname+'</td>'
                    html+='<td >'+runtimes[i].tostaid+'</td>'
                    html+='<td >'+runtimes[i].outentry+'</td>'
                    switch (runtimes[i].absdirection) {
                        case 0 : html+='<td >上行</td>'; break;
                        case 1 : html+='<td >下行</td>'; break;
                        case 3 : html+='<td >双向</td>'; break;

                    }
                    switch (runtimes[i].traintype) {
                        case 0: html+='<td >特快客</td>';break;
                        case 1: html+='<td >普快客</td>';break;
                        case 2: html+='<td >普通客</td>';break;
                        case 3: html+='<td >临时客</td>';break;
                        case 4: html+='<td >货车</td>';break;
                        case 5: html+='<td >动车</td>';break;
                        case 6: html+='<td >特快货</td>';break;
                        case 7: html+='<td >快速货</td>';break;

                    }

                    html+='<td><input type="text"   value='+runtimes[i].stoptime+'></td>'
                    html+='<td><input type="text"   value='+runtimes[i].starttime+'></td>'
                    html+='<td><input type="text"   value='+runtimes[i].runtime+'></td>'
                    switch (runtimes[i].runtimedirection) {
                        case 0:html+='<td >上</td>';break;
                        case 1:html+='<td >下</td>';break;
                    }

                    html+= '</tr >';
                }
                $("#tbody").empty();
                $("#tbody").append(html);
                form.render();

            }
        })
    })

    /*
    * ？？？
    * */
    table.on('row(test)', function(obj){
        var data = obj.data;

        layer.alert(JSON.stringify(data), {
            title: '当前行数据：'
        });

        //标注选中样式
        obj.tr.addClass('layui-table-click').siblings().removeClass('layui-table-click');
    });


    /*
    * 输入框聚焦事件
    * */
    $("body").delegate("input",
        "focus",
        function () {
            $(this).css("color","#FF4500");
        });

    /*
   * 输入框失去焦点事件
   * */
    $("body").delegate("input",
        "blur",
        function () {
            $(this).css("color","#3399FF");
        });

    /*
   * 输入框值改变事件
   *
   * */
    $("body").delegate("input",
        "change",
        function () {
            var absnumber = $(this).parent().parent().children().eq(1).html();
            var _traintype = $(this).parent().parent().children().eq(9).html();
            switch (_traintype) {
                case "特快客": var traintype=0;break;
                case "普快客": var traintype=1;break;
                case "普通客": var traintype=2;break;
                case "临时客": var traintype=3;break;
                case "货车": var traintype=4;break;
                case "动车": var traintype=5;break;
                case "特快货": var traintype=6;break;
                case "快速货": var traintype=7;break;
            }
            var stoptime = $(this).parent().parent().children().eq(10).children().val();
            var starttime = $(this).parent().parent().children().eq(11).children().val();
            var runtime = $(this).parent().parent().children().eq(12).children().val();
            var _runtimedirection = $(this).parent().parent().children().eq(13).html();
            switch (_runtimedirection) {
                case "上": var runtimedirection =0 ; break;
                case "下": var runtimedirection =1 ; break;

            }
            var param = new Object();
            param.absnumber = absnumber;
            param.traintype = traintype;
            param.stoptime = stoptime;
            param.starttime = starttime;
            param.runtime = runtime;
            param.runtimedirection = runtimedirection;
            commonUtils.post("/changeruntime?"+Math.random(),JSON.stringify(param),false,true,function () {

            })

        });

/*
    $("input").focus(function(){
        $(this).css("color","#FF4500");


    });
    $("input").blur(function(){
        $(this).css("color","#3399FF");

    });
*/

    window.closePage = function(){
    };



});




