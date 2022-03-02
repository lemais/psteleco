package Sesion1;

public class Fruta extends Elemento {

	protected String nombre;
	protected int puntos;
	
	public Fruta(int posicionX, int posicionY, int width, int height, char simbolo, String nombre, int puntos) {
		super(posicionX, posicionY, width, height, simbolo);
		this.nombre = nombre;
		this.puntos = puntos;
	} 
	
	

}
