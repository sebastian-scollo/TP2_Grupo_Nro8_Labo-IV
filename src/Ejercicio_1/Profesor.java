package Ejercicio_1;


public class Profesor extends Empleado implements Comparable<Profesor>{//el implement lo necesito cuando uso el TreeSet y utilizo la inteface compareTo
	protected String cargo;
	protected int antiguedadDocente;
	
	//CONSTRUCTORES
	
	public Profesor() {
		super();
		cargo = "Nada";
		antiguedadDocente = 0;
	}
	
	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
	//GET SET
	
	public void setCargo(String c) {
		cargo = c;
	}
	
	public void setAntiguedadDoc(int a) {
		antiguedadDocente = a;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public int getAntiguedadDoc() {
		return antiguedadDocente;
	}
	//Metodo toString
	@Override
	public String toString() {
		return "Profesor [id = " + getId() + ", Nombre = " + getNombre() + ", edad = " + getEdad() + ", cargo = " + cargo + ", Antiguedad Docente = " + antiguedadDocente + "]";
	}
	
	
public Boolean ProfeIgual(Profesor obj1,Profesor obj2) {
		
	  if(obj1.getNombre().equals(obj2.getNombre())) {
	        if(obj1.getEdad() == obj2.getEdad()) {
	            if(obj1.getCargo().equals(obj2.getCargo())) {
	                if(obj1.getAntiguedadDoc() == obj2.getAntiguedadDoc()) {
	                    return true;
	                }
	            }
	        }
	    }
	    return false;
	}

//con esto lo ordeno de mayor a menor desde la antiguedad docente
	@Override
	public int compareTo(Profesor o) {
		if(this.antiguedadDocente == o.antiguedadDocente) {
			return 0;
		}else if(this.antiguedadDocente < o.antiguedadDocente) {
			return 1;
		}
		return -1;
	}


}
	

