package edu.eci;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2124203
 */
public class mathComplex {
    
    
    
    public static ComplexNumber SumaComplejos(ComplexNumber tupla1,ComplexNumber tupla2){
        ComplexNumber numeroCNuevo;
        double valorReal1 = tupla1.GetReal();
        double valorReal2 = tupla2.GetReal();
        double realNuevo = valorReal1+valorReal2;
        realNuevo = Math.round(realNuevo * 100) / 100d;
        double valorImaginario1 = tupla1.Getimaginario();
        double valorImaginario2 = tupla2.Getimaginario();     
        double imaginarioNuevo = valorImaginario1+valorImaginario2;
        imaginarioNuevo = Math.round(imaginarioNuevo * 100) / 100d;
        numeroCNuevo = new ComplexNumber(realNuevo, imaginarioNuevo);
        //System.out.println("El resultado de la suma es: " + realNuevo + "+(" + imaginarioNuevo + ")i");
        return numeroCNuevo;
    }
    
    
    public static ComplexNumber ProductoComplejos (ComplexNumber tupla1,ComplexNumber tupla2){
        ComplexNumber numeroCNuevo;
        double valorReal1 = tupla1.GetReal();
        double valorReal2 = tupla2.GetReal();
        double valorImaginario1 = tupla1.Getimaginario();
        double valorImaginario2 = tupla2.Getimaginario(); 
        double parteReal = (valorReal1*valorReal2)+(valorImaginario1*valorImaginario2*-1);
        double parteImaginaria = (valorImaginario1*valorReal2)+(valorReal1*valorImaginario2);
        numeroCNuevo = new ComplexNumber(parteReal, parteImaginaria);
        //System.out.println("El resultado del producto es: " + parteReal + "+(" + parteImaginaria + ")i");
        return numeroCNuevo;
    }
    
    
    public static ComplexNumber RestaComplejos(ComplexNumber tupla1,ComplexNumber tupla2){
        ComplexNumber numeroCNuevo;
        double valorReal1 = tupla1.GetReal();
        double valorReal2 = tupla2.GetReal();
        double realNuevo = valorReal1-valorReal2;
        realNuevo = Math.round(realNuevo * 100) / 100d;
        double valorImaginario1 = tupla1.Getimaginario();
        double valorImaginario2 = tupla2.Getimaginario();     
        double imaginarioNuevo = valorImaginario1-valorImaginario2;
        imaginarioNuevo = Math.round(imaginarioNuevo * 100) / 100d;
        numeroCNuevo = new ComplexNumber(realNuevo, imaginarioNuevo);
        return numeroCNuevo;
    }
    
    public static ComplexNumber DivisionCompleja(ComplexNumber tupla1,ComplexNumber tupla2){
        ComplexNumber numeroCNuevo;
        double valorReal1 = tupla1.GetReal();
        double valorReal2 = tupla2.GetReal();
        double valorImaginario1 = tupla1.Getimaginario();
        double valorImaginario2 = tupla2.Getimaginario(); 
        double xNumerador = (valorReal1*valorReal2)+(valorImaginario1*valorImaginario2);
        double yNumerador = (valorReal2*valorImaginario1) - (valorReal1*valorImaginario2);
        double Denominador = Math.pow(valorReal2, 2) + Math.pow(valorImaginario2, 2);
        double valorReal = xNumerador/Denominador;
        valorReal = Math.round(valorReal * 100) / 100d;
        double valorImaginario = yNumerador/Denominador;
        valorImaginario = Math.round(valorImaginario * 100) / 100d;
        numeroCNuevo = new ComplexNumber(valorReal, valorImaginario);
        System.out.println("El resultado de la division es: " + valorReal + "+(" + valorImaginario + ")i");
        return numeroCNuevo;
    }
    
    
    public static ComplexNumber CartesianoAPolar(ComplexNumber tupla){
        ComplexNumber numeroCNuevo;
        double valorA = tupla.GetReal();
        double valorB = tupla.Getimaginario();
        double valorDivision = valorB/valorA;
        double valorTeta = Math.atan(valorDivision);
        valorA = Math.pow(valorA, 2);
        valorB = Math.pow(valorB, 2);
        double valorC = valorA + valorB;
        double valorPfea = Math.sqrt(valorC);
        System.out.println(valorPfea);
        System.out.println(valorTeta);
        numeroCNuevo = new ComplexNumber(valorPfea, valorTeta);
        return numeroCNuevo;
    }
    
    
    public static ComplexNumber PolarACartesiano(ComplexNumber tupla){
        ComplexNumber numeroCNuevo;
        double valorTeta = tupla.Getimaginario();
        double valorPfea = tupla.GetReal();
        double cosTeta= Math.cos(valorTeta);
        double sinTeta= Math.sin(valorTeta);
        double valorA = valorPfea * cosTeta;
        double valorB = valorPfea * sinTeta;
        System.out.println(valorA);
        System.out.println(valorB);
        numeroCNuevo = new ComplexNumber(valorA, valorB);
        return numeroCNuevo;
    }
    
    
    public static boolean igualdadComplejos (ComplexNumber tupla1,ComplexNumber tupla2){
        double valorA1 = tupla1.GetReal();
        double valorB1 = tupla1.Getimaginario();
        double valorA2 = tupla2.GetReal();
        double valorB2 = tupla2.Getimaginario();
        if (valorA2 == valorA1 && valorB1 == valorB2){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
