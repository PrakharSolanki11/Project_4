/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.48
 * Generated at: 2024-10-15 06:40:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.rays.pro4.controller.ForgetPasswordCtl;
import com.rays.pro4.Util.ServletUtility;
import com.rays.pro4.Bean.UserBean;
import com.rays.pro4.Bean.RoleBean;
import com.rays.pro4.controller.LoginCtl;
import com.rays.pro4.controller.ORSView;

public final class ForgetPasswordView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1718870301214L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1728973539416L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.rays.pro4.controller.ForgetPasswordCtl");
    _jspx_imports_classes.add("com.rays.pro4.Bean.UserBean");
    _jspx_imports_classes.add("com.rays.pro4.controller.LoginCtl");
    _jspx_imports_classes.add("com.rays.pro4.Util.ServletUtility");
    _jspx_imports_classes.add("com.rays.pro4.Bean.RoleBean");
    _jspx_imports_classes.add("com.rays.pro4.controller.ORSView");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/logo.png\" sizes=\"16*16\"/>\n");
      out.write("<title> Forget Password</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".ss{\n");
      out.write("height: 580px;\n");
      out.write("}\n");
      out.write("</style> \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  ");
      com.rays.pro4.Bean.UserBean bean = null;
      bean = (com.rays.pro4.Bean.UserBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new com.rays.pro4.Bean.UserBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write(' ');
      out.write(' ');
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("	");

		UserBean userBean = (UserBean) session.getAttribute("user");
		boolean userLoggedIn = userBean != null;
		String welcomeMsg = "Hi, ";
		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += userBean.getFirstName() + " (" + role + ")";
		} else {
			welcomeMsg += "Guest";
		}
	
      out.write("\n");
      out.write("\n");
      out.write("	<table>\n");
      out.write("		<tr>\n");
      out.write("			<th></th>\n");
      out.write("			<td width=\"90%\"><a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">Welcome</b></a> |\n");
      out.write("				");

				if (userLoggedIn) {
			
      out.write(" <a\n");
      out.write("				href=\" ");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">Logout</b></a>\n");
      out.write("\n");
      out.write("				");

					} else {
				
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">Login</b></a> ");

 	}
 
      out.write("</td>\n");
      out.write("			<td rowspan=\"2\">\n");
      out.write("				<h1 align=\"right\">\n");
      out.write("					<img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/customLogo.jpg\" width=\"175\"\n");
      out.write("						height=\"50\">\n");
      out.write("				</h1>\n");
      out.write("			</td>\n");
      out.write("		</tr>\n");
      out.write("\n");
      out.write("		<tr>\n");
      out.write("			<th></th>\n");
      out.write("			<td>\n");
      out.write("				<h3>");
      out.print(welcomeMsg);
      out.write("</h3>\n");
      out.write("			</td>\n");
      out.write("		</tr>\n");
      out.write("\n");
      out.write("		");

			if (userLoggedIn) {
		
      out.write("\n");
      out.write("\n");
      out.write("		<tr>\n");
      out.write("			<th></th>\n");
      out.write("			<td colspan=\"2\"><font style=\"font-size: 18px\"> <a\n");
      out.write("					href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">MyProfile</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get Marksheet</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet MeritList</b>\n");
      out.write("				</a> | ");

					if (userBean.getRoleId() == RoleBean.ADMIN) {
				
      out.write(" <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\">Add Course</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\">Add Faculty</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add TimeTable</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | ");
      out.write(" \n");
      out.write("					\n");
      out.write("					");
      out.write("  \n");
      out.write("					\n");
      out.write("					\n");
      out.write("					 <a target=\"blank\" href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\">Java Doc</b></a> ");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.STUDENT) {
 
      out.write(" <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | ");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.KIOSK) {
 
      out.write(" <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | ");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.FACULTY) {
 			// System.out.println("======>><><>"+userBean.getRoleId());
 
      out.write(" <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</b></a> | <br> <a\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add TimeTable</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | ");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.COLLEGE) {
 			//    System.out.println("======>><><>"+userBean.getRoleId());
 
      out.write(" <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | ");

 	}
 
      out.write("\n");
      out.write("\n");
      out.write("			</font></td>\n");
      out.write("		</tr>\n");
      out.write("		");

			}
		
      out.write("\n");
      out.write("	</table>\n");
      out.write("	<hr>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("  <div class= \"ss\"> \n");
      out.write("    <form action=\"");
      out.print(ORSView.FORGET_PASSWORD_CTL);
      out.write("\" method=\"post\">\n");
      out.write("    \n");
      out.write("  	   \n");
      out.write(" <div align=\"center\">\n");
      out.write("    <h1 align=\"center\">Forgot your password ?</h1>\n");
      out.write("                 <lable>Submit your Email address and we'll send your password.</lable><br><br>\n");
      out.write("	        \n");
      out.write("		    <H2>\n");
      out.write("                <font color=\"green\"> ");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font></H2>\n");
      out.write("            <H2>\n");
      out.write("                <font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font></H2>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("	<div align=\"center\">\n");
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId());
      out.write("\">\n");
      out.write("\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <tr><th>Email Id <span style=\"color:red \">*</span></th>\n");
      out.write("                <td><input type=\"text\" name=\"login\" size=\"25\"  placeholder=\"Enter the Valid-Email Id\" value=\"");
      out.print(ServletUtility.getParameter("login", request));
      out.write("\"></td>\n");
      out.write("                <td style=\"position: fixed\"><font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("login", request));
      out.write("</font></td>\n");
      out.write("		\n");
      out.write("		<tr><th style=\"padding: 3px\"></th></tr>\n");
      out.write("				\n");
      out.write("		            <tr><th></th>\n");
      out.write("		            <td>\n");
      out.write("		            &emsp;&nbsp;\n");
      out.write("	            	<input type=\"submit\" name=\"operation\" value=\"");
      out.print(ForgetPasswordCtl.OP_GO);
      out.write("\">\n");
      out.write("	            	&nbsp;&nbsp;\n");
      out.write("	            	 <input type=\"submit\" name=\"operation\" value=\"");
      out.print(ForgetPasswordCtl.OP_RESET);
      out.write("\">\n");
      out.write("	            	 </td>\n");
      out.write("	            	 </tr>\n");
      out.write("            </table>      \n");
      out.write("	</div>\n");
      out.write("    </form>\n");
      out.write("    </center>\n");
      out.write("    </div>\n");
      out.write("    ");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("#footer {\n");
      out.write("    \n");
      out.write("    position: fixed;\n");
      out.write("    left:0;\n");
      out.write("    width:100%; \n");
      out.write("    bottom:0;\n");
      out.write("    background-color:white;\n");
      out.write("    color:black;    \n");
      out.write("    text-align:center;\n");
      out.write("\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write(" \n");
      out.write("</head>\n");
      out.write("<body> \n");
      out.write("\n");
      out.write("<div id =\"footer\">\n");
      out.write("<CENTER><hr>    \n");
      out.write("    <H3>&copy; Copyrights RAYS Technologies</H3>\n");
      out.write("</CENTER>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
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
