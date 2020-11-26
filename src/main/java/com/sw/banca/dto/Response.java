package com.sw.banca.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sw.banca.utils.ErroresEnum;

/**
 * Descripción
 * @param <D>
 * @since 1.0
 */
public class Response<D> {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
    private ErroresEnum error;
    private int codigo;
    private String mensaje;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private D data;
    public Response() {
    }
    
    public Response(ErroresEnum error) {
        this.error = error;
    }

    public Response(int codigo, String mensaje) {
        this.codigo = codigo;
        this.mensaje = mensaje;
    }



    public Response(ErroresEnum error, D data) {
        this.error = error;
        this.data = data;
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public int getCodigo() {
        if (error != null) {
            codigo = error.codigo();
        }
        return codigo;
    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;
    }

    public String getMensaje() {
        if (error != null) {
            mensaje = error.mensaje();
        }
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ErroresEnum getError() {
        return error;
    }

    public void setError(ErroresEnum error) {
        this.error = error;
    }
}
