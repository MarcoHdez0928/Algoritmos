/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyTest.ArraysAndStrings;
import CrackingCodingInterview.MyCoding.ArraysAndStrings.stringRotation;
import CrackingCodingInterview.BookCoding.ArraysAndStrings.StringRotationBook;
/**
 *
 * @author MarcoHdez
 */
public class TestStringRotation {
    public static void main(String[] args){
        String str1="ABCDEFGHIJ KLMNOPQRSTUVW XYZ";
        String str2="PQRSTUVW XYZABCDEFGHIJ KLMNO";
        stringRotation test = new stringRotation();
        System.out.println("String 1:"+str1);
        System.out.println("String 2:"+str2);
        long tini=System.currentTimeMillis();
        System.out.println(test.isSubstring(str1, str2));
        long tfin=System.currentTimeMillis();
        System.out.println("Time in nanoseconds:"+ (tfin-tini));
        
        StringRotationBook testB= new StringRotationBook();
        long tiniB=System.currentTimeMillis();
        System.out.println(testB.isRotation(str1, str2));
        long tfinB=System.currentTimeMillis();
        System.out.println("Time in nanoseconds:"+ (tfinB-tiniB));
    }
}
