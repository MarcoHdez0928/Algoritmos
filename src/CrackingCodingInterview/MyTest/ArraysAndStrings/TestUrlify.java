/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyTest.ArraysAndStrings;
import CrackingCodingInterview.MyCoding.ArraysAndStrings.URLify;
import CrackingCodingInterview.BookCoding.ArraysAndStrings.URLifyBook;
/**
 *
 * @author MarcoHdez
 */
public class TestUrlify {
    public static void main(String args[]){
        URLify prueba =new URLify();
        URLifyBook pruebaB = new URLifyBook();
        String s="anita lava la tina      ";
        long tinicio=System.currentTimeMillis();
        char[] result= prueba.urlify(s, 18);
        long tfin=System.currentTimeMillis();
        System.out.println("Tiempo de ejecucion:"+(tfin-tinicio)+" Respuesta:"+ String.copyValueOf(result));
        long tinicioB=System.currentTimeMillis();
        char[] resultB= pruebaB.replaceSpaces(s.toCharArray(), 18);
        long tfinB=System.currentTimeMillis();
        System.out.println("Tiempo de ejecucion:"+(tfinB-tinicioB)+" Respuesta:"+ String.copyValueOf(resultB));
    }
}
