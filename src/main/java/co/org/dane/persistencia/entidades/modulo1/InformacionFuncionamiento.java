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
import javax.persistence.OneToOne;
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
@Table(name = "EAC_INFORMACION_FUNCIONAMIENTO")
@Setter
@Getter
public class InformacionFuncionamiento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqInformacionFuncionamiento" )
	@SequenceGenerator( name = "SeqInformacionFuncionamiento", sequenceName = "SEQ_INFORMACION_FUNCIONAMIENTO", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_INFORMACION_FUNCIONAMIENTO_PK", nullable = false )
	private long id;
	
	@Column( name = "ANIO_INICIO_OPERACIONES", nullable = false, updatable = true, length = 4 )
	private int anioInicioOperaciones;
	
	@Column( name = "MES_OPERACIONES", nullable = false, updatable = true, length = 2 )
	private int mesesOperacion;
	
	@Column( name = "CUAL_OTRA_CAUSA", nullable = true, updatable = true, length = 80 )
	private String cualOtraCausa;
	
	@Column( name = "NUMERO_DEPARTAMENTOS", nullable = true, updatable = true, length = 2 )
	private int numeroDepartamentos;
	
	@Column( name = "FECHA_DILIGENCIAMIENTO", nullable = false, updatable = true )
	private Date fechaDiligenciamiento;
	
	@Column( name = "REPRESENTANTE_LEGAL", nullable = false, updatable = true, length = 80 )
	private String representanteLegal;
	
	@Column( name = "EMAIL_REPRESENTANTE", nullable = false, updatable = true, length = 50 )
	private String emailRepresentante;
	
	@Column( name = "CELULAR_REPRESENTANTE", nullable = true, updatable = true, length = 12 )
	private long celularRepresentante;
	
	@Column( name = "PERSONA_DILIGENCIA", nullable = false, updatable = true, length = 80 )
	private String personaDiligencia;
	
	@Column( name = "CARGO_DILIGENCIA", nullable = true, updatable = true, length = 50 )
	private String cargoDiligencia;
	
	@Column( name = "EMAIL_DILIGENCIA", nullable = false, updatable = true, length = 50 )
	private String emailDiligencia;
	
	@Column( name = "TELEFONO_DILIGENCIA", nullable = false, updatable = true, length = 10 )
	private long telefonoDiligencia;
	
	@Column( name = "EXTENSION_DILIGENCIA", nullable = true, updatable = true, length = 8 )
	private long extensionDiligencia;
	
	@Column( name = "CELULAR_DILIGENCIA", nullable = true, updatable = true, length = 12 )
	private long celularDiligencia;
	
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
	@JoinColumn(name="ID_TIPO_CAUSA_FK", nullable = true, updatable = true)
	private TipoCausa tipoCausa;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_CARATULA_UNICA_FK", nullable = true, updatable = true)
	private CaratulaUnica caratulaUnica;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAnioInicioOperaciones() {
		return anioInicioOperaciones;
	}

	public void setAnioInicioOperaciones(int anioInicioOperaciones) {
		this.anioInicioOperaciones = anioInicioOperaciones;
	}

	public int getMesesOperacion() {
		return mesesOperacion;
	}

	public void setMesesOperacion(int mesesOperacion) {
		this.mesesOperacion = mesesOperacion;
	}

	public String getCualOtraCausa() {
		return cualOtraCausa;
	}

	public void setCualOtraCausa(String cualOtraCausa) {
		this.cualOtraCausa = cualOtraCausa;
	}

	public int getNumeroDepartamentos() {
		return numeroDepartamentos;
	}

	public void setNumeroDepartamentos(int numeroDepartamentos) {
		this.numeroDepartamentos = numeroDepartamentos;
	}

	public Date getFechaDiligenciamiento() {
		return fechaDiligenciamiento;
	}

	public void setFechaDiligenciamiento(Date fechaDiligenciamiento) {
		this.fechaDiligenciamiento = fechaDiligenciamiento;
	}

	public String getRepresentanteLegal() {
		return representanteLegal;
	}

	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}

	public String getEmailRepresentante() {
		return emailRepresentante;
	}

	public void setEmailRepresentante(String emailRepresentante) {
		this.emailRepresentante = emailRepresentante;
	}

	public long getCelularRepresentante() {
		return celularRepresentante;
	}

	public void setCelularRepresentante(long celularRepresentante) {
		this.celularRepresentante = celularRepresentante;
	}

	public String getPersonaDiligencia() {
		return personaDiligencia;
	}

	public void setPersonaDiligencia(String personaDiligencia) {
		this.personaDiligencia = personaDiligencia;
	}

	public String getCargoDiligencia() {
		return cargoDiligencia;
	}

	public void setCargoDiligencia(String cargoDiligencia) {
		this.cargoDiligencia = cargoDiligencia;
	}

	public String getEmailDiligencia() {
		return emailDiligencia;
	}

	public void setEmailDiligencia(String emailDiligencia) {
		this.emailDiligencia = emailDiligencia;
	}

	public long getTelefonoDiligencia() {
		return telefonoDiligencia;
	}

	public void setTelefonoDiligencia(long telefonoDiligencia) {
		this.telefonoDiligencia = telefonoDiligencia;
	}

	public long getExtensionDiligencia() {
		return extensionDiligencia;
	}

	public void setExtensionDiligencia(long extensionDiligencia) {
		this.extensionDiligencia = extensionDiligencia;
	}

	public long getCelularDiligencia() {
		return celularDiligencia;
	}

	public void setCelularDiligencia(long celularDiligencia) {
		this.celularDiligencia = celularDiligencia;
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

	public TipoCausa getTipoCausa() {
		return tipoCausa;
	}

	public void setTipoCausa(TipoCausa tipoCausa) {
		this.tipoCausa = tipoCausa;
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
