


<jsp:include page="header.jsp"/>
<jsp:include page="nav.jsp"/>

<div class="card-body" style="
  margin: auto;
  width: 50%;
  padding: 10px;">
    <h1 style="text-align: center;">Edit Course</h1>


    <form style="width: 400px;height: 600px;" action="/updateCourse" method="post">
        <input type="hidden" name="id" value="${course.id }">
        <div class="mb-3">
            <label>Course</label> <input value="${course.name }" type="text" name="name" class="form-control">
        </div>
        <div class="mb-3">
            <label>Description</label> <input value="${course.des}" type="text" name="des" class="form-control">
        </div>
        <div class="mb-3">
            <label>No.Hours</label> <input value="${course.hour}" type="text" name="hour" class="form-control">
        </div>


        <button class="btn btn-primary">Udate</button>
    </form>
</div>
<jsp:include page="footer.jsp"/>