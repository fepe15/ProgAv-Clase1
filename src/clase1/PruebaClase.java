package clase1;

public class PruebaClase {

	//crear un atributo
	private String nombre;	
	private int numero;
	
	//contructor de la clase
	public PruebaClase(){
		this.nombre = "";
	}
	
	//metodo para setear datos en el atributo nombre
	public void setNombre(String nombre){
		this.nombre=nombre;
	} 
	
	//devuelve el valor de nombre
	public String getNombre(){
		return this.nombre;
	}
	
	//metodo para setear datos en el atributo numero
	public void setNumero(int numero){
		this.numero = numero;
	} 
	
	//devuelve el valor de numero
	public String getNumero(){
		return this.nombre;
	}
	
	//sobreescribo el metodo tostring de la clase object
	@Override
	public String toString(){
		return "numero: " + this.numero + "";
	}
	
	//sobreescribo el metodo equals para poder comparar dos objetos de dos instancias de clase
	@Override
	public boolean equals(Object objeto){
		if (objeto != null){
			if(objeto.getClass().equals(this.getClass())){
				PruebaClase c = (PruebaClase)objeto;
				if(c.nombre.equals(this.nombre) && c.nombre == this.nombre){
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		int primo = 31;
		int resultado = 1;
		resultado= primo*this.numero;
		resultado= resultado+primo*this.nombre.hashCode();
		return resultado;
	}
}

