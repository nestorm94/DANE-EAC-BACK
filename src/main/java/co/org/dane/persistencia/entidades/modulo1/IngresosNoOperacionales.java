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
@Table(name = "EAC_INGRESOS_NO_OPERACIONALES")
@Setter
@Getter
public class IngresosNoOperacionales implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqIngresosNoOperacionales" )
	@SequenceGenerator( name = "SeqIngresosNoOperacionales", sequenceName = "SEQ_INGRESOS_NO_OPERACIONALES", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_INGRESO_NO_OPERACIONAL_PK", nullable = false )
	private long id;
	
	@Column( name = "VALOR", nullable = false, updatable = true, length = 12 )
	private long valor;
	
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
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_TIPO_INGRESO_NO_OPERACIONAL_FK")
	private TipoIngresosNoOperacionales tipoIngresosNoOperacionales;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_CARATULA_UNICA_FK")
	private CaratulaUnica caratulaUnica;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
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

	public TipoIngresosNoOperacionales getTipoIngresosNoOperacionales() {
		return tipoIngresosNoOperacionales;
	}

	public void setTipoIngresosNoOperacionales(TipoIngresosNoOperacionales tipoIngresosNoOperacionales) {
		this.tipoIngresosNoOperacionales = tipoIngresosNoOperacionales;
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
