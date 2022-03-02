package Sesion1;

public class FrutaMagica extends Fruta {

	protected  Efectos efecto;

	public FrutaMagica(int posicionX, int posicionY, int width, int height, char simbolo, String nombre, int puntos,
			Efectos efecto) {
		super(posicionX, posicionY, width, height, simbolo, nombre, puntos);
		this.efecto = efecto;
	}

}
