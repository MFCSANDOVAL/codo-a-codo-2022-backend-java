package codo.a.codo;

public class Arrays {

	public static void main(String[] args) {

      int[] array = new int[4];
      
      
      array[0] = 10;
      array[1] = 11;
      array[2] = 12;
      array[3] = 13;
      //array[3] = 13;//error
      
      //cuando se escribe codigo se llama TIEMPO DE COMPILACION
      //codigo ejecutandose se llama runtime tiempo de ejecucion
      System.out.println("FIN");
      
      
      
      //recorrer array
      for(int i =0; i <array.length;i++) {
    	  System.out.println(array[i]);
      }
     
      //recorrer con foreach
      for(int aux : array) {
    	  System.out.println(aux);
      }
      
      
      //quiero mostrar solo el indice 3
      
      System.out.println("mostrar valor del indice 3: " + array[3]);
	}

}
