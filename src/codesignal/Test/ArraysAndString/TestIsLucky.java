/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesignal.Test.ArraysAndString;
import CrackingCodingInterview.MyTest.Generate.utilsForMatrix;
import codesignal.MyCoding.ArraysAndString.isLucky;
/**
 *
 * @author MarcoHdez
 */
public class TestIsLucky {
    public static void main(String args[]){
        utilsForMatrix utils=new utilsForMatrix();
        isLucky testing=new isLucky();
        int[] test={1234,34567,12430,9683779,96833779};
        for(int i=0;i<test.length;i++){
            System.out.println("##### Test No: "+ (i+1));
            System.out.println("Numero a validar: "+test[i]);
            long tini=System.nanoTime();
            System.out.println(testing.isLucky(test[i]));
            long tfin=System.nanoTime();
            System.out.println("Time in nanoseconds: "+(tfin-tini));
        }
    }
}
