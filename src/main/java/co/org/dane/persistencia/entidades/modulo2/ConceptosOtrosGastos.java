/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo2;

import java.io.Serializable;

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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_INGRESOS_NETOS_GRUPO_FK", nullable = false, updatable = true)
	private IngresosNetosPorGrupos ingresosNetosPorGrupos;

}
