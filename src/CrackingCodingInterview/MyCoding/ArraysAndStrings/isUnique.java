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
public class isUnique {
    public isUnique(){
        
    }
    public boolean isUnique(String texto){
        boolean[] validate=new boolean[255];
        for(int i=0;i<texto.length();i++){
            if(validate[texto.charAt(i)]==true)
                return false;
            else
                validate[texto.charAt(i)]=true;
        }
        return true;
    }
}
