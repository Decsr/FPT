package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_002dproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_th_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_th_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_th_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_th_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_th_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_th_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_th_set_var_value_nobody.release();
    _jspx_tagPool_th_forEach_var_items.release();
    _jspx_tagPool_th_if_test.release();
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Detail</title>\n");
      out.write("        <style>\n");
      out.write("         \n");
      out.write("            body {\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-color: #fff; /* Light beige color for a warm feel */\n");
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
      out.write("                color: #d84315; /* Dark red color for a pizza theme */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form {\n");
      out.write("                width: 50%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: #fff;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table td {\n");
      out.write("                padding: 10px;\n");
      out.write("                border-bottom: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table td:first-child {\n");
      out.write("                width: 30%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"text\"],\n");
      out.write("            input[type=\"password\"],\n");
      out.write("            select {\n");
      out.write("                width: calc(100% - 20px);\n");
      out.write("                padding: 10px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            select {\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn {\n");
      out.write("                padding: 10px;\n");
      out.write("                background-color: #d84315; /* Dark red color for a pizza theme */\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:hover {\n");
      out.write("                background-color: #bf360c; /* Darker shade of red for hover effect */\n");
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
      out.write("        <br/><br/>\n");
      out.write("\n");
      out.write("        <h1>Edit Pizza</h1>\n");
      out.write("        ");
      if (_jspx_meth_th_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br/><br/>\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <table>\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                <input type=\"hidden\" name=\"productId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly/>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Pizza Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"productName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Price</td>\n");
      out.write("                    <td><input type=\"text\" name=\"unitPrice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.unitPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  readonly /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Quantity</td>\n");
      out.write("                    <td><input type=\"text\" name=\"quantityPerUnit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantityPerUnit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Category</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"categoryId\" required>\n");
      out.write("                            ");
      if (_jspx_meth_th_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Supplier</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"supplierId\" required>\n");
      out.write("                            ");
      if (_jspx_meth_th_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Image Url</td>\n");
      out.write("                    <td><input type=\"text\" name=\"productImage\" required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><a href=\"./product-management\" class=\"btn\" style=\"text-decoration: none\">Close</a></td>\n");
      out.write("                </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
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

  private boolean _jspx_meth_th_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  th:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_th_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_th_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_th_set_0.setPageContext(_jspx_page_context);
    _jspx_th_th_set_0.setParent(null);
    _jspx_th_th_set_0.setVar("product");
    _jspx_th_th_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_th_set_0 = _jspx_th_th_set_0.doStartTag();
    if (_jspx_th_th_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_th_set_var_value_nobody.reuse(_jspx_th_th_set_0);
      return true;
    }
    _jspx_tagPool_th_set_var_value_nobody.reuse(_jspx_th_th_set_0);
    return false;
  }

  private boolean _jspx_meth_th_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  th:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_th_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_th_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_th_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_th_forEach_0.setParent(null);
    _jspx_th_th_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_th_forEach_0.setVar("category");
    int[] _jspx_push_body_count_th_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_th_forEach_0 = _jspx_th_th_forEach_0.doStartTag();
      if (_jspx_eval_th_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_th_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_th_forEach_0, _jspx_page_context, _jspx_push_body_count_th_forEach_0))
            return true;
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_th_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_th_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_th_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_th_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_th_forEach_0.doFinally();
      _jspx_tagPool_th_forEach_var_items.reuse(_jspx_th_th_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_th_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_th_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_th_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  th:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_th_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_th_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_th_if_0.setPageContext(_jspx_page_context);
    _jspx_th_th_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_th_forEach_0);
    _jspx_th_th_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryId.equals(product.category.categoryId) }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_th_if_0 = _jspx_th_th_if_0.doStartTag();
    if (_jspx_eval_th_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" selected>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_th_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_th_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_th_if_test.reuse(_jspx_th_th_if_0);
      return true;
    }
    _jspx_tagPool_th_if_test.reuse(_jspx_th_th_if_0);
    return false;
  }

  private boolean _jspx_meth_th_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  th:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_th_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_th_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_th_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_th_forEach_1.setParent(null);
    _jspx_th_th_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${suppliers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_th_forEach_1.setVar("supplier");
    int[] _jspx_push_body_count_th_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_th_forEach_1 = _jspx_th_th_forEach_1.doStartTag();
      if (_jspx_eval_th_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_th_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_th_forEach_1, _jspx_page_context, _jspx_push_body_count_th_forEach_1))
            return true;
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${supplier.supplierId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${supplier.companyName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_th_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_th_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_th_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_th_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_th_forEach_1.doFinally();
      _jspx_tagPool_th_forEach_var_items.reuse(_jspx_th_th_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_th_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_th_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_th_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  th:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_th_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_th_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_th_if_1.setPageContext(_jspx_page_context);
    _jspx_th_th_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_th_forEach_1);
    _jspx_th_th_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${supplier.supplierId.equals(product.supplier.supplierId) }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_th_if_1 = _jspx_th_th_if_1.doStartTag();
    if (_jspx_eval_th_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${supplier.supplierId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" selected>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${supplier.companyName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_th_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_th_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_th_if_test.reuse(_jspx_th_th_if_1);
      return true;
    }
    _jspx_tagPool_th_if_test.reuse(_jspx_th_th_if_1);
    return false;
  }
}
