package Ejercicio_2;

public class ProductoCongelado extends Producto {
	
	private double TemperaturaRecomendada;
	
	// Constructores
		public ProductoCongelado() {
	        super();
	        this.TemperaturaRecomendada= 0;
	    }

	    public ProductoCongelado(double TemperaturaRecomendada) {
	        super();
	        this.TemperaturaRecomendada = TemperaturaRecomendada;
	    }
	    
	    public ProductoCongelado(int nroLote, String fechaCaducidad, double temperaturaDeCongelacion) {
	        super(nroLote, fechaCaducidad); 
	        this.TemperaturaRecomendada = temperaturaDeCongelacion;
	    }
	
	
	
	
	
	//Getter y Setter
	public double getTemperaturaRecomendada() {
		return TemperaturaRecomendada;
	}
	public void setTemperaturaRecomendada(double TemperaturaRecomendada) {
		this.TemperaturaRecomendada = TemperaturaRecomendada;
	}
	
	@Override
	public String toString() {
		return "Producto Congelado: " + super.toString() + "Temperatura de Congelacion= " + TemperaturaRecomendada + "]";
	}
	
}

