package us.inturik.bikeuppstore.adaptador;

import us.inturik.bikeuppstore.DTO.MantenimientoDTO;
import us.inturik.bikeuppstore.EB.Mantenimiento;
import us.inturik.bikeuppstore.adaptador.util.Adaptador;

public class MantenimientoAdaptador extends
		Adaptador<MantenimientoDTO, Mantenimiento> {

	@Override
	public MantenimientoDTO transformDTO(Mantenimiento model) {
		MantenimientoDTO objDOT = new MantenimientoDTO();
		if (model != null) {
			objDOT.setId(model.ID.get());
			objDOT.setEstado(model.ESTADO.get());
			objDOT.setFecha_ingreso(model.FECHA_INGRESO.get());
			objDOT.setFecha_salida(model.FECHA_SALIDA.get());
			objDOT.setIdarticulo(model.IDARTICULO.get());
			objDOT.setIdcliente(model.IDCLIENTE.get());
			objDOT.setIdtienda(model.IDTIENDA.get());
			objDOT.setRecibido(model.RECIBIDO.get());
			objDOT.setTotal(model.TOTAL.get());
			objDOT.setTotal_mantenimiento(model.TOTAL_MANTENIMIENTO.get());
			objDOT.setTotal_partes(model.TOTAL_PARTES.get());
			objDOT.setValor_man_bujes(model.VALOR_MAN_BUJES.get());
			objDOT.setValor_man_susdel_correctivo(model.VALOR_MAN_SUSDEL_CORRECTIVO
					.get());
			objDOT.setValor_man_susdel_general(model.VALOR_MAN_SUSDEL_GENERAL
					.get());
			objDOT.setValor_man_susdel_pp(model.VALOR_MAN_SUSDEL_PP.get());
			objDOT.setValor_man_sustra_correctivo(model.VALOR_MAN_SUSTRA_CORRECTIVO
					.get());
			objDOT.setValor_man_sustra_general(model.VALOR_MAN_SUSTRA_GENERAL
					.get());
			objDOT.setValor_man_sustra_pp(model.VALOR_MAN_SUSTRA_PP.get());
			objDOT.setValor_man_general(model.VALOR_MAN_GENERAL.get());
			objDOT.setValor_man_preventivo(model.VALOR_MAN_PREVENTIVO.get());
			objDOT.setValor_mo(model.VALOR_MO.get());
		}
		return objDOT;
	}

	@Override
	public Mantenimiento transformModel(MantenimientoDTO dto) {
		Mantenimiento objDTO = new Mantenimiento();
		if (dto != null) {
			objDTO.ID.set(dto.getId());
			objDTO.ESTADO.set(dto.getEstado());
			objDTO.FECHA_INGRESO.set(dto.getFecha_ingreso());
			objDTO.FECHA_SALIDA.set(dto.getFecha_salida());
			objDTO.IDARTICULO.set(dto.getIdarticulo());
			objDTO.IDCLIENTE.set(dto.getIdcliente());
			objDTO.IDTIENDA.set(dto.getIdtienda());
			objDTO.RECIBIDO.set(dto.getRecibido());
			objDTO.TOTAL.set(dto.getTotal());
			objDTO.TOTAL_MANTENIMIENTO.set(dto.getTotal_mantenimiento());
			objDTO.TOTAL_PARTES.set(dto.getTotal_partes());
			objDTO.VALOR_MAN_BUJES.set(dto.getValor_man_bujes());
			objDTO.VALOR_MAN_SUSDEL_CORRECTIVO.set(dto
					.getValor_man_susdel_correctivo());
			objDTO.VALOR_MAN_SUSDEL_GENERAL.set(dto
					.getValor_man_susdel_general());
			objDTO.VALOR_MAN_SUSDEL_PP.set(dto.getValor_man_susdel_pp());
			objDTO.VALOR_MAN_SUSTRA_CORRECTIVO.set(dto
					.getValor_man_sustra_correctivo());
			objDTO.VALOR_MAN_SUSTRA_GENERAL.set(dto
					.getValor_man_sustra_general());
			objDTO.VALOR_MAN_SUSDEL_PP.set(dto.getValor_man_susdel_pp());
			objDTO.VALOR_MAN_GENERAL.set(dto.getValor_man_general());
			objDTO.VALOR_MAN_PREVENTIVO.set(dto.getValor_man_preventivo());
			objDTO.VALOR_MO.set(dto.getValor_mo());
		}
		return objDTO;
	}

}
