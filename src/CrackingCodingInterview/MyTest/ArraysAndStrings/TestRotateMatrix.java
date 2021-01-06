/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyTest.ArraysAndStrings;
import CrackingCodingInterview.MyCoding.ArraysAndStrings.rotateMatrix;
import CrackingCodingInterview.BookCoding.ArraysAndStrings.rotateMatrixBook;
import CrackingCodingInterview.MyTest.Generate.utilsForMatrix;
/**
 *
 * @author MarcoHdez
 */
public class TestRotateMatrix {
    public static void main(String args[]){
        int[][] matrix={{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}};
        rotateMatrix test=new rotateMatrix();
        utilsForMatrix utils=new utilsForMatrix();
        System.out.println("Original Matrix");
        utils.printArray(matrix,4);
        long tini=System.nanoTime();
        matrix=test.rotateMatrix(matrix);
        long tfin=System.nanoTime();
        
        System.out.println("\nMatrix Rotated To The Rigth");
        
        utils.printArray(matrix,4);
        System.out.println("\nTime in nanoseconds: "+(tfin-tini));
        
        int[][] matrix2={{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}};
        rotateMatrixBook testB=new rotateMatrixBook();
        System.out.println("Original Matrix");
        utils.printArray(matrix2,4);
        long tiniB=System.nanoTime();
        matrix2=testB.rotate(matrix2);
        long tfinB=System.nanoTime();
        
        System.out.println("\nMatrix Rotated To The Rigth");
        
        utils.printArray(matrix2,4);
        System.out.println("\nTime in nanoseconds: "+(tfinB-tiniB));
        
    }
    
    
}
