package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AverageMilePerGallon;

/**
 * Servlet implementation class getAverageServlet
 */
@WebServlet("/getAverageServlet")
public class getAverageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAverageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userMiles = request.getParameter("userMiles");
		String userGallons = request.getParameter("userGallons");
		AverageMilePerGallon userInput = new AverageMilePerGallon(Integer.parseInt(userMiles),Double.valueOf(userGallons).doubleValue());
		request.setAttribute("userAveragePouch", userInput);
		getServletContext().getRequestDispatcher("/resultAverage.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
				//writer.println(userInput.toString()); //note the change to userCoins
				//writer.close();
		// TODO Auto-generated method stub
	}

}
