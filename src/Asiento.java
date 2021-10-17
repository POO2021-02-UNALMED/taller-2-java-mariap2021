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
		if("amarillo".equals(color) || "negro".equals(color) || "blanco".equals(color) || "verde".equals(color) || "rojo".equals(color))
		this.color=color;	    	
}


}
