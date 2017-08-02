package com.example;

import java.io.*;
import javax.servlet.*;

public class PersonalInfo extends GenericServlet {
		
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
		PrintWriter pw = response.getWriter();
		pw.write("Pranali Rasal\nCDK Global");
	}	

}