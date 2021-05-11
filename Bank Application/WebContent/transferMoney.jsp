
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Transfer Money</title>
		<link rel="stylesheet" href="css/transfer.css" type="text/css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
</head>
<body style="background-color:#ffffff;">
	<div class="bg1img">
			<div class="centerdiv">
				
				<form action="TransferServlet" method="post" onsubmit="return valid()">
				<br><label for="sender">From </label><br>
					<div>
						<input type="text" name="snm" id="snm" class="inputbox" placeholder="Enter Name" required>
					</div><br>
					<div>
						<input type="number" name="sano" id="sano" class="inputbox" placeholder="Enter Account number" required>
					</div><br>
					<div>
						<input type="number" name="amt" id="amt" class="inputbox" placeholder="Enter Amount" required>
					</div><br>
					<label for="receiver">To</label><br>
					<div>
						<input type="text" name="rnm" id="rnm" class="inputbox" placeholder="Enter Name" required>
					</div><br>
					<div>
						<input type="number" name="rano" id="rano" class="inputbox" placeholder="Enter Account Number" required>
					</div><br><br>
					<div>
						<button type="submit" class="inputbox">Transfer</button>
					</div><br>
				</form>
					
				</div>
			</div>
		<script>
			function valid()
			{
				alert("Money Transmitted Successfully!!!")
			}
		</script>
</body>
</html>