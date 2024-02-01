/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.uttt.sintaxisjava;

/**
 *
 * @author jlgallardoadmon
 */
public class Auto {

    //Variables de instancia,atributos, campos, caracteristicas
    private String model;
    private int milesDriven;
    private double gallonsOfGas;

    public String getModel() {
        return model;
    }

    public void setModel(String modelo) {
        model = modelo;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    public void setGallonsOfGas(double gallonsOfGas) {
        this.gallonsOfGas = gallonsOfGas;
    }

    public boolean validarModelo(String modelo) {
//        boolean resp;
//        if(model.equalsIgnoreCase(modelo)){
//            resp = true;
//        }else {
//            resp = true;
//        }
//        
//        return resp;

//       if(model.equalsIgnoreCase(modelo))
//           return true;
//       else
//           return false;
        //return (model.equalsIgnoreCase(modelo))?true:false;
        boolean resp = false;
        if (model.equalsIgnoreCase(modelo)) {
            resp = true;
        }
        return resp;

    }
}
