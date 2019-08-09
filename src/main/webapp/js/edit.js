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

    window.initData = function(){

    }

    window.getConsole = function (elem) {
        commonUtils.get("/console", false, true, function (res) {
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


/*    $("#consoleId").change(function () {
        var options=$("#consoleId option:selected ");

        var consoleId =  options.val();
        alert(consoleId,1);
        getStation(consoleId,$('.stationId'));
    });*/

    form.on('select(consoleFilter)', function(data){
        var options=$("#consoleId option:selected ");

        var consoleId =  options.val();

        getStation(consoleId,$('.stationId'));
    });
    getStation(1,$('.stationId'))
    getConsole($('.consoleId'));

    initData();

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
                    html+='<td >'+runtimes[i].absdirection+'</td>'
                    html+='<td >'+runtimes[i].traintype+'</td>'
                    html+='<td><input type="text"   value='+runtimes[i].stoptime+'></td>'
                    html+='<td><input type="text"   value='+runtimes[i].starttime+'></td>'
                    html+='<td><input type="text"   value='+runtimes[i].runtime+'></td>'
                    html+='<td >'+runtimes[i].runtimedirection+'</td>'
                    html+= '</tr >';
                }
                $("#tbody").empty();
                $("#tbody").append(html);
                form.render();
            }
        })
    })

    table.on('row(test)', function(obj){
        var data = obj.data;

        layer.alert(JSON.stringify(data), {
            title: '当前行数据：'
        });

        //标注选中样式
        obj.tr.addClass('layui-table-click').siblings().removeClass('layui-table-click');
    });




    $("input").focus(function(){
        $(this).css("color","#FF4500");


    });
    $("input").blur(function(){
        $(this).css("color","#3399FF");


    });

    window.closePage = function(){
    };

    $('.close').click(function () {

    });

});




