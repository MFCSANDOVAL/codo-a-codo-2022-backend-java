<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nuevo Producto</title>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>




</head>
<body>


    <header>

    
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
              <a class="navbar-brand" href="home.html">Home</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="cargarArchivo.html">Cargar Archivo</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="alta.html">Nuevo Producto</a>
                  </li>
                  
                  <li class="nav-item">
                    <a class="nav-link disabled">Disabled</a>
                  </li>
                </ul>
                <form class="d-flex">
                  <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                  <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
              </div>
            </div>
          </nav>
    

    </header>

    <main>
    
        <section class="container-fluid">
            <div class="container-fluid ">
           
              
            <h1>Nuevo Producto</h1>

            <form>
                <div class="col-6">
                  <label for="exampleInputCodigo" class="form-label">Codigo</label>
                  <input type="codigo" class="form-control" id="exampleInputCodigo" aria-describedby="codigoHelp">
                  
                </div>
                <div class="col-6">
                  <label for="exampleInputTitulo" class="form-label">Titulo</label>
                  <input type="titulo" class="form-control" id="exampleInputTitulo">
                </div>

                
                  <div class="col-6">
                    <label for="exampleInputPrecio" class="form-label">Precio</label>
                    <input type="precio" class="form-control" id="exampleInputPrecio">
                </div>

                <div class="col-6">
                    <label for="exampleInputStock" class="form-label">Stock</label>
                    <input type="stock" class="form-control" id="exampleInputStock">
                </div>
               
                <div class="col-6">
                    <label for="exampleInputCategoria" class="form-label">Categoria</label>
                <select class="form-select" aria-label="Default select example">
                   
                    <option selected>Seleccione...</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                  </select>
                 </div>

                 <div class="col-6">
                    <label for="exampleInputMarca" class="form-label">Marca</label>
                <select class="form-select" aria-label="Default select example">
                   
                    <option selected>Seleccione...</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                  </select>
                 </div>


                <div class="col-12 mt-2">
                
                <button type="submit" class="btn btn-primary">Grabar</button>
                </div>

                
              </form>
           
            </div>
          
        </section>
    </main>
</body>
</html>