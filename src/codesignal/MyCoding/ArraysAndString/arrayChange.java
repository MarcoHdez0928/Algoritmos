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
public class arrayChange {
    int arrayChange(int[] inputArray) {
        int moves=0;
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i-1]>=inputArray[i]){
                moves+=Math.abs(inputArray[i-1]-inputArray[i])+1;
                inputArray[i]+=Math.abs(inputArray[i-1]-inputArray[i])+1;
            }            
        }
        return moves;
    }

}
