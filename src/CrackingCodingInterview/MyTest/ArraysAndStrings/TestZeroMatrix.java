/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyTest.ArraysAndStrings;
import CrackingCodingInterview.MyCoding.ArraysAndStrings.zeroMatrix;
import CrackingCodingInterview.MyTest.Generate.utilsForMatrix;
import CrackingCodingInterview.BookCoding.ArraysAndStrings.zeroMatrixBook;
/**
 *
 * @author MarcoHdez
 */
public class TestZeroMatrix {
    public static void main(String args[]){
        int[][] matrix={{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,0,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25},
                        {21,22,23,0,25},
                        {21,22,23,24,25}};
        zeroMatrix test =new zeroMatrix();
        utilsForMatrix utils=new utilsForMatrix();
        utils.printArray(matrix, 4);
        long tini=System.nanoTime();
        matrix=test.setZeroes(matrix);
        long tfin=System.nanoTime();
        utils.printArray(matrix, 4);
        System.out.println("Time in nanoseconds: "+(tfin-tini));
        
        int[][] matrixB={{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,0,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25},
                        {21,22,23,0,25},
                        {21,22,23,24,25}};
        zeroMatrixBook testB =new zeroMatrixBook();        
        utils.printArray(matrixB, 4);
        long tiniB=System.nanoTime();
        matrixB=testB.setZeros(matrixB);
        long tfinB=System.nanoTime();
        utils.printArray(matrixB, 4);
        System.out.println("Time in nanoseconds: "+(tfinB-tiniB));
    }
}
