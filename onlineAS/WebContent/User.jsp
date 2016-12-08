<%@page import="com.sree.DAO.UserDao"%>
<%@page import="com.sree.services.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Actions</title>
</head>
<body>
        <div>
            <table>
                <thead>
                    <tr>
                        <th>Emp ID</th>
                        <th>Name</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Salary</th>
                        <th>Designation</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        UserDao user = new UserDao();
                    	List<User> list = user.getUsers();
                        for (User e : list) {
                    %>
 
                    <tr>
                        <td><%=String.valueOf(e.getUserId())%></td>
                        <td><%=e.getName()%></td>
                        <td><%=e.getEmail()%></td>
                        <td><a href="mailto:<%=e.getEmail()%>"><%=e.getEmail()%></a></td>
                        <td><%=String.valueOf(e.getCountry())%></td>
                       <td style="border: none;">
                            <div>
                                <form method="post" action="UserUpdate.jsp">
                                    <input type="hidden" id="updateId" name="updateId" value="<%=String.valueOf(e.getUserId())%>"/> 
                                    <input type="submit" value="Modify..."/> 
                                </form>
                            </div>
                        </td>
                        <td style="border: none;">
                            <div>
                                <form method="post" action="DeleteServlet">
                                    <input type="hidden" id="delId" name="delId" value="<%=String.valueOf(e.getUserId())%>"/> 
                                    <input type="submit" value="Delete"/> 
                                </form>
                            </div>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>