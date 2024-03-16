package  com.lxisoft.app;
import java.sql.PreparedStatement;
import java.sql.*;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
    Contact contact = new Contact();
    String url = "jdbc:mysql://localhost:3306/contacts";
    String password = "root";
    String username = "root";

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        createContact(request, response);
    }
    public void createContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String firstName = request.getParameter("firstName");
            String phoneNumber = request.getParameter("phoneNumber");

            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                String query = "INSERT INTO contactinfo (name, phoneNo) VALUES (?, ?)";
                try (PreparedStatement prep = connection.prepareStatement(query)) {
                    prep.setString(1, firstName);
                    prep.setString(2, phoneNumber);
                    prep.executeUpdate();
                }
            }
            request.setAttribute("contact", contact);
            request.getRequestDispatcher("input.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            // Forward to an error page or handle the error appropriately
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }



    public void updateContact(HttpServletRequest request, HttpServletResponse response) {

    }

    public void deleteContact(HttpServletRequest request, HttpServletResponse response){}
}


