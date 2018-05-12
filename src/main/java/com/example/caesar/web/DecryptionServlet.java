package com.example.caesar.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.caesar.util.CaesarCipher;

/**
 * Servlet Class for Decrypting Caesar Cipher
 */
@WebServlet("/decrypt")
public class DecryptionServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String shift = request.getParameter("shift");
		String message = request.getParameter("message");
		int shiftNum = 0;

		try {
			shiftNum = Integer.parseInt(shift);
		} catch (NumberFormatException e) {
			request.setAttribute("message", "Please specify valid shift number.");
		}

		String resultMessage = CaesarCipher.decrypt(shiftNum, message);
		request.setAttribute("message", resultMessage);

		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
