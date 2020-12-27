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
public class PalindromePermutationBook {
    public boolean isPalindromePermutationBook(String str){
        int countOdd=0;
        int[] table=new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
        for(char c : str.toCharArray()){
            int x =getCharNumber(c);
            if(x != -1){
                table[x]++;
                if(table[x]%2==1){
                    countOdd++;
                }else{
                    countOdd--;
                }
            }
        }
        return countOdd<=1;
    }
    int getCharNumber(Character c){
        int a= Character.getNumericValue('a');
        int z= Character.getNumericValue('z');
        int val= Character.getNumericValue(c);
        if(a<=val && val<=z)
            return val-a;
        return -1;
    }
}
