package kanban.dominio;

import java.util.ArrayList;
import java.util.HashSet;

public class Tablero {
	private String nombre;
	private ArrayList<Tarea> listaDeTareas = new ArrayList<Tarea>();
	private HashSet<Tarea> listaDeTareasPendientes;
	
	
	public Tablero() {
		
	}
	
	public Tablero(String nombre) {
		this.nombre = nombre;
		this.listaDeTareas = new ArrayList<Tarea>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Tarea> getListaDeTareas() {
		return listaDeTareas;
	}

	public void setListaDeTareas(ArrayList<Tarea> listaDeTareas) {
		this.listaDeTareas = listaDeTareas;
	}
	
	public void agregarTarea(Tarea tarea) {
		listaDeTareas.add(tarea);
	}
	
	
}
