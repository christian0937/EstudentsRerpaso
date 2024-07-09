package dto;

public class Calzado{
private String zapatos;
private String tenis;
	
	
	
public Calzado(String zapatos, String tenis) {
	super();
	this.zapatos = zapatos;
	this.tenis = tenis;
	
}

public String getZapatos() {
	return zapatos;
}

public void setZapatos(String zapatos) {
	this.zapatos = zapatos;
}

public String getTenis() {
	return tenis;
}

public void setTenis(String tenis) {
	this.tenis = tenis;
}



}