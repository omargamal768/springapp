


<jsp:include page="header.jsp"/>
<jsp:include page="nav.jsp"/>

<div class="card-body" style="
  margin: auto;
  width: 50%;
  padding: 10px;">
    <h1 style="text-align: center;">Add new Teacher</h1>


    <form style="width: 400px;height: 600px;" action="createTeacher" method="post">
        <div class="mb-3">
            <label>Teacher Name</label> <input type="text" name="name" class="form-control">
        </div>
        <div class="mb-3">
            <label>Teacher Mobile</label> <input type="text" name="mobile" class="form-control">
        </div>





        <div class="mb-3">
            <label>Teacher Subject</label> <input type="text"
                                                  name="subject" class="form-control">
        </div>



        <button class="btn btn-primary">Add</button>
    </form>
</div>
<jsp:include page="footer.jsp"/>