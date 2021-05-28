import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


    @WebServlet(name = "guess", urlPatterns = "/guess")
    public class GuessingGameServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.getWriter().println("<h1>Welcome to the Guessing Game!</h1>");
        }
    }
