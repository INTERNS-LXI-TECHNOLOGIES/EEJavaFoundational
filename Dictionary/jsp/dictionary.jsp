<!DOCTYPE html>
  </head>
  <body style="background-color:powderblue;">

     <h3> <header>English Dictionary</header></h3>

    <%@ page import="com.lxisoft.model.Word" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.List" %>

      <div class="container">
        <form>
        <h4><input type="search" placeholder="Search Word">
        <button type="submit">Search</button></h4>

      </form>
      <form class="nosubmit">
      </form>
      </div>

       <%List<Word> words = (ArrayList<Word>) request.getAttribute("words");%>

                  <p class="info-text">Type any existing word and click Search to get meaning, example, synonyms, etc.</p>
    </div>
  </body>
</html>
