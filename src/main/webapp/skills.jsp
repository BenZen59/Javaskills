<%@ page import="fr.bz.javaskills.Bean.JavaSkillsBean" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ taglib prefix="mt" uri="/WEB-INF/myTags.tld" %>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="./style.css">
</head>
<body>
<jsp:useBean id="javaSkillsBean" class="fr.bz.javaskills.Bean.JavaSkillsBean" scope="request">
    <jsp:setProperty name="skills" property="*"/>
</jsp:useBean>
<h1>${javaSkillsBean.nom}</h1>
<h1>Compétences Acquis</h1>
<div class="acquis">
    <% for (String competence : javaSkillsBean.getAcquisElements()) { %>

    <%=competence%>
    <br>
    <% } %></div>
<h1>Compétences Non Acquis</h1>
<div class="nonAcquis">
    <% for (String competence : javaSkillsBean.getNonAcquisElements()) { %>

    <%=competence%>
    <br>
    <% } %></div>
<h5><mt:LoremIpsum taille="1000"/></h5> <%-- mini 177 --%>
</body>
</html>