/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyTest.ArraysAndStrings;
import CrackingCodingInterview.MyCoding.ArraysAndStrings.*;
import CrackingCodingInterview.MyTest.Generate.randomStrings;
/**
 *
 * @author MarcoHdez
 */
public class TestIsUnique {
    public static void main(String args[]){
        isUnique test =new isUnique();
        randomStrings rS = new randomStrings();
        String rangoTexto = "1234567890abcdefghijklmnopqrstuvwxyz";
        int longitud=0;
        for(int i=0;i<500;i++){
            longitud++;
            if(longitud>20)
                longitud=0;
            String texto= rS.generateRamdomString(rangoTexto, longitud);
            System.out.println(texto+":"+test.isUnique(texto));
        }
    }
}
