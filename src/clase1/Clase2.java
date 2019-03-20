package clase1;

public class Clase2 {
	
	public static void main(String[]args){
		
		PruebaClase PruebaClaseUno = new PruebaClase();
		PruebaClaseUno.setNombre("Jose");
		PruebaClaseUno.setNumero(10);
			
		PruebaClase PruebaClaseDos = new PruebaClase();
		PruebaClaseDos.setNombre("Jose");
		PruebaClaseDos.setNumero(10);
		
		//compara las dos referencias de la clase
		if (PruebaClaseUno == PruebaClaseDos){
			System.out.println("son iguales");
		}
		else{
			System.out.println("no son iguales");
		}
		
		//compara valores de tipo string
		if (PruebaClaseUno.getNombre().equals(PruebaClaseDos.getNombre())){
			System.out.println("no son iguales");
		}
		
		if (PruebaClaseUno.equals(PruebaClaseDos)){
			System.out.println("los nombres son iguales");
		}
		else{
			System.out.println("son distintos");
		}
		
		System.out.println(PruebaClaseUno.hashCode());
		System.out.println(PruebaClaseDos.hashCode());
	}
}
