package us.inturik.bikeuppstore.CTRL;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class BikuppStore_BakcendServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Servicio en proceso...");
	}
}
