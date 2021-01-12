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
public class areSimilar {
    boolean areSimilar(int[] a, int[] b) {
        boolean validado=false;
        int index=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                if(validado)
                    return false;
                if(index==-1){
                    index=i;
                }else {
                    if(a[i]!=b[index] || a[index]!= b[i]){
                        return false;
                    }else{
                        validado=true;
                    }                
                }
            }
        }
        return true;
    }

}
