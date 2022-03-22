/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo1;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ALFONSO
 *
 */
@Entity
@Table(name = "EAC_DEPARTAMENTOS")
@Setter
@Getter
public class Departamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqDepartamento" )
	@SequenceGenerator( name = "SeqDepartamento", sequenceName = "SEQ_DEPARTAMENTOS", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_DEPARTAMENTO_PK", nullable = false )
	private int id;
	
	@Column( name = "CODIGO", nullable = false, updatable = true, length = 2 )
	private int codigo;
	
	@Column( name = "NOMBRE", nullable = false, updatable = true, length = 100 )
	private String nombre;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departamento")
	private Collection<Municipio> municipios;

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the municipios
	 */
	public Collection<Municipio> getMunicipios() {
		return municipios;
	}

	/**
	 * @param municipios the municipios to set
	 */
	public void setMunicipios(Collection<Municipio> municipios) {
		this.municipios = municipios;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(Object id2) {
		// TODO Auto-generated method stub
		
	}


}
