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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_TIPO_CAUSA_FK", nullable = true, updatable = true)
	private TipoCausa tipoCausa;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_CARATULA_UNICA_FK", nullable = true, updatable = true)
	private CaratulaUnica caratulaUnica;

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the anioInicioOperaciones
	 */
	public int getAnioInicioOperaciones() {
		return anioInicioOperaciones;
	}

	/**
	 * @param anioInicioOperaciones the anioInicioOperaciones to set
	 */
	public void setAnioInicioOperaciones(int anioInicioOperaciones) {
		this.anioInicioOperaciones = anioInicioOperaciones;
	}

	/**
	 * @return the mesesOperacion
	 */
	public int getMesesOperacion() {
		return mesesOperacion;
	}

	/**
	 * @param mesesOperacion the mesesOperacion to set
	 */
	public void setMesesOperacion(int mesesOperacion) {
		this.mesesOperacion = mesesOperacion;
	}

	/**
	 * @return the cualOtraCausa
	 */
	public String getCualOtraCausa() {
		return cualOtraCausa;
	}

	/**
	 * @param cualOtraCausa the cualOtraCausa to set
	 */
	public void setCualOtraCausa(String cualOtraCausa) {
		this.cualOtraCausa = cualOtraCausa;
	}

	/**
	 * @return the numeroDepartamentos
	 */
	public int getNumeroDepartamentos() {
		return numeroDepartamentos;
	}

	/**
	 * @param numeroDepartamentos the numeroDepartamentos to set
	 */
	public void setNumeroDepartamentos(int numeroDepartamentos) {
		this.numeroDepartamentos = numeroDepartamentos;
	}

	/**
	 * @return the fechaDiligenciamiento
	 */
	public Date getFechaDiligenciamiento() {
		return fechaDiligenciamiento;
	}

	/**
	 * @param fechaDiligenciamiento the fechaDiligenciamiento to set
	 */
	public void setFechaDiligenciamiento(Date fechaDiligenciamiento) {
		this.fechaDiligenciamiento = fechaDiligenciamiento;
	}

	/**
	 * @return the representanteLegal
	 */
	public String getRepresentanteLegal() {
		return representanteLegal;
	}

	/**
	 * @param representanteLegal the representanteLegal to set
	 */
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}

	/**
	 * @return the emailRepresentante
	 */
	public String getEmailRepresentante() {
		return emailRepresentante;
	}

	/**
	 * @param emailRepresentante the emailRepresentante to set
	 */
	public void setEmailRepresentante(String emailRepresentante) {
		this.emailRepresentante = emailRepresentante;
	}

	/**
	 * @return the celularRepresentante
	 */
	public long getCelularRepresentante() {
		return celularRepresentante;
	}

	/**
	 * @param celularRepresentante the celularRepresentante to set
	 */
	public void setCelularRepresentante(long celularRepresentante) {
		this.celularRepresentante = celularRepresentante;
	}

	/**
	 * @return the personaDiligencia
	 */
	public String getPersonaDiligencia() {
		return personaDiligencia;
	}

	/**
	 * @param personaDiligencia the personaDiligencia to set
	 */
	public void setPersonaDiligencia(String personaDiligencia) {
		this.personaDiligencia = personaDiligencia;
	}

	/**
	 * @return the cargoDiligencia
	 */
	public String getCargoDiligencia() {
		return cargoDiligencia;
	}

	/**
	 * @param cargoDiligencia the cargoDiligencia to set
	 */
	public void setCargoDiligencia(String cargoDiligencia) {
		this.cargoDiligencia = cargoDiligencia;
	}

	/**
	 * @return the emailDiligencia
	 */
	public String getEmailDiligencia() {
		return emailDiligencia;
	}

	/**
	 * @param emailDiligencia the emailDiligencia to set
	 */
	public void setEmailDiligencia(String emailDiligencia) {
		this.emailDiligencia = emailDiligencia;
	}

	/**
	 * @return the telefonoDiligencia
	 */
	public long getTelefonoDiligencia() {
		return telefonoDiligencia;
	}

	/**
	 * @param telefonoDiligencia the telefonoDiligencia to set
	 */
	public void setTelefonoDiligencia(long telefonoDiligencia) {
		this.telefonoDiligencia = telefonoDiligencia;
	}

	/**
	 * @return the extensionDiligencia
	 */
	public long getExtensionDiligencia() {
		return extensionDiligencia;
	}

	/**
	 * @param extensionDiligencia the extensionDiligencia to set
	 */
	public void setExtensionDiligencia(long extensionDiligencia) {
		this.extensionDiligencia = extensionDiligencia;
	}

	/**
	 * @return the celularDiligencia
	 */
	public long getCelularDiligencia() {
		return celularDiligencia;
	}

	/**
	 * @param celularDiligencia the celularDiligencia to set
	 */
	public void setCelularDiligencia(long celularDiligencia) {
		this.celularDiligencia = celularDiligencia;
	}

	/**
	 * @return the tipoCausa
	 */
	public TipoCausa getTipoCausa() {
		return tipoCausa;
	}

	/**
	 * @param tipoCausa the tipoCausa to set
	 */
	public void setTipoCausa(TipoCausa tipoCausa) {
		this.tipoCausa = tipoCausa;
	}

	/**
	 * @return the caratulaUnica
	 */
	public CaratulaUnica getCaratulaUnica() {
		return caratulaUnica;
	}

	/**
	 * @param caratulaUnica the caratulaUnica to set
	 */
	public void setCaratulaUnica(CaratulaUnica caratulaUnica) {
		this.caratulaUnica = caratulaUnica;
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
	public void setId(long id) {
		this.id = id;
	}

	
	
}
