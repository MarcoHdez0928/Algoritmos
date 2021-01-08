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
public class stringRotation {
    public boolean isSubstring(String str1, String str2){
        if(str1.length()!=str2.length())
            return false;
        String str1str1=str1+str1;
        if(str1str1.contains(str2))
            return true;
        return false;
    }
}
