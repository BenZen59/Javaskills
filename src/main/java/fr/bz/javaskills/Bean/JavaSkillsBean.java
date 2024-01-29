package fr.bz.javaskills.Bean;

import java.util.ArrayList;

public class JavaSkillsBean {
    private String nom = "";
    private ArrayList<String> acquisElements;
    private ArrayList<String >nonAcquisElements;
    private String[] list = {
            "Java",
            "JVM (Java Virtual Machine)",
            "JRE (Java Runtime Environment)",
            "JDK (Java Development Kit)",
            "POO (Programmation Orientée Objet)",
            "Héritage",
            "Polymorphisme",
            "Encapsulation",
            "Abstraction",
            "Interface",
            "Classe",
            "Méthode",
            "Variable",
            "Thread",
            "Exception",
            "Collection",
            "Framework",
            "API (Interface de Programmation d'Application)",
            "IDE (Environnement de Développement Intégré)",
            "JavaFX",
            "Swing",
            "Servlet",
            "JSP (JavaServer Pages)",
            "JDBC (Java Database Connectivity)",
            "Maven",
            "Gradle",
            "JUnit",
            "Spring Framework",
            "RESTful",
            "JSON (JavaScript Object Notation)"
    };

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<String> getAcquisElements() {
        return acquisElements;
    }

    public void setAcquisElements(ArrayList<String> acquisElements) {
        this.acquisElements = acquisElements;
    }

    public ArrayList<String> getNonAcquisElements() {
        return nonAcquisElements;
    }

    public void setNonAcquisElements(ArrayList<String> nonAcquisElements) {
        this.nonAcquisElements = nonAcquisElements;
    }

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }
}
