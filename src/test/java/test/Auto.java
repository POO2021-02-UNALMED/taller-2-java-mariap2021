package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public int cantidadCreados;
	
	public int cantidadAsientos() {
		int n = 0;
		for(int i = 0;i < asientos.length;i++) {
			if(asientos[i]!=null) {
				n++;
			}
		}
		return n;
	}
  
   public String verificarIntegridad() {
	   for(int i=0; i<asientos.length;i++) {
	   if(asientos[i].registro==registro && registro==motor.registro && asientos[i].registro== motor.registro) {
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


