/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo2;

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

import co.org.dane.persistencia.entidades.modulo3.GastosCausadosPersonal;
import co.org.dane.persistencia.entidades.modulo4.CostosCausados;
import co.org.dane.persistencia.entidades.modulo4.OtrosGastosCausados;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ALFONSO
 *
 */
@Entity
@Table(name = "EAC_CONCEPTOS_OTROS_GASTOS")
@Setter
@Getter
public class ConceptosOtrosGastos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqConceptosOtrosGastos" )
	@SequenceGenerator( name = "SeqConceptosOtrosGastos", sequenceName = "SEQ_CONCEPTOS_OTROS_GASTOS", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_CONCEPTOS_OTROS_GASTOS_PK", nullable = false )
	private long id;
	
	@Column( name = "ORDEN", nullable = false, updatable = true, length = 2 )
	private int orden;
	
	@Column( name = "DESCRIPCION", nullable = false, updatable = true, length = 200 )
	private String descripcion;
	
	@Column( name = "VALOR", nullable = false, updatable = true, length = 13 )
	private double valor;
	
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
	
	//Modulo2
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_INGRESOS_NETOS_GRUPO_FK", nullable = true, updatable = true)
	private IngresosNetosPorGrupos ingresosNetosPorGrupos;

	//Modulo3
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_GASTOS_CAUSADOS_PERONAL_FK", nullable = true, updatable = true)
	private GastosCausadosPersonal gastosCausadosPersonal;

	//Modulo4
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CONCEPTO_OTROS_GASTOS_FK", nullable = true, updatable = true)
	private CostosCausados costosCausados;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_OTRO_GASTO_CAUSADO_FK", nullable = true, updatable = true)
	private OtrosGastosCausados otrosGastosCausados;
	
	
}
