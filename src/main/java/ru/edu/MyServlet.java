package ru.edu;

import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello") // вместо описания сервлета в src/main/webapp/WEB-INF/web.xml
public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// засовываем в Response html страницу
		PrintWriter writer = resp.getWriter();
		writer.write("<html>");
		writer.write("<body>");
		writer.write("<h1> MyServlet .doGet " + new Date() + "< /h1>");
		writer.write("</body>");
		writer.write("</html>");
	}

}
