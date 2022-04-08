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
@Table(name = "EAC_TIPO_ORGANIZACION")
@Setter
@Getter
public class TipoOrganizacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqTipoOrganizacion" )
	@SequenceGenerator( name = "SeqTipoOrganizacion", sequenceName = "SEQ_TIPO_ORGANIZACION", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_TIPO_ORGANIZACION_PK", nullable = false )
	private int id;
	
	@Column( name = "CODIGO", nullable = false, updatable = true, length = 2 )
	private String codigo;
	
	@Column( name = "ORDEN", nullable = false, updatable = true, length = 2 )
	private int orden;
	
	@Column( name = "NOMBRE", nullable = false, updatable = true, length = 100 )
	private String nombre;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoOrganizacion")
	private Collection<SubTipoOrganizacion> subTipoOrganizacion;

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the orden
	 */
	public int getOrden() {
		return orden;
	}

	/**
	 * @param orden the orden to set
	 */
	public void setOrden(int orden) {
		this.orden = orden;
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
	 * @return the subTipoOrganizacion
	 */
	public Collection<SubTipoOrganizacion> getSubTipoOrganizacion() {
		return subTipoOrganizacion;
	}

	/**
	 * @param subTipoOrganizacion the subTipoOrganizacion to set
	 */
	public void setSubTipoOrganizacion(Collection<SubTipoOrganizacion> subTipoOrganizacion) {
		this.subTipoOrganizacion = subTipoOrganizacion;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	
	
}
