package pac1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WeatherServlet
 */
@WebServlet("/WeatherServlet")
public class WeatherServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double rand = Math.random();
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\"/>");
		out.println("<title>お天気予報</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>お天気を予想します</h1>");
		out.print("<p>天気は、");
		if(rand >= 0 && rand < 0.5) {
			out.print("晴れです");
		} else if(rand >= 0.5 && rand < 0.8) {
			out.print("くもりですねぇ");
		} else {
			out.print("雨でしょう");
		}
		out.println("</p>");
		out.println("</body>");
		out.println("");
		out.println("</html>");
		
		
	}
}
