
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Create User</title>
		<link rel="stylesheet" href="css/RegiSite.css" type="text/css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
</head>
<body style="background-color:#e7e7e7;">
	<div class="bg1img">
			<div class="centerdiv">
				
				<h2>User Registration</h2>
				<form action="CreateUserServlet" method="post" onsubmit="return valid()">
					<div>
						<input type="text" name="uname" id="uname" class="inputbox" placeholder="Enter Name" required>
					</div><br>
					<div>
						<input type="email" name="email" id="mail" class="inputbox" placeholder="Enter EmailId" required>
					</div><br>
					<div>
						<input type="number" name="ano" id="acno" class="inputbox" placeholder="Enter Account number" required>
					</div><br>
					<div>
						<input type="number" name="bal" id="bal" class="inputbox" placeholder="Enter Balance" required>
					</div><br>
					<div>
						<button type="submit" class="inputbox">Submit</button>
					</div><br>
				</form>
					
				</div>
			</div>
		<script>
			function valid()
			{
				alert("Account Created!!!");
			}
		</script>
</body>
</html>