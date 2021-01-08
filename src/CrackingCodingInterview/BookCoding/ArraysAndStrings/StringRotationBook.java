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
public class StringRotationBook {
    public boolean isRotation(String s1,String s2){
        int len =s1.length();
        if(len==s2.length() && len>0){
            String s1s1= s1+s1;
            return s1s1.contains(s2);
        }
        return false;
    }
}
