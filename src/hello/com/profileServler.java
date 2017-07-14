package hello.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.google.appengine.api.urlfetch.HTTPResponse;

public class profileServler extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		//req.getRequestDispatcher("link.html").include(req, res);  
        
        Cookie ck[]=req.getCookies(); 
        
        if(ck!=null){  
         String name=ck[0].getValue();  
        out.println("welcome "+ name);
        }
        else{  
            out.print("Please login first");  
            req.getRequestDispatcher("login.html").include(req, res);  
        }  
        out.close();  
		
		
	}

}
