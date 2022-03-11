package Crudoperations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import details.classes;

@WebServlet("/Addclasses")
public class Addclasses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   try {
			   PrintWriter out = response.getWriter();
			   String param=request.getParameter("ID");
			   int id= Integer.parseInt(param);
			   String param1=request.getParameter("section");
			   int section= Integer.parseInt(param1);
			   String teacher=request.getParameter("teacher");
			   String subject=request.getParameter("subject");

	        Connection conn = databaseconnection.initializeDatabase();
	        

	        PreparedStatement st = conn.prepareStatement("insert into classes (id,section,teacher,subject) values(?,?,?,?)");
	        st.setInt(1, id);
			st.setInt(2, section);
	        st.setString(3,teacher);
	        st.setString(4, subject);

	        st.executeUpdate();

	        st.close();
	        conn.close();

	       
	        out.println("<html><body><b><h1 align='center'>Successfully Inserted</h1>"
	                    + "</b><br>"+"<h3 align='center'><a href='class.jsp'>Return to Classes</a></h3>\"</body></html>");
	    }
	    catch (Exception e) 
	    {
	        e.printStackTrace();
	    }
	}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
