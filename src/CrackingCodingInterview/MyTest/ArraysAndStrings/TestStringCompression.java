/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyTest.ArraysAndStrings;
import CrackingCodingInterview.MyCoding.ArraysAndStrings.stringCompression;
import CrackingCodingInterview.BookCoding.ArraysAndStrings.stringCompressionBook;
/**
 *
 * @author MarcoHdez
 */
public class TestStringCompression {
    public static void main(String args[]){
        stringCompression test=new stringCompression();
        stringCompressionBook testB=new stringCompressionBook();
        String str="aaaaaayyyyyybbbrrjjiooddppmmmmmmhjhhhuduuuuuttttt";
        long tini=System.nanoTime();
        System.out.println(test.stringCompression(str));
        long tfin=System.nanoTime();
        System.out.println("Tiempo en nanosegundos:"+ (tfin-tini));
        
        long tiniB=System.nanoTime();
        System.out.println(testB.compress(str));
        long tfinB=System.nanoTime();
        System.out.println("Tiempo en nanosegundos:"+ (tfinB-tiniB));
    }
}
