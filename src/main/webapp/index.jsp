<%@ page import="fr.bz.javaskills.Bean.JavaSkillsBean" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="./style.css">
</head>
<body>
<jsp:useBean id="skills" class="fr.bz.javaskills.Bean.JavaSkillsBean" scope="request">
    <jsp:setProperty name="skills" property="*"/>
</jsp:useBean>
<%--<jsp:folls.jsp"></jsp:forward>--%>
<form action="skills-servlet">
    <label for="nom">Nom :</label>
    <input type="text" id="nom" name="nom" class="textPut"
           value="<jsp:getProperty name='skills' property='nom' />"><br>
    <% for(String competence : skills.getList()) { %>
    <input type="checkbox" name="skills" value="<%= competence %>" readonly>
    <label for="<%= competence %>"><%= competence %></label><br>
    <% } %>
    <input type="submit" value="Valider" class="link-button">
</form>
</body>
</html>