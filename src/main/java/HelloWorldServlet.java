import javax.script.ScriptContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    String name;

    private int counter = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        name = req.getParameter("name");

        if (name != null) {
            res.getWriter().println("<h1>Hello, " + name + "!</h1>");
        } else {
            res.getWriter().println("<h1>Hello, World!</h1>");
        }

        counter++;

        res.getWriter().println("Times you've visited this page: " + counter);

    }
}


