/**
 * @(#)Constante.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.sw.banca.utils;


public final class Constante {

	public static final String OK = "Todas las operaciones se ejecutaron correctamente";
	public static final String DATOS_REQUERIDOS_INCOMPLETOS = "Datos requeridos incompletos";
	public static final String NO_DATA = "No se encontraron registros";
	public static final String FALLO_REGISTRO = "Registro Fallo, Intentelo nuevamente";
	public static final String FALLO_LECTURA_OCR = "Fallo lectura de documento, Intentelo nuevamente";
	public static final String EMAIL_NO_SEND = "No fue posible enviar el correo";
	public static final String SMS_NO_SEND = "No fue posible enviar el sms";
    

    private Constante() {
        throw new AssertionError();
    }
}
