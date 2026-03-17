import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Port extends HttpServlet {

    // ----------- GET METHOD -------------
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Dynamic Page</title>");

        // ----- SIMPLE CSS -----
        out.println("<style>");
        out.println("body{font-family:Arial;margin:0;padding:0;}");
        out.println(".navbar{display:flex;justify-content:space-between;background:#333;padding:15px;}");
        out.println(".navbar a{color:white;text-decoration:none;}");
        out.println("</style>");

        out.println("</head>");
        out.println("<body>");

        // ----- NAVBAR -----
        out.println("<nav class='navbar'>");
        out.println("<div style='color:white;font-weight:bold;'>MyPortfolio</div>");
        out.println("<ul style='display:flex;list-style:none;gap:20px;margin:0;'>");
        out.println("<li><a href='#about'>About Me</a></li>");
        out.println("<li><a href='#education'>Education</a></li>");
        out.println("<li><a href='#skills'>Skills</a></li>");
        out.println("<li><a href='#projects'>Projects</a></li>");
        out.println("<li><a href='#contact'>Contact</a></li>");
        out.println("</ul>");
        out.println("</nav>");

        out.println("<h2>Welcome to Laxman's Portfolio</h2>");

        // ----- ABOUT SECTION -----
        out.println("<div style='display:flex;align-items:center;gap:20px;'>");

        out.println("<div style='flex:1;'>");
        out.println("<div id='about'>");
        out.println("<h2>About Me</h2>");
        out.println("<p>My name is Laxman, and my portfolio represents my learning as a science and engineering student focused on renewable energy and sustainable innovation.</p>");
        out.println("</div>");
        out.println("</div>");

        // IMAGE SIDE
        out.println("<div style='flex:1;text-align:right;'>");
        out.println("<img src='durga%20pass.jpg' style='max-width:250px;border-radius:50%;'>");
        out.println("</div>");

        out.println("</div>");

        out.println("<hr>");

        // ----- EDUCATION -----
        out.println("<div id='education'>");
        out.println("<h3>Education</h3>");
        out.println("<ul>");
        out.println("<li>B.Tech in Computer Science and Engineering, GIET University, 2020-2024</li>");
        out.println("</ul>");
        out.println("</div>");

        out.println("<hr>");

        // ----- SKILLS -----
        out.println("<div id='skills'>");
        out.println("<h3>Skills</h3>");
        out.println("<ul>");
        out.println("<li>Java, Python, C++</li>");
        out.println("<li>HTML, CSS, JavaScript</li>");
        out.println("<li>MySQL, MongoDB</li>");
        out.println("</ul>");
        out.println("</div>");

        out.println("<hr>");

        // ----- PROJECTS -----
        out.println("<div id='projects'>");
        out.println("<h3>Projects</h3>");
        out.println("<table border='1'>");
        out.println("<tr><th>SlNo</th><th>Project Name</th><th>Description</th></tr>");
        out.println("<tr><td>1</td><td>Smart Home Automation</td><td>Control appliances remotely.</td></tr>");
        out.println("<tr><td>2</td><td>Emocare</td><td>Emotion detection using ML.</td></tr>");
        out.println("<tr><td>3</td><td>TransDoot</td><td>Transport management system.</td></tr>");
        out.println("</table>");
        out.println("</div>");

        out.println("<hr>");

        // ----- CONTACT -----
        out.println("<div id='contact'>");
        out.println("<h3>Contact Information</h3>");
        out.println("<ul>");
        out.println("<li>Email: kklaxmanreddy@gmail.com</li>");
        out.println("<li>Phone: +91 7326869678</li>");
        out.println("</ul>");
        out.println("</div>");

        out.println("<hr>");

        // ----- FORM -----
        out.println("<h3>Enter your details to contact me:</h3>");
        out.println("<form method='post' action='Port'>");
        out.println("Name: <input type='text' name='username'><br><br>");
        out.println("Email: <input type='email' name='email'><br><br>");
        out.println("Phone: <input type='number' name='phone'><br><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");

        out.println("</body></html>");
    }

    // ----------- POST METHOD -------------
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        out.println("<html><body>");
        out.println("<h2>Welcome " + name + "!</h2>");
        out.println("<p>Thank you for contacting me.</p>");

        out.println("<table border='1'>");
        out.println("<tr><th>Name</th><th>Email</th><th>Phone</th></tr>");
        out.println("<tr><td>" + name + "</td><td>" + email + "</td><td>" + phone + "</td></tr>");
        out.println("</table>");

        out.println("<br><a href='Port'>Go Back</a>");
        out.println("</body></html>");
    }
}