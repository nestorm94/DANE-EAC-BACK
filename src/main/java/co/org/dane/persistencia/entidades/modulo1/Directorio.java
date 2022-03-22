/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo1;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "EAC_DIRECTORIO")
@Setter
@Getter
public class Directorio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqDirectorio" )
	@SequenceGenerator( name = "SeqDirectorio", sequenceName = "SEQ_DIRECTORIO", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_DIRECTORIO_PK", nullable = false )
	private long id;
	
	//IDNOREMP Número de orden, identificación de cada empresa en el directorio 
		@Column( name = "NUMERO_ORDEN", nullable = false, updatable = true, length = 6 )
		private int numeroOrden;//ok
		
		//IDNITCC NIT 
		@Column( name = "NUMERO_DOCUMENTO", nullable = false, updatable = true, length = 10 )
		private long numeroDocumento;//ok
		
		//IDDV Dígito de verificación 
		@Column( name = "DIGITO_VERIFICACION", nullable = false, updatable = true, length = 1 )
		private byte digitoVerificacion;//ok
		
		//IDCAMA Registro de cámara 
		@Column( name = "NUMERO_CAMARA", nullable = true, updatable = true, length = 3 )
		private int numeroCamara;//ok
		
		//IDREG Registro mercantil
		@Column( name = "NUMERO_REGISTRO", nullable = true, updatable = true, length = 11 )
		private long numeroRegistro;//ok	
		
		//IDPRORAZ Razón social de la empresa
		@Column( name = "RAZON_SOCIAL", nullable = false, updatable = true, length = 80 )
		private String razonSocial;
		
		//IDIGG Localización georeferenciada de la gerencia (código asignado por georefenciación - LGGR)
		@Column( name = "GEOREFERENCIA_GERENCIA", nullable = false, updatable = true, length = 11 )
		private double georeferenciaGerecia;
		
		//IDNOMCOM Nombre comercial
		@Column( name = "NOMBRE_COMERCIAL", nullable = false, updatable = true, length = 80 )
		private String nombreComercial;
		
		//IDSIGLA Sigla
		@Column( name = "SIGLA", nullable = true, updatable = true, length = 10 )
		private String sigla;
		
		//IDWEB Página Web 
		@Column( name = "PAGINA_WEB", nullable = true, updatable = true, length = 40 )
		private String paginaWeb;
		
		//IDIGG Localización georeferenciada de la gerencia (código asignado por georefenciación - LGGR)
		@Column( name = "GEOREFERENCIA_NOTIFICACION", nullable = false, updatable = true, length = 11 )
		private double georeferenciaNotificacion;
		
		@Column( name = "CUAL_TIPO_ORGANIZACION", nullable = true, updatable = true, length = 30 )
		private String cualTipoOrgaizacion;
		
		//IDFEINI Fecha inicio operaciones
		@Column( name = "FECHA_CONSTITUCION_DESDE", nullable = true, updatable = true )
		private Date fechaConstitucionDesde;
		
		//IDFECIE Fecha terminación operaciones
		@Column( name = "FECHA_CONSTITUCION_HASTA", nullable = true, updatable = true )
		private Date fechaConstitucionHasta;
		
		@Column( name = "CUAL_OTRO_ESTADO", nullable = true, updatable = true, length = 30 )
		private String cualOtroEstado;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "ID_USUARIO_FK", nullable = false, updatable = true)
		private Usuario usuario;
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "directorio")
		private Collection<CaratulaUnica> caratulas;

		public long getId() {
			// TODO Auto-generated method stub
			return 0;
		}

		/**
		 * @return the numeroOrden
		 */
		public int getNumeroOrden() {
			return numeroOrden;
		}

		/**
		 * @param numeroOrden the numeroOrden to set
		 */
		public void setNumeroOrden(int numeroOrden) {
			this.numeroOrden = numeroOrden;
		}

		/**
		 * @return the numeroDocumento
		 */
		public long getNumeroDocumento() {
			return numeroDocumento;
		}

		/**
		 * @param numeroDocumento the numeroDocumento to set
		 */
		public void setNumeroDocumento(long numeroDocumento) {
			this.numeroDocumento = numeroDocumento;
		}

		/**
		 * @return the digitoVerificacion
		 */
		public byte getDigitoVerificacion() {
			return digitoVerificacion;
		}

		/**
		 * @param digitoVerificacion the digitoVerificacion to set
		 */
		public void setDigitoVerificacion(byte digitoVerificacion) {
			this.digitoVerificacion = digitoVerificacion;
		}

		/**
		 * @return the numeroCamara
		 */
		public int getNumeroCamara() {
			return numeroCamara;
		}

		/**
		 * @param numeroCamara the numeroCamara to set
		 */
		public void setNumeroCamara(int numeroCamara) {
			this.numeroCamara = numeroCamara;
		}

		/**
		 * @return the numeroRegistro
		 */
		public long getNumeroRegistro() {
			return numeroRegistro;
		}

		/**
		 * @param numeroRegistro the numeroRegistro to set
		 */
		public void setNumeroRegistro(long numeroRegistro) {
			this.numeroRegistro = numeroRegistro;
		}

		/**
		 * @return the razonSocial
		 */
		public String getRazonSocial() {
			return razonSocial;
		}

		/**
		 * @param razonSocial the razonSocial to set
		 */
		public void setRazonSocial(String razonSocial) {
			this.razonSocial = razonSocial;
		}

		/**
		 * @return the georeferenciaGerecia
		 */
		public double getGeoreferenciaGerecia() {
			return georeferenciaGerecia;
		}

		/**
		 * @param georeferenciaGerecia the georeferenciaGerecia to set
		 */
		public void setGeoreferenciaGerecia(double georeferenciaGerecia) {
			this.georeferenciaGerecia = georeferenciaGerecia;
		}

		/**
		 * @return the nombreComercial
		 */
		public String getNombreComercial() {
			return nombreComercial;
		}

		/**
		 * @param nombreComercial the nombreComercial to set
		 */
		public void setNombreComercial(String nombreComercial) {
			this.nombreComercial = nombreComercial;
		}

		/**
		 * @return the sigla
		 */
		public String getSigla() {
			return sigla;
		}

		/**
		 * @param sigla the sigla to set
		 */
		public void setSigla(String sigla) {
			this.sigla = sigla;
		}

		/**
		 * @return the paginaWeb
		 */
		public String getPaginaWeb() {
			return paginaWeb;
		}

		/**
		 * @param paginaWeb the paginaWeb to set
		 */
		public void setPaginaWeb(String paginaWeb) {
			this.paginaWeb = paginaWeb;
		}

		/**
		 * @return the georeferenciaNotificacion
		 */
		public double getGeoreferenciaNotificacion() {
			return georeferenciaNotificacion;
		}

		/**
		 * @param georeferenciaNotificacion the georeferenciaNotificacion to set
		 */
		public void setGeoreferenciaNotificacion(double georeferenciaNotificacion) {
			this.georeferenciaNotificacion = georeferenciaNotificacion;
		}

		/**
		 * @return the cualTipoOrgaizacion
		 */
		public String getCualTipoOrgaizacion() {
			return cualTipoOrgaizacion;
		}

		/**
		 * @param cualTipoOrgaizacion the cualTipoOrgaizacion to set
		 */
		public void setCualTipoOrgaizacion(String cualTipoOrgaizacion) {
			this.cualTipoOrgaizacion = cualTipoOrgaizacion;
		}

		/**
		 * @return the fechaConstitucionDesde
		 */
		public Date getFechaConstitucionDesde() {
			return fechaConstitucionDesde;
		}

		/**
		 * @param fechaConstitucionDesde the fechaConstitucionDesde to set
		 */
		public void setFechaConstitucionDesde(Date fechaConstitucionDesde) {
			this.fechaConstitucionDesde = fechaConstitucionDesde;
		}

		/**
		 * @return the fechaConstitucionHasta
		 */
		public Date getFechaConstitucionHasta() {
			return fechaConstitucionHasta;
		}

		/**
		 * @param fechaConstitucionHasta the fechaConstitucionHasta to set
		 */
		public void setFechaConstitucionHasta(Date fechaConstitucionHasta) {
			this.fechaConstitucionHasta = fechaConstitucionHasta;
		}

		/**
		 * @return the cualOtroEstado
		 */
		public String getCualOtroEstado() {
			return cualOtroEstado;
		}

		/**
		 * @param cualOtroEstado the cualOtroEstado to set
		 */
		public void setCualOtroEstado(String cualOtroEstado) {
			this.cualOtroEstado = cualOtroEstado;
		}

		/**
		 * @return the usuario
		 */
		public Usuario getUsuario() {
			return usuario;
		}

		/**
		 * @param usuario the usuario to set
		 */
		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		/**
		 * @return the caratulas
		 */
		public Collection<CaratulaUnica> getCaratulas() {
			return caratulas;
		}

		/**
		 * @param caratulas the caratulas to set
		 */
		public void setCaratulas(Collection<CaratulaUnica> caratulas) {
			this.caratulas = caratulas;
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
