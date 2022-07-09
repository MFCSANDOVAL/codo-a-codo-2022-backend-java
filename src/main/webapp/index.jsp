<html>

   <head>
   <!-- CSS only -->
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

   </head>
   
   <body>
   <!-- navbar -->
   <%@include file="navbar.jsp" %>	
      <main>
      <div class="container">
      <section>
      <h1>Alta</h1>
      <!-- -JSP -->
      <form METHOD="POST"
      action="<%=request.getContextPath()%>/CreateController">
      
      <div class="mb-3">
    <label for="exampleFormControlInput1" class="form-label">Nombre</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Nombre" maxlength="50">
</div>
<div class="mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">Precio</label>
  <input type="number" class="form-control" id="exampleFormControlTextarea1">
</div>
<div class="mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">Imagen</label>
  <input type="file" class="form-control" id="exampleFormControlTextarea1">
</div> 
<div class="mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">Codigo</label>
  <input type="text" class="form-control" id="exampleFormControlTextarea1" maxlength="7">
</div> //53:49
<button class="btn btn-primary">
Dar de alta
</button> 
      
      </form>
      </section>
      </div>
      </main>
   </body>
</html>