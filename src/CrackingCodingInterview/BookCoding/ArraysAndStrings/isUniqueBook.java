/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.BookCoding.ArraysAndStrings;




/**
 *
 * @author jessica
 */
public class isUniqueBook {
    public isUniqueBook(){
        
    }
    public boolean isUniqueChars(String str){
        if(str.length()>128) return false;
        boolean[] char_set=new boolean[128];
        for(int i=0; i <str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val]=true;
        }
        return true;
    }
    
    public boolean isUniqueChars2(String str){
        int checker =0;
        for(int i=0;i<str.length();i++){
            int val =str.charAt(i)-'a';
            if((checker &(1 << val)) >0)
                return false;
            checker |=(1<<val);
        }
        return true;
    }
}
