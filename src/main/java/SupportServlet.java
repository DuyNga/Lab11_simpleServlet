import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/support")
public class SupportServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("support.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = this.getServletContext();
        String supportEmail = sc.getInitParameter("support-email");
        String name = req.getParameter("txtName");
        String email = req.getParameter("txtEmail");
        String text = "Thank you! %s for contacting us. ";
        String id = String.valueOf((int)Math.random() * 50 + 1);
        text += "We should receive reply from us with in 24 hrs in your email address %s. ";
        text += "Let us know in our support email %s if you don't receive reply within 24 hrs. ";
        text += "Please be sure to attach your reference %s in your email.";
        PrintWriter out = resp.getWriter();
        out.print("<html><head><title>IT Support</title></head><body>");
        out.print(String.format(text, name, email,supportEmail, id));
        out.print("</body></html>");
    }
}
