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
public class checkPermutationBook {
    public boolean isPermutation(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        int[] letters=new int[128];
        for(int i=0;i<s1.length();i++){
            letters[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            letters[s2.charAt(i)]--;
            if(letters[s2.charAt(i)]<0)
                return false;
        }
        return true;
    }
}
