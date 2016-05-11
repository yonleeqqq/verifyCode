package com.heima.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����û���д����֤��
		String userCode = request.getParameter("verify");
		//�õ�session�е�code
		String sessionCode = (String) request.getSession().getAttribute("code");
		//�ȶ� 
		if(userCode!=null&&userCode.equalsIgnoreCase(sessionCode)){
			//�ɹ� ��¼�ɹ�
			response.sendRedirect("/verifyCode/index.jsp");
		}else{
			//ʧ�� ת������¼ҳ�沢��ʾ
			request.setAttribute("error","��֤���������");
			request.getRequestDispatcher("/MyJsp.jsp").forward(request,response);
		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
