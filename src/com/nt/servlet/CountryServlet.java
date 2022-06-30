package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CountryServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		String IndiaStates[]= {"UP","MP","AP"};
		String USAStates[]= {"KP","CP","RP"};
		String NepalStates[]= {"LP","PP","CP"};
		String BanglaDeshStates[]= {"JP","NP","OP"};
		
		
		PrintWriter pw=null;
		String country=null;
		
		
		 pw=res.getWriter();
		 country=req.getParameter("country");
		 res.setContentType("text/html");
		
		
		 if(country.equals("1")) {
			 pw.println("<h1><b>Indian States Are</b></h1>  " +Arrays.toString(IndiaStates));
		 }
		 else if(country.equals("2")) {
			 pw.println("<h1><b>American States Are</b></h1> " +Arrays.toString(USAStates));
		 }
		 else if(country.equals("3")) {
			 pw.println("<h1><b>Nepali States Are</b></h1>  " +Arrays.toString(NepalStates));
		 }
		 else {
			 pw.println("<h1><b>Bangla States Are</b></h1>  " +Arrays.toString(BanglaDeshStates));
		 }
	
		 pw.println("<a href='page.html'>home</a><br>");
		 
		 pw.close();
		 
		 }//method 
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		doGet(req,res);
	}

}
