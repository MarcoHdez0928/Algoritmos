/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyCoding.ArraysAndStrings;

import java.util.HashMap;

/**
 *
 * @author MarcoHdez
 * validate between two strings that are permutations
 */
public class checkPermutation {
    public boolean checkPermutation(String s1,String s2){
        //removeSpaces(s1);
        //removeSpaces(s2);
        HashMap<Character,Integer> mapa= new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(mapa.containsKey(s1.charAt(i)))
                mapa.replace(s1.charAt(i), 1+mapa.get(s1.charAt(i)));
            else    
                mapa.put(s1.charAt(i), 0);
        }
        for(int i=0;i<s2.length();i++){
            if(mapa.containsKey(s2.charAt(i))==false)
                return false;
            if(mapa.get(s2.charAt(i))>0)
                mapa.replace(s2.charAt(i),mapa.get(s2.charAt(i))-1);
            else if(mapa.get(s2.charAt(i))==0)
                mapa.remove(s2.charAt(i));
        }
        if(mapa.isEmpty())
            return true;
        else
            return false;
    }
    public String removeSpaces(String s){
        return s.toLowerCase().replace(" ", ""); 
    }
}
