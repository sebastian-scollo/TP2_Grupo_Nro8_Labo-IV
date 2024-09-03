package Ejercicio_2;

public class ProductoFresco extends Producto {
	protected String FechaEnvasado;
	protected String PaisOrigen;
	
	// CONSTRUCTORES
	
	public ProductoFresco() {
		FechaEnvasado = "00/00/0000";
		PaisOrigen = "Sin definir";
	}
	
	public ProductoFresco(String f, String p) {
		FechaEnvasado = f;
		PaisOrigen = p;
	}
	
	public ProductoFresco(int nroLote, String fechaCaducidad, String f, String p) {
		super(nroLote, fechaCaducidad); 
		this.FechaEnvasado = f;
		this.PaisOrigen = p;
	}
	// METODOS GET / SET
	
	public String getFechaEnvasado() {
		return FechaEnvasado;
	}
	
	public String getPaisOrigen() {
		return PaisOrigen;
	}
	
	public void setFechaEnvasado(String f) {
		FechaEnvasado = f;
	}
	
	public void setPaisOrigen(String p) {
		PaisOrigen = p;
	}
	
	// OVERRIDE
	
	public String toString() {
		return "Producto [FechaCaducidad=" + FechaCaducidad 
				+ ", FechaEnvasado=" + FechaEnvasado 
				+ ", NumeroLote=" + NumeroLote 
				+ ", PaisOrigen= " + PaisOrigen 
				+ "]";
	}
}