package vn.edu.centrasd.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;

import java.io.PrintWriter;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/*
	   Ghi đè phương thức doGet của lớp HttpServlet
	   Để: Lấy yêu cầu từ người dùng. Các yêu cầu đã được GÓI trong đối tượng request
	       và tính toán, xử lý
	       Sau đó trả kết quả cho người dùng thông qua đối tượng response
	*/
	@Override
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       
		   // Phương thức getWriter của lớp HttpServletResponse cho phép
		   // tạo ra một đối tượng của lớp PrintWriter, đồng thời gắn kết nó với luồng yêu cầu của khách
		   // cho phép trả tài liệu HTML về đúng client đã yêu cầu	
	       PrintWriter out = response.getWriter();
	       
	       //Trả các dữ liệu về thông qua phương thức println của lớp PrintWriter
	       out.println("<html>");
	       out.println("<head><title>Hello Servlet</title></head>");
	        
	       out.println("<body>");
	       out.println("<h3>Hello World</h3>");
	       out.println("This is my first Servlet");
	       out.println("</body>");
	       out.println("<html>");
	   }
	 
	   @Override
	   protected void doPost(HttpServletRequest request,
	           HttpServletResponse response) throws ServletException, IOException {
	       this.doGet(request, response);
	   }
}
