/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-08-18 04:31:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1597301381698L));
    _jspx_dependants.put("jar:file:/C:/APP/eGovFrameDev-3.9.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final-project/WEB-INF/lib/spring-webmvc-4.3.28.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1595281502000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.28.RELEASE.jar", Long.valueOf(1597301370702L));
    _jspx_dependants.put("jar:file:/C:/APP/eGovFrameDev-3.9.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final-project/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/views/common/tags.jsp", Long.valueOf(1597717822327L));
    _jspx_dependants.put("/WEB-INF/views/notice/../common/navi.jsp", Long.valueOf(1597717822325L));
    _jspx_dependants.put("jar:file:/C:/APP/eGovFrameDev-3.9.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final-project/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/C:/APP/eGovFrameDev-3.9.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final-project/WEB-INF/lib/spring-webmvc-4.3.28.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1595281502000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>같이 보자! 공공연한사이</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/jquery.fullPage.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/style.css\" />\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/js/jquery.color.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/js/custom.js\"></script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".category{\n");
      out.write("\tbackground-color: #C0C0C0;\n");
      out.write("    transition: all 0.5s;\n");
      out.write("    transition-timing-function: ease;\n");
      out.write("}\n");
      out.write(".category .col:hover{\n");
      out.write("    transition: all 0.5s;\n");
      out.write("    transition-timing-function:ease;\n");
      out.write("    background-color: white;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write(".category .col {\n");
      out.write("\tfont-size: 25px;\n");
      out.write("\tpadding-top: 15px;\n");
      out.write("\tpadding-bottom: 15px;\n");
      out.write("}\n");
      out.write("a {\n");
      out.write("\ttext-decoration: none !important;\n");
      out.write("\tcolor: black;\n");
      out.write("}\n");
      out.write("a:hover {\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tcolor: black;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"header\">\n");
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<nav class=\"navbar sticky-top transparent custom-color\" id=\"navbar-top\">\n");
      out.write("\t\t\t<!-- side navi bar btn -->\n");
      out.write("\t\t\t<div class=\"col-1\">\n");
      out.write("\t\t\t\t<button id=\"sidebarCollapse\" class=\"btn navbar-toggler\"\n");
      out.write("\t\t\t\t\ttype=\"button\" data-toggle=\"collapse\">\n");
      out.write("\t\t\t\t\t<div id=\"sidenav-icon\">\n");
      out.write("\t\t\t\t\t\t<span></span> <span></span> <span></span> <span></span> <span></span>\n");
      out.write("\t\t\t\t\t\t<span></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- side navi bar btn -->\n");
      out.write("\t\t\t<!-- brand name, title -->\n");
      out.write("\t\t\t<div class=\"col-3 text-left\">\n");
      out.write("\t\t\t\t<a class=\"navbar-brand font-weight-bolder\" href=\"/home.do\"> <span\n");
      out.write("\t\t\t\t\tclass=\"h2 font-weight-bolder custom-color\">공공연한사이</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- brand name, title -->\n");
      out.write("\t\t\t<!-- search bar -->\n");
      out.write("\t\t\t<div class=\"col-4\">\n");
      out.write("\t\t\t\t<form class=\"form-inline mr-sm-2 searchform\">\n");
      out.write("\t\t\t\t\t<input type=\"search\" class=\"form-control\" id=\"search-box\" />\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"btn\" type=\"button\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-search fa-2x custom-color\"></i>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- search bar -->\n");
      out.write("\t\t\t<!-- user icons -->\n");
      out.write("\t\t\t<div class=\"col-4 text-right\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- user icons -->\n");
      out.write("\t\t</nav>\n");
      out.write("\t\t<!-- Vertical navbar -->\n");
      out.write("\t\t<nav class=\"vertical-nav active\" id=\"sidebar\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-12 sidebar-top\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<ul class=\"nav flex-column m-3\">\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\">\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled components mb-5\">\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"#homeSubmenu\"\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"collapse\" aria-expanded=\"false\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-toggle h4\">공연예매</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"collapse list-unstyled\" id=\"homeSubmenu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/performance/list.do\" class=\"h6\">콘서트</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"h6\">뮤지컬</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"h6\">연극</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"h4\">메이트</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"h4\">뒤풀이</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"h4\">이벤트</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/qna/list.do\" class=\"h4\">고객문의센터</a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"h4\">마이페이지</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t\t<!-- End vertical navbar -->\n");
      out.write(" ");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"body\" style=\"margin-top: 100px;\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t<div class=\"row mb-3\">\n");
      out.write("\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t<strong><span style=\"font-size: 25px;\">고객지원센터</span></strong>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row mb-3\">\n");
      out.write("\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row category\" id=\"category\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col\" id=\"notice-list\"><a href=\"/notice/list.do?pageNo=1&rows=20&status=blank&keyword=blank\">공지사항</a></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col\" id=\"QnA-list\"><a href=\"/qna/list.do\">QnA</a></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col\">자주하는질문</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col\">나의문의내역</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t<table class=\"table\" style=\"text-align: center;\">\n");
      out.write("\t\t\t\t\t\t\t<colgroup>\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"10%\">\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"15%\">\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"45%\">\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"10%\">\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"10%\">\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"10%\">\n");
      out.write("\t\t\t\t\t\t\t</colgroup>\n");
      out.write("\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>1</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>서비스소식</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"text-align: left !important; \"><a style=\"color: black;\" href=\"/notice/detail.do\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"badge badge-danger\">단독판매</span> [2020 예술의전당  뮤지컬 총 결산] 티켓오픈안내</a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>관리자</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>1</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>2020.08.08</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\" style=\"background-color: #f5f5f5; height: 300px;\">\n");
      out.write("\t\t\t\t\t<div class=\"col-2\">\n");
      out.write("\t\t\t\t\t\t <img alt=\"\" src=\"../resources/sample-images/image1.jpg\" style=\"width: 200px; height: 200px; margin-top: 50px;\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-1\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"col-8\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" style=\"margin-top: 50px;\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 style=\"font-weight: bolder;\">뮤지컬[모차르트]</h3>\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" style=\"margin-top: 20px;\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-1\">\n");
      out.write("\t\t\t\t\t\t\t\t <i class=\"fas fa-bell fa-4x\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-9\" style=\"margin-left: 20px;\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5 style=\"font-weight: bolder;\">티켓오픈</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"font-weight: bolder\"> 2020.12.32() 오후 1:00</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" style=\"margin-top: 30px;\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\" class=\"btn btn-primary\">상세보기</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\" style=\"margin-top: 50px;\"><div class=\"col-12\"></div></div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t<table class=\"table\"><tr><th></th></tr></table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t<span><strong>공연개요</strong></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t공연명, 공연장, 공연기간, 공연시간, 러닝타임, 관람연령, 등급, 및 가격 등\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t<span><strong>공연소개</strong></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t공연소개, 출연진소개, 시놉시스 등\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t조기예매, 청소년할인, 장애인, 국가유공자할인 등 정보\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t<span><strong>할인정보</strong></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t공연소개, 출연진소개, 시놉시스 등\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-12\" align=\"right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"/notice/list.do\"><i class=\"fas fa-stream fa-2x\" style=\"color: black;\"></i></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-12\" align=\"right\">\n");
      out.write("\t\t\t\t\t\t<span><strong>목록</strong></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\" style=\"margin-top: 30px;\">\n");
      out.write("\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t<table class=\"table\" style=\"height: 100px;\">\n");
      out.write("\t\t\t\t\t\t\t<colgroup>\n");
      out.write("\t\t\t\t\t\t\t\t <col width=\"10%\">\n");
      out.write("\t\t\t\t\t\t\t\t <col width=\"10%\">\n");
      out.write("\t\t\t\t\t\t\t\t <col width=\"70%\">\n");
      out.write("\t\t\t\t\t\t\t\t <col width=\"10%\">\n");
      out.write("\t\t\t\t\t\t\t</colgroup>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><span style=\"padding-right: 7px;\">이전글</span><i class=\"fas fa-angle-up\"></i></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>분류명</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>제목</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>등록일</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><span style=\"padding-right: 7px;\">다음글</span><i class=\"fas fa-angle-down\"></i></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>분류명</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>제목</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>등록일</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function () {\n");
      out.write("\t//현재 페이지의 URL주소를 가져온다.\n");
      out.write("\tvar URL = window.location.href;\n");
      out.write("\t// URL에 notice가 포함되어있으면 배경색을 흰색으로 바꿔준다.\n");
      out.write("\tif (URL.indexOf(\"notice\") != -1) {\n");
      out.write("\t\t$(\"#notice-list\").css(\"background-color\",\"white\")\n");
      out.write("\t}\n");
      out.write("})\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/views/notice/../common/navi.jsp(37,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty LOGIN_USER}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t<a href=\"/signin.do\" class=\"btn\" type=\"button\">\n");
          out.write("\t\t\t\t\t\t<i class=\"fas fa-sign-in-alt fa-2x custom-color\"></i>\n");
          out.write("\t\t\t\t\t</a>\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t<a class=\"btn\" href=\"/mypage/mypagemain.do\">\n");
          out.write("\t\t\t\t\t\t<i class=\"far fa-user fa-2x custom-color\"></i>\n");
          out.write("\t\t\t\t\t</a>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t<a href=\"#\" class=\"btn\" type=\"button\">\n");
          out.write("\t\t\t\t\t\t<i class=\"far fa-bell fa-2x custom-color\"></i>\n");
          out.write("\t\t\t\t\t</a>\n");
          out.write("\t\t\t\t\t<a href=\"#\" class=\"btn\" type=\"button\">\n");
          out.write("\t\t\t\t\t\t<i class=\"far fa-envelope fa-2x custom-color\"></i>\n");
          out.write("\t\t\t\t\t</a>\n");
          out.write("\t\t\n");
          out.write("\t\t\t\t\t<a href=\"/signout.do\" class=\"btn\" type=\"button\">\n");
          out.write("\t\t\t\t\t\t<i class=\"fas fa-sign-out-alt fa-2x custom-color\"></i>\n");
          out.write("\t\t\t\t\t</a>\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}
