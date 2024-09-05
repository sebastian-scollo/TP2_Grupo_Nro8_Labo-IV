package Ejercicio_3;

public class PoliDeportivo {
 private double nroSuperficie;
 private String nombre;
 
 //Constructores
 public PoliDeportivo() {
		this.nroSuperficie = 0;
		this.nombre = "Sin nombre";
}
 
 public PoliDeportivo(double nroSuperficie, String nombre) {
		
		this.nroSuperficie = nroSuperficie;
		this.nombre = nombre;
	}
 
 //getter y setters
public double getNroSuperficie() {
	return nroSuperficie;
}
public void setNroSuperficie(double nroSuperficie) {
	this.nroSuperficie = nroSuperficie;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}


@Override
public String toString() {
	return "PoliDeportivo [nroSuperficie=" + nroSuperficie + ", nombre=" + nombre + "]";
}
 
}
