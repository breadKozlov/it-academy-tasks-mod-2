package by.kozlov.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String message = "";
        String path = "/error.jsp";

        if (name.isEmpty()) {
            message = "Please write your name in the form";
            req.setAttribute("message",message);
        } else if (phone.isEmpty() && email.isEmpty()) {
            message = "Please write your phone number or email in the form";
            req.setAttribute("message",message);
        } else {
            path = "/welcome.jsp";
            req.setAttribute("name",name);
            req.setAttribute("phone",phone);
            req.setAttribute("email",email);
        }
        getServletContext().getRequestDispatcher(path).forward(req,resp);
    }
}
