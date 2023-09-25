<%@ page import ="java.sql.* " %>
<%@ page import ="com.lxisoft.ibrahim.workshoptwo.product.productmodel.*"%>
<%@ page import="org.apache.logging.log4j.Logger,org.apache.logging.log4j.LogManager" %>
<html>
<body>

<h1> Here Is Your product Details </h1>
<%
Logger logger = LogManager.getLogger("employee");
try{
Connection con = null;

Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven","root","root");
if(con!=null){
out.write("- connection created successfully");

} else{


out.write("- Not connection created successfully");
}

Statement statement = con.createStatement();

 ResultSet results = statement.executeQuery("Select * from  product ");

 while(results.next()){

     ProductModel pm = new ProductModel();



          pm.setProduct_category( results.getString("product_category"));

          pm.setProduct_price(results.getDouble("product_price"));

         out.write("product category:"+ pm.getProduct_category());

          out.write("product price"+pm.getProduct_price());



 }
    con.close();
}
catch(Exception e){
logger.info(e.getMessage());
}

%>


</body>
</html>
