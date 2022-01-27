package com.br.rd;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GGOProjeto
 */
@WebServlet("/GGOProjeto")
public class GGOProjeto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GGOProjeto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		int val1 = Integer.parseInt(request.getParameter("val1"));
		int val2 = Integer.parseInt(request.getParameter("val2"));
		int val3 = Integer.parseInt(request.getParameter("val3"));
		int result ;
		
		// calculando se o quadrado é retangulo ou não
		if (val1 == 0 && val2 > 0 && val3 > 0 && (val2 == val3)){
			result = val2 * val3;
			response.getWriter().println("é um quadrado e a Area e igual a:" + result);
		}else if(val2 == 0 && val3 > 0 && val1 > 0 && (val1 == val3)) {
			result = val3 * val1;
			response.getWriter().println("é um quadrado  e a Area e igual a:" + result);
		}else if(val3 == 0 && val1 > 0 && val2 > 0 && (val2 == val1)) {
			result = val2 * val1;
			response.getWriter().println("é um quadrado  e a Area e igual a:" + result);
		}
		else if(val3 == 0 && val1 > 0 && val2 > 0 && val1 > 0 && ( val1 != val2)) {
			result = val1 * val2;
			response.getWriter().println("é um quadrado Retangulo e a Area e igual a:" + result);
		}
		else if(val2 == 0 && val3 > 0 && val1 > 0 &&  (val1 != val3)) {
			result = val1 * val3;
			response.getWriter().println("quadrado Retangulo e a Area e igual a:" + result);
		}else if(val1 == 0 && val2 > 0 && val3 > 0 &&  (val2 != val3)) {
			result = val2 * val3;
			response.getWriter().println("quadrado Retangulo e a Area e igual a:" + result);
		}
		
		// calculo para ver o tipo do triangulo
		if(val1 > 0 && val2 > 0 && val3 > 0 && val1 == val2 && val2 == val3) {
			response.getWriter().println("Triângulo Equilátero");
		}else if(val1 > 0 && val2 > 0 && val3 > 0 && (val1 == val2 || val1 == val3 || val2 == val3)) {
			response.getWriter().println("Triângulo Isósceles");
		} else if (val1 > 0 && val2 > 0 && val3 > 0 && (val1 != val2 || val1 != val3 || val2 != val3 )) {
			response.getWriter().println("Triângulo Escaleno");
		}

		
	
	
	
		

	}
}

