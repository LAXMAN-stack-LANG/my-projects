<!DOCTYPE html>
<html>
<head>
<title>JSP Calculator</title>
</head>

<body>

<center>

<h1>Mini JSP Calculator</h1>

<table border="2" cellpadding="10">

<form action="calc" method="post">

<tr>
<td>Enter First Number</td>
<td><input type="text" name="num1" placeholder="First Number"></td>
</tr>

<tr>
<td>Enter Second Number</td>
<td><input type="text" name="num2" placeholder="Second Number"></td>
</tr>

<tr>
<td>Select Operator</td>
<td>
<select name="op">
<option value="+">Addition (+)</option>
<option value="-">Subtraction (-)</option>
<option value="*">Multiplication (*)</option>
<option value="/">Division (/)</option>
</select>
</td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Calculate">
<input type="reset" value="Clear">
</td>
</tr>

</form>

</table>

</center>

</body>
</html>