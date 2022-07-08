package oop;

public class Motor {
	
	private String nombre;
	private float hp;
	
	//constructor
	
	public Motor(String nombre, Float hp) {
		this.setNombre(nombre);
		this.setHp(hp);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

}
