/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesignal.MyCoding.ArraysAndString;

/**
 *
 * @author MarcoHdez
 */
public class addBorder {
    public String[] addBorder(String[] picture){
        int lenString=picture[0].length();
        int lenMatrix=picture.length;
        String[] result=new String[lenMatrix+2];
        result[0]=generateBorder(lenString+2);
        for(int i=0; i<lenMatrix;i++){
            result[i+1]="*"+picture[i]+"*";
        }
        result[lenMatrix+1]=generateBorder(lenString+2);
        return result;
    }
    String generateBorder(int size){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<size;i++){
            sb.append("*");
        }
        return sb.toString();
    }
}
