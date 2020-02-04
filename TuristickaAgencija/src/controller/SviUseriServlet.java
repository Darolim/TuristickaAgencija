package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SviUseriService;


@WebServlet("/SviUseriServlet")
public class SviUseriServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SviUseriServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SviUseriService service = new SviUseriService();
		
	}

}
