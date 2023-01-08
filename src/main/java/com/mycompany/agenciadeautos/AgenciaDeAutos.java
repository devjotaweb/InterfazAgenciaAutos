
package com.mycompany.agenciadeautos;

/**
 *
 * @author Jesus Paracare
 */
public class AgenciaDeAutos {
        
    /**
     *Constructor
     */
    public String nombreEmpresa;
    public int telefono;
    public int cuentaBancaria;
    public int alquilerAutos;

    public AgenciaDeAutos(String nombreEmpresa, int telefono, int cuentaBancaria, int alquilerAutos) {
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;
        this.cuentaBancaria = cuentaBancaria;
        this.alquilerAutos = alquilerAutos;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public int getAlquilerAutos() {
        return alquilerAutos;
    }

    public void setAlquilerAutos(int alquilerAutos) {
        this.alquilerAutos = alquilerAutos;
    }

    @Override
    public String toString() {
        return "AgenciaAutos{" + "nombreEmpresa=" + nombreEmpresa + ", telefono=" + telefono + ", cuentaBancaria=" + cuentaBancaria + ", alquilerAutos=" + alquilerAutos + '}';
    }
    
    public void alquilerAutos(float billete){}
    
}




