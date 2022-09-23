package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AverageMilePerGallon;
import model.valuePerMile;

/**
 * Servlet implementation class getPriceServlet
 */
@WebServlet("/getPriceServlet")
public class getPriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPriceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String userCost = request.getParameter("userCost");
		String userMiles = request.getParameter("userMiles");
		valuePerMile userInputSecond = new valuePerMile(Double.valueOf(userCost).doubleValue(),Integer.parseInt(userMiles));
		request.setAttribute("userAveragePouch", userInputSecond);
		getServletContext().getRequestDispatcher("/resultPrice.jsp").forward(request, response);
	}

}
