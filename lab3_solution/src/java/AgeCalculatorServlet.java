/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tweet
 */
public class AgeCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(request.getParameter("age") == null){
          request.setAttribute("message", "You must give your current age");
          getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
          return;
        }
        if(!(request.getParameter("age").matches("^[0-9]*$"))){
            
          request.setAttribute("message", "You must enter a number.");
          getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
          return;
        }
        
        int userAge = Integer.parseInt(request.getParameter("age"));
        int userAgeNext = userAge + 1;
        request.setAttribute("message", "Your next age will be" + userAgeNext);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;

    }
}
