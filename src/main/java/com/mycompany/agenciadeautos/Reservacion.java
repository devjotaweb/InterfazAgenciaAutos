
package com.mycompany.agenciadeautos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Paracare
 */
public class Reservacion {
    
    //recuerda que debes agregar los montos a pagar que se relacionan con la clase PAGO
    public String modeloAuto;
    public String marca;
    public String color;
    private int matricula;
    public String disponibilidad;

    public Reservacion(String modeloAuto, String marca, String color, int matricula, String disponibilidad) {
        this.modeloAuto = modeloAuto;
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.disponibilidad = disponibilidad;
    }

    public String getModeloAuto() {
        return modeloAuto;
    }

    public void setModeloAuto(String modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "modeloAuto=" + modeloAuto + ", marca=" + marca + ", color=" + color + ", matricula=" + matricula + ", disponibilidad=" + disponibilidad + '}';
    }
    
    public int alquilerHoras(int n, int m, int totalH){  
        JOptionPane.showMessageDialog(null, "Indique cuantas desea alquilar el auto, gracias");
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "numero de horas"));
        m = 1000;
        totalH = n*m;
        
        return totalH;
    }
    
    public String alquilerDias(String dias){
        
        dias = JOptionPane.showInputDialog(null, "Indique la fecha de retirada del auto");
        return dias;
    }
    
    public void entregaAuto(String entrega){
    
        entrega = JOptionPane.showInputDialog(null, "Indique la fecha de entrega");
    
    }
    
}
