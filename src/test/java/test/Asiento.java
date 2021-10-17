package test;

public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	public Asiento(String color, int precio, int registro ) {
		this.color=color;	
		this.precio=precio;	
		this.color=color;	
		
	}
	
	
	public void cambiarColor(String color) {
		if(color=="amarillo" || color=="negro" || color=="blanco"|| color=="verde" || color=="rojo")
		this.color=color;	    	
}


}
