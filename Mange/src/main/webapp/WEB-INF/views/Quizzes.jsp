<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<body>
<jsp:include page="nav.jsp"/>


<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="card">
                <div class="card-header text-center">
                    <h1>Manage Quizzes</h1>

                </div>
                <div class="card-body">
                    <table class="table">
                        <thead>

                        <tr>
                            <th scope="col">Id</th>
                            <th scope="col">model</th>
                            <th scope="col">subject</th>
                            <th scope="col">Q1</th>
                            <th scope="col">Q2</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${QuizzesList}" var="quize">
                            <tr>
                                <th scope="row">${quize.id }</th>
                                <td>${quize.model }</td>
                                <td>${quize.subject }</td>
                                <td>${quize.q1 }</td>
                                <td>${quize.q2 }</td>

                                <td><a href="editQuize/${quize.id}"
                                       class="btn btn-sm btn-primary">Edit</a> <a
                                        href="deleteQuize/${quize.id }" class="btn btn-sm btn-danger">Delete</a></td>
                            </tr>
                        </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

<button style="text-align: center;" class="btn btn-primary"><a style="text-align: center; color: white;" class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/AddQuize">Add new Quize</a></button>
<jsp:include page="footer.jsp"/>