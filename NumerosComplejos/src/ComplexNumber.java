
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2124203
 */
public class ComplexNumber {
    double real;
    double imaginario;
    
    
    public ComplexNumber(double real1, double imaginario1){
        real = real1;
        imaginario = imaginario1;
    }
    
    public double GetReal(){
        return real;
    }
    
    public double Getimaginario(){
        return imaginario;
    }
    
    public float Modulus(){
        double a = Math.pow(real, 2);
        double b = Math.pow(imaginario, 2);
        double suma = a+b;
        float respuesta = (float) Math.sqrt(suma);
        return respuesta;        
    }
    
//    public fase(){
//        
//    }
    
    public ComplexNumber Conjugado(){
        double imaginarioN = imaginario * (-1);
        ComplexNumber NumeroCNuevo = new ComplexNumber(real, imaginarioN);
        return NumeroCNuevo;
    }
    
}
