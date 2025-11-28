package Model;

//abstract class --- No se puede instanciar solamente heredar
//Super clase
public abstract class Profesionistas {

	private String profesionistas;
	private long cedula;

	public Profesionistas(String profesionistas, long cedula) {
		this.profesionistas = profesionistas;
		this.cedula = cedula;
	}

	public String getProfesionistas() {
		return profesionistas;
	}

	public void setProfesionistas(String profesionistas) {
		this.profesionistas = profesionistas;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

}
