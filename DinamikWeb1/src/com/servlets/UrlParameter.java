package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UrlParameter
 */
@WebServlet("/urunislemleri")
public class UrlParameter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UrlParameter() {
     
    }

	
	public void init(ServletConfig config) throws ServletException {
		
	
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//b�yle gidiyo 
		String ad=request.getParameter("ad")==null ? "":request.getParameter("ad");
		Integer adet=request.getParameter("adet")==null ? 0:Integer.parseInt(request.getParameter("adet"));
		PrintWriter pw=response.getWriter();
		pw.println("�r�nleri getirme istegi al�nd� !"+ad+" �r�nden "+adet+" Kay�t Edildi");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter pw=response.getWriter();
		pw.println("�r�nleri Kaydetme istegi al�nd� !");
		
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		PrintWriter pw=resp.getWriter();
		pw.println("�r�nleri kaydetme istegi etme !");
		
	}


	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		PrintWriter pw=resp.getWriter();
		pw.println("�r�nleri silme istegi etme !");
		
	}
	
	

}
