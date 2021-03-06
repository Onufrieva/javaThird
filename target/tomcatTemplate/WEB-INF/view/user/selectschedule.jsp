<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10.03.2019
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page import="java.util.ResourceBundle" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<fmt:setBundle basename="strings"/>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">

    <meta name="author" content="">


    <title>SCHEDULEs</title>

    <!-- Bootstrap core CSS -->
    <link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/css/simple-sidebar.css" rel="stylesheet">

</head>

<body>

<div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <div class="bg-light border-right" id="sidebar-wrapper">
        <div class="sidebar-heading"><fmt:message key="page.all.menu"/></div>
        <div class="list-group list-group-flush">
            <a href="${pageContext.request.contextPath}/servlet/gotoselect" class="list-group-item list-group-item-action bg-light"><fmt:message key="SCHEDULES"/></a>
            <a href="${pageContext.request.contextPath}/servlet/gotomytickets" class="list-group-item list-group-item-action bg-light"><fmt:message key="MY_TICKETS"/></a>

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
            <form action="${pageContext.request.contextPath}/servlet/update" method="post">
                <div class="row">
                    <div class="col-sm-4">
                        <div class="form-group">
                            <label for="hall"><fmt:message key="EXHIBITION_HALL"/></label>
                            <select name="hall" class="custom-select" id="hall">
                                <option selected value="0"><fmt:message key="ALL"/></option>
                                <c:forEach var="i" items="${halls}" varStatus="status">
                                    <option value="${i.getId()}">${i.getNameHall()}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="col-sm-4">
                        <div class="form-group">
                            <label for="cat"><fmt:message key="SCHEDULE_CAT"/></label>
                            <select name="cat" class="custom-select" id="cat">
                                <option selected value="0"><fmt:message key="ALL"/></option>
                                <c:forEach var="i" items="${cats}" varStatus="status">
                                    <option value="${i.getIdCat()}">${i.getName()}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <button type="submit" class="btn btn-primary" style = "margin-top: 9%;"><fmt:message key="UPDATE"/> </button>
                    </div>
                </div>
            </form>

            <c:if test="${fn:length(expos) eq 0}">
                <div class="alert alert-danger">
                    <strong>Error!</strong> <fmt:message key="ERROR_SEARCH"/>
                </div>
            </c:if>

            <c:if test="${fn:length(expos) gt 0}">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th><fmt:message key="TABLE_ID_SCHEDULE"/> </th>
                            <th><fmt:message key="TABLE_HALL"/> </th>
                            <th><fmt:message key="TABLE_CAT"/> </th>
                            <th><fmt:message key="TABLE_NAME_SCHEDULE"/> </th>
                            <th><fmt:message key="TABLE_PRICE"/> </th>
                            <th><fmt:message key="TABLE_DATE"/> </th>
                            <th><fmt:message key="button.book"/> </th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="i" items="${expos}" varStatus="status">
                            <tr>
                                <th>${i.getIdExpo()}</th>
                                <th>${i.getFilmName()}</th>
                                <th>${i.getCatName()}</th>
                                <th>${i.getName()}</th>
                                <th>${i.getPrice()}</th>
                                <th>${i.getDate()}</th>
                                <form action="${pageContext.request.contextPath}/servlet/gotobook">
                                    <th>
                                        <input type="hidden" name="btnid" value="${i.getIdExpo()}">
                                        <input type="submit" class="btn-primary" value="Book">

                                    </th>
                                </form>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:if>



        </div>
    </div>
</div>

</body>

</html>
