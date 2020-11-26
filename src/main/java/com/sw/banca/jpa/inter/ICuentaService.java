package com.sw.banca.jpa.inter;

import java.util.List;

import com.sw.banca.model.TbCuenta;

public interface ICuentaService  extends ICRUD<TbCuenta, Integer> {

	public List<TbCuenta> listarPorUsuarioId(Integer usuId);
}
