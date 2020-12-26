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
public class URLify {
    public char[] urlify(String s,int num){
        s=s.trim();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                num=num+2;
        }
        char[] result=new char[num];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                result[j++]='%';
                result[j++]='2';
                result[j++]='0';
            }
            else {
                result[j++]=s.charAt(i);
            }
        }
        return result;
    }
    
}
