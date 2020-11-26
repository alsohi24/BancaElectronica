package com.sw.banca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sw.banca.model.TbUsuario;

public interface IUsuarioRepo extends JpaRepository<TbUsuario, Integer> {
				
	TbUsuario findOneByUsuNombre(String usuNombre);
		
	@Modifying
	@Query(value = "INSERT INTO tb_rol_usuario (usu_id, rol_id) VALUES (:idUsuario, :idRol)", nativeQuery = true)
	void registrarRolPorDefecto(@Param("idUsuario") Integer idUsuario, @Param("idRol") Integer idRol);
}