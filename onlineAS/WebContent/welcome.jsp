<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import = "java.util.*" session="true"%>
<%@include file="header.jsp"%>
	<title>Welcome <%=session.getAttribute("name")%></title>  
    <h3>Login successful!!!</h3>  
    <h4>Hello,
    		<%=session.getAttribute("name")%></h4>
    <H1>Using Sessions to Track Users</H1>
        Session ID: <%=session.getId()%>
        <BR>
        Session creation time: <%=new Date(session.getCreationTime())%>
        <BR>
        Last accessed time: <%=new Date(session.getLastAccessedTime())%>
  <ul>
  	<li><a href="${root}userServlet">User Profile</a></li>
  </ul>    
         
</body>  
</html>  
