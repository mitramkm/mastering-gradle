package ch6;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DateTimeServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {
    	Calendar cal = Calendar.getInstance();
        resp.getOutputStream().print(cal.getTime().toString());
    }

}
