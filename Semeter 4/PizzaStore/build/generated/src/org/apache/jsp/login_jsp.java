package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header-auth.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                width: 80%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form {\n");
      out.write("                width: 300px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: #fff;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form p {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #555;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form input[type=\"text\"],\n");
      out.write("            form input[type=\"password\"],\n");
      out.write("            form input[type=\"submit\"] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form input[type=\"submit\"] {\n");
      out.write("                background-color: #333;\n");
      out.write("                color: white;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form input[type=\"submit\"]:hover {\n");
      out.write("                background-color: #555;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .error-message {\n");
      out.write("                color: red;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style><style>\n");
      out.write("            body {\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-color: #f9f5f2; /* Creamy color for a warm feel */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                width: 80%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #e64a19; /* Dark orange color for a pizza theme */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form {\n");
      out.write("                width: 300px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 60px;\n");
      out.write("                background-color: #fff;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form p {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #555;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form input[type=\"text\"],\n");
      out.write("            form input[type=\"password\"],\n");
      out.write("            form input[type=\"submit\"] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form input[type=\"submit\"] {\n");
      out.write("                background-color: #e64a19; /* Dark orange color for a pizza theme */\n");
      out.write("                color: white;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form input[type=\"submit\"]:hover {\n");
      out.write("                background-color: #bf360c; /* Darker shade of orange for hover effect */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .error-message {\n");
      out.write("                color: red;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("       \r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./asset/styles.css\">\r\n");
      out.write("    \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("          \r\n");
      out.write("            <nav>\r\n");
      out.write("                <ul id=\"main-menu\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"./login\"><image src=\"https://scontent.fsgn5-11.fna.fbcdn.net/v/t1.15752-9/431532203_783873163092717_8112718023163948451_n.png?_nc_cat=111&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeHql7_h9Wx_qIrRiAP7N6cyeSqBkG9IoW15KoGQb0ihbVXmamdyz25PEx57uJyRvxs-bOYlZiyZwXjkpQ7l_yuV&_nc_ohc=7IOIcLd9qAkAX_O51Zg&_nc_ht=scontent.fsgn5-11.fna&oh=03_AdTyWwHaWbGUFvqiV7TAZxQ4Yt_CBGWW11BJwse2USjFAw&oe=6616597D\"/></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"./login\">Login</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                   <li>\r\n");
      out.write("                        <a href=\"./register\">Register</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            $('#toggle').click(function () {\r\n");
      out.write("                $('nav').slideToggle();\r\n");
      out.write("            })\r\n");
      out.write("        })\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("        <h1>Login</h1>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("        <form action=\"./login\" method=\"post\">\n");
      out.write("            Enter your ID <input type=\"text\" name=\"accountId\" required/>\n");
      out.write("            <br/>\n");
      out.write("            Enter password  <input type=\"password\" name=\"password\" required/>\n");
      out.write("            <br/>\n");
      out.write("            <br/>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Log in\" style=\"color: white; background: red; padding: 10px; border-radius: 5px\"/>\n");
      out.write("            <th:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
