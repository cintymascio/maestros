package Maestros;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC9
 */
public class Envase {
    
    private Integer codigo;
    private String nombre;
    private String unidad_med;
    private String cantidad;

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUnidad_med() {
        return unidad_med;
    }

    public String getCantidad() {
        return cantidad;
    }

    public Envase(Integer codigo, String nombre, String unidad_med, String cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidad_med = unidad_med;
        this.cantidad = cantidad;
    }

  
    
}
