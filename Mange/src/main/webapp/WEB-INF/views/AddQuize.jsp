


<jsp:include page="header.jsp"/>
<jsp:include page="nav.jsp"/>

<div class="card-body" style="
  margin: auto;
  width: 50%;
  padding: 10px;">
    <h1 style="text-align: center;">Add new Quize</h1>


    <form style="width: 400px;height: 600px;" action="createQuize" method="post">
        <div class="mb-3">
            <label>Quize Model</label> <input type="text" name="model" class="form-control">
        </div>
        <div class="mb-3">
            <label>Quize Subject</label> <input type="text" name="subject" class="form-control">
        </div>





        <div class="mb-3">
            <label>Q1</label> <input type="text"
                                                  name="q1" class="form-control">
        </div>
        <div class="mb-3">
            <label>Q2</label> <input type="text"
                                     name="q2" class="form-control">
        </div>




        <button class="btn btn-primary">Add</button>
    </form>
</div>
<jsp:include page="footer.jsp"/>