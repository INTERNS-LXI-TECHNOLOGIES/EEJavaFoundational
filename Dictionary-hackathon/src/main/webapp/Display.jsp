<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>
<fmt:setLocale value="${locallang}" />
<fmt:setBundle basename="Messages" />

<!DOCTYPE html>
<html lang="${param.lang}">
<head> 
<style>
.button{
			  background-color: #FF0000;
			  color: white;
			  text-align: center;
			  text-decoration: none;
			  display: inline-block;
			  cursor: pointer;

       }
	table th,td 
	{	width: 2px;
		border:2px solid black;

	}
</style> 
	<h1 align="center"> DICTIONARY </h1>
	<title>
	Display 	
	</title>

</head>
<body button style ="background: lightgreen">

<%@page import = "com.lxisoft.servet.*"%>
<%@page import = "com.lxisoft.sqlrepository.*"%>
<%@page import = "com.lxisoft.model.*,java.util.*"%>

<table align="center" style="border-collapse: collapse;">
	        <tr>
				<th style="font-family: fantasy;font size: 10px"> WORD</th>
				
			</tr>
<% ArrayList<Word> wordList=(ArrayList<Word>) request.getAttribute("wordList");
	
	for(Word i : wordList)
		{ %>
			<b>
				

			<tr style=" font-style:oblique;  ">
			<td>
				<a href="Select.jsp?temp=<%=i.getMeaning()%>">
					
					<input type="button" name="submit" value="<%=i.getWord()%>">
				</a><br>

		<%
	}
		%> 
</table>

<center><br>
<% if (request.isUserInRole("admin")) 
   { %>

   	<button class="button" onclick=" window.location.href='Add.jsp'"> ADD NEW WORD 
  <%
   }
  %>
</center>
</body>
<footer>

</footer>
</html>