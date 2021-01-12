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
public class alternatingSums {
    public int[] alternatingSums(int[] arr){
        int[] result=new int[2];
        for(int i=0;i<arr.length;i++){
            result[i%2]+=arr[i];
        }
        return result;
    }
}
