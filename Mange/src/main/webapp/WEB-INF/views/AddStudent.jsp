


<jsp:include page="header.jsp"/>
<jsp:include page="nav.jsp"/>

<div class="card-body" style="
  margin: auto;
  width: 50%;
  padding: 10px;">
  <h1 style="text-align: center;">Add new Stuent</h1>


    <form style="width: 400px;height: 600px;" action="createStudent" method="post">
        <div class="mb-3">
            <label>Student Name</label> <input type="text" name="name" class="form-control">
        </div>
        <div class="mb-3">
            <label>Student Mobile</label> <input type="text" name="mobile" class="form-control">
        </div>





        <div class="mb-3">
            <label>Student Country</label> <input type="text"
                                                  name="country" class="form-control">
        </div>



        <button class="btn btn-primary">Add</button>
    </form>
</div>
<jsp:include page="footer.jsp"/>