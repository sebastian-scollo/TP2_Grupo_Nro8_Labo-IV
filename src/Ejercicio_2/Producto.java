package Ejercicio_2;

public class Producto {
   protected String FechaCaducidad;
   protected int NumeroLote;
   
   //metodos getters y setters
   public void setFechaCaducidad(String _FechaCaducidad) {
	   this.FechaCaducidad = _FechaCaducidad;
   }
   public void setNroLote(int _NroLote) {
	   NumeroLote = _NroLote;
   }
   public String getFechaCaducidad() {return FechaCaducidad;}
   public int getNroLote() {return NumeroLote;}
   
   //Constructores 
   public Producto() {
	   this.NumeroLote = -1;
	   this.FechaCaducidad = "Nula";
	   
   }
   public Producto(int _NumeroLote,String _Fdate) {
	   this.NumeroLote = _NumeroLote;
	   this.FechaCaducidad = _Fdate;
   }
   
@Override
public String toString() {
	return "Producto [FechaCaducidad=" + FechaCaducidad + ", NumeroLote=" + NumeroLote + "]";
}
   
   
   
}
