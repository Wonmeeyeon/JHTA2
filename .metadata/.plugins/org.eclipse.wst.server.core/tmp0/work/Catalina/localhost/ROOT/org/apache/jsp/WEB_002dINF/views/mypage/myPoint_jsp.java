/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-08-24 01:10:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myPoint_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(12);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1597801996994L));
    _jspx_dependants.put("jar:file:/C:/APP/eGovFrameDev-3.9.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final-project/WEB-INF/lib/spring-webmvc-4.3.28.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1595281502000L));
    _jspx_dependants.put("/WEB-INF/views/mypage/./mypageheader.jsp", Long.valueOf(1598228119425L));
    _jspx_dependants.put("jar:file:/C:/APP/eGovFrameDev-3.9.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final-project/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fn.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.28.RELEASE.jar", Long.valueOf(1597801982913L));
    _jspx_dependants.put("jar:file:/C:/APP/eGovFrameDev-3.9.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final-project/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/views/mypage/../common/footer.jsp", Long.valueOf(1597717822323L));
    _jspx_dependants.put("/WEB-INF/views/common/tags.jsp", Long.valueOf(1597717822327L));
    _jspx_dependants.put("jar:file:/C:/APP/eGovFrameDev-3.9.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final-project/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/C:/APP/eGovFrameDev-3.9.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final-project/WEB-INF/lib/spring-webmvc-4.3.28.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1595281502000L));
    _jspx_dependants.put("/WEB-INF/views/mypage/../common/navi.jsp", Long.valueOf(1598228519717L));
    _jspx_dependants.put("/WEB-INF/views/mypage/./mypagemenubar.jsp", Long.valueOf(1597912170470L));
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
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/style.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/card.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/mypage.css\" />\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.4.4/umd/popper.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/js/jquery.color.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/js/custom.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/js/mypage/myPoint.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<input type=\"hidden\" id=\"login-type\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_TYPE }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\n");
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
      out.write("\t\t\t\t\tclass=\"h2 font-weight-bolder custom-color\"><img id=\"brand-logo\" style=\"width: 200px;\" src=\"/resources/logo/gongsaLogo.png\"/></span>\n");
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
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/performance/list.do?category=콘서트\" class=\"h6\">콘서트</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/performance/list.do?category=뮤지컬\" class=\"h6\">뮤지컬</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/performance/list.do?category=연극\" class=\"h6\">연극</a></li>\n");
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
      out.write("<script>\n");
      out.write("$(function() {\n");
      out.write("\t$(\"#btn-logout\").click(function(event) {\n");
      out.write("\t\tevent.preventDefault();\n");
      out.write("\t\t\n");
      out.write("\t\tvar loginType = $(\"#login-type\").val();\n");
      out.write("\t\t\n");
      out.write("\t\tif (loginType == 'web') {\n");
      out.write("\t\t\tlocation.href = \"/signout.do\";\n");
      out.write("\t\t} else if (loginType == \"sns\") {\n");
      out.write("\t\t\tlocation.href = \"https://kauth.kakao.com/oauth/logout?client_id=8c912903836a6643f0a91b7b98862cf7&logout_redirect_uri=http://localhost/sns/logout.do\"\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("})\n");
      out.write("</script>\n");
      out.write(" ");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"body mt-5\">\n");
      out.write("\t\t<div class=\"container-fluid mb-4\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"offset-1 col-2 mt-4\">\n");
      out.write("\t<div id=\"generic_price_table\">\n");
      out.write("\t\t<!--PRICE CONTENT START-->\n");
      out.write("\t\t<div class=\"generic_content clearfix\">\n");
      out.write("\t\t\t<!--HEAD PRICE DETAIL START-->\n");
      out.write("\t\t\t<div class=\"generic_head_price clearfix\">\n");
      out.write("\t\t\t\t<!--HEAD CONTENT START-->\n");
      out.write("\t\t\t\t<div class=\"generic_head_content clearfix\">\n");
      out.write("\t\t\t\t\t<!--HEAD START-->\n");
      out.write("\t\t\t\t\t<div class=\"head_bg\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"head\">\n");
      out.write("\t\t\t\t\t\t<span>마이페이지</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--//HEAD END-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--//HEAD CONTENT END-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--//HEAD PRICE DETAIL END-->\n");
      out.write("\t\t\t<!--FEATURE LIST START-->\n");
      out.write("\t\t\t<div class=\"generic_feature_list\">\n");
      out.write("\t\t\t\t<ul id=\"mypagemenu\">\n");
      out.write("\t\t\t\t\t<li data-href=\"myperformance.do\" ><span>예매내역</span></li>\n");
      out.write("\t\t\t\t\t<li data-href=\"mymateroom.do\"><span>메이트방</span></li>\n");
      out.write("\t\t\t\t\t<li data-href=\"myprofile.do\"><span>나의프로필</span></li>\n");
      out.write("\t\t\t\t\t<li data-href=\"myLikes.do\"><span>관심공연</span></li>\n");
      out.write("\t\t\t\t\t<li data-href=\"myCoupon.do\"><span>나의쿠폰</span></li>\n");
      out.write("\t\t\t\t\t<li data-href=\"myPoint.do\"><span>나의포인트</span></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--//FEATURE LIST END-->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--//PRICE CONTENT END-->\n");
      out.write("\t</div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-8 mt-4\">\n");
      out.write("\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<div class=\"card\">\n");
      out.write("\t<div class=\"card-body\" style=\"background-color: rgba(0, 0, 0, 0.5);\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t\t<img style=\"width: 200px; height: 200px;\"\n");
      out.write("\t\t\t\t\tsrc=\"/resources/sample-images/sample-consert4.jpg\"\n");
      out.write("\t\t\t\t\tclass=\"rounded float-left\" alt=\"...\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-12 text-white mt-3\"\n");
      out.write("\t\t\t\t\t\tstyle=\"border-bottom: 1px dotted #fff;\">\n");
      out.write("\t\t\t\t\t\t<h3 id=\"login-user-id\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-12 text-white mt-3\"\n");
      out.write("\t\t\t\t\t\tstyle=\"border-bottom: 1px dotted #fff;\">\n");
      out.write("\t\t\t\t\t\t<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.nickname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-12 mt-3\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-primary btn-lg\">나의 정보 변경</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-3\" style=\"border-right: 1px dotted #fff;\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-12 text-white mt-3 text-center\">\n");
      out.write("\t\t\t\t\t<h2>쿠폰</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-12 text-white text-center mt-3\">\n");
      out.write("\t\t\t\t\t<h2>\n");
      out.write("\t\t\t\t\t\t<span class=\"text-warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.coupons.size() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>개\n");
      out.write("\t\t\t\t\t</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t\t<div class=\"col-12 text-white mt-3 text-center\">\n");
      out.write("\t\t\t\t\t<h2>포인트</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-12 text-white text-center mt-3\">\n");
      out.write("\t\t\t\t\t<h2>\n");
      out.write("\t\t\t\t\t\t<span class=\"text-warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.point }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>P\n");
      out.write("\t\t\t\t\t</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-12\">\n");
      out.write("\t\t<hr />\n");
      out.write("\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t<table class=\"table table-borderless\">\n");
      out.write("\t\t\t\t\t<colgroup>\n");
      out.write("\t\t\t\t\t\t<col width=\"30%\"/>\n");
      out.write("\t\t\t\t\t</colgroup>\n");
      out.write("\t\t\t\t\t<tbody class=\"site-map text-center\">\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"2\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"brand-logo h1 font-weight-bolder text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/home.do\" class=\"custom-color\">공공연한사이</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h6 font-weight-bolder text-dark\t\">사이트맵</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h6\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"text-dark\">콘서트</a> \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h6\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"text-dark\">뮤지컬</a> \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h6\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"text-dark\">연극</a> \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h6\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"text-dark\">이벤트</a> \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h6\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"text-dark\">고객문의센터</a> \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"6\" class=\"text-muted text-left\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mt-3\">JHTA 2002기 2조\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>정다훈,</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>기효진,</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>원미연,</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>유세민,</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>이민섭,</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>이한</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div>공연예매와 메이트 매칭을 제공하는 웹 애플리케이션 제작</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t제작년도 : 2020년 8월\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t기획배경 :\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t기존에 학습한 웹 애플리케이션과 다양한 외부 API 기술을 활용하여 예매사이트 기능과 커뮤니케이션 기능을 구현한다.\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
      // /WEB-INF/views/mypage/../common/navi.jsp(38,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("\t\t\t\t\t<a href=\"/signout.do\" class=\"btn\" type=\"button\" id=\"btn-logout\">\n");
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
