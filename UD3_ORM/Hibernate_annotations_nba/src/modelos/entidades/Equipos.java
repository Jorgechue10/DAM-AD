package modelos.entidades;
// Generated 19-dic-2018 15:41:00 by Hibernate Tools 5.2.11.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Equipos generated by hbm2java
 */
@Entity
@Table(name = "equipos", catalog = "nba")
public class Equipos implements java.io.Serializable {

	private String nombre;
	private String ciudad;
	private String conferencia;
	private String division;
	/*
	private Set jugadoreses = new HashSet(0);
	private Set partidosesForEquipoVisitante = new HashSet(0);
	private Set partidosesForEquipoLocal = new HashSet(0);
	*/
	public Equipos() {
	}

	public Equipos(String nombre) {
		this.nombre = nombre;
	}

	public Equipos(String nombre, String ciudad, String conferencia, String division, Set jugadoreses,
			Set partidosesForEquipoVisitante, Set partidosesForEquipoLocal) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.conferencia = conferencia;
		this.division = division;

		//this.jugadoreses = jugadoreses;
		//this.partidosesForEquipoVisitante = partidosesForEquipoVisitante;
		//this.partidosesForEquipoLocal = partidosesForEquipoLocal;
	}

	@Id

	@Column(name = "Nombre", unique = true, nullable = false, length = 20)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "Ciudad", length = 20)
	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Column(name = "Conferencia", length = 4)
	public String getConferencia() {
		return this.conferencia;
	}

	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}

	@Column(name = "Division", length = 9)
	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	/*
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipos")
	public Set getJugadoreses() {
		return this.jugadoreses;
	}

	public void setJugadoreses(Set jugadoreses) {
		this.jugadoreses = jugadoreses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equiposByEquipoVisitante")
	public Set getPartidosesForEquipoVisitante() {
		return this.partidosesForEquipoVisitante;
	}

	public void setPartidosesForEquipoVisitante(Set partidosesForEquipoVisitante) {
		this.partidosesForEquipoVisitante = partidosesForEquipoVisitante;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equiposByEquipoLocal")
	public Set getPartidosesForEquipoLocal() {
		return this.partidosesForEquipoLocal;
	}

	public void setPartidosesForEquipoLocal(Set partidosesForEquipoLocal) {
		this.partidosesForEquipoLocal = partidosesForEquipoLocal;
	}
	*/

}
