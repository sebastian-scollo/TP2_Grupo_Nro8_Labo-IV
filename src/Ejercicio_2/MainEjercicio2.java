package Ejercicio_2;

public class MainEjercicio2 {

	public static void main(String[] args) {
		
		ProductoCongelado productoCongelado = new ProductoCongelado(120, "02/05/2025", 5);
		ProductoFresco productoFresco = new ProductoFresco(052, "24/12/2024", "12/01/2024", "Argentina");
		ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado(305, "08/08/2026", 1975223);
		
		
		System.out.println(productoCongelado.toString());
		System.out.println(productoFresco.toString());
		System.out.println(productoRefrigerado.toString());
		
	}

}
