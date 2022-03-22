/**
 * 
 */
package co.org.dane.persistencia.entidades.modulo1;

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
@Table(name = "EAC_VARIABLES_EMPRESA")
@Setter
@Getter
public class VariableEmpresa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SeqVariableEmpresa" )
	@SequenceGenerator( name = "SeqVariableEmpresa", sequenceName = "SEQ_VARIABLES_EMPRESA", initialValue = 1, allocationSize = 1 )
	@Column( name = "ID_VARIABLE_EMPRESA_PK", nullable = false )
	private long id;
	
	@Column( name = "NUMERO_ESTABLECIMIENTOS", nullable = false, updatable = true, length = 5)
	private int numeroEstablecimientos;
	
	@Column( name = "INGRESO", nullable = false, updatable = true, length = 12)
	private long ingreso;
	
	@Column( name = "PERSONAL_OCUPADO", nullable = false, updatable = true, length = 7)
	private int personalOcupado;
	
	@Column( name = "REMUNERACION", nullable = true, updatable = true, length = 12)
	private long remuneracion;
	
	@Column( name = "OTROS_COSTOS_GASTOS", nullable = false, updatable = true, length = 12)
	private long otrosCostosGastos;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_VARIABLE_FK", nullable = false, updatable = true)
	private TipoVariable seccion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CODIGO_CIIU_FK", nullable = false, updatable = true)
	private CodigoCIIU codigoCIIU;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CARATULA_UNICA_FK", nullable = false, updatable = true)
	private CaratulaUnica caratulaUnica;

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the numeroEstablecimientos
	 */
	public int getNumeroEstablecimientos() {
		return numeroEstablecimientos;
	}

	/**
	 * @param numeroEstablecimientos the numeroEstablecimientos to set
	 */
	public void setNumeroEstablecimientos(int numeroEstablecimientos) {
		this.numeroEstablecimientos = numeroEstablecimientos;
	}

	/**
	 * @return the ingreso
	 */
	public long getIngreso() {
		return ingreso;
	}

	/**
	 * @param ingreso the ingreso to set
	 */
	public void setIngreso(long ingreso) {
		this.ingreso = ingreso;
	}

	/**
	 * @return the personalOcupado
	 */
	public int getPersonalOcupado() {
		return personalOcupado;
	}

	/**
	 * @param personalOcupado the personalOcupado to set
	 */
	public void setPersonalOcupado(int personalOcupado) {
		this.personalOcupado = personalOcupado;
	}

	/**
	 * @return the remuneracion
	 */
	public long getRemuneracion() {
		return remuneracion;
	}

	/**
	 * @param remuneracion the remuneracion to set
	 */
	public void setRemuneracion(long remuneracion) {
		this.remuneracion = remuneracion;
	}

	/**
	 * @return the otrosCostosGastos
	 */
	public long getOtrosCostosGastos() {
		return otrosCostosGastos;
	}

	/**
	 * @param otrosCostosGastos the otrosCostosGastos to set
	 */
	public void setOtrosCostosGastos(long otrosCostosGastos) {
		this.otrosCostosGastos = otrosCostosGastos;
	}

	/**
	 * @return the seccion
	 */
	public TipoVariable getSeccion() {
		return seccion;
	}

	/**
	 * @param seccion the seccion to set
	 */
	public void setSeccion(TipoVariable seccion) {
		this.seccion = seccion;
	}

	/**
	 * @return the codigoCIIU
	 */
	public CodigoCIIU getCodigoCIIU() {
		return codigoCIIU;
	}

	/**
	 * @param codigoCIIU the codigoCIIU to set
	 */
	public void setCodigoCIIU(CodigoCIIU codigoCIIU) {
		this.codigoCIIU = codigoCIIU;
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
