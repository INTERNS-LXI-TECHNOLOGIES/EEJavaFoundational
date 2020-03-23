<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<%@ page import="java.util.*" %> 
<%@ page import="com.lxisoft.model.Model"%>
<%@page import = "com.lxisoft.config.*"%>
<%@page contentType = "text/html;charset=UTF-8" pageEncoding = "UTF-8"%>
<!DOCTYPE HTML >
<html>
<head>
<title>MOCK EXAM</title>
</head>
<body background="image/earth.jpg">
 <%
  Internationalization international=new Internationalization();
  String language = session.getAttribute("language").toString();
  

  if(language==null)
  {
    language="en";
  }
  session.setAttribute("language",language);
  String datasofmock = international.localization(language,"IN","Datas_of_mock_Exam");
  String id= international.localization(language,"IN","Id");
  String questions = international.localization(language,"IN","Questions");
  String answer = international.localization(language,"IN","Answer");
  String option1 = international.localization(language,"IN","Option1");
  String option2 = international.localization(language,"IN","Option2");
  String option3 = international.localization(language,"IN","Option3");
  String submit = international.localization(language,"IN","Submit");
  String delete = international.localization(language,"IN","Delete");
  String back = international.localization(language,"IN","Back");

  %>

<h2><font color="#87CEFA" style="margin-left: 43%"><%=datasofmock%></h2>
<%ArrayList<Model>datas=(ArrayList<Model>)session.getAttribute("array");%>
<TABLE align="center" cellpadding="15" border="1" style="background-color:  #122f39" >
	<tr>
    <th><%out.println(id);%></th>
    <th><%=questions%></th>
    <th><%=answer%></th> 
    <th><%=option1%></th>
    <th><%=option2%></th>
    <th><%=option3%></th>
    <th><%=delete%></th>
  </tr>
<% try{

for (int i=0;i<datas.size();i++){%>

<TR>
<TD><%out.println(i+1);%></TD>
<TD><%=(datas.get(i).getQuestion())%></TD>
<TD><%=(datas.get(i).getAnswer())%></TD>
<TD><%=(datas.get(i).getOption1())%></TD>
<TD><%=(datas.get(i).getOption2())%></TD>
<TD><%=(datas.get(i).getOption3())%></TD>
<form>
<TD><button formaction="delete" name="Delete" value=<%out.println(datas.get(i).getId());%>><%=delete%></button></TD>
</form>
</TR>
<% } 
} catch (Exception e) {
%>
</font>
<font size="+3" color="#87CEFA" style="margin-left:-6%"><br></br>
<%
	e.printStackTrace();
	out.println(e);
}
%>

</TR>
</TABLE>
</font>
<form style="margin-left: 45%">
<button type="submit" formaction="delete.jsp" ><%=submit%></button>
<button type="submit" formaction="admin.jsp"  ><%=back%></button></TD></TD>
</form>
</body> 
</html>