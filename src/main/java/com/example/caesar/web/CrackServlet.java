package com.example.caesar.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.caesar.util.CaesarCipher;
import com.example.caesar.util.CaesarCipherCracker;

/**
 * Servlet Class for Cracking Caesar Cipher
 */
@WebServlet("/crack")
public class CrackServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = request.getParameter("message");
		
		int shift = CaesarCipherCracker.guessShift(message);
		String resultMessage = CaesarCipher.decrypt(shift, message);
		request.setAttribute("message", resultMessage);

		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
