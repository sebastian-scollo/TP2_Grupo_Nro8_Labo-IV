package Ejercicio_1;

//import java.util.Iterator; 
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		TreeSet<Profesor> TreeSetProfesores=new TreeSet<Profesor>();
		
		Profesor Carmen=new Profesor("Carmen",48,"Directora",15); //constructor solo empleado
		Profesor Carlos=new Profesor();
		Profesor German=new Profesor("German",36,"Jefe TP",10); //constructor completo
		Profesor Gisela=new Profesor();
		Profesor Roberto=new Profesor("Roberto",35,"Ayudante",30);
		
		TreeSetProfesores.add(Carmen);
		TreeSetProfesores.add(Carlos);
		TreeSetProfesores.add(German);
		TreeSetProfesores.add(Gisela);
		TreeSetProfesores.add(Roberto);
		
		

	}

}
