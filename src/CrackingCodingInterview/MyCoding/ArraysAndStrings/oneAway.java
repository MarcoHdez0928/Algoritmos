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
public class oneAway {
    public boolean oneAwayValid(String str1, String str2){     
        if(str1.length()==str2.length()){
            return validateUpdate(str1,str2);
        }
        if(str1.length()+1==str2.length()){
            return validInsertOrDelete(str1,str2);
        }
        if(str1.length()==str2.length()+1){
            return validInsertOrDelete(str2,str1);
        }
        return false;
    }
    public boolean validateUpdate(String str1,String str2){
        boolean band=false;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                if(band)
                    return false;
                band=true;
            }
        }
        return true;
    }
    public boolean validInsertOrDelete(String str1,String str2){
        int band=0;
        //abcd abc
        for(int i=0;i<str1.length()+band;i++){
            if(str1.charAt(i)!=str2.charAt(i+band)){
                if(band>1)
                    return false;
                band++;
            }
        }
        return true;
    }
}
