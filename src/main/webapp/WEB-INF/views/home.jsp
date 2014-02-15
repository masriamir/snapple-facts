<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:template>

    <jsp:attribute name="css">
        <%@include file="fragments/css.jspf" %>
    </jsp:attribute>

    <jsp:attribute name="js">
        <%@include file="fragments/js.jspf" %>
    </jsp:attribute>

    <jsp:attribute name="header">
        <%@include file="fragments/header.jspf" %>
    </jsp:attribute>

    <jsp:attribute name="footer">
        <%@include file="fragments/footer.jspf" %>
    </jsp:attribute>

    <jsp:body>
        <%@include file="fragments/content.jspf" %>
    </jsp:body>

</t:template>