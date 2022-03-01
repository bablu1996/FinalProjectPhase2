package com.babluprasad.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.babluprasad.admin.*;
/**
 * Servlet implementation class InsertData
 */
@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			  
            // Initialize the database
            Connection con = DatabaseConnection.initializeDatabase();
  
            // Create a SQL query to insert data into demo table
            // demo table consists of two columns, so two '?' is used
            PreparedStatement st = con
                   .prepareStatement("insert into modifystudents values(?, ?, ?, ?)");
  
            // For the first parameter,
            // get the data using request object
            // sets the data to st pointer
            st.setInt(1, Integer.valueOf(request.getParameter("id")));
            st.setString(2, request.getParameter("name"));
            st.setInt(3, Integer.valueOf(request.getParameter("aclass")));
            st.setInt(4, Integer.valueOf(request.getParameter("age")));
            
            // Execute the insert command using executeUpdate()
            // to make changes in database
            int result = st.executeUpdate();
            if(result==0)
            	response.sendRedirect("/LearnersAcademy/failure.jsp");
            if(result==1)
            	response.sendRedirect("/LearnersAcademy/success.jsp");
            // Close all the connections
            st.close();
            con.close();
           
            
  
        }
        catch (Exception e) {
        	response.sendRedirect("/LearnersAcademy/failure.jsp");
            e.printStackTrace();
        }
 
	}

}
