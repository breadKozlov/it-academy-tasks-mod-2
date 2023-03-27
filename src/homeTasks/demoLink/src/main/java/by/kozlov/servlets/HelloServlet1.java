package by.kozlov.servlets;

import by.kozlov.entity.Link;
import by.kozlov.entity.Modules;
import by.kozlov.entity.Theme;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/hello1")
public class HelloServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String message = Modules.MODULE1.getNameOfModule();
        List<Theme> listModuleOne = Modules.MODULE1.getThemesOfModule();

        out.println("<html>");
        out.println("<head><style>" +
                "table,th,tr,td{ width: 300px;" +
                "height:30px;" +
                "border: solid 1px silver;" +
                "text-align:center;" +
                "border-collapse: collapse;}" +
                "</style></head>");
        out.println("<body>");
        out.println("<h1>" + message + "</h1>");

        out.println("<table>");
        for (Theme value : listModuleOne) {
            out.println("<tr><td>" + value.getNameOfTheme() + "</td><td>");
            for (Link link : value.getLinks()) {
                out.println("<a href=\"" + link.getLink() + "\">" + link.getDescription() + "</a><br>");
            }
            out.println("</td></tr>");
        }
        out.println("</table>");
        out.println("<a href='/'>Назад</a>");
        out.println("</body></html>");
    }
}
