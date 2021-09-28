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
 * @author Cameron
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstSelected = request.getParameter("first");
        String secondSelected = request.getParameter("second");
        request.setAttribute("firstSelected", firstSelected);
        request.setAttribute("secondSelected", secondSelected);
        
        String userSelection = request.getParameterValues("operation")[0];
        
        request.setAttribute("result", userSelection);
        if(request.getParameter("first").matches("[a-zA-Z]+") || request.getParameter("second").matches("[a-zA-Z]+") ||
            request.getParameter("first")==null || request.getParameter("second") == null || request.getParameter("first").equals("") || request.getParameter("second").equals("")){
            request.setAttribute("result", "Result: Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
            }
   
        int firstDigit = Integer.parseInt(request.getParameter("first"));
        int secondDigit = Integer.parseInt(request.getParameter("second"));
  
        if(userSelection.equals("+")){
            request.setAttribute("result", "Result: " + (firstDigit + secondDigit));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        if(userSelection.equals("-")){
            request.setAttribute("result", "Result: " + (firstDigit - secondDigit));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        if(userSelection.equals("*")){
            request.setAttribute("result", "Result: " + (firstDigit * secondDigit));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }        
        if(userSelection.equals("%")){
            request.setAttribute("result", "Result: " + (firstDigit % secondDigit));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }        
     getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
     return;
    }
    

}
