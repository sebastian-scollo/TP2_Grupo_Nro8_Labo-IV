package Ejercicio_1;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		// Crear una clase mainEjercicio1_a donde se cree 5 profesores
		// y se guarden dentro de un arraylist.
		
		Profesor profe1 = new Profesor("Lopez", 30, "Profesor", 5);
		Profesor profe2 = new Profesor("Perez", 27, "Ayudante de Catedra", 3);
		Profesor profe3 = new Profesor("Kloster", 60, "Director", 34);
		Profesor profe4 = new Profesor("Angel", 37, "Profesor", 7);
		Profesor profe5 = new Profesor("Angel", 37, "Profesor", 7);
		
	   if(profe4.ProfeIgual(profe4, profe5)) {
		   System.out.println("Los profesores son iguales");
		   
	   }else {
		   System.out.println("Los profesores son diferentes");
	   }
		
		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>(5);
		listaProfesores.add(profe1);
		listaProfesores.add(profe2);
		listaProfesores.add(profe3);
		listaProfesores.add(profe4);
		listaProfesores.add(profe5);
		
		//Mostrar Informacion con un Iterator

		ListIterator<Profesor> IT = listaProfesores.listIterator();
		
		while(IT.hasNext()) {
			Profesor Obj=IT.next();
			System.out.println(Obj.toString());
		}
		
	}

}
