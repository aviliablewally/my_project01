/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2024-02-26 19:14:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userDetailUpdata_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>个人信息修改</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\" background-image: url('image/a1.jpg') ;height: 750px;width: 1500px\">\r\n");
      out.write("    <p1>\r\n");
      out.write("\r\n");
      out.write("        <form action=\"/userDetailUpdataServlet?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&cardID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User.cardID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\" style=\"padding-left: 150px;padding-right: 100px;padding-top: 100px\">\r\n");
      out.write("\r\n");
      out.write("            <table border=\"17\" style=\"width: 500px;height: 400px;background-color: white\">\r\n");
      out.write("\r\n");
      out.write("                <tr style=\"height: 50px\">\r\n");
      out.write("                    <th colspan=\"3\"  style=\"size: A3\">注册</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"center\"><label for=\"account-label\"><span style=\" font-size:30px;\">账号</span></label></td>\r\n");
      out.write("                    <td align=\"center\" colspan=\"2\"><input type=\"text\" name=\"account\" id=\"account-label\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User.account}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <text style=\"visibility: hidden\" id=\"account-Text\">规则不符合</text>\r\n");
      out.write("                    </td>\r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"center\"><label for=\"password-label\"><span style=\" font-size:30px;\">密码</span></label></td>\r\n");
      out.write("                    <td align=\"center\" colspan=\"2\"><input type=\"text\" name=\"password\" id=\"password-label\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <text style=\"visibility: hidden\" id=\"password-Text\">规则不符合</text>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"center\"><label for=\"Email-label\"><span style=\" font-size:30px;\">邮箱</span></label></td>\r\n");
      out.write("                    <td align=\"center\" colspan=\"2\"><input type=\"text\" name=\"Email\" id=\"Email-label\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <text style=\"visibility: hidden\" id=\"Email-Text\">规则不符合</text>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr style=\"height: 50px\">\r\n");
      out.write("                    <td colspan=\"3\" align=\"center\">\r\n");
      out.write("                        <input size=\"30px\" type=\"submit\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("    </p1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
