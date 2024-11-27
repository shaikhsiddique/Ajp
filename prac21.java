/*
    Question: Develop a servlet program to print "Hello MSBTE" in the browser window.
*/

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloMSBTE")
public class prac21 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello MSBTE</h1>");
    }
}

/*<applet code="prac21.class" width="400" height="300"></applet>*/
