<%--
  Created by IntelliJ IDEA.
  User: lw_cs
  Date: 2019/8/9
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8">
    <title>区间运行时分编辑</title>
    <style>

        body{background-color: #2D2D2D}
        .link{
            color: #41F18D;
            text-decoration: none;

            font-size: 30px;
            font-weight: bold;

        }
        #div1  {

            width: 250px;
            height: 80px;
            position: absolute;
            top: 20%;
            left: 0;
            right: 0;
            margin: auto;
        }
        #div2{
            background-color: #41F18D;
            width: 500px;
            height: 300px;
            position: absolute;
            top: 28%;
            left: 0;
            right: 0;
            margin: auto;
        }

        #div1 a:hover{
            color: orange;
        }
    </style>
</head>
<body>
<div id="div1"><a href="/edit"  class="link">区间运行时分编辑</a></div>
<div id="div2">

</div>

<!-- 背景div -->
<div id="mydiv" style="height:500px;"></div>
<script type="text/javascript">
    window.onload = function() {
        //配置
        var config = {
            vx: 4,	//小球x轴速度,正为右，负为左
            vy: 4,	//小球y轴速度
            height: 2,	//小球高宽，其实为正方形，所以不宜太大
            width: 2,
            count: 200,		//点个数
            color: "121, 162, 185", 	//点颜色
            stroke: "130,255,255", 		//线条颜色
            dist: 6000, 	//点吸附距离
            e_dist: 20000, 	//鼠标吸附加速距离
            max_conn: 10 	//点到点最大连接数
        }

        //调用
        CanvasParticle(config);
    }
</script>
<script type="text/javascript" src="/js/canvas-particle.js"></script>
</body>
</html>