package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = res.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
  /*
            String page = "<html><head>\n"
                    + "<title>Login</title>\n"
                    + "<style>"
                    + ".header{color: red; border: solid 2px blue;} "
                    + "</style>"
                    + "</head>\n"
                    + "<body>\n"
                    + "<h1 class='header'>Please Login</h1>"
                    + "</body></html>";

            out.print(page);
             */
            out.println("<!DOCTYPE html>\n"
                    + "<html lang='en'>\n"
                    + "<head>\n"
                    + "    <title>Login</title>\n"
                    + "    <style>\n"
                    + "        .uname{\n"
                    + "            border: solid 2px red;\n"
                    + "            margin: 10px;\n"
                    + "            padding: 10px;\n"
                    + "        }\n"
                    + "        .pass{\n"
                    + "            border: solid 2px blue;\n"
                    + "            margin: 10px;\n"
                    + "            padding: 10px;\n"
                    + "        }\n"
                    + "    </style>\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "    <h1>Welcome to Login Page</h1>\n"
                    + "    <form action='" +req.getContextPath() + "/login-check' method='POST'>\n"
                    + "        <div class='uname'>\n"
                    + "            <label for='username'>User Name</label>\n"
                    + "            <input type='text' id='username' name='uname'>\n"
                    + "        </div>\n"
                    + "        <div class='pass'>\n"
                    + "            <label for='password'>Password</label>\n"
                    + "            <input type='password' id='password' name='passwd' >\n"
                    + "        </div>\n"
                    + "        <div>\n"
                    + "            <input type='submit' value='Login'>\n"
                    + "        </div>\n"
                    + "    </form>\n"
                    + "</body>\n"
                    + "</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
