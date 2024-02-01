/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.uttt.sintaxisjava;

import javax.swing.JOptionPane;



/**
 *
 * @author jlgallardoadmon
 */
public class TestAuto {
    public static void main(String[] args) {
        String cadena = "";
        String modelo;
        double litrosGas;
        int km;
        boolean sentinel = true;
       
        
        cadena = "Menu de opciones\n1)Asignar valor al Modelo\n2)Asignar Valor al Kilometraje" +
                 "\n3)Asignar Valor a los litros de Gasolina\n4)Imprimir el valor de modelo" +
                 "\n5)imprimir valor de kilometraje\n6)Imprimir valor de los litros de gasolina" + 
                 "\n7)Comparar nombre de modelo\n8)Salir\nElegir opción:";
        
        

        Auto a1 = new Auto();
        
        do{
            
        
        String opcion = JOptionPane.showInputDialog(cadena);
        
        
        switch(opcion){
            case "1":
                modelo = JOptionPane.showInputDialog("Introduce el modelo del Auto");
                a1.setModel(modelo);
            break;    
            case "2": 
                km = Integer.parseInt
                (JOptionPane.showInputDialog("Introduce el kilometraje del auto"));
                a1.setMilesDriven(km);
            break;
            
            case "3":
            litrosGas = Double.parseDouble
                (JOptionPane.showInputDialog("Introduce los litros de gasolina del auto"));
                a1.setGallonsOfGas(litrosGas);
            break;
            
            case "4":
                JOptionPane.showMessageDialog(null, "El Modelo es: " + a1.getModel());
                break;
            case "5":
                JOptionPane.showMessageDialog(null, "El kilometraje es: " + a1.getMilesDriven());
                break;
            case "6":
                JOptionPane.showMessageDialog(null, "Los litros de gasolina: " + a1.getGallonsOfGas());
                break;
            case "7":
                String model = JOptionPane.showInputDialog("Introduce el modelo a comparar");
                if(a1.validarModelo(model))
                    JOptionPane.showMessageDialog(null,"El modelo " + a1.getModel() 
                            + " y el modelo a comparar " + model + " son iguales");
                else
                    JOptionPane.showMessageDialog(null,"El modelo " + a1.getModel() 
                            + " y el modelo a comparar " + model + " no son iguales");
            break;
            
            case "8":
                String resp = JOptionPane.showInputDialog("Estas seguro de salir si/no?");
                
                if(resp.equalsIgnoreCase("si")){
                    JOptionPane.showMessageDialog(null, "See you next time");
                    sentinel = false;
                }
                    
        }
        
        }while(sentinel);
    }
}
