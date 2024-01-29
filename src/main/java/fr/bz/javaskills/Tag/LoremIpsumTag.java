package fr.bz.javaskills.Tag;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

import java.io.IOException;

public class LoremIpsumTag extends SimpleTagSupport {
    private int taille;

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque vestibulum accumsan turpis eu" +
                "euismod.";
        while (lorem.length() < taille) {
           lorem+=lorem;
        }
        lorem = lorem.substring(0,taille);
        out.println(lorem);
    }
}
