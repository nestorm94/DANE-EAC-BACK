/**
 * 
 */
package co.org.dane.servicios.modulo1;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import co.org.dane.persistencia.repositorios.modulo1.RepositorioCaratulaUnica;
import co.org.dane.persistencia.repositorios.modulo1.RepositorioDireccion;
import co.org.dane.persistencia.repositorios.modulo1.RepositorioEstadoEncuesta;
import co.org.dane.persistencia.repositorios.modulo1.RepositorioEstadoModulos;
import co.org.dane.persistencia.repositorios.modulo1.RepositorioInformacionFuncionamiento;
import co.org.dane.persistencia.repositorios.modulo1.RepositorioIngresosNoOperacionales;
import co.org.dane.persistencia.repositorios.modulo1.RepositorioNovedadEncuesta;
import co.org.dane.persistencia.repositorios.modulo1.RepositorioOperacion;
import co.org.dane.persistencia.repositorios.modulo1.RepositorioVariableEmpresa;
import co.org.dane.persistencia.repositorios.modulo1.RepositorioaCapitalSocial;

/**
 * @author ALFONSO
 *
 */
@Service
public class ServiciosCaratulaUnica implements IServiciosCaratulaUnica {

	@Autowired
	private RepositorioCaratulaUnica repositorioCaratulaUnica;
	
	@Autowired
	private RepositorioDireccion repositorioDireccion;
	
	@Autowired
	private RepositorioaCapitalSocial repositorioCapitalSocial;
	
	@Autowired
	private RepositorioOperacion repositorioOperacion; 
	
	@Autowired
	private RepositorioVariableEmpresa repositorioVariableEmpresa; 
	
	@Autowired
	private RepositorioIngresosNoOperacionales repositorioIngresosNoOperacionales;
	
	@Autowired
	private RepositorioInformacionFuncionamiento repositorioInformacionFuncionamiento;
	
	@Autowired
	private RepositorioNovedadEncuesta repositorioNovedadEncuesta;
	
	@Autowired
	private RepositorioEstadoEncuesta repositorioEstadoEncuesta;
	
	@Autowired
	private RepositorioEstadoModulos repositorioEstadoModulos;
	
	@Override
	public CaratulaUnica guardarCaratulaUnica(CaratulaUnica caratulaUnica) throws EncuestaAnualComercioException {		
		return this.repositorioCaratulaUnica.save(caratulaUnica);
	}

	@Override
	public CaratulaUnica modificarCaratulaUnica(CaratulaUnica caratulaUnica) throws EncuestaAnualComercioException {
		return null;
	}

	@Override
	public CaratulaUnica eliminarCaratulaUnica(CaratulaUnica caratulaUnica) throws EncuestaAnualComercioException {
		return null;
	}

	@Override
	public CaratulaUnica cargarCaratulaUnica(String usuario) throws EncuestaAnualComercioException {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.YEAR, -1);
		Date fechaInicio = calendar.getTime();
		Date fechaFin = calendar.getTime();
		
		System.out.println("usuario: " +  usuario);
		System.out.println("fecha inicio: " +  fechaInicio);
		System.out.println("fecha final: " +  fechaFin);
		
		return this.repositorioCaratulaUnica.findCaratulaUnicaByUsuarioFechaDesdeFechaHasta(usuario, fechaInicio, fechaFin);
		
	}

	@Override
	public List<Direccion> getCaratulaUnicaDirecciones(long idCaratulaUnica) throws EncuestaAnualComercioException {
		return this.repositorioDireccion.findDireccionByIdCaratula(idCaratulaUnica);
	}

	@Override
	public List<CapitalSocial> getCaratulaUnicaCapitalSocial(long idCaratulaUnica)
			throws EncuestaAnualComercioException {
		return this.repositorioCapitalSocial.findCapitalSocialByIdCaratula(idCaratulaUnica);
	}

	@Override
	public List<Operacion> getCaratulaUnicaOperacion(long idCaratulaUnica) throws EncuestaAnualComercioException {
		return this.repositorioOperacion.findOperacionByIdCaratula(idCaratulaUnica);
	}

	@Override
	public List<VariableEmpresa> getCaratulaUnicaVariableEmpresa(long idCaratulaUnica) throws EncuestaAnualComercioException {
		return this.repositorioVariableEmpresa.findVariableEmpresaByIdCaratula(idCaratulaUnica);
	}

	@Override
	public List<IngresosNoOperacionales> getCaratulaUnicaIngresosNoOperacionales(long idCaratulaUnica)
			throws EncuestaAnualComercioException {
		return this.repositorioIngresosNoOperacionales.findIngresosNoOperacionalesByIdCaratula(idCaratulaUnica);
	}

	@Override
	public InformacionFuncionamiento getCaratulaUnicaInformacionFuncionamiento(long idCaratulaUnica)
			throws EncuestaAnualComercioException {
		return this.repositorioInformacionFuncionamiento.findInformacionFuncionamientoByIdCaratula(idCaratulaUnica);
	}

	@Override
	public List<NovedadEncuesta> getCaratulaUnicaNovedadEncuesta(long idCaratulaUnica)
			throws EncuestaAnualComercioException {
		return this.repositorioNovedadEncuesta.findNovedadEncuestaByIdCaratula(idCaratulaUnica);
	}

	@Override
	public List<EstadoEncuesta> getCaratulaUnicaEstadoEncuesta(long idCaratulaUnica)
			throws EncuestaAnualComercioException {
		return this.repositorioEstadoEncuesta.findEstadoEncuestaByIdCaratula(idCaratulaUnica);
	}

	@Override
	public List<EstadoModulos> getCaratulaUnicaEstadoModulos(long idCaratulaUnica)
			throws EncuestaAnualComercioException {
		return this.repositorioEstadoModulos.findEstadoModulosByIdCaratula(idCaratulaUnica);
	}

	@Override
	public Direccion guardarDireccion(Direccion direccion) throws EncuestaAnualComercioException {
		return this.repositorioDireccion.save(direccion);
	}

	@Override
	public CapitalSocial guardarCapitalSocial(CapitalSocial capitalSocial) throws EncuestaAnualComercioException {
		return this.repositorioCapitalSocial.save(capitalSocial);
	}

	@Override
	public Operacion guardarOperacion(Operacion operacion) throws EncuestaAnualComercioException {
		return this.repositorioOperacion.save(operacion);
	}

	@Override
	public VariableEmpresa guardarVariableEmpresa(VariableEmpresa variableEmpresa)
			throws EncuestaAnualComercioException {
		return this.repositorioVariableEmpresa.save(variableEmpresa);
	}

	@Override
	public IngresosNoOperacionales guardarIngresosNoOperacionales(IngresosNoOperacionales ingresosNoOperacionales)
			throws EncuestaAnualComercioException {
		return this.repositorioIngresosNoOperacionales.save(ingresosNoOperacionales);
	}

	@Override
	public InformacionFuncionamiento guardarInformacionFuncionamiento(
			InformacionFuncionamiento informacionFuncionamiento) throws EncuestaAnualComercioException {
		return this.repositorioInformacionFuncionamiento.save(informacionFuncionamiento);
	}

	@Override
	public NovedadEncuesta guardarNovedadEncuesta(NovedadEncuesta novedadEncuesta)
			throws EncuestaAnualComercioException {
		return this.repositorioNovedadEncuesta.save(novedadEncuesta);
	}

	@Override
	public EstadoEncuesta guardarEstadoEncuesta(EstadoEncuesta estadoEncuesta) throws EncuestaAnualComercioException {
		return this.repositorioEstadoEncuesta.save(estadoEncuesta);
	}

	@Override
	public EstadoModulos guardarEstadoModulos(EstadoModulos estadoModulos) throws EncuestaAnualComercioException {
		return this.repositorioEstadoModulos.save(estadoModulos);
	}
	
}


