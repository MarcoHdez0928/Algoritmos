/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyCoding.ArraysAndStrings;

/**
 *
 * @author MarcoHdez
 */
public class rotateMatrix {
    public int[][] rotateMatrix(int [][] matrix){
        int aux=0;
        int length=matrix[0].length-1;
        for(int j=0;j<length/2;j++){
            for(int i=j;i<length-j;i++){
                aux=matrix[j][i+j];
                matrix[j][i+j]=matrix[length-i-j][j];
                matrix[length-i-j][j]=matrix[length-j][length-i-j];
                matrix[length-j][length-i-j]=matrix[j+i][length-j];
                matrix[j+i][length-j]=aux;
                
            }
        }
        return matrix;
    }
}
