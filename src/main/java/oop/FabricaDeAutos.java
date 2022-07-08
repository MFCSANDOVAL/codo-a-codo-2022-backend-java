package oop;

public class FabricaDeAutos {

	public static void main(String[] args) {
		//quiero crear mi primer obj de la clase Auto
		
		Auto fiatUno = new Auto(300f,"AUTO",new Motor("motor",300f));//constructor
		
		fiatUno.encender();//f3
		fiatUno.verVelocidad();//0
		
		fiatUno.acelerar();
		fiatUno.verVelocidad();//1
		
		fiatUno.acelerar();
		fiatUno.verVelocidad();//2
		
		fiatUno.acelerar();
		fiatUno.verVelocidad();//3
		//fiatUno.acelerar();
		
		System.out.println("frenando");
		fiatUno.frenar();
		fiatUno.verVelocidad();
		
		fiatUno.apagar();
		fiatUno.verVelocidad();
		/*fiatUno.encender();//f3
		 
		 
		
		//quiero ver la velocidad del auto...
		//nombreDelObjeto.atributo;
		System.out.println("velocidad actual=" + fiatUno.velocidad);
		
		fiatUno.apagar();//f3
		fiatUno.apagar();//f3*/
		
		System.out.println("fin");

	}

}
