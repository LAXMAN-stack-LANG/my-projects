<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
</head>
<body>
    <h1>Admin Dashboard</h1>
    <% String username = (String) session.getAttribute("username");
       if (username != null) {
           out.println("<p>Welcome, " + username + "!</p>");

       } else {
           out.println("<p style='color:red;'>Please log in first.</p>");
       }
    %>
</body>
</html>