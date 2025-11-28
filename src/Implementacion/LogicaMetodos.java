package Implementacion;

import java.util.HashMap;

import Interface.Metodos;
import Model.Informatica;

public class LogicaMetodos implements Metodos{
	
	private HashMap<Long, Informatica> hashMapProfesio = new HashMap<Long, Informatica>();

	@Override
	public void guardar(Informatica informatica) {
		// TODO Auto-generated method stub
		hashMapProfesio.put(informatica.getCedula(), informatica);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hashMapProfesio);
	}

	@Override
	public Informatica buscar(long cedula) {
		// TODO Auto-generated method stub
		return hashMapProfesio.get(cedula);
	}

	@Override
	public void editar(Informatica informatica) {
		// TODO Auto-generated method stub
		hashMapProfesio.put(informatica.getCedula(), informatica);
	}

	@Override
	public void eliminar(long cedula) {
		// TODO Auto-generated method stub
		hashMapProfesio.remove(cedula);
	}

}
