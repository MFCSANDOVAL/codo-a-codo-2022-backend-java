package oop2;

import oop.Auto;
import oop.Estereo;
import oop.Motor;

public class Main {

	public static void main(String[] args) {
		//composicion
		Motor motorDesdeAfuera = new Motor("mclaren",150f);
		Auto auto = new Auto(220f, "RENAULT", motorDesdeAfuera);
		
		//asociacion
		Estereo e = new Estereo();
		auto.setEstereo(e);
		//quiero definir la marca de mi auto
		//auto.setMarca("Renault");
		
		auto.getMarca();
		auto.getColor();
	    auto.getVelocidad();
	    auto.getVelocidadMaxima();
		//auto.setVelocidad(-100);//
		//auto.setAnio(2025);
		//auto.setSerie(33232442);
		//auto.setEncendido(encendido);
		//auto.apagar
	}

}
