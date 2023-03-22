package by.kozlov.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/go")
public class UserAgentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String info = req.getHeader("User-Agent");
        String message;

        if (info.contains("Edge")) {
            message = "Edge";
        } else if (info.contains("Opera")) {
            message = "Opera";
        } else if (info.contains("FireFox")) {
            message = "FireFox";
        } else {
            message = "Chrome";
        }

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html><head><title>Servlet</title></head>");
        printWriter.println("<body>");
        printWriter.println("<p>Hello " + message + " user</p><br>");
        printWriter.println("<p><a href=\"./index.jsp\">Go to index.jsp</a></p>");
        printWriter.println("</body></html>");
    }
}
