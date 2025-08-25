// import jakarta.servlet.*;
 import java.io.*;

 import jakarta.servlet.http.*;
 public class storeservlet  extends HttpServlet
 {
	                                         
	 public  void service(HttpServletRequest request,HttpServletResponse response)
	 {
		try{ 
		String name=request.getParameter("name");//surya
		String age=request.getParameter("age");//24
		
		// created object for http sesiion 
		
		HttpSession session=request.getSession();
		
		session.setAttribute("name",name); // name=surya
		session.setAttribute("age",age);//age=24
		
		
		
		response.sendRedirect("welcome");
		}
		catch(Exception e)
		{
		}
			 
		
	 }
 }
 