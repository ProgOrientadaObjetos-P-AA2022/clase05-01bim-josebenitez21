    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

public class UnidadDVD {

    private String marca;
    private double costo;

    public UnidadDVD(String a) {
        marca = a;
       
    }
    public UnidadDVD(String a, double c) {
        marca = a;
        costo = c;
    }
    

    UnidadDVD() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void establecerMarca(String n) {
        marca = n;
    }
    public void establecerCosto(double c) {
        costo = c;
    }

    public String obtenerMarca() {
        return marca;
    }
    public double obtenerCosto() {
        return costo;
    }
}
