package SpringWork.servlets;

import SpringWork.models.MapTask;
import SpringWork.repositorys.MapTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = {"web-map"})
public class MainServlet extends HttpServlet {

    @Autowired
    private MapTaskRepository mapTaskRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        resp.getWriter().write("SERVICE!\n");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("doGet!\n");
        Iterable<MapTask> mapping = mapTaskRepository.findAll();
        resp.getWriter().write(mapping.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("doPost!\n");
    }

    @Override
    public void destroy() {
    }
}
