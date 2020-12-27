/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyCoding.ArraysAndStrings;

/**
 *
 * @author MarcoHdez
 */
public class palindromePermutation {
    public boolean isPalindromePermutation(String str){
        int[] arr =new int[255];
        boolean flag=false;
        str=str.toLowerCase().replace(" ", "");
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)] >0){
                arr[str.charAt(i)]=arr[str.charAt(i)]+1;
            }
            else{
                arr[str.charAt(i)]=1;
            }
        }
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]>0){
                if(arr[str.charAt(i)]%2==1){
                    if(flag)
                        return false;
                    else
                        flag=true;                    
                }
                arr[str.charAt(i)]=0;
            }
        }
        return true;
    }
}
