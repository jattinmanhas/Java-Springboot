<%@ include file="common/header.jspf" %>

<div>
    <%@ include file="common/navigation.jspf" %>
    <div class="container">
        <h1>WELCOME TO TODOS SITE</h1>
        <p>Welcome ${name}</p>
        <hr>
        <p>Your Todos:<p>
        <table class="table table-hover">
            <thead>
                <tr>
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>is Done?</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                        <td> <a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a> </td>
                        <td> <a href="update-todo?id=${todo.id}" class="btn btn-info">Update</a> </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="add-todo" class="btn btn-success">Add Todo</a>
    </div>
</div>
<%@ include file="common/footer.jspf" %>
