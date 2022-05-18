<!DOCTYPE html>
  </head>
  <body style="background-color:powderblue;">

      <header>English Dictionary</header>

    <%@ page import="com.lxisoft.model.Dictionary" %>
    <% Dictionary dictionary = new Dictionary();%>
    <% 
    dictionary.setWords("Abomasum"); 
    dictionary.setMeaning(" The fourth stomach of a ruminant, such as a cow or sheep (noun)");
    %>
    
    <h5> WORD :  
    <%= dictionary.getWords() %> 
    MEANING : 
    <%= dictionary.getMeaning() %></h5>

      <div class="container">
        <form>
        <input type="search" placeholder="Search Word">
        <button type="submit">Search</button>
      </form>
      <form class="nosubmit">
      </form>
      </div>
      <p class="info-text">Type any existing word and press enter to get meaning, example, synonyms, etc.</p>
      <ul>
          <div class="details">
          </div>
        <div class="content">
          <li class="meaning">
            <div class="details">
              <p>Meaning</p>
            </div>
          <li class="example">
            <div class="details">
              <p>Example</p>
            </div>
          <li class="synonyms">
            <div class="details">
              <p>Synonyms</p>
              <div class="list"></div>
            </div>
          </li>
        </div>
      </ul>
    </div>
  </body>
</html>
