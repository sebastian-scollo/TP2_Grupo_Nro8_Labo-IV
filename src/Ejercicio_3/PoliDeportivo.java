package Ejercicio_3;

public class PoliDeportivo implements Edificio, InstalacionSport {
 private String nombre;
 
 //Constructores
 public PoliDeportivo() {
		this.nombre = "Sin nombre";
}
 
 public PoliDeportivo(String nombre) {
		
		this.nombre = nombre;
	}
 
 //getter y setters
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}


@Override
public String toString() {
	return "PoliDeportivo [nombre=" + nombre + "]";
}

//Implementacion interfaces

@Override
public int getTipoDeInstalacion() {
	
	return 2;
}
@Override
public double getSuperficieEdificio() {
	
	return 400;
}





 
}
