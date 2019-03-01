package modelos.entidades;
// Generated 19-dic-2018 15:41:00 by Hibernate Tools 5.2.11.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Jugadores generated by hbm2java
 */
@Entity
@Table(name = "jugadores", catalog = "nba")
public class Jugadores implements java.io.Serializable {

	private int codigo;
	private Equipos equipos;
	private String nombre;
	private String procedencia;
	private String altura;
	private Integer peso;
	private String posicion;
	//private Set estadisticases = new HashSet(0);

	public Jugadores() {
	}

	public Jugadores(int codigo) {
		this.codigo = codigo;
	}

	public Jugadores(int codigo, Equipos equipos, String nombre, String procedencia, String altura, Integer peso,
			String posicion, Set estadisticases) {
		this.codigo = codigo;
		this.equipos = equipos;
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.altura = altura;
		this.peso = peso;
		this.posicion = posicion;
	//	this.estadisticases = estadisticases;
	}

	@Id

	@Column(name = "codigo", unique = true, nullable = false)
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Nombre_equipo")
	public Equipos getEquipos() {
		return this.equipos;
	}

	public void setEquipos(Equipos equipos) {
		this.equipos = equipos;
	}

	@Column(name = "Nombre", length = 30)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "Procedencia", length = 20)
	public String getProcedencia() {
		return this.procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	@Column(name = "Altura", length = 4)
	public String getAltura() {
		return this.altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	@Column(name = "Peso")
	public Integer getPeso() {
		return this.peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	@Column(name = "Posicion", length = 5)
	public String getPosicion() {
		return this.posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	/*
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jugadores")
	public Set getEstadisticases() {
		return this.estadisticases;
	}

	public void setEstadisticases(Set estadisticases) {
		this.estadisticases = estadisticases;
	}
	*/

}