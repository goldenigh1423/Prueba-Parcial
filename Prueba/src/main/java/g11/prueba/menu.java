/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g11.prueba;

import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class menu {
    private String nombre;
    private String id;
    private String descripcion;
    private int precio;

    public menu(String nombre, String descripcion,String id, int precio) {
        this.id=id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final menu other = (menu) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
    
}
