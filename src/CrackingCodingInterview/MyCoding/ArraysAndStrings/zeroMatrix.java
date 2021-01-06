/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyCoding.ArraysAndStrings;

import java.util.LinkedList;

/**
 *
 * @author MarcoHdez
 */
public class zeroMatrix {
    
    public int[][] setZeroes(int[][] matrix){
        LinkedList<Integer> x=new LinkedList();
        LinkedList<Integer> y=new LinkedList();    
        //save positions in X and Y with elements equals to zero
        for(int j=0;j<matrix.length; j++){
            for(int i=0;i<matrix[0].length;i++){
                if(matrix[j][i]==0){
                    x.add(j);
                    y.add(i);
                }
            }
        }
        //replace selected elements in positions in x with zero
        for(int i=0;i<x.size();i++){
            for(int j=0;j<matrix.length;j++){
                matrix[x.get(i)][j]=0;
            }
        }
        for(int i=0;i<y.size();i++){
            for(int j=0;j< matrix[0].length;j++){
                matrix[j][y.get(i)]=0;
            }
        }
        return matrix;
    }
    
    
}
