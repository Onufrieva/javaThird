
<!DOCTYPE html>
<%@ page import="java.util.ResourceBundle" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<fmt:setBundle basename="strings"/>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">

    <meta name="author" content="">


    <title>New Film</title>

    <!-- Bootstrap core CSS -->
    <link href="../../../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../../../css/simple-sidebar.css" rel="stylesheet">

</head>

<body>

<div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <div class="bg-light border-right" id="sidebar-wrapper">
        <div class="sidebar-heading"><fmt:message key="page.all.menu"/></div>
        <div class="list-group list-group-flush">
            <a href="${pageContext.request.contextPath}/servlet/newschedule" class="list-group-item list-group-item-action bg-light"><fmt:message key="ADD_SCHEDULE"/></a>
<%--         <a href="${pageContext.request.contextPath}/servlet/newcat" class="list-group-item list-group-item-action bg-light"><fmt:message key="ADD_CATEGORY"/></a>--%>
            <a href="${pageContext.request.contextPath}/servlet/newfilm" class="list-group-item list-group-item-action bg-light"><fmt:message key="ADD_HALL"/></a>

        </div>
    </div>


    <!-- Page Content -->
    <div id="page-content-wrapper">

        <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">


            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto mt-2 mt-lg-0">

                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/servlet/logout"><fmt:message key="LOG_OUT"/></a>
                    </li>

                    </li>
                </ul>
            </div>
        </nav>

        <div class="container-fluid">

            <div class="row">

                <div class="col-sm-1">
                </div>

                <div class="col-10">
                    <div class="display-3" align="center">
                        <fmt:message key="ADD_HALL"/>
                    </div>




                    <form action="${pageContext.request.contextPath}/servlet/newfilm" method="post" align="center">

                        <div class="form-group">
                            <label for="filmname"><fmt:message key="HALL_NAME"/> </label>
                            <input type="text" class="form-control" id="filmname" name="filmname">
                        </div>

                        <div class="form-group">
                            <label for="duration"><fmt:message key="HALL_ADRESS"/> </label>
                            <input type="text" class="form-control" id="duration" name="duration">
                        </div>

                        <button type="submit" class="btn btn-primary"><fmt:message key="ADD"/> </button>

                    </form>
                </div>

                <div class="col-sm-1">

                </div>
            </div>
        </div>
    </div>
</div>

</body>

</html>
