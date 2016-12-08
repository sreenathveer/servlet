<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="css/bootstrap/css/bootstrap-responsive.css" media="screen"> 
		<link rel="stylesheet" type="text/css" href="css/custom/custom.css" > 
</head>
	<body>
		 <header>
		 	<div class="row-fluid">
		 		<div class="span12 span">
		 			<div class="span6">
							<img alt="" src="${pageContext.request.contextPath}/images/logo.png" >
					</div>
					<div class="span4"></div>
		 			<div class="span2">
		 					<c:set var="session_id" scope="session" value="<%=session.getId()%>"/>
		 					<c:choose>
							    <c:when test="${session_id == null}">
							       <img alt="login" src="${pageContext.request.contextPath}/images/login2.png" >
								   <img alt="register" src="${pageContext.request.contextPath}/images/register2.png" >
							    </c:when>
							    <c:otherwise>
							        <img alt="login" src="${pageContext.request.contextPath}/images/login2.png" >
							    </c:otherwise>
							</c:choose>
					</div>
		 		</div>
		 	</div>
		 </header>	
		 <hr>