package edu.eci;


import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2124203
 */
public class TestMatrizFIlasColumnas {
    
    @Test
    public void testInverso() {
        boolean flagEsperada = true;
        MatrizFilasColumnas valorEsperado = new MatrizFilasColumnas(2,2);
        ComplexNumber valor1 = new ComplexNumber(-1, 1);
        valorEsperado.AddInPosition(0,0,valor1);
        ComplexNumber valor2 = new ComplexNumber(-2, 2);
        valorEsperado.AddInPosition(0,1,valor2);
        ComplexNumber valor3 = new ComplexNumber(1, -1);
        valorEsperado.AddInPosition(1,0,valor3);
        ComplexNumber valor4 = new ComplexNumber(2, -2);
        valorEsperado.AddInPosition(1,1,valor4);
        MatrizFilasColumnas matriz1 = new MatrizFilasColumnas(2,2);
        valor1 = new ComplexNumber(1, -1);
        matriz1.AddInPosition(0,0,valor1);
        valor2 = new ComplexNumber(2, -2);
        matriz1.AddInPosition(0,1,valor2);
        valor3 = new ComplexNumber(-1, 1);
        matriz1.AddInPosition(1,0,valor3);
        valor4 = new ComplexNumber(-2, 2);
        matriz1.AddInPosition(1,1,valor4);
        MatrizFilasColumnas matrizFinal = matriz1.Inverso();
        boolean flag = mathMatriz.IgualMatricial(matrizFinal, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
    @Test
    public void testSumaMatricial() {
        boolean flagEsperada = true;
        MatrizFilasColumnas valorEsperado = new MatrizFilasColumnas(2,2);
        ComplexNumber valor1 = new ComplexNumber(-1, 1);
        valorEsperado.AddInPosition(0,0,valor1);
        ComplexNumber valor2 = new ComplexNumber(-2, 2);
        valorEsperado.AddInPosition(0,1,valor2);
        ComplexNumber valor3 = new ComplexNumber(1, -1);
        valorEsperado.AddInPosition(1,0,valor3);
        ComplexNumber valor4 = new ComplexNumber(2, -2);
        valorEsperado.AddInPosition(1,1,valor4);
        MatrizFilasColumnas matriz1 = new MatrizFilasColumnas(2,2);
        valor1 = new ComplexNumber(0, -1);
        matriz1.AddInPosition(0,0,valor1);
        valor2 = new ComplexNumber(-1, 0);
        matriz1.AddInPosition(0,1,valor2);
        valor3 = new ComplexNumber(-5, 0);
        matriz1.AddInPosition(1,0,valor3);
        valor4 = new ComplexNumber(-2, 2);
        matriz1.AddInPosition(1,1,valor4);
        MatrizFilasColumnas matriz2 = new MatrizFilasColumnas(2,2);
        valor1 = new ComplexNumber(-1, 2);
        matriz2.AddInPosition(0,0,valor1);
        valor2 = new ComplexNumber(-1, 2);
        matriz2.AddInPosition(0,1,valor2);
        valor3 = new ComplexNumber(6, -1);
        matriz2.AddInPosition(1,0,valor3);
        valor4 = new ComplexNumber(4, -4);
        matriz2.AddInPosition(1,1,valor4);
        MatrizFilasColumnas matrizFinal = mathMatriz.SumaMatricial(matriz1, matriz2);
        boolean flag = mathMatriz.IgualMatricial(matrizFinal, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
    
    @Test
    public void testMultiplicacionScalarMatrices() {
        boolean flagEsperada = true;
        MatrizFilasColumnas valorEsperado = new MatrizFilasColumnas(2,2);
        ComplexNumber valor1 = new ComplexNumber(12, 21);
        valorEsperado.AddInPosition(0,0,valor1);
        ComplexNumber valor2 = new ComplexNumber(0, 0);
        valorEsperado.AddInPosition(0,1,valor2);
        ComplexNumber valor3 = new ComplexNumber(13, 13);
        valorEsperado.AddInPosition(1,0,valor3);
        ComplexNumber valor4 = new ComplexNumber(12, 8);
        valorEsperado.AddInPosition(1,1,valor4);
        MatrizFilasColumnas matriz1 = new MatrizFilasColumnas(2,2);
        valor1 = new ComplexNumber(6, 3);
        matriz1.AddInPosition(0,0,valor1);
        valor2 = new ComplexNumber(0, 0);
        matriz1.AddInPosition(0,1,valor2);
        valor3 = new ComplexNumber(5, 1);
        matriz1.AddInPosition(1,0,valor3);
        valor4 = new ComplexNumber(4, 0);
        matriz1.AddInPosition(1,1,valor4);
        ComplexNumber complejo = new ComplexNumber(3, 2);
        MatrizFilasColumnas matrizFinal = mathMatriz.MultiplicacionScalarMatriz(matriz1, complejo);
        boolean flag = mathMatriz.IgualMatricial(matrizFinal, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
    
    @Test
    public void testMultiplicacionMatrices() {
        boolean flagEsperada = true;
        MatrizFilasColumnas valorEsperado = new MatrizFilasColumnas(3,3);
        ComplexNumber valor1 = new ComplexNumber(26, -52);
        valorEsperado.AddInPosition(0,0,valor1);
        ComplexNumber valor2 = new ComplexNumber(60, 24);
        valorEsperado.AddInPosition(0,1,valor2);
        ComplexNumber valor3 = new ComplexNumber(26, 0);
        valorEsperado.AddInPosition(0,2,valor3);
        ComplexNumber valor4 = new ComplexNumber(9, 7);
        valorEsperado.AddInPosition(1,0,valor4);
        ComplexNumber valor5 = new ComplexNumber(1, 29);
        valorEsperado.AddInPosition(1,1,valor5);
        ComplexNumber valor6 = new ComplexNumber(14, 0);
        valorEsperado.AddInPosition(1,2,valor6);
        ComplexNumber valor7 = new ComplexNumber(48, -21);
        valorEsperado.AddInPosition(2,0,valor7);
        ComplexNumber valor8 = new ComplexNumber(15, 22);
        valorEsperado.AddInPosition(2,1,valor8);
        ComplexNumber valor9 = new ComplexNumber(20, -22);
        valorEsperado.AddInPosition(2,2,valor9);
        MatrizFilasColumnas matriz1 = new MatrizFilasColumnas(3,3);
        valor1 = new ComplexNumber(3, 2);
        matriz1.AddInPosition(0,0,valor1);
        valor2 = new ComplexNumber(0, 0);
        matriz1.AddInPosition(0,1,valor2);
        valor3 = new ComplexNumber(5, -6);
        matriz1.AddInPosition(0,2,valor3);
        valor4 = new ComplexNumber(1, 0);
        matriz1.AddInPosition(1,0,valor4);
        valor5 = new ComplexNumber(4, 2);
        matriz1.AddInPosition(1,1,valor5);
        valor6 = new ComplexNumber(0, 1);
        matriz1.AddInPosition(1,2,valor6);
        valor7 = new ComplexNumber(4, -1);
        matriz1.AddInPosition(2,0,valor7);
        valor8 = new ComplexNumber(0, 0);
        matriz1.AddInPosition(2,1,valor8);
        valor9 = new ComplexNumber(4, 0);
        matriz1.AddInPosition(2,2,valor9);
        MatrizFilasColumnas matriz2 = new MatrizFilasColumnas(3,3);
        valor1 = new ComplexNumber(5, 0);
        matriz2.AddInPosition(0,0,valor1);
        valor2 = new ComplexNumber(2, -1);
        matriz2.AddInPosition(0,1,valor2);
        valor3 = new ComplexNumber(6, -4);
        matriz2.AddInPosition(0,2,valor3);
        valor4 = new ComplexNumber(0, 0);
        matriz2.AddInPosition(1,0,valor4);
        valor5 = new ComplexNumber(4, 5);
        matriz2.AddInPosition(1,1,valor5);
        valor6 = new ComplexNumber(2, 0);
        matriz2.AddInPosition(1,2,valor6);
        valor7 = new ComplexNumber(7, -4);
        matriz2.AddInPosition(2,0,valor7);
        valor8 = new ComplexNumber(2, 7);
        matriz2.AddInPosition(2,1,valor8);
        valor9 = new ComplexNumber(0, 0);
        matriz2.AddInPosition(2,2,valor9);
        MatrizFilasColumnas matrizFinal = mathMatriz.multiplicacionMatricial(matriz1, matriz2);
        boolean flag = mathMatriz.IgualMatricial(matrizFinal, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
    
    @Test
    public void testMultiplicacionVectorMatriz() {
        boolean flagEsperada = true;
        VectorFilasColumna valorEsperado = new VectorFilasColumna(2);
        ComplexNumber valor1 = new ComplexNumber(12, 12);
        valorEsperado.AddValue(valor1);
        ComplexNumber valor2 = new ComplexNumber(16, -8);
        valorEsperado.AddValue(valor2);
        VectorFilasColumna vector1 = new VectorFilasColumna(2);
        valor1 = new ComplexNumber(4, 0);
        vector1.AddValue(valor1);
        valor2  =  new ComplexNumber(4, -2);
        vector1.AddValue(valor2);
        MatrizFilasColumnas matriz1 = new MatrizFilasColumnas(2,2);
        valor1 = new ComplexNumber(-2, 3);
        matriz1.AddInPosition(0,0,valor1);
        valor2 = new ComplexNumber(4, -2);
        matriz1.AddInPosition(0,1,valor2);
        ComplexNumber valor3 = new ComplexNumber(4, 2);
        matriz1.AddInPosition(1,0,valor3);
        ComplexNumber valor4 = new ComplexNumber(0, 0);
        matriz1.AddInPosition(1,1,valor4);
        VectorFilasColumna matrizFinal = mathMatriz.MultiplicacionVectorMatriz(vector1, matriz1);
        boolean flag = mathComplexVectorSpace.IgualdadVectores(matrizFinal, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
    
    @Test
    public void testMultiplicacionMatrizVector() {
        boolean flagEsperada = true;
        VectorFilasColumna valorEsperado = new VectorFilasColumna(2);
        ComplexNumber valor1 = new ComplexNumber(4, -4);
        valorEsperado.AddValue(valor1);
        ComplexNumber valor2 = new ComplexNumber(16, 8);
        valorEsperado.AddValue(valor2);
        VectorFilasColumna vector1 = new VectorFilasColumna(2);
        valor1 = new ComplexNumber(4, 0);
        vector1.AddValue(valor1);
        valor2  =  new ComplexNumber(4, -2);
        vector1.AddValue(valor2);
        MatrizFilasColumnas matriz1 = new MatrizFilasColumnas(2,2);
        valor1 = new ComplexNumber(-2, 3);
        matriz1.AddInPosition(0,0,valor1);
        valor2 = new ComplexNumber(4, -2);
        matriz1.AddInPosition(0,1,valor2);
        ComplexNumber valor3 = new ComplexNumber(4, 2);
        matriz1.AddInPosition(1,0,valor3);
        ComplexNumber valor4 = new ComplexNumber(0, 0);
        matriz1.AddInPosition(1,1,valor4);
        VectorFilasColumna matrizFinal = mathMatriz.MultiplicacionMatrizVector(matriz1, vector1);
        boolean flag = mathComplexVectorSpace.IgualdadVectores(matrizFinal, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
    
    @Test
    public void testProductoTensor() {
        boolean flagEsperada = true;
        MatrizFilasColumnas valorEsperado = new MatrizFilasColumnas(6,4);
        ComplexNumber valor1 = new ComplexNumber(-3, 0);
        valorEsperado.AddInPosition(0,0,valor1);
        valorEsperado.AddInPosition(0,1,valor1);
        valorEsperado.AddInPosition(0,2,valor1);
        valorEsperado.AddInPosition(0,3,valor1);
        ComplexNumber valor2 = new ComplexNumber(-4, 0);
        valorEsperado.AddInPosition(1,0,valor2);
        valorEsperado.AddInPosition(1,1,valor2);
        valorEsperado.AddInPosition(1,2,valor2);
        valorEsperado.AddInPosition(1,3,valor2);
        ComplexNumber valor3 = new ComplexNumber(-7, 0);
        valorEsperado.AddInPosition(2,0,valor3);
        valorEsperado.AddInPosition(2,1,valor3);
        valorEsperado.AddInPosition(2,2,valor3);
        valorEsperado.AddInPosition(2,3,valor3);
        ComplexNumber valor4 = new ComplexNumber(6, 0);
        valorEsperado.AddInPosition(3,0,valor4);
        valorEsperado.AddInPosition(3,1,valor4);
        valorEsperado.AddInPosition(3,2,valor4);
        valorEsperado.AddInPosition(3,3,valor4);
        ComplexNumber valor5 = new ComplexNumber(8, 0);
        valorEsperado.AddInPosition(4,0,valor5);
        valorEsperado.AddInPosition(4,1,valor5);
        valorEsperado.AddInPosition(4,2,valor5);
        valorEsperado.AddInPosition(4,3,valor5);
        ComplexNumber valor6 = new ComplexNumber(14, 0);
        valorEsperado.AddInPosition(5,0,valor6);
        valorEsperado.AddInPosition(5,1,valor6);
        valorEsperado.AddInPosition(5,2,valor6);
        valorEsperado.AddInPosition(5,3,valor6);
        MatrizFilasColumnas matriz1 = new MatrizFilasColumnas(2,2);
        valor1 = new ComplexNumber(-1, 0);
        matriz1.AddInPosition(0,0,valor1);
        matriz1.AddInPosition(0,1,valor1);
        valor2 = new ComplexNumber(2, 0);
        matriz1.AddInPosition(1,0,valor2);
        matriz1.AddInPosition(1,1,valor2);
        MatrizFilasColumnas matriz2 = new MatrizFilasColumnas(3,2);
        valor1 = new ComplexNumber(3, 0);
        matriz2.AddInPosition(0,0,valor1);
        matriz2.AddInPosition(0,1,valor1);
        valor2 = new ComplexNumber(4, 0);
        matriz2.AddInPosition(1,0,valor2);
        matriz2.AddInPosition(1,1,valor2);
        valor3 = new ComplexNumber(7, 0);
        matriz2.AddInPosition(2,0,valor3);
        matriz2.AddInPosition(2,1,valor3);
        MatrizFilasColumnas matrizFinal = mathMatriz.ProductoTensor(matriz1, matriz2);
        boolean flag = mathMatriz.IgualMatricial(matrizFinal, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
    
    
    @Test
    public void testMultiplicacionMatrizVectorBooleana() {
        boolean flagEsperada = true;
        VectorFilasColumna valorEsperado = new VectorFilasColumna(6);
        ComplexNumber valor1 = new ComplexNumber(0, 0);
        valorEsperado.AddValue(valor1);
        ComplexNumber valor2 = new ComplexNumber(0, 0);
        valorEsperado.AddValue(valor2);
        ComplexNumber valor3 = new ComplexNumber(12, 0);
        valorEsperado.AddValue(valor3);
        ComplexNumber valor4 = new ComplexNumber(5, 0);
        valorEsperado.AddValue(valor4);
        ComplexNumber valor5 = new ComplexNumber(1, 0);
        valorEsperado.AddValue(valor5);
        ComplexNumber valor6 = new ComplexNumber(9, 0);
        valorEsperado.AddValue(valor6);
        VectorFilasColumna vector1 = new VectorFilasColumna(6);
        valor1 = new ComplexNumber(6, 0);
        vector1.AddValue(valor1);
        valor2 = new ComplexNumber(2, 0);
        vector1.AddValue(valor2);
        valor3 = new ComplexNumber(1, 0);
        vector1.AddValue(valor3);
        valor4 = new ComplexNumber(5, 0);
        vector1.AddValue(valor4);
        valor5 = new ComplexNumber(3, 0);
        vector1.AddValue(valor5);
        valor6 = new ComplexNumber(10, 0);
        vector1.AddValue(valor6);
        MatrizFilasColumnas matriz1 = new MatrizFilasColumnas(6,6);
        matriz1.AddInPosition(0,0,new ComplexNumber(0,0));
        matriz1.AddInPosition(1,0,new ComplexNumber(0,0));
        matriz1.AddInPosition(2,0,new ComplexNumber(0,0));
        matriz1.AddInPosition(3,0,new ComplexNumber(0,0));
        matriz1.AddInPosition(4,0,new ComplexNumber(0,0));
        matriz1.AddInPosition(5,0,new ComplexNumber(1,0));
        
        matriz1.AddInPosition(0,1,new ComplexNumber(0,0));
        matriz1.AddInPosition(1,1,new ComplexNumber(0,0));
        matriz1.AddInPosition(2,1,new ComplexNumber(1,0));
        matriz1.AddInPosition(3,1,new ComplexNumber(0,0));
        matriz1.AddInPosition(4,1,new ComplexNumber(0,0));
        matriz1.AddInPosition(5,1,new ComplexNumber(0,0));

        matriz1.AddInPosition(0,2,new ComplexNumber(0,0));
        matriz1.AddInPosition(1,2,new ComplexNumber(0,0));
        matriz1.AddInPosition(2,2,new ComplexNumber(0,0));
        matriz1.AddInPosition(3,2,new ComplexNumber(0,0));
        matriz1.AddInPosition(4,2,new ComplexNumber(1,0));
        matriz1.AddInPosition(5,2,new ComplexNumber(0,0));
        
        matriz1.AddInPosition(0,3,new ComplexNumber(0,0));
        matriz1.AddInPosition(1,3,new ComplexNumber(0,0));
        matriz1.AddInPosition(2,3,new ComplexNumber(0,0));
        matriz1.AddInPosition(3,3,new ComplexNumber(1,0));
        matriz1.AddInPosition(4,3,new ComplexNumber(0,0));
        matriz1.AddInPosition(5,3,new ComplexNumber(0,0));

        matriz1.AddInPosition(0,4,new ComplexNumber(0,0));
        matriz1.AddInPosition(1,4,new ComplexNumber(0,0));
        matriz1.AddInPosition(2,4,new ComplexNumber(0,0));
        matriz1.AddInPosition(3,4,new ComplexNumber(0,0));
        matriz1.AddInPosition(4,4,new ComplexNumber(0,0));
        matriz1.AddInPosition(5,4,new ComplexNumber(1,0));

        matriz1.AddInPosition(0,5,new ComplexNumber(0,0));
        matriz1.AddInPosition(1,5,new ComplexNumber(0,0));
        matriz1.AddInPosition(2,5,new ComplexNumber(1,0));
        matriz1.AddInPosition(3,5,new ComplexNumber(0,0));
        matriz1.AddInPosition(4,5,new ComplexNumber(0,0));
        matriz1.AddInPosition(5,5,new ComplexNumber(0,0));
        
        
        int numeroClicks = 4;
        VectorFilasColumna matrizFinal = mathMatriz.MultiplicacionMatrizVectorConMovimiento(matriz1, vector1, numeroClicks);
        boolean flag = mathComplexVectorSpace.IgualdadVectores(matrizFinal, valorEsperado);
        assertEquals(flagEsperada, flag);
    }
    
    
    @Test
    public void PruebaValorMedioVarianza(){
        boolean flag;
        boolean flagEsperada = true;
        double valorEsperado = 2.5;
        double raizDosSobreDos = Math.sqrt(2)/2;
        MatrizFilasColumnas matriz = new MatrizFilasColumnas(2, 2);
        matriz.AddInPosition(0, 0, new ComplexNumber(1, 0));
        matriz.AddInPosition(0, 1, new ComplexNumber(0, -1));
        matriz.AddInPosition(1, 0, new ComplexNumber(0, 1));
        matriz.AddInPosition(1, 1, new ComplexNumber(2, 0));
        ComplexVectorSpace vector = new ComplexVectorSpace(2);
        vector.AddValue(new ComplexNumber(raizDosSobreDos, 0));
        vector.AddValue(new ComplexNumber(0,raizDosSobreDos));
        double valorMedio = mathMatriz.ValorMedio(matriz, vector);
        System.out.println("Valor medio: "+valorMedio);
        if (valorMedio == valorEsperado){
            MatrizFilasColumnas matrizMedio= new MatrizFilasColumnas(matriz.sizeFilas, matriz.sizeColumnas);
            matrizMedio.AddInPosition(0, 0, new ComplexNumber(valorMedio, 0));
            matrizMedio.AddInPosition(0, 1, new ComplexNumber(0, 0));
            matrizMedio.AddInPosition(1, 0, new ComplexNumber(0, 0));
            matrizMedio.AddInPosition(1, 1, new ComplexNumber(valorMedio, 0));
            MatrizFilasColumnas matrizRestada = mathMatriz.RestaMatricial(matriz, matrizMedio);
            MatrizFilasColumnas matrizCuadrada = mathMatriz.multiplicacionMatricial(matrizRestada, matrizRestada);
            double valorVarianza = mathMatriz.Varianza(matrizCuadrada, vector);
            System.out.println("valor Varianza = " + valorVarianza);
            flag = true;
            
        }
        else{
            flag = false;
        }
        assertEquals(flagEsperada, flag);
    }
    
    
    @Test
    public void PruebaEjercicio4(){
        boolean flag = true;
        boolean flagEsperada = true;
        //double valorEsperado = 2.5;
        ArrayList vectorMatrices = new ArrayList<MatrizFilasColumnas>();
        double raizDosSobreDos = Math.sqrt(2)/2;
        MatrizFilasColumnas matriz1 = new MatrizFilasColumnas(2, 2);
        matriz1.AddInPosition(0, 0, new ComplexNumber(0, 0));
        matriz1.AddInPosition(0, 1, new ComplexNumber(1, 0));
        matriz1.AddInPosition(1, 0, new ComplexNumber(1, 0));
        matriz1.AddInPosition(1, 1, new ComplexNumber(0, 0));
        vectorMatrices.add(matriz1);
        MatrizFilasColumnas matriz2 = new MatrizFilasColumnas(2, 2);
        matriz2.AddInPosition(0, 0, new ComplexNumber(raizDosSobreDos, 0));
        matriz2.AddInPosition(0, 1, new ComplexNumber(raizDosSobreDos, 0));
        matriz2.AddInPosition(1, 0, new ComplexNumber(raizDosSobreDos, 0));
        matriz2.AddInPosition(1, 1, new ComplexNumber(-raizDosSobreDos, 0));
        vectorMatrices.add(matriz2);
        ComplexVectorSpace vector = new ComplexVectorSpace(2);
        vector.AddValue(new ComplexNumber(1, 0));
        vector.AddValue(new ComplexNumber(0,0));
        ComplexVectorSpace vectorRespuesta = mathMatriz.CalcularStateVector(vectorMatrices, vector);
        System.out.println("vector resultante");
        for (int i = 0; i < vectorRespuesta.size; i ++){
            System.out.println("vector " + i + vectorRespuesta.GetPosition(i).GetReal() + " " + vectorRespuesta.GetPosition(i).Getimaginario());
        }
        assertEquals(flagEsperada, flag);
    }
    
    
}
