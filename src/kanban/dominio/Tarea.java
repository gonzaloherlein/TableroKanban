package kanban.dominio;

import java.util.Objects;

public class Tarea {
	private Estado estado;
	private Usuario usuarioRealizador;
	private String nombreDeTarea;
	
	public Tarea() {
		
	}
	
	public Tarea(Usuario usuarioRealizador,String nombreDeTarea) {
		this.usuarioRealizador = usuarioRealizador;
		this.nombreDeTarea = nombreDeTarea;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	

	public Usuario getUsuarioRealizador() {
		return usuarioRealizador;
	}

	public void setUsuarioRealizador(Usuario usuarioRealizador) {
		this.usuarioRealizador = usuarioRealizador;
	}

	public String getNombreDeTarea() {
		return nombreDeTarea;
	}

	public void setNombreDeTarea(String nombreDeTarea) {
		this.nombreDeTarea = nombreDeTarea;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarea other = (Tarea) obj;
		return estado == other.estado;
	}
	
	public void cambiarEstado(Usuario usuario, Estado estado) {
		Estado nuevoEstado = estado;
		if(nuevoEstado.equals(estado.EN_CURSO) && usuario.equals(this.usuarioRealizador)){
			this.estado = nuevoEstado;
		}else if(nuevoEstado.equals(estado.PENDIENTE) || nuevoEstado.equals(nuevoEstado.FINALIZADA)){
			this.estado = nuevoEstado;
		}
	}
}
