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
public class AllLongestString {
    public String[] allLongestString(String[] array){
        boolean[] longest=new boolean[array.length];;
        int count=0;
        int maxSize=0;
        String[] result;
        for(int i=0;i<array.length;i++){
            if(array[i].length()>maxSize){
                longest=new boolean[array.length];
                longest[i]=true;
                count=1;
                maxSize=array[i].length();
            }else if(array[i].length()==maxSize){
                longest[i]=true;
                count++;
            }
        }
        result=new String[count];
        count=0;
        for(int i=0;i<array.length;i++){
            if(longest[i]==true){
                result[count]=array[i];
                count++;
            }
        }
        return result;
    }
}
