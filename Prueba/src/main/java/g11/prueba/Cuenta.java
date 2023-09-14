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
public class Cuenta {
    private String propietario;
    private String id;
    private int dinero;

    public Cuenta(String propietario, String id, int dinero) {
        this.propietario = propietario;
        this.id = id;
        this.dinero = dinero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
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
        final Cuenta other = (Cuenta) obj;
        return Objects.equals(this.id, other.id);
    }

    public String getPropietario() {
        return propietario;
    }

    public String getId() {
        return id;
    }

    public int getDinero() {
        return dinero;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
}
