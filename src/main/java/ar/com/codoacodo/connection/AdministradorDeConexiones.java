package ar.com.codoacodo.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones { 
    public static Connection getConnection() {
    	/*String url = "jdbc:mysql://127.0.0.1:3306/codo-a-codo?serverTimeZone=UTC&userSSL=false";
        String username = "root";
        String password = "metalica123";
        
        String driverName = "com.mysql.cj.jdbc.Driver";//mysql|postrges
        */
        //control errores
    	
    	String url = System.getenv("DATASOURCE_URL");
    	String user = System.getenv("DATASOURCE_USERNAME");
    	String password = System.getenv("DATASOURCE_PASSWORD");
    	String driverName = System.getenv("DATASOURCE_DRIVER");
    	
    			
        Connection con = null;
        try {
        	Class.forName(driverName);//carga en memoria el diver
            con = DriverManager.getConnection(url,user,password);
            
            
        }catch(Exception e){
        	e.printStackTrace();//se q paso o lo que fallo.
 
        }
        return con;
    
    }
    
    public static void main(String[] args) {
		Connection con = AdministradorDeConexiones.getConnection();
		if(con != null) {
			System.out.println("Conexion ok");
		}else {
			System.err.println("conexion fail");
		}
	}
}
