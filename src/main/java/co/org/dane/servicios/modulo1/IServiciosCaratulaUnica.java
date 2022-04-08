/**
 * 
 */
package co.org.dane.servicios.modulo1;

import java.util.List;

import co.org.dane.excepciones.EncuestaAnualComercioException;
import co.org.dane.persistencia.entidades.modulo1.CapitalSocial;
import co.org.dane.persistencia.entidades.modulo1.CaratulaUnica;
import co.org.dane.persistencia.entidades.modulo1.Direccion;
import co.org.dane.persistencia.entidades.modulo1.EstadoEncuesta;
import co.org.dane.persistencia.entidades.modulo1.EstadoModulos;
import co.org.dane.persistencia.entidades.modulo1.InformacionFuncionamiento;
import co.org.dane.persistencia.entidades.modulo1.IngresosNoOperacionales;
import co.org.dane.persistencia.entidades.modulo1.NovedadEncuesta;
import co.org.dane.persistencia.entidades.modulo1.Operacion;
import co.org.dane.persistencia.entidades.modulo1.VariableEmpresa;

/**
 * @author ALFONSO
 *
 */
public interface IServiciosCaratulaUnica {

	public CaratulaUnica guardarCaratulaUnica(CaratulaUnica caratulaUnica) throws EncuestaAnualComercioException;
	public CaratulaUnica modificarCaratulaUnica(CaratulaUnica caratulaUnica) throws EncuestaAnualComercioException;
	public CaratulaUnica eliminarCaratulaUnica(CaratulaUnica caratulaUnica) throws EncuestaAnualComercioException;
	public CaratulaUnica cargarCaratulaUnica(String usuario) throws EncuestaAnualComercioException;
	
	//Cargar datos que hacen parte de la caratula Unica.
	public List<Direccion> getCaratulaUnicaDirecciones(long idCaratulaUnica) throws EncuestaAnualComercioException;
	public List<CapitalSocial> getCaratulaUnicaCapitalSocial(long idCaratulaUnica) throws EncuestaAnualComercioException;
	public List<Operacion> getCaratulaUnicaOperacion(long idCaratulaUnica) throws EncuestaAnualComercioException;
	public List<VariableEmpresa> getCaratulaUnicaVariableEmpresa(long idCaratulaUnica) throws EncuestaAnualComercioException;
	public List<IngresosNoOperacionales> getCaratulaUnicaIngresosNoOperacionales(long idCaratulaUnica) throws EncuestaAnualComercioException;
	public InformacionFuncionamiento getCaratulaUnicaInformacionFuncionamiento(long idCaratulaUnica) throws EncuestaAnualComercioException;
	public List<NovedadEncuesta> getCaratulaUnicaNovedadEncuesta(long idCaratulaUnica) throws EncuestaAnualComercioException;
	public List<EstadoEncuesta> getCaratulaUnicaEstadoEncuesta(long idCaratulaUnica) throws EncuestaAnualComercioException;
	public List<EstadoModulos> getCaratulaUnicaEstadoModulos(long idCaratulaUnica) throws EncuestaAnualComercioException;
	
	//Crear y modificar Datos que hacen parte de la caratula unica.
	public Direccion guardarDireccion(Direccion direccion) throws EncuestaAnualComercioException;
	public CapitalSocial guardarCapitalSocial(CapitalSocial capitalSocial) throws EncuestaAnualComercioException;
	public Operacion guardarOperacion(Operacion operacion) throws EncuestaAnualComercioException;
	public VariableEmpresa guardarVariableEmpresa(VariableEmpresa variableEmpresa) throws EncuestaAnualComercioException;
	public IngresosNoOperacionales guardarIngresosNoOperacionales(IngresosNoOperacionales ingresosNoOperacionales) throws EncuestaAnualComercioException;
	public InformacionFuncionamiento guardarInformacionFuncionamiento(InformacionFuncionamiento informacionFuncionamiento) throws EncuestaAnualComercioException;
	public NovedadEncuesta guardarNovedadEncuesta(NovedadEncuesta novedadEncuesta) throws EncuestaAnualComercioException;
	public EstadoEncuesta guardarEstadoEncuesta(EstadoEncuesta estadoEncuesta) throws EncuestaAnualComercioException;
	public EstadoModulos guardarEstadoModulos(EstadoModulos estadoModulos) throws EncuestaAnualComercioException;
	
}
