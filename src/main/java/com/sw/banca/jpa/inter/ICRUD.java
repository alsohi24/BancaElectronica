package com.sw.banca.jpa.inter;

import java.util.List;

public interface ICRUD<T, V> {

	T registrar(T obj);
	T modificar(T obj);
	List<T> listar();
	T listarPorId(V v);
	void eliminar(V v);
	void eliminar(Integer v);
}
