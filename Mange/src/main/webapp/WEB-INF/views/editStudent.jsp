


<jsp:include page="header.jsp"/>
<jsp:include page="nav.jsp"/>

<div class="card-body" style="
  margin: auto;
  width: 50%;
  padding: 10px;">
    <h1 style="text-align: center;">Edit Student</h1>


    <form style="width: 400px;height: 600px;" action="/updateStudent" method="post">
        <input type="hidden" name="id" value="${student.id }">
        <div class="mb-3">
            <label>Student Name</label> <input value="${student.name }" type="text" name="name" class="form-control">
        </div>
        <div class="mb-3">
            <label>Student Mobile</label> <input value="${student.mobile }" type="text" name="mobile" class="form-control">
        </div>





        <div class="mb-3">
            <label>Student Country</label> <input value="${student.country }" type="text"
                                                  name="country" class="form-control">
        </div>



        <button class="btn btn-primary">Udate</button>
    </form>
</div>
<jsp:include page="footer.jsp"/>