/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesignal.Test.ArraysAndString;
import codesignal.MyCoding.ArraysAndString.reverseStringSequence;
/**
 *
 * @author MarcoHdez
 */
public class TestReverseStringSequence {
    public static void main(String[] args){
        reverseStringSequence testing=new reverseStringSequence();
        String[] test={"foo(bbc(joo))GLI","foo","(foo)","(footoos(uos(khjs(skod)opihsfd)uhosdf)uikhgsf)oiu"};
        for(int i=0;i<test.length;i++){
            System.out.println("##### Test No: "+ (i+1));
            System.out.println("String a validar:"+test[i]);
            long tini=System.nanoTime();
            System.out.println(testing.reverseString(test[i]));
            long tfin=System.nanoTime();
            System.out.println("Time in nanoseconds: "+ (tfin-tini));
        }
    }
}
