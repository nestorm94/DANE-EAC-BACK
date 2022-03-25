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

}
