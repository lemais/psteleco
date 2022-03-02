package Sesion1;

public class Personaje extends Elemento {
	
	protected int Velocidad;
	
	public Personaje(int posicionX, int posicionY, int width, int height, char simbolo, int Velocidad) {
		super(posicionX, posicionY, width, height, simbolo);
		this.Velocidad = Velocidad;
		}
	
	public void	saltar() {
	}
	
	
	public void	avanzar() {
	}
	
	
	public void	cogerFrutas() {
	}
	
	
	public void	chocar() {
	}
	
	
	public void	mostrarFrutas() {
	}
	
	
}
