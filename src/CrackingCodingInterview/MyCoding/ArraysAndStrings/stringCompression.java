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
public class stringCompression {
    public String stringCompression(String str){
        char c=' ';
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(c!=str.charAt(i)){
                if(count>0){
                    sb.append(c+""+count);
                }
                c=str.charAt(i);
                count=1;
            }
            else{
                count++;
            }                
        }
        sb.append(c+""+count);
        return str.length()<=sb.length()? str:sb.toString();
    }
}
