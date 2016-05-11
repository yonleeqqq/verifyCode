package com.heima.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dsna.util.images.ValidateCode;

public class VerifyPhoto extends HttpServlet {

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
		response.setContentType("image/jpeg");
		//������֤��
		ValidateCode code = new ValidateCode(150,70,4,20);
		//����ȷ�𰸷���Session
		String str = code.getCode();
		request.getSession().setAttribute("code",str);
		//��ͼƬ�����͸������
		code.write(response.getOutputStream());
	}


}
