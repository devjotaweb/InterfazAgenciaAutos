
package com.mycompany.agenciadeautos;

/**
 *
 * @author Jesus Paracare
 */
public class AtencionCliente {
    
     public int idEmpresa;

    public AtencionCliente(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public String toString() {
        return "AtencionCliente{" + "idEmpresa=" + idEmpresa + '}';
    }
    
    public void atencion(){}
    
}
