<jsp:useBean id="student" class="StudentBean"/>

<jsp:setProperty name="student" property="name"/>
<jsp:setProperty name="student" property="age"/>

<html>
<body>

<h2>Student Profile</h2>

Name: <jsp:getProperty name="student" property="name"/><br>
Age: <jsp:getProperty name="student" property="age"/>

</body>
</html>