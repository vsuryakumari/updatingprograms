package hello.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		
		String name=req.getParameter("username");
		String password=req.getParameter("pword");
		if(password.equals("suji"))
		{
			  out.print("You are successfully logged in!");  
	            out.print("Welcome, " +name);  
	          //  req.getRequestDispatcher("link.html").forward(req, res);
	            
	      Cookie  ck=new Cookie("name",name);  
	            res.addCookie(ck);  
	           
	        }else{  
	            out.print("sorry, username or password error!");  
	           req.getRequestDispatcher("Login.html").include(req,res);
	           
	        }  
	          
	        out.close();  
	    }  
		
		
	}


