package by.kozlov.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.function.Consumer;

public class FirstServlet extends HttpServlet {

    private static final String PATH_TO_DIR = "./NumOfVisits";
    private static final String PATH_OF_FILE = "/numOfVisits.txt";
    private static int numOfEnters = 1;
    private final Consumer<String> printer = x -> {
        File file = new File(PATH_TO_DIR);
        if (file.mkdirs()) {
            System.out.println("Directory is created");
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file.getPath() + x))) {
            bw.write(Integer.toString(numOfEnters));
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    };

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        numOfEnters++;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html><head><title>First Servlet</title></head>");
        printWriter.println("<body><h1>This is First Servlet</h1>");
        printWriter.println("<p>Number of visit is: " + numOfEnters + " </p><br>");
        printWriter.println("<p><a href=\"./index.jsp\">Go to index.jsp</a></p>");
        printWriter.println("</body></html>");
        printer.accept(PATH_OF_FILE);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    public void destroy() {
        super.destroy();
        numOfEnters = 1;
    }
}
