package Ejercicio_1;

public class Empleado {
 private final int id;
 private String nombre;
 private int edad;
 static private int cont=999;
 
 //constructor sin parametros
 public Empleado() {
	 cont++;
	 this.id = cont;
	 this.nombre = "Nada";
	 this.edad = -1;
 }
	public Empleado( String nombre, int edad) {
		cont++;
		this.id =cont;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}
	
	static public int devuelveProximoID() {
		return cont+1;
		
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
 
}
