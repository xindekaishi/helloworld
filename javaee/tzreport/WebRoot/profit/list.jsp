<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!doctype html>
<html>
  <head>
     <meta charset = "utf-8" />
     <title></title>
     <style type="text/css">
        body{height:670px;font-size:14px;font-family:"微软雅黑";}
     </style>
	 <%@include file="../common/taglib.jsp"%>
	 <%@include file="../common/common.jsp"%>
	 <!-- 引入分页插件 -->
	 <script type="text/javascript" src="../js/jquery.pagination.js"></script>	 
  </head>
  <body>
       <!-- 头部区域  -->
       <%@include file="../common/header.jsp"%>
		<!--中间内容-->
		<div id="mainContent">
			<!--右侧导航栏-->
			<div id="sidebar">
               <%@include file="../common/slider.jsp"%>
			</div>
			<!--内容区域-->
			<div id="content">
				<!--表格-->
				<div class="ta">
				<!--标题-->   
				<p class="ta_title">部门虹之玉排名</p>
				<!--日期-->
				<div class="ta_select">
<!-- 			     <span class="tase_span">日期</span> -->
<!-- 				 <div class="select"> -->
<!-- 					 <input type="text" placeholder="2015.5" class="ta_input"> -->
<!-- 				 </div> -->
                <a class="addprofit" href="http://localhost/tzreport/profit/add">添加收入</a>
	          	<select name="profitBean.typeId" id="typeId" class="text_box" onchange="tm_searchProfit(this,false)">
	          		<option value="">--请选择收入类型--</option>
	          		<c:forEach var="pt" items="${maps}">
	          			<option ${pt.id==profitBean.typeId ? 'selected="selected"':''}   value="${pt.id}">${pt.name}</option>
	          		</c:forEach>
	          	</select>
	          	&nbsp;&nbsp;&nbsp;&nbsp;金额范围:&nbsp;<input type="text" id="minMoney" class="range" placeholder="最小金额">&nbsp;到 &nbsp;<input type="text" class="range" id="maxMoney" placeholder="最大金额">
	          	<input type="button" class="searchMoney" value="搜索" onclick="tm_searchProfit(this,true)">               
				</div>
				<!--表格-->
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table">
				 <thead>
				  <tr class="ta_tr">
				   <td width="7%">ID</td>
				   <td width="14%">金额(元)</td>
				   <td width="12%">收入者</td>
				   <td width="15%">收入类型</td>
				   <td width="18%">收入时间</td>
				   <td width="18%">收入的描述</td>
				   <td width="16%">操作</td>		  
				  </tr>
				 </thead>
				 <tbody id="tbody">
<%-- 				<c:import url="listTemplate.jsp"></c:import> --%>
<%--				<jsp:include page="listTemplate.jsp"></jsp:include> --%>
					<c:forEach var="profit" items="${profitBeans}">
					  <tr class="tmui-items">
						<td>${profit.id}</td>
						<td>${profit.money}</td>
						<td>${profit.username}</td>						
						<td class="key">${profit.typeName}</td>
						<td>${tz:dateFormat2(profit.createTime,"yyyy-MM-dd HH:mm:ss")}</td>
						<td>${profit.description}</td>
						<td><a href="${basePath}/profit/add/${profit.id}" data-opid="${profit.id}">编辑</a>&nbsp;&nbsp;
						    <a href="javascript:void(0);" onclick="tm_delete(this)" data-opid="${profit.id}">删除</a></td>
					  </tr>				  
					</c:forEach>
				 </tbody>
				</table>
				</div>
				<div style="height:30px;padding:12px 0 10px 658px;">
				   <div class="page"></div>
				</div>			
			</div>
		</div>
     <script type="text/javascript">
         var totalcount = "${result}";
         $(function(){
        	 tm_initPage(totalcount);
         });
         //初始化分页
         function tm_initPage(itemCount){
            $(".page").pagination(itemCount,{ //100分页的总数。
      			items_per_page:5,        //控制每页多少条信息。
     			num_display_entries:2,   //主体页数。
     			current_page:0,          //指明选中的页码。
     			num_edge_entries:2,      //边缘页数。
     			prev_text:"前一页",
     			next_text:"后一页",
     			ellipse_text:"...",
     			renderer:"defaultRenderer",
     			load_first_page:false,
     			showGo : true,
     			showSelect:true,
     			callback:function(pnum,psize){//会回传两个参数，一个为当前页，另一个为每页显示的页数。
     				tm_loadTemplate(pnum,psize);
     			}
              });          	 
         }
         //根据下拉属性进行查找
         function tm_searchProfit(obj,flag){
        	 if(flag){
            	 var minMoney = $("#minMoney").val();
            	 var maxMoney = $("#maxMoney").val();
            	 if(isNotEmpty(maxMoney) && isNotEmpty(minMoney) && maxMoney<minMoney){
            		 alert("最小金额不能大于最大金额");
            		 $("#minMoney").select();
            		 return;
            	 }
        	 }
        	 tm_loadTemplate(0,5,function(itemCount){
        		 tm_initPage(itemCount);
        	 });
         }
         //ajax加载模板页面
         function tm_loadTemplate(pno,psize,callback){
        	 var typeId = $("#typeId").val();
        	 var minMoney = $("#minMoney").val();
        	 var maxMoney = $("#maxMoney").val();
        	 var typeName = $("#typeId").find("option:selected").text();
        	 //执行一个ajax分页就大功告成了
             $.ajax({
          	  type:"post",
          	  url:basePath+"/profit/listTemplate",
          	  data:{"pageNo":pno*psize,"pageSize":psize,"typeId":typeId,"minMoney":minMoney,"maxMoney":maxMoney},
          	  success:function(data){
          		  //alert(data);
          		  $("#tbody").html(data);
          		  keyHighlighter(typeName);
          		  if(callback){
          			  var totalcount = $("#talcount").val();
          			  callback(totalcount);
          		  }
          	  }
             });        	 
         }
         function tm_delete(obj){
        	//不管是什么删除一定要给提示，防止误操作
        	tm_dialoag({content:"您确定删除吗？",callback:function(ok){
        		if(ok){
        			var opid = $(obj).data("opid");
        			$.ajax({
        				type:"post",
        				url:"http://localhost/tzreport/json/delete/"+opid,
        				success:function(data){
        					if(data.result=="success"){
        						$(obj).parents(".tmui-items").fadeOut("slow",function(){
        							$(this).remove();
        						});
        					}else{
        						alert("删除失败！");
        					}
        				}
        			});
        			
        		}
        	}});
         }
     </script>
  </body>
</html>
