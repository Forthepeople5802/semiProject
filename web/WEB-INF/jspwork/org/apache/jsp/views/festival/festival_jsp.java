/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.49
 * Generated at: 2018-04-20 00:11:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.festival;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.*;
import festival.model.vo.*;
import java.util.*;

public final class festival_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("festival.model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("member.model.vo");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
ArrayList<Festival> list=null;
if(request.getAttribute("show")!=null){
	 list=(ArrayList<Festival>)request.getAttribute("show");}

      out.write('\n');
      out.write('\n');
 
Member loginMember= null;

if(session.getAttribute("loginMember") instanceof Business)
 {
	loginMember = (Business)session.getAttribute("loginMember");
 }
else if (session.getAttribute("loginMember") instanceof Customer)
{
	loginMember = (Customer)session.getAttribute("loginMember");
}
else if (session.getAttribute("loginMember") instanceof Manager)
{
	loginMember = (Manager)session.getAttribute("loginMember");
}

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>푸딩 푸드트럭 축제</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/food/resources/css/top-menu.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/food/resources/css/foot.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/food/resources/css/festival.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/food/resources/css/location.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/food/resources/css/bootstrap.min.css\">\n");
      out.write("<script src=\"/food/resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"/food/resources/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"/food/resources/js/jquery.scrolly.min.js\"></script>\n");
      out.write("<script src=\"/food/resources/js/jquery.scrollzer.min.js\"></script>\n");
      out.write("\t<script src=\"/food/resources/js/jquery.scrollfollow.js\"></script>\n");
      out.write("\n");
      out.write(" \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function onoff(){\n");
      out.write("\t\n");
      out.write("   \t$.ajax({\n");
      out.write("\t      \turl : \"/food/onoff\",\n");
      out.write("\t      \tdata : {\n");
      out.write("\t        state: onoffState,\n");
      out.write("\t            ");
if(loginMember instanceof Business){
      out.write("\n");
      out.write("\t               userid : \"");
      out.print(((Business)loginMember).getBusiness_Id());
      out.write("\"\n");
      out.write("\t            ");
}
      out.write("\n");
      out.write("\t         \n");
      out.write("\t         },\n");
      out.write("\t      type : 'post',\n");
      out.write("\t      success : function(data) {\n");
      out.write("\t    \t\n");
      out.write("\t         if(data == 1){\n");
      out.write("\t            alert(\"장사를 시작합니다\");\n");
      out.write("\t            onoffState='Y';\n");
      out.write("\t            $(\"#graybutton\").attr(\"src\", \"/food/resources/images/redbutton.png\");\n");
      out.write("\t            \n");
      out.write("\t            $(\".gb\").hide();\n");
      out.write("\t            $(\".rb\").show();\n");
      out.write("\t            \n");
      out.write("\t            \n");
      out.write("\t            \n");
      out.write("\t         }else if(data == 2){\n");
      out.write("\t            alert(\"장사를 종료합니다\");\n");
      out.write("\t            onoffState='N';\n");
      out.write("\t            $(\"#graybutton\").attr(\"src\", \"/food/resources/images/graybutton.png\");\n");
      out.write("\t            \n");
      out.write("\t            $(\".rb\").hide();\n");
      out.write("\t            $(\".gb\").show();\n");
      out.write("\t          \t\n");
      out.write("\t         }\n");
      out.write("\t      }\n");
      out.write("\t   });\n");
      out.write("\t}\n");
int cnt = 0;
      out.write("\n");
      out.write("\t//축제리스트 검색 ajax\n");
      out.write("\t$(function(){\n");
      out.write("\t\t$('#fsearch').on('click', function(){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl: 'fsearch.do',\n");
      out.write("\t\t\t\ttype: 'post',\n");
      out.write("\t\t\t\tdata: { fSearch : $('input[name=fesSearch]').val() },\n");
      out.write("\t\t\t\tdataType: 'json',\n");
      out.write("\t\t\t\tsuccess: function(data) {\n");
      out.write("\t\t\t\t\tvar jsonStr = JSON.stringify(data);\n");
      out.write("\t\t\t\t\tvar json = JSON.parse(jsonStr);\n");
      out.write("\t\t\t\t\tvar searchList = \"\";\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\tfor(var i in json.list){\n");
      out.write("\t\t\t\t\t\tsearchList += \n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\"<div class='media-left'>\"+\n");
      out.write("\t\t\t\t\t\t\t\t\"<img src='/food/resources/images/festival/\"+json.list[i].festival_image_file+\"'\"+\t\n");
      out.write("\t\t\t\t\t\t\t\t\"class='media-object'\"+\n");
      out.write("\t\t\t\t\t\t\t\t\"align='left' width='300px' height='300px'>\"+\n");
      out.write("\t\t\t\t\t\t\t\"</div>\"+\n");
      out.write("\t\t\t\t\t\t\t\"<div class='media-body'>\"+\n");
      out.write("\t\t\t\t\t\t\t\t\"<h4><a href='/food/fes_info?fesNo=\"+json.list[i].festival_no+\"'>\" +\n");
      out.write("\t\t\t\t\t\t\t\"<strong>\"+json.list[i].festival_name+\"</strong>\" +\n");
      out.write("\t\t\t\t\t\t\t\"</a></h4>\"+\n");
      out.write("\t\t\t\t\t\t\t\"<p>장소 : \"+json.list[i].festival_addr+\"</p>\" +\n");
      out.write("\t\t\t\t\t\t\t\"<p>날짜 : \"+json.list[i].festival_date_start+\" ~ \"+json.list[i].festival_date_end+\"</p>\";\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t");
 if(loginMember instanceof Manager) { 
      out.write("\n");
      out.write("\t\t\t\t\t\tsearchList += \"<a href='/food/fes_delete?fesNo=\"+json.list[i].festival_no+\"'>삭제</a>\"+ \" / \" +\n");
      out.write("\t\t\t\t\t\t\t\"<a href='/food/fes_upview?fNo=\"+json.list[i].festival_no+\"'>수정</a>\";\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tsearchList += \"<br><br><br><hr style='width: 800px'></div><br><br>\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t$('#festival_list').html(searchList);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});//ajax\n");
      out.write("\t\t\t\n");
      out.write("\t\t});\t//click\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#calendars\").scrollFollow({\n");
      out.write("            speed : 450,    // 꿈지럭 거리는 속도\n");
      out.write("            offset : 400     // 웹페이지 상단에서 부터의 거리(바꿔보면 뭔지 안다)\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t");
if(loginMember instanceof Business){
      out.write("\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t      url : \"/food/NY\",\n");
      out.write("\t\t      data : {\n");
      out.write("\t\t    \t \n");
      out.write("\t               userid : \"");
      out.print(((Business)loginMember).getBusiness_Id());
      out.write("\"\n");
      out.write("\t            \n");
      out.write("\t\t      },\n");
      out.write("\t\t      type : 'post',\n");
      out.write("\t\t      success : function(data) {\n");
      out.write("\t\t    \t \n");
      out.write("\t\t    \t  onoffState=data;\n");
      out.write("\t\t         if(data == 'Y'){//장사시작인 상태\n");
      out.write("\t\t        \t \n");
      out.write("\t\t\t            $(\".gb\").hide();\n");
      out.write("\t\t\t            $(\".rb\").show();\n");
      out.write("\t\t        \t\n");
      out.write("\t\t         }else {//장사 종료인 상태\n");
      out.write("\t\t        \t\n");
      out.write("\t\t        \t $(\".rb\").hide();\n");
      out.write("\t\t\t         $(\".gb\").show();\n");
      out.write("\t\t         }\n");
      out.write("\t\t      }\n");
      out.write("\t\t   });\n");
      out.write("\t\t");
}
      out.write("\n");
      out.write("\t}); //onload\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\tfunction deleteCheck() {\n");
      out.write("\t\tvar ok = confirm(\"해당 축제정보를 삭제하시겠습니까?\");\n");
      out.write("\t\t\n");
      out.write("\t\tif(ok) {\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("/* 메인사진 */\n");
      out.write("#mainPhoto {\n");
      out.write("\tbackground-image: url(\"/food/resources/images/FOODING2.jpg\");\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tbackground-position: center;\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 230px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-sm-4 {\n");
      out.write("\tleft-padding: 0px;\n");
      out.write("\tright-padding: 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("#main-t a #calendars:hover{\n");
      out.write("\t\tborder: 5px solid #f00;\n");
      out.write("}\n");
      out.write("\t\n");
      out.write("#calendars{\n");
      out.write("           position: absolute;\n");
      out.write("            border: 3px solid #f00;\n");
      out.write("            right : 5px;\n");
      out.write("            top : 30px;\n");
      out.write("            width: 150px;\n");
      out.write("            height: 300px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- 상단 네비게이션 바 -->\n");
      out.write("\t<div class=\"navcl\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-inverse\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\" style=\"padding-left: 0px;\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\" >\n");
      out.write("\t\t\t\t\t<li style=\"margin-right:10px;\"><a class=\"navbar-brand\" href=\"/food/index.jsp \">\n");
      out.write("\t\t\t\t\t\t<img src=\"/food/resources/images/LOGO_fooding.png\" style=\"width:65px; height:30px; \">\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"/food/index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/food/slocation\">지역검색</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"/food/flist\">푸드트럭</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"/food/fes_show\">축제검색</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t");
 if(loginMember==null){ 
      out.write("\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/food/views/logIn/logIn.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/food/views/signUp/select_signUp.jsp\"><span class=\"glyphicon glyphicon-edit\"></span> 회원가입</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t");
 } else if(loginMember instanceof Customer){
      out.write("\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li><a><span class=\"glyphicon glyphicon-user\"></span> ");
      out.print(((Customer)loginMember).getCustomer_Id() );
      out.write("님</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/food/views/userMy/user_my.jsp\"><span class=\"glyphicon glyphicon-th-list\"></span>내 정보 보기</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/food/memberlogout\"><span class=\"glyphicon glyphicon-share\"></span>로그아웃</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t");
 } else if(loginMember instanceof Business){
      out.write("\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"gb\" ><a class=\"gb\"  href=\"javascript: onoff();\"><img class=\"gb\" id=\"graybutton\"  alt=\"회색버튼\" src=\"/food/resources/images/graybutton.png\" width=\"15px\" height=\"15px\"><span class=\"glyphicon gb\"></span>장사 시작</a></li>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li class=\"rb\" ><a class=\"rb\"  href=\"javascript: onoff();\" ><img class=\"rb\" id=\"redbutton\"  alt=\"빨간버튼\" src=\"/food/resources/images/redbutton.png\" width=\"15px\" height=\"15px\"><span class=\"glyphicon rb\"></span>장사 종료</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/food/foodtruckdetail?bId=");
      out.print(((Business)loginMember).getBusiness_Id() );
      out.write("\"><span class=\"glyphicon glyphicon-cutlery\"></span>내 트럭</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a><span class=\"glyphicon glyphicon-user\"></span> ");
      out.print(((Business)loginMember).getBusiness_Id() );
      out.write("님 </a></li>\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"/food/views/businessMy/business_my.jsp\"><span class=\"glyphicon glyphicon-th-list\"></span>내 정보 보기</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/food/memberlogout\"><span class=\"glyphicon glyphicon-share\"></span>로그아웃</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t");
 } else if(loginMember instanceof Manager){
      out.write("\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li><a><span class=\"glyphicon glyphicon-user\"></span> ");
      out.print(((Manager)loginMember).getManager_Id() );
      out.write("님</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/food/views/adminMy/admin_my.jsp\"><img alt=\"회원관리\" src=\"/food/resources/images/people.png\" width=\"15px\" height=\"15px\">회원관리</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/food/memberlogout\"><span class=\"glyphicon glyphicon-share\"></span>로그아웃</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</nav>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- 메인 사진 -->\n");
      out.write("\n");
      out.write("\t<div id=\"mainPhoto\" align=\"center\">\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"main-t\" align=\"center\">\n");
      out.write("\t\n");
      out.write("\t\t<br>\n");
      out.write("\t\t\t<a href=\"/food/cal_show\"><img id=\"calendars\" src=\"/food/resources/images/calendar2018s.png\"\n");
      out.write("\t\t\tstyle=\"width: 80px; height: 80px; float: right\"></a>\n");
      out.write("\t\t\n");
      out.write("\t\t<h3 id=\"mt-h3\">F e s t i v a l &nbsp;&nbsp;&nbsp;I n f o m a t i o n</h3>\n");
      out.write("\t\t<form onsubmit=\"return false\">\n");
      out.write("\t\t\t<input name=\"fesSearch\" type=\"text\" placeholder=\"Search..\"> \n");
      out.write("\t\t\t<button id=\"fsearch\" class=\"glyphicon glyphicon-search\"></button>\n");
      out.write("\t\t</form>\t\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t</div>\n");
      out.write("\t\t<br>\n");
      out.write("\t<div id=\"festival_list\" class=\"container\" align=\"center\">\n");
      out.write("\t\t<!-- festival -->\n");
      out.write("\t\t");
 for(Festival f : list) { 
      out.write("\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t <div class=\"media-left\">\n");
      out.write("\t\t\t\t<img src=\"/food/resources/images/festival/");
      out.print( f.getFestival_Image_File() );
      out.write("\"\t\n");
      out.write("\t\t\t\t\tclass=\"media-object\"\n");
      out.write("\t\t\t\t\talign=\"left\" width=\"200px\" height=\"200px\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"media-body\">\n");
      out.write("\t\t\t\t\t<h4><a href=\"/food/fes_info?fesNo=");
      out.print( f.getFestival_No());
      out.write("\">\n");
      out.write("\t\t\t\t\t<strong>");
      out.print(f.getFestival_Name());
      out.write("</strong>\n");
      out.write("\t\t\t\t\t</a></h4>\n");
      out.write("\t\t\t\t\t<p>장소 : ");
      out.print(f.getFestival_Addr() );
      out.write("</p>\n");
      out.write("\t\t\t\t\t<p>날짜 : ");
      out.print(f.getFestival_Date_Start());
      out.write(' ');
      out.write('~');
      out.write(' ');
      out.print(f.getFestival_Date_End());
      out.write("</p>\n");
      out.write("\t\t\t\t");
 if(loginMember instanceof Manager) { 
      out.write("\t\n");
      out.write("\t\t\t\t\t<p><a id=\"deleteFes\" onclick=\"return deleteCheck()\" href=\"/food/fes_delete?fesNo=");
      out.print( f.getFestival_No());
      out.write("\">삭제</a> / \n");
      out.write("\t\t\t\t\t<a href=\"/food/fes_upview?fNo=");
      out.print( f.getFestival_No());
      out.write("\">수정</a>\n");
      out.write("\t\t\t\t");
 } 
      out.write("\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<hr style=\"width: 800px\">\n");
      out.write("\t\t<br>\n");
      out.write("\t\t\t");
 } 
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"foot\" style=\"bottom: 0; position: relative;\">FoodTruck\n");
      out.write("\t\t&nbsp;Copyright @ iei.or.kr &nbsp; All Rights Reserved.</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
