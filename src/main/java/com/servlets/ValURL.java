package com.servlets;

import com.modelo.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author camil
 */
public class ValURL extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ValURL</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ValURL at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            String tourl = request.getParameter("url");
            out.println(tourl);
            ValidadorURL vurl = new ValidadorURL();
            out.println(vurl.urlValidador(tourl));
            /* if(vurl.urlValidador(tourl)==true){
            out.println("La URL: "+tourl+" es valida.");
            //out.println("Title: " +document.outerHtml());
    }else{
            out.println("No es valida.");
        }*/
            final String htmlText = "<!DOCTYPE html>" +
            "    <html>" +
            "    <head>" +
            "       <title>Java Magazine</title>" +
            "    </head>" +
            "    <body>" +
            "       <h1>Hello World!</h1>" +
            "    </body>" +
            "</html>";
            
            Document document = Jsoup.parse(htmlText);
            Elements allElements=document.getAllElements();
            for(Element element:allElements){
                out.println(element.nodeName()+" "+element.ownText());
            }
                // In case of any IO errors, we want the messages written to the console

        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
