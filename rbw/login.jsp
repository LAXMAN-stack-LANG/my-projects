<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Login</h1>
    <form  method="post">
        <select name="userType" id="userType">
            <option value="student">Student</option>
            <option value="admin">Admin</option>
        </select><br><br>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>
        <input type="submit" value="Login"> 
    </form>
    <% String name = request.getParameter("username");
       String password = request.getParameter("password");
       String userType = request.getParameter("userType");
       if (name != null && password != null) {
           if (userType.equals("admin") && name.equals("LaxmanADM") && password.equals("adm123")) {
               session.setAttribute("username", name);
               response.sendRedirect("admin.jsp");
           } else if (userType.equals("student") && name.equals("LaxmanSTU") && password.equals("stu123")) {
               session.setAttribute("username", name);
               response.sendRedirect("student.jsp");
           } else {
               out.println("<p style='color:red;'>Invalid username or password</p>");
           }
       }
       %>
</body>
</html>