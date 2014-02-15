<%@tag description="page layout template" pageEncoding="UTF-8" %>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<%@attribute name="css" fragment="true" %>
<%@attribute name="js" fragment="true" %>

<!DOCTYPE html>
<html>

    <head>

        <meta charset="UTF-8">
        <meta name="Description" content="Enjoy random Snapple Real Facts at the click of a button!">

        <title>Random Snapple Real Facts</title>

        <jsp:invoke fragment="css" />

    </head>

    <body>

        <div class="container">

            <div class="row">
                <div class="col-md-12" id="header">
                    <jsp:invoke fragment="header" />
                </div>
            </div>

            <div class="row">
                <div class="col-md-12" id="content">
                    <jsp:doBody />
                </div>
            </div>

            <div class="row">
                <div class="col-md-12" id="footer">
                    <jsp:invoke fragment="footer" />
                </div>
            </div>

        </div>

        <jsp:invoke fragment="js" />

    </body>

</html>