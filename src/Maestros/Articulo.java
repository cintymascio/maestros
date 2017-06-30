package Maestros;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 

/**
 *
 * @author PC9
 */
public class Articulo {
    
    private Integer codigo;
    private String nombre;
    private String descripcion;
    private Subrubro subrubro;
    private Rubro rubro;
    private Receta receta;
    private Insumo insumo;

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Subrubro getSubrubro() {
        return subrubro;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public Receta getReceta() {
        return receta;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public Articulo(Integer codigo, String nombre, String descripcion, Subrubro subrubro, Rubro rubro, Receta receta, Insumo insumo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.subrubro = subrubro;
        this.rubro = rubro;
        this.receta = receta;
        this.insumo = insumo;
    }

  
    
    
}
