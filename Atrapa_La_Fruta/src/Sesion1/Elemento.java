package Sesion1;

public abstract class Elemento {
	protected int posicionX;
	protected int posicionY;
	protected int width;
	protected int height;
	//protected string imagen;
	protected char simbolo;
	

	public Elemento(int posicionX, int posicionY, int width, int height, char simbolo) {
		
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.width = width;
		this.height = height;
		this.simbolo = simbolo;
	} 

	//falta la imagen que sera con alguna gui


public int getPosicionX() {
	return posicionX;
}

public void setPosicionX(int posicionX) {
	this.posicionX = posicionX;
}

public int getPosicionY() {
	return posicionY;
}

public void setPosicionY(int posicionY) {
	this.posicionY = posicionY;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}


public char getSimbolo() {
	return simbolo;
}

public void setSimbolo(char simbolo) {
	this.simbolo = simbolo;
}

public void mostrarDatos() {
	
}

}

