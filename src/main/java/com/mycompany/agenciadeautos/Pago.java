
package com.mycompany.agenciadeautos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Paracare
 */
public class Pago {
    
    public float prepago;

    public Pago(float prepago) {
        this.prepago = prepago;
    }

    public float getPrepago() {
        return prepago;
    }

    public void setPrepago(float prepago) {
        this.prepago = prepago;
    }

    @Override
    public String toString() {
        return "Pago{" + "prepago=" + prepago + '}';
    }

    public void puntoVenta(float puntoventa){
        
        JOptionPane.showMessageDialog(null, "Prepare su tarjeta, recuerde tener a la mano su DNI");
    
    }
    
    public void transferenciaBancaria(float banco){}
    
    public void efectivo(float cash, float monto, float pago){}
    
}
