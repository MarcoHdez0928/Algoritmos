/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesignal.MyCoding.ArraysAndString;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author MarcoHdez
 */
public class sortByHeight {
    public int[] isSortingByHeight(int[] a){
        int[] resp;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                count++;
            }                
        }
        resp=new int[count];
        count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                resp[count]=a[i];
                count++;
            }               
        }
        Arrays.sort(resp);
        count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                a[i]=resp[count];
                count++;
            }
        }
        return a;
    }
}
