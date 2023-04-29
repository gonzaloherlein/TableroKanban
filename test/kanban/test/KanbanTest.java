package kanban.test;

import static org.junit.Assert.*;

import org.junit.Test;

import kanban.dominio.Estado;
import kanban.dominio.Tablero;
import kanban.dominio.Tarea;
import kanban.dominio.Usuario;

public class KanbanTest {

	@Test
	public void queSePuedaCrearUnTablero() {
		Tablero tablero = new Tablero();
		assertNotNull(tablero);
	}
	
	@Test
	public void queSePuedaCrearUnaTarea() {
		Tarea nuevaTarea = new Tarea();
		assertNotNull(nuevaTarea);
	}
	
	@Test
	public void queSePuedaCrearUnUsuario() {
		Usuario nuevoUsuario = new Usuario("Eduardo");
		assertNotNull(nuevoUsuario);
	}
	
	@Test
	public void queSePuedaAgregarUnaTarea() {
		Tablero tablero = new Tablero();
		Tarea nuevaTarea = new Tarea();
		tablero.agregarTarea(nuevaTarea);
		assertEquals(tablero.getListaDeTareas().size(),1);
	}
	
	@Test
	public void queSePuedaCambiarUnaTareaEnCurso() {
		Tablero tablero = new Tablero();
		Tarea nuevaTarea = new Tarea();
		Usuario nuevoUsuario = new Usuario("Eduardo");
		
		
		tablero.agregarTarea(nuevaTarea);
		nuevaTarea.cambiarEstado(nuevoUsuario, Estado.EN_CURSO);
		
		
		assertEquals(nuevaTarea.getEstado(), Estado.EN_CURSO);
	}
}
