package ecommerce;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ecommerce.Product;

@WebServlet("/insert")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String Id=request.getParameter("productId");
		String name=request.getParameter("productName");
		String category=request.getParameter("productCategory");
		String price=request.getParameter("price");
		session.getAttribute(name);
		session.getAttribute(category);
		session.getAttribute(price);
        session.getAttribute(Id);
		session.setAttribute("productId",Id);
		session.setAttribute("productName",name);
		session.setAttribute("productCategory",category);
		session.setAttribute("price",price);
		
		response.sendRedirect("display.jsp");
	}
	}
