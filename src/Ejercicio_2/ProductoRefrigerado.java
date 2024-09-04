package Ejercicio_2;


public class ProductoRefrigerado extends Producto {
	
	private int codSupAlimentaria;


	//Getters & Setters
	public int getCodSupAlimentaria() {
		return codSupAlimentaria;
	}

	public void setCodSupAlimentaria(int codSupAlimentaria) {
		this.codSupAlimentaria = codSupAlimentaria;
	}
	
	//Constructores
	
	public ProductoRefrigerado()
	{
		super();
		this.codSupAlimentaria = -1;
	}
	
	public ProductoRefrigerado(int numeroLote, String fechaCaducidad, int codSupAlimentaria)
	{
		super(numeroLote, fechaCaducidad);
		this.codSupAlimentaria = codSupAlimentaria;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "ProductoRefrigerado [codSupAlimentaria=" 
				+ codSupAlimentaria + ", FechaCaducidad=" + FechaCaducidad
				+ ", NumeroLote=" + NumeroLote + "]";
		
	}
	
	
}


