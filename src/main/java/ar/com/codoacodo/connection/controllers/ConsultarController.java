package ar.com.codoacodo.connection.controllers;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.connection.dto.Producto;

@WebServlet("/ConsultarController")
public class ConsultarController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	
	   String id = req.getParameter("id");
	   //validaciones!!
	   String sql = "SELECT * FROM PRODUCTO WHER ID = " + id;
	    
	   //conexion
	   Connection con = AdministradorDeConexiones.getConnection();
	   //statement
	   Statement st = con.createStatement();
	   //resultset
	   ResultSet rs = st.executeQuery(sql);
	   //rs sacando los datos
	   
	   Long id = rs.getLong(1);//tomar la primer columna
	   String nombre = rs.getString(2);
	   Float precio = rs.getFloat(3);
	   Date fecha = rs.getDate(4);
	   String imagen = rs.getString(5);
	   String codigo = rs.getString(6);
	   
	   //campos crear un objeto
	   
	   Producto prodFromDb = new Producto(idProducto,nombre,precio,fecha,imagen,codigo);
	
	   //ir a otra pagina y ademas pasarle datos
	   
	   req.setAttribute("producto", prodFromDb);
	   getServletContext().getRequestDispatcher("/detalle.jsp").forward(req,resp);
	
	
	}
	
	
	
}
