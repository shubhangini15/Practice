package com.wish;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WishSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public WishSrv() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		   res.setContentType("text/html"); //dispatches all information to client window
		   PrintWriter out = res.getWriter();
		   
		   Date d1 = new Date();
		 
		   String str = d1.toString();
		   
		   int hour = d1.getHours();
		   
			out.print("<HTML><body bgcolor=orange><center>");
			
			String displayTime = req.getParameter(str);
			
		   out.println("<b><center> Date & Time is: "+d1 +"</b></center><br><br>");
		   if(hour < 12) {
				out.print("Good Morning!");
			} else if (hour < 17 && hour >= 12) {
				out.print("Good Afternoon. Have a good day!");
			} else if(hour > 17 && hour <= 20) {
				out.print("Good Evening");
			} else
				out.print("Goodnight!");
		   
		   out.println("</body></HTML>");
	}

}
