loadMap = function(){
    var map = new BMap.Map("map");
    var point = new BMap.Point(120.384428184,36.1052149013);
    map.centerAndZoom(point, 12);
    map.addControl(new BMap.ScaleControl({anchor: BMAP_ANCHOR_TOP_LEFT}));//左上角添加比例尺
    map.addControl(new BMap.NavigationControl());//左上角添加缩放
    map.enableScrollWheelZoom();//添加鼠标滚轮缩放，默认禁用
    // var marker = new BMap.Marker(e.point);
    // map.addOverlay(marker);
    // map.addEventListener("click", function(e){
    //     var marker = new BMap.Marker(e.point);
    //     map.addOverlay(marker);
    //     var opts = {
    //         width: 100,
    //         height: 50,
    //         title: e.point.lng+", "+e.point.lat
    //     };
    //     map.openInfoWindow(new BMap.InfoWindow("", opts), e.point);
    //     // marker.addEventListener()
    // });
    return map;
};

traffic_monitoring = function (){

    var data = {"time": "2020-01-06 08:00", data: [{"num": 3.2, "data": [[120.396788867812724, 36.1027653], [120.39635768, 36.0969328]]}]};
    var map = loadMap();
    var points = [
        new BMap.Point(120.39678886, 36.1027653),
        new BMap.Point(120.39635768, 36.0969328),
        new BMap.Point(120.39218954, 36.0968162)
    ];
    var polyline = new BMap.Polyline(points, {
        enableEditing: false,
        enableClicking: false,
        strokeWeight: '6',
        strokeOpacity: 0.8,
        strokeColor: "#18a45b"
    });
    map.addOverlay(polyline);
    document.getElementById("show_data").innerHTML = " <h5 id='show_data' style='text-align: center;'>全市各区拥堵指数</h5>" +
        "<br/><table width=\"100%\" border=\"0\" cellspacing=\"1\" bgcolor=\"#eeeeee\" style='font-size: 14px;text-align: left; border-width: 1px;\n" +
        "    border-color: #666666;\n" +
        "    border-collapse: collapse;'>\n" +
        "<tr>\n" +
        "<th bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>区域</th><th bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>拥堵指数</th>\n" +
        "</tr>\n" +
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>市南区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>市北区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>黄岛区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>崂山区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>李沧区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>四方区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>城阳区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>平度市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>胶州市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>即墨市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>莱西市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>胶南市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "</table>\n";



    document.getElementById("graphTitle").innerText = name+"城市流量监测数据";
    document.getElementById("history").innerHTML = "拥堵指数趋势图";

};
drawArea = function(data, map){
    var area = data.split("-")[0];
    var color = data.split("-")[1];
    var bdary = new BMap.Boundary();
    bdary.get(area, function(rs){
        var count = rs.boundaries.length;
        for(var c=0;c<count;c++){
            var ply = new BMap.Polygon(rs.boundaries[c], {strokWeight: 2, strokeColor: color, fillOpacity: 0.3, fillColor:color});
            map.addOverlay(ply);
        }
    })
};
traffic_index = function(){
   
    document.getElementById("show_data").innerHTML = " <h5 id='show_data' style='text-align: center;'>全市事故与违法数</h5>" +
        "<br/><table width=\"100%\" border=\"0\" cellspacing=\"1\" bgcolor=\"#eeeeee\" style='font-size: 14px;text-align: left; border-width: 1px;\n" +
        "    border-color: #666666;\n" +
        "    border-collapse: collapse;'>\n" +
        "<tr>\n" +
        "<th bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>区域</th><th bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>事故数</th><th bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>违法数</th>\n" +
        "</tr>\n" +
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>市南区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>15</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>16</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>市北区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>12</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>22</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>黄岛区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>16</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>21</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>崂山区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>13</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>18</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>李沧区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>9</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>15</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>四方区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>9</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>17</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>城阳区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>10</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>19</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>平度市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>6</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>27</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>胶州市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>15</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>26</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>即墨市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>8</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>28</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>莱西市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>7</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>27</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>胶南市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>26</td></tr>"+
        "</table>\n" +
        "<div style='margin-top: 10px;margin-left: 10px;'><a href=\"/Accident_illegal\" class=\"mb-1 btn btn-success\" width='100%'>查看数据详情</a></div>";
    var map = loadMap();
    var areas = ["青岛市城阳区-#FF0000", "青岛市黄岛区-#000080", "青岛市即墨区-#DC143C", "胶南市-#DC143C", "胶州市-#FFFF00", "莱西市-#FFFF00"
        , "青岛市李沧区-#000080", "平度市-#000080", "青岛市市北区-#DC143C", "青岛市市南区-#DC143C", "青岛市四方区-#FFFF00", "青岛市崂山区-#FFFF00"];
    for(var i=0;i<areas.length;i++){
        drawArea(areas[i], map);
    }

    document.getElementById("graphTitle").innerText = name+"城市交通指数监测";
    document.getElementById("history").innerText = name+"区域交通指数历史数据";
};
traffic_vehicle = function(){
    document.getElementById("show_data").innerHTML = " <h5 id='show_data' style='text-align: center;'>车辆迁移数据展示</h5>" +
        "<br/><table width=\"100%\" border=\"0\" cellspacing=\"1\" bgcolor=\"#eeeeee\" style='font-size: 14px;text-align: left; border-width: 1px;\n" +
        "    border-color: #666666;\n" +
        "    border-collapse: collapse;'>\n" +
        "<tr>\n" +
        "<th bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>区域</th><th bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>迁入</th><th bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>迁出</th>\n" +
        "</tr>\n" +
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>市南区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>5</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>6</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>市北区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>5</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>6</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>黄岛区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>5</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>6</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>崂山区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>5</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>6</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>李沧区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>5</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>6</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>四方区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>5</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>6</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>城阳区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>5</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>6</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>平度市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>5</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>6</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>胶州市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>5</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>6</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>即墨市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>5</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>6</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>莱西市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>5</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>6</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>胶南市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>5</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>6</td></tr>"+
        "</table>\n";



    var map = loadMap();
    var areas = ["青岛市城阳区-#FF0000", "青岛市黄岛区-#000080", "青岛市即墨区-#DC143C", "胶南市-#DC143C", "胶州市-#FFFF00", "莱西市-#FFFF00"
        , "青岛市李沧区-#000080", "平度市-#000080", "青岛市市北区-#DC143C", "青岛市市南区-#DC143C", "青岛市四方区-#FFFF00", "青岛市崂山区-#FFFF00"];
    for(var i=0;i<areas.length;i++){
        drawArea(areas[i], map);
    }

    document.getElementById("graphTitle").innerText = name+"城市交通指数监测";
    document.getElementById("history").innerText = name+"区域交通指数历史数据";
};
people_statistic = function(){
    alert("功能暂未开放");
};
illegal_statistic = function(){
    document.getElementById("show_data").innerHTML = " <h5 id='show_data' style='text-align: center;'>流量异常重点区域</h5>" +
        "<br/><table width=\"100%\" border=\"0\" cellspacing=\"1\" bgcolor=\"#eeeeee\" style='font-size: 14px;text-align: left; border-width: 1px;\n" +
        "    border-color: #666666;\n" +
        "    border-collapse: collapse;'>\n" +
        "<tr>\n" +
        "<th bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>区域</th><th bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>重点区域数</th>\n" +
        "</tr>\n" +
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>市南区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>56</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>市北区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>40</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>黄岛区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>47</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>崂山区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>70</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>李沧区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>30</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>四方区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>40</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>城阳区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>38</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>平度市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>49</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>胶州市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>56</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>即墨市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>57</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>莱西市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>56</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>胶南市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>45</td></tr>"+
        "</table>\n"+
        "<div style='margin-top: 10px;margin-left: 10px;'><a href=\"/keyArea\" class=\"mb-1 btn btn-success\" width='100%' onclick=''>查看数据详情</a></div>";


    var map = loadMap();
    var points = [
        {"lng":120.34,"lat":36.14,"count":Math.round(Math.random()*100)},
        {"lng":120.50,"lat":36.14,"count":Math.round(Math.random()*100)},
        {"lng":120.34,"lat":36.10,"count":Math.round(Math.random()*100)},
        {"lng":120.50,"lat":36.10,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)}
    ];
    heamapOverlay = new BMapLib.HeatmapOverlay({"radius": 20});
    map.addOverlay(heamapOverlay);
    heamapOverlay.setDataSet({data: points, max: 100});
    heamapOverlay.show();
    document.getElementById("graphTitle").innerText = name+"城市违法统计";
    document.getElementById("history").innerText = name+"违法记录历史数据";

};
accident_statistic = function(){
    document.getElementById("show_data").innerHTML = " <h5 id='show_data' style='text-align: center;'>全市可用停车场</h5>" +
        "<br/><table width=\"100%\" border=\"0\" cellspacing=\"1\" bgcolor=\"#eeeeee\" style='font-size: 14px;text-align: left; border-width: 1px;\n" +
        "    border-color: #666666;\n" +
        "    border-collapse: collapse;'>\n" +
        "<tr>\n" +
        "<th bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>区域</th><th bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>停车场数</th>\n" +
        "</tr>\n" +
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>市南区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>市北区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>黄岛区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>崂山区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>李沧区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>四方区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>城阳区</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>平度市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>胶州市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>即墨市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>莱西市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "<tr><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;'>胶南市</td><td bgcolor=\"#FFFFFF\" style='padding: 5px 5px;text-align: center;'>5</td></tr>"+
        "</table>\n"+
        "<div style='margin-top: 10px;margin-left: 10px;'><a href='/avaParkLot' class=\"mb-1 btn btn-success\" width='100%'>查看数据详情</a></div>";

    document.getElementById("map").innerHTML="";
    document.getElementById("map").style = "height: 350px; width: 100%";
    var map = loadMap();
    var points = [
        {"lng":120.34,"lat":36.14,"count":Math.round(Math.random()*100)},
        {"lng":120.50,"lat":36.14,"count":Math.round(Math.random()*100)},
        {"lng":120.34,"lat":36.10,"count":Math.round(Math.random()*100)},
        {"lng":120.50,"lat":36.10,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)},
        {"lng":120.34+Math.random()*0.16,"lat":36.14+Math.random()*0.04,"count":Math.round(Math.random()*100)}
    ];
    heamapOverlay = new BMapLib.HeatmapOverlay({"radius": 10});
    map.addOverlay(heamapOverlay);
    heamapOverlay.setDataSet({data: points, max: 100});
    heamapOverlay.show();
    document.getElementById("graphTitle").innerText = name+"城市事故统计";
    document.getElementById("history").innerText = name+"事故记录历史数据";
};
car_transfer = function(){
    document.getElementById("map").innerHTML="";
    document.getElementById("map").style = "height: 350px; width: 100%";
    document.getElementById("map").removeAttribute('_echarts_instance_');
    var myChart = echarts.init(document.getElementById("map"));
    var areas = ['城阳区', '黄岛区', '即墨市', '胶南市', '胶州市', '莱西市', '李沧区', '平度市', '市北区', '市南区', '四方区', '崂山区'];
    var data = [[0, 0, 3], [0, 1, 11], [0, 2, 8], [0, 3, 7], [0, 4, 5], [0, 5, 10], [0, 6, 11], [0, 7, 8], [0, 8, 1], [0, 9, 1], [0, 10, 6], [0, 11, 0], [1, 0, 0], [1, 1, 2], [1, 2, 8], [1, 3, 1], [1, 4, 11], [1, 5, 11], [1, 6, 3], [1, 7, 10], [1, 8, 6], [1, 9, 1], [1, 10, 2], [1, 11, 1], [2, 0, 9], [2, 1, 6], [2, 2, 2], [2, 3, 2], [2, 4, 9], [2, 5, 6], [2, 6, 8], [2, 7, 0], [2, 8, 11], [2, 9, 5], [2, 10, 5], [2, 11, 8], [3, 0, 2], [3, 1, 2], [3, 2, 5], [3, 3, 10], [3, 4, 8], [3, 5, 5], [3, 6, 8], [3, 7, 8], [3, 8, 1], [3, 9, 9], [3, 10, 4], [3, 11, 9], [4, 0, 5], [4, 1, 0], [4, 2, 6], [4, 3, 10], [4, 4, 8], [4, 5, 11], [4, 6, 1], [4, 7, 6], [4, 8, 9], [4, 9, 9], [4, 10, 6], [4, 11, 0], [5, 0, 1], [5, 1, 7], [5, 2, 1], [5, 3, 2], [5, 4, 4], [5, 5, 7], [5, 6, 0], [5, 7, 6], [5, 8, 1], [5, 9, 0], [5, 10, 2], [5, 11, 6], [6, 0, 0], [6, 1, 2], [6, 2, 9], [6, 3, 10], [6, 4, 7], [6, 5, 2], [6, 6, 7], [6, 7, 0], [6, 8, 1], [6, 9, 7], [6, 10, 9], [6, 11, 3], [7, 0, 0], [7, 1, 1], [7, 2, 4], [7, 3, 2], [7, 4, 2], [7, 5, 6], [7, 6, 11], [7, 7, 9], [7, 8, 9], [7, 9, 11], [7, 10, 10], [7, 11, 10], [8, 0, 1], [8, 1, 4], [8, 2, 9], [8, 3, 7], [8, 4, 0], [8, 5, 2], [8, 6, 10], [8, 7, 9], [8, 8, 6], [8, 9, 3], [8, 10, 5], [8, 11, 8], [9, 0, 7], [9, 1, 7], [9, 2, 5], [9, 3, 2], [9, 4, 3], [9, 5, 6], [9, 6, 1], [9, 7, 10], [9, 8, 3], [9, 9, 3], [9, 10, 8], [9, 11, 4], [10, 0, 6], [10, 1, 10], [10, 2, 0], [10, 3, 4], [10, 4, 7], [10, 5, 9], [10, 6, 8], [10, 7, 4], [10, 8, 10], [10, 9, 3], [10, 10, 7], [10, 11, 1], [11, 0, 0], [11, 1, 11], [11, 2, 0], [11, 3, 2], [11, 4, 0], [11, 5, 4], [11, 6, 0], [11, 7, 5], [11, 8, 3], [11, 9, 7], [11, 10, 10], [11, 11, 7]];
    data = data.map(function (item) {
        return [item[1], item[0], item[2] || '-'];
    });

    options = {
        tooltip: {
            position: 'top'
        },
        legend:{
            show: false
        },
        animation: false,
        grid: {
            height: '80%',
            top: '10%'
        },
        xAxis: {
            type: 'category',
            data: areas,
            axisLabel:{
                interval: 0
            },
            splitArea: {
                show: true
            }
        },
        yAxis: {
            type: 'category',
            data: areas,
            axisLabel:{
                interval: 0
            },
            splitArea: {
                show: true
            }
        },
        visualMap: {
            min: 0,
            max: 10,
            calculable: true,
            orient: 'horizontal',
            left: 'center',
            bottom: '5%'
        },
        series: [{
            name: 'Punch Card',
            type: 'heatmap',
            data: data,
            label: {
                show: true
            },
            emphasis: {
                itemStyle: {
                    shadowBlur: 10,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }]
    };
    myChart.setOption(option=options);
    document.getElementById("graphTitle").innerText = "车辆转移统计";
};
public_traffic = function(){
    alert("功能暂未开放");
};