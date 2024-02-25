


<jsp:include page="header.jsp"/>
<jsp:include page="nav.jsp"/>

<div class="card-body" style="
  margin: auto;
  width: 50%;
  padding: 10px;">
    <h1 style="text-align: center;">Teacher Stuent</h1>


    <form style="width: 400px;height: 600px;" action="/updateTeacher" method="post">
        <input type="hidden" name="id" value="${teacher.id }">
        <div class="mb-3">
            <label>Teacher Name</label> <input value="${teacher.name }" type="text" name="name" class="form-control">
        </div>
        <div class="mb-3">
            <label>Teacher Mobile</label> <input value="${teacher.mobile }" type="text" name="mobile" class="form-control">
        </div>





        <div class="mb-3">
            <label>Teacher Subject</label> <input value="${teacher.subject }" type="text"
                                                  name="subject" class="form-control">
        </div>



        <button class="btn btn-primary">Udate</button>
    </form>
</div>
<jsp:include page="footer.jsp"/>