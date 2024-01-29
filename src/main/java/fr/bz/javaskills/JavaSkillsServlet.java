package fr.bz.javaskills;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.bz.javaskills.Bean.JavaSkillsBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/skills-servlet")
public class JavaSkillsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        process(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        process(request, response);
    }

    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String nom = request.getParameter("nom");
        String[] acquisElements = request.getParameterValues("skills");
        JavaSkillsBean javaSkillsBean = new JavaSkillsBean();
        javaSkillsBean.setNom(nom);
        javaSkillsBean.setAcquisElements(new ArrayList<>(Arrays.asList(acquisElements)));
        request.setAttribute("javaSkillsBean", javaSkillsBean);
        List<String> allSkills = List.of(javaSkillsBean.getList());
        String[] nonAcquisElements;
        if (acquisElements != null) {
            List<String> noSelectedSkills = new ArrayList<>(allSkills);
            noSelectedSkills.removeAll(List.of(acquisElements));
            nonAcquisElements = noSelectedSkills.toArray(new String[0]);
            javaSkillsBean.setNonAcquisElements(new ArrayList<>(Arrays.asList(nonAcquisElements)));
            request.setAttribute("javaSkillsBean", javaSkillsBean);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("skills.jsp");
        dispatcher.forward(request, response);
    }

    public void destroy() {
    }
}