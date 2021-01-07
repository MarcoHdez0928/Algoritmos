/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.BookCoding.ArraysAndStrings;

/**
 *
 * @author MarcoHdez
 */
public class zeroMatrixBook {
    public int[][] setZeros(int[][] matrix){
        boolean rowHasZero = false;
        boolean colHasZero = false;
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[0][j]==0){
                rowHasZero=true;
                break;
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                colHasZero=true;
                break;
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]==0){
                matrix=nullifyRow(matrix,i);
            }
        }
        for(int j=1;j<matrix[0].length;j++){
            if(matrix[0][j]==0)
                matrix=nullifyColumn(matrix,j);
        }
        if(rowHasZero){
            matrix=nullifyRow(matrix,0);
        }
        if(colHasZero){
            matrix=nullifyColumn(matrix,0);
        }
        return matrix;
    }
    int[][] nullifyRow(int[][] matrix, int row){
        for(int j=0;j<matrix[0].length;j++){
            matrix[row][j]=0;
        }
        return matrix;
    }
    int[][] nullifyColumn(int[][] matrix, int col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col]=0;
        }
        return matrix;
    }
}
