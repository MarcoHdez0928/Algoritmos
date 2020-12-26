/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyTest.ArraysAndStrings;

import CrackingCodingInterview.MyCoding.ArraysAndStrings.checkPermutation;
import CrackingCodingInterview.BookCoding.ArraysAndStrings.checkPermutationBook;
/**
 *
 * @author MarcoHdez
 */
public class TestCheckPermutation {
    public static void main(String args[]){
        checkPermutation prueba=new checkPermutation();
        checkPermutationBook pruebaBook= new checkPermutationBook();
        String s1="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuv"
                + "wxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqr"
                + "stuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmn"
                + "opqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghij"
                + "klmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdef"
                + "ghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab"
                + "cdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx"
                + "yzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrst"
                + "uvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnop"
                + "qrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijkl"
                + "mnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefgh"
                + "ijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd"
                + "efghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
                + "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuv"
                + "wxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqr"
                + "stuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmn"
                + "opqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghij"
                + "klmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdef"
                + "ghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab"
                + "cdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx"
                + "yzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrst"
                + "uvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnop"
                + "qrstuvwxyz";
        String s2="fopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnl"
                + "istufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdea"
                + "bcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmr"
                + "gdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkv"
                + "zhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwx"
                + "yjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufo"
                + "pqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlis"
                + "tufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabc"
                + "nlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgd"
                + "eabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzh"
                + "mrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyj"
                + "kvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopq"
                + "wxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistu"
                + "fopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnl"
                + "istufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdea"
                + "bcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmr"
                + "gdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkv"
                + "zhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwx"
                + "yjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufo"
                + "pqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlis"
                + "tufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabc"
                + "nlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgdeabcnlistufopqwxyjkvzhmrgd"
                + "eabcnlistu";
        long tinicio=System.currentTimeMillis();
        System.out.println(prueba.checkPermutation(s1, s2));
        long tfin=System.currentTimeMillis();
        System.out.println("My Coding Tiempo total de ejecucion en milisegundos: "+ (tfin-tinicio));
        long tinicioB=System.currentTimeMillis();
        System.out.println(pruebaBook.isPermutation(s1, s2));
        long tfinB=System.currentTimeMillis();
        System.out.println("My Coding Tiempo total de ejecucion en milisegundos: "+ (tfinB-tinicioB));
    }
    
}
