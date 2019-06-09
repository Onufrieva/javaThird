
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 09.03.2019
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
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


    <title>New SCHEDULE</title>

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
<%--            <a href="${pageContext.request.contextPath}/servlet/newcat" class="list-group-item list-group-item-action bg-light"></a>--%>
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
                        <fmt:message key="NEW_SCHEDULE"/>
                    </div>

                    <form action="${pageContext.request.contextPath}/servlet/newschedule" method="post" align="center">



                        <div class="form-group">
                            <label for="exhname"><fmt:message key="SCHEDULE_NAME"/> </label>
                            <input type="text" class="form-control" id="exhname" name="exhname">
                        </div>
                        <div class="form-group">

                            <div class="form-group">
                                <label for="date"><fmt:message key="SCHEDULE_DATE"/> </label>
                                <input type="date" class="form-control" id="date" name="date">
                            </div>



                                <div class="form-group">
                                    <label for="price"><fmt:message key="PRICE"/> </label>
                                    <input type="number" class="form-control" id="price" name="price">
                                </div>


                            <div class="form-group">
                                <label for="hall"><fmt:message key="EXHIBITION_HALL"/></label>
                                <select name="hall" class="custom-select" id="hall">
                                    <c:forEach var="i" items="${halls}" varStatus="status">
                                        <option value="${i.getId()}">${i.getNameHall()}</option>
                                    </c:forEach>
                                </select>
                            </div>

                            <div class="form-group">
                                <label for="cat"><fmt:message key="SCHEDULE_CAT"/></label>
                                <select name="cat" class="custom-select" id="cat">
                                    <c:forEach var="i" items="${cats}" varStatus="status">
                                        <option value="${i.getIdCat()}">${i.getName()}</option>
                                    </c:forEach>
                                </select>
                            </div>

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
