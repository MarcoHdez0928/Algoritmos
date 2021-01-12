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
public class commonCharacterCount {
    int commonCharacterCount(String s1, String s2) {
        int[] v1=countCharacters(s1);
        int[] v2=countCharacters(s2);
        int count=0;
        for(int i=0;i<128;i++){
            if(v1[i]>0 && v2[i]>0){
                if(v1[i]<=v2[i]){
                    count+=v1[i];
                }else{
                    count+=v2[i];
                }
            }
        }
        return count;
    }
    int[] countCharacters(String s){
        int[] array=new int[128];
        for(int i=0;i<s.length();i++){
            array[s.charAt(i)]+=1;
        }
        return array;
    }
}
