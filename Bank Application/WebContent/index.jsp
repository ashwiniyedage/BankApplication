<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
		<link rel="stylesheet" type="text/css" href="css/style.css" media="all" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<nav class="navbar navbar-expand-md bg-light navbar-light">
		<p class="text-justify" style="padding-left:70px;padding-top:5px;font-size:14px;">
			Global Bank stands with you during these trying times. Branches
			are open for essential banking services from Monday to Saturday
			(closed on 2nd and 4th Saturday) between 10 am & 4 pm.
		</p>
	</nav>
		<nav class="navbar navbar-expand-md navbar-dark" style="background-color: #292075;    cursor: pointer;">
			<div class="container">
    			<img style="width:170px;height:130px; " src="img/bsnk.PNG">
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsenavbar">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse text-center" id="collapsenavbar">
					<ul class="navbar-nav ml-auto" >
						<li class="nav-item">
							<a href="index.jsp" class="nav-link text-white">Home</a>
						</li>
						<li class="nav-item">
							<a href="createUser.jsp" class="nav-link text-white">Create User</a>
						</li>
						<li class="nav-item">
							<a href="transferMoney.jsp" class="nav-link text-white">Money Transfer</a>
						</li>
						<li class="nav-item">
							<a href="history.jsp" class="nav-link text-white">Transaction History</a>
						</li>
						<li class="nav-item">
							<a href="Contact.jsp" class="nav-link text-white">Contact Us</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	<div class="bgimg">
		<nav class="navbar navbar-expand-md navbar-light bg-light">
			<div class="container">
			<ul class="navbar-nav mr-auto text-left">
			<li class="nav-item">
			<div class="dropdown">
				<a class="dropdown-toggle nav-link" data-toggle="dropdown" style="padding-left:40px; color:black;">Explore Product</a>
				<div class="dropdown-menu">
				<form action="AccountsServlet" method="post">
					<button type="submit" class="dropdown-item">Account</button> 
				</form>
					<button class="dropdown-item">Deposits</button>
					<button class="dropdown-item">Cards</button>
					<button class="dropdown-item">Loan</button>
				</div>				
			</div>
			</li>
			<li class="nav-item">
			<div class="dropdown">
				<a class="dropdown-toggle nav-link" data-toggle="dropdown" style="padding-left:40px;color:black;">Make Payment</a>
				<div class="dropdown-menu">
					<a class="dropdown-item">Recharge & Pay Bills</a>
					<a class="dropdown-item">Investment</a>
					<a class="dropdown-item">Pay Taxes</a>
					<a class="dropdown-item">Overdue Payments</a>
				</div>
			</div>
			</li>
			<li class="nav-item">
			<div class="dropdown">
				<a class="dropdown-toggle nav-link" data-toggle="dropdown" style="padding-left:40px;color:black;">Smart Bank</a>
				<div class="dropdown-menu">
					<a class="dropdown-item">Online Banking</a>
					<a class="dropdown-item">Mobile Banking</a> 
					<a class="dropdown-item">Branch Banking</a> 
					<a class="dropdown-item">Phone Banking</a>
				</div>
			</div>
			</li>
			<li class="nav-item">
			<div class="dropdown">
				<a class="dropdown-toggle nav-link" data-toggle="dropdown" style="padding-left:40px;color: black;">Service</a>
				<div class="dropdown-menu">
					<a class="dropdown-item">Fund Transfer</a> 
				</div>
			</div>
			</li>
		</ul>
		</div>
		<div class="container dropdown text-center text-white hearderset">
			 <button class=" bg-warning text-white btn-lg ml-auto" type="submit">Login</button>
		</div>
		</nav>
		
	</div>
	<div class="container ourservices text-center">
		<h1>Services</h1>
		
		<div class="row rowsetting">
			<div class="col-lg-4 col-md-4 col-sm-4 col-10 d-block m-auto">
				<div class="imgseeting d-block m-auto bg-warning">
				<i class="fa fa-mobile fa-3x" aria-hidden="true"></i>
				</div>
					<h2>Mobile Banking </h2>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-4 col-10 d-block m-auto">
				<div class="imgseeting d-block m-auto bg-warning">
				<i class="fa fa-credit-card fa-3x" aria-hidden="true"></i>
				</div>
				<h2>Net Banks</h2>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-4 col-10 d-block m-auto ">
				<div class="imgseeting d-block m-auto bg-warning">
				<i class="fa fa-mobile fa-3x " aria-hidden="true"></i>
				</div>
			    <h2>Mobile Recharge</h2>
				</div>
		</div>
	</div>  
<div class="text-center ">
	<h2 style="font-weight:bold">Connect With Us</h2>	
	<nav class="navbar navbar-expand-md bg-light navbar-light">
		<div class="col-lg-2 col-md-2 col-sm-2">
			
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2 consetting">
			<a href="#">
			<i class="fa fa-facebook-official fa-4x" aria-hidden="true"></i>
			 Facebook</a>
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2">
			<a href="#">
			<i class="fa fa-instagram fa-4x" aria-hidden="true"></i>
			 Instagram</a>
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2">
			<a href="#">
			<i class="fa fa-twitter fa-4x" aria-hidden="true"></i>
			 Twitter</a>
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2">
			<a href="#">
			<i class="fa fa-youtube-play fa-4x" aria-hidden="true"></i>
			 YouTube</a>
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2">
			
		</div>
	</nav>
</div>
<footer class="page-footer font-small indigo foot" style="background-color: #dadada; margin-top: 30px;">
	<div class="container text-center text-md-left">
		<div class="row">
			<div class="col-lg-3 col-md-3 col-sm-3 col-10 d-block m-auto">
				<h5 class="font-weight-bold text-uppercase mt-3 mb-4" style="text-align: left;">Contact Us</h5>
				<ul class="list-unstyled" >
					<li class="text-left"><a href="#!">Call: 1800-419-5959</a>
					<p>to get your Account Balance</p></li>
					<li class="text-left"><a href="#!">Call: 1800-419-6969</a>
					<p>to get your Mini Statement</p></li>
					<li class="text-left"><a href="#!">Find your Nearest Branch</a></li>
					<li class="text-left"><a href="#!">Comprehensive Notice Board</a></li>
					<li class="text-left"><a href="#!">Services for customers with disabilities</a></li>
				</ul>
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-3 col-10 d-block m-auto">
				<h5 class="font-weight-bold text-uppercase mt-3 mb-4" style="text-align: left;">SHAREHOLDERS' CORNER</h5>
				<ul class="list-unstyled" >
					<li class="text-left"><a href="#!">Stock Information</a></li>
					<li class="text-left"><a href="#!">Regulatory Disclosures Section</a></li>
					<li class="text-left"><a href="#!">Shareholder's Information</a></li>
					<li class="text-left"><a href="#!">Investor FAQs</a></li>
					<li class="text-left"><a href="#!">Investor Contact</a></li>
				</ul>
			</div>
			<div class="col-lg-3 col-md-3 col-sm-3 col-10 d-block m-auto">
				<h5 class="font-weight-bold text-uppercase mt-3 mb-4" style="text-align: left;">MEDIA CENTER</h5>
				<ul class="list-unstyled" >
					<li class="text-left"><a href="#!">Corporate Profile</a></li>
					<li class="text-left"><a href="#!">Vision and Values</a></li>
					<li class="text-left"><a href="#!">Awards & Recognition</a></li>
					<li class="text-left"><a href="#!">Press release</a></li>
				</ul>
			</div>
			<div class="col-lg-3 col-md-3 col-sm-3 col-10 d-block m-auto">
				<h5 class="font-weight-bold text-uppercase mt-3 mb-4" style="text-align: left;">OTHER LINKS</h5>
				<ul class="list-unstyled" >
					<li class="text-left"><a href="#!">Global Group</a></li>
					<li class="text-left"><a href="#!">Careers</a></li>
					<li class="text-left"><a href="#!">CSR & Sustainability</a></li>
					<li class="text-left"><a href="#!">Download Forms</a></li>
					<li class="text-left"><a href="#!">Fees and Charges</a></li>
					<li class="text-left"><a href="#!">Health Insurance </a></li>
				</ul>
			</div>
		</div>	
	</div>
</footer>
		<footer style="background-color: #494949; color: white;">
		<div class="footer-copyright text-center py-3">
			© 2020 Copyright: <a href="https://mdbootstrap.com/">
				GlobalBank</a>Made By Ashwini Yedge
		</div>
		<!-- Copyright -->
	</footer>
</body>
</html>