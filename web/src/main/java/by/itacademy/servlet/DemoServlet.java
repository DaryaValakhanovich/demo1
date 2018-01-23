package by.itacademy.servlet;

import by.itacademy.service.DemoService;
import by.itacademy.dao.DemoDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/do")
public class DemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("text", new DemoService().toDoSth(new DemoDao()));
        req.getRequestDispatcher("/WEB-INF/jsp/demo.jsp")
                .forward(req, resp);
    }
}

