<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Sreenath Veeraiahgari</title>
		<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css" media="screen"> 
		<link rel="stylesheet" type="text/css" href="css/custom.css" >
	</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12 header">
				<div class="col-md-2">
					<img alt="logo" src="images/logo.png"  width="100%">
				</div>
				<div class="col-md-8 header-form">
					<form action="locations.do" class="form-login" method="post" id="village-form">
					<h3>Locate My Village</h3>
					<div class="col-md-12">
						<div class="col-md-3">
							<p>
								<input type="text" class="form-control" name="country" placeholder="Country" country_id="" id="countries">
							</p>
						</div>
						<div class="col-md-3">
							<p>
								<input type="text" class="form-control" name="village" placeholder="State" state_id=""  id="states">
							</p>
						</div>
						<div class="col-md-3">
							<p>
								<input type="text" class="form-control" name="district" placeholder="District" id="district">
							</p>
						</div>
						<div class="col-md-3">
							<p>
								<input type="text" class="form-control" name="mandal" placeholder="Mandal" id="mandal">
							</p>
						</div>
						<div class="col-md-3">
							<p>
								<input type="text" class="form-control" name="village" placeholder="Village" id="village">
							</p>
						</div>
						<div class="col-md-3">
							<p>
								<input type="submit" name="search" value="search">
							</p>
						</div>
					</div>
					</form>
				</div>
			</div>
			
		</div>
	</div>