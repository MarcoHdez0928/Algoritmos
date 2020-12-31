/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyTest.ArraysAndStrings;
import CrackingCodingInterview.MyCoding.ArraysAndStrings.oneAway;
import CrackingCodingInterview.BookCoding.ArraysAndStrings.OneAwayBook;
/**
 *
 * @author MarcoHdez
 */
public class TestOneAway {
    public static void main(String args[]){
        oneAway test=new oneAway();
        OneAwayBook testB=new OneAwayBook();
        String str= "aabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiu";
        String str2="aabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaiuhfudaabbccddfftdosfhoisfoasi8dfyhiasfhoiuahfoaie";
        long tini=System.currentTimeMillis();
        System.out.println(test.oneAwayValid(str, str2));
        long tfin=System.currentTimeMillis();
        System.out.println("Tiempo de ejecucion: "+ (tfin-tini));
        long tiniB=System.currentTimeMillis();
        System.out.println(testB.oneEditAway(str, str2));
        long tfinB=System.currentTimeMillis();
        System.out.println("Tiempo de ejecucion: "+ (tfinB-tiniB));
    }
}
