
package com.mycompany.agenciadeautos;

/**
 *
 * @author Jesus Paracare
 */
public class Cliente {
    
    private int idUsuario;
    private int datosBancarios;
    private int direccion;
    private int telefono;

    public Cliente(int idUsuario, int datosBancarios, int direccion, int telefono) {
        this.idUsuario = idUsuario;
        this.datosBancarios = datosBancarios;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getDatosBancarios() {
        return datosBancarios;
    }

    public void setDatosBancarios(int datosBancarios) {
        this.datosBancarios = datosBancarios;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idUsuario=" + idUsuario + ", datosBancarios=" + datosBancarios + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    public void reservacionAutos(String telefonica, String online, String presencial){}
    
}
