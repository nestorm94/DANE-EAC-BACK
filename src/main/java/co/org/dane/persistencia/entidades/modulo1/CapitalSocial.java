/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo1;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ALFONSO
 *
 */
@Entity
@Table(name = "EAC_CAPITAL_SOCIAL")
@Setter
@Getter
public class CapitalSocial implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqCapitalSocial" )
	@SequenceGenerator( name = "SeqCapitalSocial", sequenceName = "SEQ_CAPITAL_SOCIAL", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_CAPITAL_SOCIAL_PK", nullable = false )
	private long id;
	
	@Column( name = "PUBLICO", nullable = false, updatable = true, length = 3 )
	private int publico;
	
	@Column( name = "PRIVADO", nullable = false, updatable = true, length = 3 )
	private int privado;
	
	@Column( name = "TOTAL", nullable = false, updatable = true, length = 3 )
	private int total;
	
	@Column( name = "USUARIO_CREACION", nullable = true, updatable = true, length = 30 )
	private String usuarioCreacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column( name = "FECHA_CREACION", nullable = true, updatable = true )
	private Date fechaCreacion;
	
	@Column( name = "USUARIO_MODIFICACION", nullable = true, updatable = true, length = 30 )
	private String usuarioModificacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column( name = "FECHA_MODIFICACION", nullable = true, updatable = true)
	private Date fechaModificacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoCapitalSocial tipoCapitalSocial;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CARATULA_UNICA_FK", nullable = false, updatable = true)
	private CaratulaUnica caratulaUnica;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPublico() {
		return publico;
	}

	public void setPublico(int publico) {
		this.publico = publico;
	}

	public int getPrivado() {
		return privado;
	}

	public void setPrivado(int privado) {
		this.privado = privado;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public TipoCapitalSocial getTipoCapitalSocial() {
		return tipoCapitalSocial;
	}

	public void setTipoCapitalSocial(TipoCapitalSocial tipoCapitalSocial) {
		this.tipoCapitalSocial = tipoCapitalSocial;
	}

	public CaratulaUnica getCaratulaUnica() {
		return caratulaUnica;
	}

	public void setCaratulaUnica(CaratulaUnica caratulaUnica) {
		this.caratulaUnica = caratulaUnica;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
