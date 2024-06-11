
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Employee Registration Page</h1>
<form action="save" method="POST">
<pre>
Employee ID	 :<input type="text" name="eid"/>
Employee Name	:<input type="text" name="ename"/>
Employee Sal	:<input type="text" name="esal"/>
Employee Gen	:<input type="radio" name="empgen" value="Male">Male <input type="radio" name="empgen" value="Female">Female
Employee Addr	:<textarea name="empadddr">		</textarea>
Employee Demp	:<select name="dept">
						<option>Dev</option>
						<option>QA</option>
						<option>DB</option>
						<option>Testing</option>
				</select>
Employee Client : <select multiple="multiple" name="eclient">
				<option>AWC</option>
				<option>NIT</option>
				<option>HCL</option>
				<option>TCS</option>
</select>				
Employee Shift:<input type="checkbox" name="eshift" value="AM">AM<input type="checkbox" name="eshift" value="Noon">Noon	<input type="checkbox" name="eshift" value="PM">PM				
Employee DOJ	:<input type="date" name="date">
Employee Pass	:<input type="password" name="pass">
	<input type="submit" value="Register"/>

</pre>
</form>
</body>
</html>