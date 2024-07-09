package Academia;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import dto.Calzado;
import dto.Piernas;
import dto.Torso;

public class Uniformes {

	private List<String> torso;
	private List<String> piernas;
	private List<String> calzado;
	public Uniformes(List<String> torso, List<String> piernas, List<String> calzado) {
		super();
		this.torso = torso;
		this.piernas = piernas;
		this.calzado = calzado;
	}
	public List<String> getTorso() {
		return torso;
	}
	public void setTorso(List<String> torso) {
		this.torso = torso;
	}
	public List<String> getPiernas() {
		return piernas;
	}
	public void setPiernas(List<String> piernas) {
		this.piernas = piernas;
	}
	public List<String> getCalzado() {
		return calzado;
	}
	public void setCalzado(List<String> calzado) {
		this.calzado = calzado;
	}
	@Override
	public String toString() {
		return "Uniformes [torso=" + torso + ", piernas=" + piernas + ", calzado=" + calzado + ", getTorso()="
				+ getTorso() + ", getPiernas()=" + getPiernas() + ", getCalzado()=" + getCalzado() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}


