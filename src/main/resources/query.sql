delete from tb_rol;
INSERT INTO TB_ROL(ROL_ID,ROL_TITULO,ROL_DESCRIPCION) VALUES(1,'ADMINISTRADOR','ROL ADMINISTRADOR');
INSERT INTO TB_ROL(ROL_ID,ROL_TITULO,ROL_DESCRIPCION) VALUES(2,'CLIENTE','ROL CLIENTE');

delete from TB_AGENCIA;
INSERT INTO TB_AGENCIA(AGEN_ID,AGEN_DESCRIPCION,AGEN_DIRECCION,AGEN_ESTADO) VALUES(1,'AGENCIA','AV AGENCIA',1);

delete from tb_estados;
INSERT INTO tb_estados(EST_ID,EST_DESCRIPCION) VALUES(1,'ACTIVO');
INSERT INTO tb_estados(EST_ID,EST_DESCRIPCION) VALUES(2,'INACTIVO');

delete from TB_TIPO_SOLICITUD;
INSERT INTO TB_TIPO_SOLICITUD(tsol_id,tsol_descripcion,tsol_est_id) VALUES(1,'SOLICITUD',1);

delete from TB_TIPO_PRODUCTO;
INSERT INTO TB_TIPO_PRODUCTO(TPROD_ID,TPROD_DESCRIPCION,TPROD_EST_ID) VALUES(1,'TIPO PRODUCTO',1);

delete from TB_TIPO_PAGOS;
INSERT INTO TB_TIPO_PAGOS(TPAGO_ID,TPAGO_DESCRIPCION,TPAGO_EST_ID) VALUES(1,'TIPO PAGO',1);

delete from TB_TIPO_MOVIMIENTOS;
INSERT INTO TB_TIPO_MOVIMIENTOS(TMVM_ID,TMVM_DESCRIPCION,tmvm_est_id) VALUES(1,'TIPO MOVIMIENTO',1);

delete from TB_TIPO_NOTIFICACION;
INSERT INTO TB_TIPO_NOTIFICACION(tntf_id,tntf_descripcion,tntf_est_id) VALUES(1,'TIPO NOTIFICACION',1);

delete from tb_tipo_monedas;
INSERT INTO tb_tipo_monedas(tmon_id,tmon_descripcion) VALUES(1,'SOL');

delete from tb_tipo_documento;
INSERT INTO tb_tipo_documento(tdoc_id,tdoc_descripcion) VALUES(1,'DNI');

delete from tb_tipo_cuentas;
INSERT INTO tb_tipo_cuentas(tcta_id,tcta_descripcion,tcta_est_id) VALUES(1,'CTA. AHORROS SOLES',1);


delete from rol_usuario;
delete from tb_usuario;
delete from tb_cliente;
insert into tb_usuario

select *from tb_rol_usuario;