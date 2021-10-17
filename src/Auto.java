package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public int cantidadCreados;
	
    public Auto(String modelo, int precio, Asiento[] asientos, String marca, Motor motor, int registro,
			int cantidadCreados) {
		super();
		this.modelo = modelo;
		this.precio = precio;
		this.asientos = asientos;
		this.marca = marca;
		this.motor = motor;
		this.registro = registro;
		this.cantidadCreados = cantidadCreados;
	}
	public int cantidadAsientos(){
    	return this.asientos.length;
    	}
   public String verificarIntegridad() {
	   for(int i=1; i<this.asientos.length;i++) {
	   if(this.asientos[i].registro==this.registro && this.registro==this.motor.registro && this.asientos[i].registro== this.motor.registro) {
		   String mensaje="Auto original";
		   return mensaje;
				   
	   }
	   
	   else {
		   String mensaje="Las piezas no son originales";
		   return mensaje;
		   
	   }    
	   }return null;
   }

}
