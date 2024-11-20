package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_002dmanagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <title>PizzaStore</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function doDelete(id) {\n");
      out.write("                if (confirm(\"Are you sure to delete product with id = \" + id)) {\n");
      out.write("                    window.location = \"./delete-product?productId=\" + id;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-color: #f4f4f4;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                width: 80%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                padding-left: 40px; /* Adding padding to the left */\n");
      out.write("                padding-right: 40px; /* Adding padding to the right */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h2 {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #e64a19; /* Dark orange color for a pizza theme */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a.button {\n");
      out.write("                background-color: green;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                color: white;\n");
      out.write("                padding: 10px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a.button:hover {\n");
      out.write("                background-color: darkgreen;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table th,\n");
      out.write("            table td {\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: left;\n");
      out.write("                border-bottom: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table th {\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table tr:hover {\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .actions a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #333;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .actions a:hover {\n");
      out.write("                color: blue;\n");
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
      out.write("\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./asset/styles.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("            <nav>\r\n");
      out.write("                <ul id=\"main-menu\" style=\"\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"./product-management\"><image src=\"https://scontent.fsgn5-11.fna.fbcdn.net/v/t1.15752-9/431532203_783873163092717_8112718023163948451_n.png?_nc_cat=111&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeHql7_h9Wx_qIrRiAP7N6cyeSqBkG9IoW15KoGQb0ihbVXmamdyz25PEx57uJyRvxs-bOYlZiyZwXjkpQ7l_yuV&_nc_ohc=7IOIcLd9qAkAX_O51Zg&_nc_ht=scontent.fsgn5-11.fna&oh=03_AdTyWwHaWbGUFvqiV7TAZxQ4Yt_CBGWW11BJwse2USjFAw&oe=6616597D\"/></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"./sales-report\">Sales Report</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"./order-management\">Orders</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"./product-management\">Pizzas</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"./member-management\">Members</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"header_login\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $('#toggle').click(function () {\r\n");
      out.write("                    $('nav').slideToggle();\r\n");
      out.write("                })\r\n");
      out.write("            })\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("        <h2>Pizza Management</h2>\n");
      out.write("        <br/>\n");
      out.write("        <div style=\"\">\n");
      out.write("            <a style=\"background-color: blue; border-radius: 5px; color: white; padding: 10px 30px; text-decoration: none; margin-left: 10px  \" href=\"./create-pizza\" >+ Create new</a>\n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("    <th:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("    </th:if>\n");
      out.write("    <th:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pizzas != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("        <br/>\n");
      out.write("        <table>\n");
      out.write("            <tr >\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Description</th>\n");
      out.write("                <th>Image Url</th>\n");
      out.write("                <th>Category</th>\n");
      out.write("                <th>Actions</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </th:if>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("                        <a href=\"register.jsp\">Register</a>\r\n");
        out.write("                        /\r\n");
        out.write("                        <a href=\"login.jsp\">Login</a>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        Welcome, <a href=\"account\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\r\n");
        out.write("                        /\r\n");
        out.write("                        <a href=\"./logout\">Logout</a>\r\n");
        out.write("\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pizzas}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("pizza");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <tr style=\"border-bottom: #777777 1px solid\">\n");
          out.write("                    <td style=\"padding: 5px 10px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pizza.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td style=\"padding: 5px 10px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pizza.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td style=\"padding: 5px 10px;\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pizza.unitPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td style=\"padding: 5px 10px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pizza.category.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td style=\"padding: 5px 10px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pizza.productImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td style=\"padding: 5px 10px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pizza.category.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
          out.write("                    <td>\n");
          out.write("                        <a href=\"./edit-product?productId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pizza.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit | </a>\n");
          out.write("                        <a onclick=\"doDelete('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pizza.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\" href=\"#\">Delete | </a>\n");
          out.write("\n");
          out.write("                        <a href=\"./detail-product?productId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pizza.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Details</a>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
