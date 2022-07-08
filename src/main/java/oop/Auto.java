package oop;

public class Auto {
	//atributos de la clase, deben ser privados
	private String color;
	private int anio;
	private long serie;
	private String marca;
	private String modelo;
	private float velocidad;
	private float velocidadMaxima;
	private boolean encendido;
	
	private Motor motor;
	private Estereo estereo;
	//cuando nace un obj: constructor
	
	public Auto(float velocidadMaxima, String marca, Motor motor){
		//velocidad = 0;
		
		this.setVelocidadMaxima(velocidadMaxima);
		this.setVelocidad(0);//seteando velocidad
		this.setAnio(2022);
		this.setEncendido(false);
		this.setMarca(marca);
		this.setMotor(motor);
		//anio = 2022;
		//marca = "SIN MARCA";
		//modelo = "SIN MODELO";
		encendido = false;
		//velocidadMaxima = 3;
	}
	//metodos
	
	public void setMotor(Motor motor) {
		if(motor == null) {
			Motor motorInterno = new Motor("default",100f);
		    this.motor = motorInterno;
		}
		this.motor = motor;
	}
	
	public Motor getMotor() {
		return this.motor;
	}
	
	public void setEstereo(Estereo nuevoEstereo) {
		if(nuevoEstereo != null)
			this.estereo = nuevoEstereo;
	}
	
	public void encender() {
		if(!this.isEncendido()) {
		 this.setEncendido(true);
			System.out.println("auto encendido");
		}else {
			System.out.println("no se puede encendor dos veces");
		}
		
	}
	
	
	public void acelerar() {
		
		if(this.isEncendido()) {
			if(this.getVelocidad() < this.getVelocidadMaxima()) {
				this.setVelocidad(this.getVelocidad() + 1);
			}else {
				System.out.println("error no puede superar la velocidad maxima");
			}
		}else {
          System.out.println("error: debe encender el auto");
		}
		
	}
	
	public void frenar() {
		if(this.isEncendido()) {
			if(this.getVelocidad() > 0) {
				velocidad--;
				this.setVelocidad(this.getVelocidad() - 1);
			}
			
		}else {
			System.out.println("error:auoto apgado");
		}
	}
	
	public void verVelocidad() {
		System.out.println(velocidad);
	}
	
	public void apagar() {
		if(this.isEncendido()) {
		 //boolean isALgo() Boolean getAlgo()
			while(this.getVelocidad() > 0) {
				frenar();
				
			}
			
			this.setEncendido(false);
			
			System.out.println("se ha apagado correctamente");
		}else {
			System.out.println("no se puede apagar dos veces");
		}
	}

	public String getMarca() {
		//esto es la logica oculta al mundo exterior
		//wrapper
		
		//tipo primitivos
		//byte <short <int <long  <float <double 
		//byte  short  integer  long  float double <---  tpos wrappers tien metodos porq son clases
		//por defecto como son clases
		//sus objetos valen null
		
		// boolean char string
	  
		 //String edad = "10";
		//int edadInt = Integer.parseInt(edad);
		//wrrapper
		//integer //clase jdk > objetos
		
		//String algo; vale null
		//Integer otraCosa; // null
		//int algoInt; //0
		//char c; vale 0
		return marca == null ? "" : marca;
	}
	
	public void setMarca(String marca) {
		if(marca != null)
			this.marca = marca;
		else {
			this.marca ="";
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	private void setAnio(int anio) {
		this.anio = anio;
	}

	public long getSerie() {
		return serie;
	}

	private void setSerie(long serie) {
		this.serie = serie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVelocidad() {
		return velocidad;
	}

	private void setVelocidad(float velocidad) {
		if(velocidad < 0) {
			this.velocidad = 0;
			
		}else {
			this.velocidad = velocidad;
		}
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	private void setVelocidadMaxima(float velocidadMaxima) {
        if(velocidadMaxima < 0 || velocidadMaxima > 220) {
        	if(velocidadMaxima < 0)
        		this.velocidadMaxima = 0;
        	if(velocidadMaxima > 220)
        		this.velocidadMaxima = 220;
        }else {
        	this.velocidadMaxima = velocidadMaxima;
        }
	}

	public boolean isEncendido() {
		return encendido;
	}

	private void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	//alt+shift+s
}
//37:07