/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyTest.Generate;

/**
 *
 * @author MarcoHdez
 */
public class utilsForMatrix {
    public void printMatrix(int[][] matrix,int formatterZeroes){
        for(int i=0;i<matrix.length;i++){
            System.out.print("\n");
            for(int j=0;j<matrix[0].length;j++)
                System.out.print("["+String.format("%0"+formatterZeroes+"d",matrix[i][j])+"]");
        }
        System.out.print("\n");
    }
    public void printArray(int[] Array,int formatterZeroes){
        
        for(int j=0;j<Array.length;j++)
            System.out.print("["+String.format("%0"+formatterZeroes+"d",Array[j])+"]");
        
        System.out.print("\n");
    }
    public void printArray(String[] Array){
        
        for(int j=0;j<Array.length;j++)
            System.out.print("["+Array[j]+"]");
        
        System.out.print("\n");
    }
}
