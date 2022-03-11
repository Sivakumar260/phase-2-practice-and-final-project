package FruitShop;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/create")
public class Insertdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   try {

        Connection conn = databaseconnection.initializeDatabase();

        PreparedStatement st = conn.prepareStatement("insert into Fruitshop (name,city,value) values(?,?,?)");

		st.setString(1, request.getParameter("name"));

        st.setString(2, request.getParameter("city"));
        
        st.setInt(3, Integer.valueOf(request.getParameter("value")));

        st.executeUpdate();

        st.close();
        conn.close();

        PrintWriter out = response.getWriter();
        out.println("<html><body><b>Successfully Inserted"
                    + "</b></body></html>");
    }
    catch (Exception e) 
    {
        e.printStackTrace();
    }
}
	
}
