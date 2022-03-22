/**
 * 
 */
package co.org.dane.controladores;

import java.net.URI;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.org.dane.dto.modulo1.CapitalSocialDTO;
import co.org.dane.dto.modulo1.CaratulaUnicaDTO;
import co.org.dane.dto.modulo1.DireccionDTO;
import co.org.dane.dto.modulo1.EstadoEncuestaDTO;
import co.org.dane.dto.modulo1.EstadoModulosDTO;
import co.org.dane.dto.modulo1.InformacionFuncionamientoDTO;
import co.org.dane.dto.modulo1.IngresosNoOperacionalesDTO;
import co.org.dane.dto.modulo1.NovedadEncuestaDTO;
import co.org.dane.dto.modulo1.OperacionDTO;
import co.org.dane.dto.modulo1.VariableEmpresaDTO;
import co.org.dane.fachada.modulo1.CapitalSocialFachada;
import co.org.dane.fachada.modulo1.CaratulaUnicaFachada;
import co.org.dane.fachada.modulo1.DireccionFachada;
import co.org.dane.fachada.modulo1.EstadoEncuestaFachada;
import co.org.dane.fachada.modulo1.EstadoModulosFachada;
import co.org.dane.fachada.modulo1.InformacionFuncionamientoFachada;
import co.org.dane.fachada.modulo1.IngresosNoOperacionalesFachada;
import co.org.dane.fachada.modulo1.NovedadEncuestaFachada;
import co.org.dane.fachada.modulo1.OperacionFachada;
import co.org.dane.fachada.modulo1.VariableEmpresaFachada;
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
import co.org.dane.servicios.modulo1.IServiciosCaratulaUnica;

/**
 * @author ALFONSO
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/modulo1")
public class CaratulaUnicaController {

	@Autowired
	private IServiciosCaratulaUnica serviciosCaratulaUnica;
	
	@PostMapping(path = "/caratulaUnica", consumes =  MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CaratulaUnicaDTO> save(@RequestBody CaratulaUnicaDTO caratulaUnicaDTO ) {
		try {
			System.out.println("CaratulaUnicaController.save: " + caratulaUnicaDTO.toString());			
			CaratulaUnica caratula = this.serviciosCaratulaUnica.guardarCaratulaUnica(CaratulaUnicaFachada.getInstance().convertirEntity(caratulaUnicaDTO));
			System.out.println(caratula);
			
			return ResponseEntity.created(new URI("/" + caratula.getId())).body(CaratulaUnicaFachada.getInstance().convertirDTO(caratula));
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping(path = "/cargarCaratulaUnica/", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CaratulaUnicaDTO> cargarCaratulaUnica(@RequestParam("usuario") String usuario) {
		try {
			System.out.println("usuario: " + usuario);
			CaratulaUnica caratula = this.serviciosCaratulaUnica.cargarCaratulaUnica(usuario);
			System.out.println("caratula: " + caratula);
			return ResponseEntity.status(HttpStatus.OK).body(CaratulaUnicaFachada.getInstance().convertirDTO(caratula));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping(path = "/getCaratulaUnicaDirecciones/", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<DireccionDTO>> getCaratulaUnicaDirecciones(@RequestParam("idCaratulaUnica") long idCaratulaUnica) {

		try {
			List<Direccion> direcciones = this.serviciosCaratulaUnica.getCaratulaUnicaDirecciones(idCaratulaUnica);
			return ResponseEntity.status(HttpStatus.OK).body(DireccionFachada.getInstance().obtenerListaDTO(direcciones));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping(path = "/getCaratulaUnicaCapitalSocial/", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CapitalSocialDTO>> getCaratulaUnicaCapitalSocial(@RequestParam("idCaratulaUnica") long idCaratulaUnica) {
		try {
			List<CapitalSocial> cps = this.serviciosCaratulaUnica.getCaratulaUnicaCapitalSocial(idCaratulaUnica);
			return ResponseEntity.status(HttpStatus.OK).body(CapitalSocialFachada.getInstance().obtenerListaDTO(cps));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping(path = "/getCaratulaUnicaOperacion/", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<OperacionDTO>> getCaratulaUnicaOperacion(@RequestParam("idCaratulaUnica") long idCaratulaUnica) {
		try {
			List<Operacion> ops = this.serviciosCaratulaUnica.getCaratulaUnicaOperacion(idCaratulaUnica);
			return ResponseEntity.status(HttpStatus.OK).body(OperacionFachada.getInstance().obtenerListaDTO(ops));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping(path = "/getCaratulaUnicaVariableEmpresa/", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<VariableEmpresaDTO>> getCaratulaUnicaVariableEmpresa(@RequestParam("idCaratulaUnica") long idCaratulaUnica) {
		try {
			List<VariableEmpresa> ves = this.serviciosCaratulaUnica.getCaratulaUnicaVariableEmpresa(idCaratulaUnica);
			return ResponseEntity.status(HttpStatus.OK).body(VariableEmpresaFachada.getInstance().obtenerListaDTO(ves));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping(path = "/getCaratulaUnicaIngresosNoOperacionales/", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<IngresosNoOperacionalesDTO>> getCaratulaUnicaIngresosNoOperacionales(@RequestParam("idCaratulaUnica") long idCaratulaUnica) {
		try {
			List<IngresosNoOperacionales> inf = this.serviciosCaratulaUnica.getCaratulaUnicaIngresosNoOperacionales(idCaratulaUnica);
			return ResponseEntity.status(HttpStatus.OK).body(IngresosNoOperacionalesFachada.getInstance().obtenerListaDTO(inf));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping(path = "/getCaratulaUnicaInformacionFuncionamiento/", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<InformacionFuncionamientoDTO> getCaratulaUnicaInformacionFuncionamiento(@RequestParam("idCaratulaUnica") long idCaratulaUnica) {
		try {
			InformacionFuncionamiento inf = this.serviciosCaratulaUnica.getCaratulaUnicaInformacionFuncionamiento(idCaratulaUnica);
			return ResponseEntity.status(HttpStatus.OK).body(InformacionFuncionamientoFachada.getInstance().convertirDTO(inf));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping(path = "/getCaratulaUnicaNovedadEncuesta/", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<NovedadEncuestaDTO>> getCaratulaUnicaNovedadEncuesta(@RequestParam("idCaratulaUnica") long idCaratulaUnica) {
		try {
			List<NovedadEncuesta> nvs = this.serviciosCaratulaUnica.getCaratulaUnicaNovedadEncuesta(idCaratulaUnica);
			return ResponseEntity.status(HttpStatus.OK).body(NovedadEncuestaFachada.getInstance().obtenerListaDTO(nvs));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping(path = "/getCaratulaUnicaEstadoEncuesta/", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<EstadoEncuestaDTO>> getCaratulaUnicaEstadoEncuesta(@RequestParam("idCaratulaUnica") long idCaratulaUnica) {
		try {
			List<EstadoEncuesta> est = this.serviciosCaratulaUnica.getCaratulaUnicaEstadoEncuesta(idCaratulaUnica);
			return ResponseEntity.status(HttpStatus.OK).body(EstadoEncuestaFachada.getInstance().obtenerListaDTO(est));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping(path = "/getCaratulaUnicaEstadoModulos/", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<EstadoModulosDTO>> getCaratulaUnicaEstadoModulos(@RequestParam("idCaratulaUnica") long idCaratulaUnica) {
		try {
			List<EstadoModulos> est = this.serviciosCaratulaUnica.getCaratulaUnicaEstadoModulos(idCaratulaUnica);
			return ResponseEntity.status(HttpStatus.OK).body(EstadoModulosFachada.getInstance().obtenerListaDTO(est));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	//-----------------------------------------------------
	
	@PostMapping(path = "/guardarDireccion/", consumes =  MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DireccionDTO> guardarDireccion(@RequestBody DireccionDTO direccionDTO){
		try {
			Direccion dir = this.serviciosCaratulaUnica.guardarDireccion(DireccionFachada.getInstance().convertirEntity(direccionDTO));
			return ResponseEntity.status(HttpStatus.OK).body(DireccionFachada.getInstance().convertirDTO(dir));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PostMapping(path = "/guardarCapitalSocial/", consumes =  MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CapitalSocialDTO> guardarCapitalSocial(@RequestBody CapitalSocialDTO capitalSocialDTO){
		try {
			CapitalSocial cap = this.serviciosCaratulaUnica.guardarCapitalSocial(CapitalSocialFachada.getInstance().convertirEntity(capitalSocialDTO));
			return ResponseEntity.status(HttpStatus.OK).body(CapitalSocialFachada.getInstance().convertirDTO(cap));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PostMapping(path = "/guardarOperacion/", consumes =  MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<OperacionDTO> guardarOperacion(@RequestBody OperacionDTO operacionDTO){
		try {
			Operacion ope = this.serviciosCaratulaUnica.guardarOperacion(OperacionFachada.getInstance().convertirEntity(operacionDTO));
			return ResponseEntity.status(HttpStatus.OK).body(OperacionFachada.getInstance().convertirDTO(ope));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PostMapping(path = "/guardarVariableEmpresa/", consumes =  MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<VariableEmpresaDTO> guardarVariableEmpresa(@RequestBody VariableEmpresaDTO variableEmpresaDTO){
		try {
			VariableEmpresa vem = this.serviciosCaratulaUnica.guardarVariableEmpresa(VariableEmpresaFachada.getInstance().convertirEntity(variableEmpresaDTO));
			return ResponseEntity.status(HttpStatus.OK).body(VariableEmpresaFachada.getInstance().convertirDTO(vem));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PostMapping(path = "/guardarIngresosNoOperacionales/", consumes =  MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<IngresosNoOperacionalesDTO> guardarIngresosNoOperacionales(@RequestBody IngresosNoOperacionalesDTO ingresosNoOperacionalesDTO){
		try {
			IngresosNoOperacionales ino = this.serviciosCaratulaUnica.guardarIngresosNoOperacionales(IngresosNoOperacionalesFachada.getInstance().convertirEntity(ingresosNoOperacionalesDTO));
			return ResponseEntity.status(HttpStatus.OK).body(IngresosNoOperacionalesFachada.getInstance().convertirDTO(ino));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PostMapping(path = "/guardarInformacionFuncionamiento/", consumes =  MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<InformacionFuncionamientoDTO> guardarInformacionFuncionamiento(@RequestBody InformacionFuncionamientoDTO informacionFuncionamientoDTO){
		try {
			InformacionFuncionamiento inf = this.serviciosCaratulaUnica.guardarInformacionFuncionamiento(InformacionFuncionamientoFachada.getInstance().convertirEntity(informacionFuncionamientoDTO));
			return ResponseEntity.status(HttpStatus.OK).body(InformacionFuncionamientoFachada.getInstance().convertirDTO(inf));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PostMapping(path = "/guardarNovedadEncuesta/", consumes =  MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<NovedadEncuestaDTO> guardarNovedadEncuesta(@RequestBody NovedadEncuestaDTO novedadEncuestaDTO){
		try {
			NovedadEncuesta nve = this.serviciosCaratulaUnica.guardarNovedadEncuesta(NovedadEncuestaFachada.getInstance().convertirEntity(novedadEncuestaDTO));
			return ResponseEntity.status(HttpStatus.OK).body(NovedadEncuestaFachada.getInstance().convertirDTO(nve));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PostMapping(path = "/guardarEstadoEncuesta/", consumes =  MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EstadoEncuestaDTO> guardarEstadoEncuesta(@RequestBody EstadoEncuestaDTO estadoEncuestaDTO){
		try {
			EstadoEncuesta ese = this.serviciosCaratulaUnica.guardarEstadoEncuesta(EstadoEncuestaFachada.getInstance().convertirEntity(estadoEncuestaDTO));
			return ResponseEntity.status(HttpStatus.OK).body(EstadoEncuestaFachada.getInstance().convertirDTO(ese));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PostMapping(path = "/guardarEstadoModulos/", consumes =  MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EstadoModulosDTO> guardarEstadoModulos(@RequestBody EstadoModulosDTO estadoModulosDTO){
		try {
			EstadoModulos esm = this.serviciosCaratulaUnica.guardarEstadoModulos(EstadoModulosFachada.getInstance().convertirEntity(estadoModulosDTO));
			return ResponseEntity.status(HttpStatus.OK).body(EstadoModulosFachada.getInstance().convertirDTO(esm));
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	/**
	 * @return the serviciosCaratulaUnica
	 */
	public IServiciosCaratulaUnica getServiciosCaratulaUnica() {
		return serviciosCaratulaUnica;
	}

	/**
	 * @param serviciosCaratulaUnica the serviciosCaratulaUnica to set
	 */
	public void setServiciosCaratulaUnica(IServiciosCaratulaUnica serviciosCaratulaUnica) {
		this.serviciosCaratulaUnica = serviciosCaratulaUnica;
	}
	
}
