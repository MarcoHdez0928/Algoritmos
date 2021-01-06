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
public class rotateMatrixBook {
    public int[][] rotate(int[][] matrix){
        if(matrix.length==0 || matrix.length != matrix[0].length) return matrix;
        int n = matrix.length;
        for(int layer=0; layer< n/2; layer++){
            int first= layer;
            int last= n-1-layer;
            for(int i = first; i< last; i++){
                int offset=i - first;
                //save top
                int top=matrix[first][i];
                // left->top
                matrix[first][i]=matrix[last-offset][first];
                
                //bottom -> left
                matrix[last-offset][first]=matrix[last][last - offset];
                
                //rigth -> bottom
                matrix[last][last-offset]=matrix[i][last];
                
                //top -> rigth
                matrix[i][last]=top;// rigth <- saved top
                
            }
        }
        return matrix;
    }
}
