/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesignal.MyCoding.ArraysAndString;

/**
 *
 * @author MarcoHdez
 */
public class matrixElementsSums {
    public int matrixElementsSums(int[][] matrix){
        boolean[] haunted=new boolean[matrix[0].length];
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(haunted[j]==false){
                    if(matrix[i][j]==0){
                        haunted[j]=true;
                    }
                    else{
                        count=count+matrix[i][j];
                    }
                }
            }
        }
        return count;
    }
}
