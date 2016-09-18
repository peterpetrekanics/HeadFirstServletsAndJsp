package com.test;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("init in servlet1 started");
    	super.init(config);
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("servlet1 - Served at: ").append(request.getContextPath()).append("\n\n");
		response.setHeader("Refresh", "3; URL=http://localhost:8080/synched_attribute/servlet1");
		synchronized(getServletContext()) {
			Enumeration<String> myAttrs = getServletContext().getAttributeNames();
			if(myAttrs.hasMoreElements()) System.out.println("true");
			while(myAttrs.hasMoreElements()){
				if(myAttrs.nextElement().equals("myProgress")){
					System.out.println("found");
					response.getWriter().append(" " + getServletContext().getAttribute("myProgress") + "\n");
				}
				
			}
		}
		response.getWriter().append("servlet1 doGet ends..");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@Override
	public void destroy() {
		System.out.println("servlet1 destroyed");
		super.destroy();
	}

}
