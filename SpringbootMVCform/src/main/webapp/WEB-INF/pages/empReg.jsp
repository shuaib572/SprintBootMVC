
<html>
<head>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	margin: 0;
	padding: 0;
}

h1 {
	text-align: center;
	padding: 20px;
	color: #333;
}

form {
	max-width: 400px;
	margin: 0 auto;
	padding: 20px;
	background-color: #fff;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
	border-radius: 5px;
}

label {
	font-weight: bold;
	color: #555;
	display: block;
	margin-top: 10px;
}

input[type="text"], input[type="date"], select {
	width: 100%;
	padding: 10px;
	margin-top: 5px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input[type="radio"] {
	margin-top: 5px;
	margin-right: 5px;
}

select[multiple] {
	height: 100px; /* Adjust the height as needed */
	width: 100%;
	padding: 10px;
	margin-top: 5px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input[type="submit"], input[type="reset"] {
	background-color: #007bff;
	color: #fff;
	border: none;
	padding: 10px 20px;
	border-radius: 3px;
	cursor: pointer;
	margin-top: 10px;
}

input[type="submit"]:hover, input[type="reset"]:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<h1>Welcome to Employee Registration page</h1>
	<form action="save" method="post">
		Employee id :<input type="text" name="eid" /> Employee name :<input
			type="text" name="ename" /> Employee Dept :<select name="edept">
			<option>select</option>
			<option>Developer</option>
			<option>Testing</option>
			<option>HR Operation</option>
			<option>Sales</option>
		</select> Salary <input type="text" name="esal"> Employee DOJ: <input
			type="date" name=edate> Gender :<input type="radio"
			value="male" name="egen"> M <input type="radio"
			value="Female" name="egen"> F <input type="radio" name="egen">Other<br> 
		 Client	location <select id="edept" name="edept" multiple>
			<option>Noida</option>
			<option>HYD</option>
			<option>Bang</option>
			<option>DLI</option>
		</select> 
		Address <input type="text" name="eadd">
	
		<input type="submit" value="Register" /> <input type="reset"
			value="Reset">


	</form>
</body>
</html>
