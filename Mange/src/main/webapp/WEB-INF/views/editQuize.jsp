


<jsp:include page="header.jsp"/>
<jsp:include page="nav.jsp"/>

<div class="card-body" style="
  margin: auto;
  width: 50%;
  padding: 10px;">
    <h1 style="text-align: center;">Edit Quize</h1>


    <form style="width: 400px;height: 600px;" action="/updateQuize" method="post">
        <input type="hidden" name="id" value="${quize.id }">
        <div class="mb-3">
            <label>Model Name</label> <input value="${quize.model }" type="text" name="model" class="form-control">
        </div>
        <div class="mb-3">
            <label>Quize Subject</label> <input value="${quize.subject }" type="text" name="subject" class="form-control">
        </div>





        <div class="mb-3">
            <label>Q1</label> <input value="${quize.q1 }" type="text"
                                                  name="q1" class="form-control">
        </div>
        <div class="mb-3">
            <label>Q2</label> <input value="${quize.q2 }" type="text"
                                     name="q2" class="form-control">
        </div>





        <button class="btn btn-primary">Udate</button>
    </form>
</div>
<jsp:include page="footer.jsp"/>