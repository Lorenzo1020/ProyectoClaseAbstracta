package Model;

//extends --- herencia
//Vamos a hererdar de todo lo que contega la clase abstracta
public class Informatica extends Profesionistas {

	private String pc;
	private String lengProga;

	public Informatica(String profesionistas, long cedula, String pc, String lengProga) {
		super(profesionistas, cedula);
		this.pc = pc;
		this.lengProga = lengProga;
	}

	@Override
	public String toString() {
		return "Informatica [getProfesionistas()=" + getProfesionistas() + ", getCedula()=" + getCedula() + ", pc=" + pc
				+ ", lengProga=" + lengProga + "]\n";
	}

	public String getPc() {
		return pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

	public String getLengProga() {
		return lengProga;
	}

	public void setLengProga(String lengProga) {
		this.lengProga = lengProga;
	}

}
