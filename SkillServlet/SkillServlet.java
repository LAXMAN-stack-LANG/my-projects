import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SkillServlet extends HttpServlet {
    // 
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Dynamic Page</title></head>");
        out.println("<body>");
        out.println("<h2>Enter Your Details</h2>");

        out.println("<form method='post' action='Form'>");
        out.println("Name: <input type='text' name='username'><br><br>");
        out.println("skill :<p><input type='checkbox' name='skills' value='Java'> Java<br>");
        out.println("<input type='checkbox' name='skills' value='Python'> Python<br>");
        out.println("<input type='checkbox' name='skills' value='C++'> C++<br><br>");
        out.println("<input type='checkbox' name='skills' value='JavaScript'> JavaScript<br><br>");
        out.println("<input type='checkbox' name='skills' value='HTML'> HTML<br><br>");
        out.println("<input type='checkbox' name='skills' value='CSS'> CSS<br><br>");
        out.println("<input type='checkbox' name='skills' value='SQL'> SQL<br><br>");
        out.println("<input type='checkbox' name='skills' value='Ruby'> Ruby<br><br>");
        out.println("<input type='checkbox' name='skills' value='Go'> Go<br><br>");
        out.println("<input type='checkbox' name='skills' value='Swift'> Swift<br><br>");
        out.println("<input type='checkbox' name='skills' value='Kotlin'> Kotlin<br><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        String[] skills = request.getParameterValues("skills");

        out.println("<html>");
        out.println("<head><title>Response Page</title></head>");
        out.println("<body>");

        out.println("<h2>Welcome " + name + "!</h2>");
        out.println("<p>Your skills are:</p><ul>");

        if (skills != null) {
            for (String skill : skills) {
                out.println("<li>" + skill + "</li>");
            }
        } else {
            out.println("<li>No skills selected</li>");
        }

        out.println("</ul>");
        out.println("<br><a href='Form'>Go Back</a>");

        out.println("</body></html>");
    }
}