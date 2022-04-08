/**
 * 
 */
package co.org.dane.fachada.modulo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.CollectionUtils;

import co.org.dane.dto.modulo1.NovedadEncuestaDTO;
import co.org.dane.persistencia.entidades.modulo1.CaratulaUnica;
import co.org.dane.persistencia.entidades.modulo1.NovedadEncuesta;

/**
 * @author ALFONSO
 *
 */
public class NovedadEncuestaFachada {
	
private static NovedadEncuestaFachada novedadEncuestaFachada;
	
	public static NovedadEncuestaFachada getInstance() {
		if(novedadEncuestaFachada == null)
			return new NovedadEncuestaFachada();
		else
			return novedadEncuestaFachada;
	}
	
	
	public List<NovedadEncuestaDTO> obtenerListaDTO(List<NovedadEncuesta> entities){
		 return CollectionUtils.isEmpty(entities) ? new ArrayList<>()
	                : entities.stream().map(entidad -> convertirDTO(entidad)).collect(Collectors.toList());
	}
	
	
	public List<NovedadEncuesta> obtenerListaEntity(List<NovedadEncuestaDTO> dtos){
		 return CollectionUtils.isEmpty(dtos) ? new ArrayList<>()
	                : dtos.stream().map(dto -> convertirEntity(dto)).collect(Collectors.toList());
	}
	
	
	public NovedadEncuestaDTO convertirDTO(NovedadEncuesta entity){
		
		NovedadEncuestaDTO dto = new NovedadEncuestaDTO();
		dto.setId(entity.getId());
		dto.setCodigo(entity.getCodigo());
		dto.setNombre(entity.getNombre());
		dto.setFechaInicio(entity.getFechaInicio());
		dto.setFechaFin(entity.getFechaFin());
		dto.setActivo(entity.getActivo());
		dto.setIdCaratulaUnica(entity.getCaratulaUnica() != null ? entity.getCaratulaUnica().getId() : 0);
		
		return dto;
	}
	
	public NovedadEncuesta convertirEntity(NovedadEncuestaDTO dto){
		
		NovedadEncuesta entity = new NovedadEncuesta();
		entity.setId(dto.getId());
		entity.setCodigo(dto.getCodigo());
		entity.setNombre(dto.getNombre());
		entity.setFechaInicio(dto.getFechaInicio());
		entity.setFechaFin(dto.getFechaFin());
		entity.setActivo(dto.getActivo());
		
		if(dto.getIdCaratulaUnica() != 0) {
			CaratulaUnica cu = new CaratulaUnica();
			cu.setId(dto.getIdCaratulaUnica());
			entity.setCaratulaUnica(cu);
		}
		
		return entity;
	}


	/**
	 * @return the novedadEncuestaFachada
	 */
	public static NovedadEncuestaFachada getNovedadEncuestaFachada() {
		return novedadEncuestaFachada;
	}


	/**
	 * @param novedadEncuestaFachada the novedadEncuestaFachada to set
	 */
	public static void setNovedadEncuestaFachada(NovedadEncuestaFachada novedadEncuestaFachada) {
		NovedadEncuestaFachada.novedadEncuestaFachada = novedadEncuestaFachada;
	}

}

/*
 	private long id;
	private int codigo;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private String activo;
	private long idCaratulaUnica;
*/