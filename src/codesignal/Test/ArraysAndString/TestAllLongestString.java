/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesignal.Test.ArraysAndString;
import CrackingCodingInterview.MyTest.Generate.utilsForMatrix;
import codesignal.MyCoding.ArraysAndString.AllLongestString;
/**
 *
 * @author MarcoHdez
 */
public class TestAllLongestString {
    public static void main(String[] args){
        utilsForMatrix utils=new utilsForMatrix();
        String[][] test={{"abd","cgr","OIUHASD","outfd8oia","i","oiuyhadhbd"},
                        {"abd","cr","OIASD","oud8oia","i","oiudhbd"},
                        {"abd","cgr","OIUHASD","outfd8oia","i","oiuyhadhbd","outfd8oiasa","outfd8tha"},
                        {"outfd8oiasa","outfd8oiasa","outfd8oiasa","outfd8oiasa","outfd8oiasa","outfd8oiasa","outfd8oiasa","outfd8oiasa"},
                        {"b","r","c","a","i","ac","af","y"}};
        AllLongestString testing=new AllLongestString();
        for(int i=0;i<test.length;i++){
            System.out.println("##### Test No: "+(i+1));
            utils.printArray(test[i]);
            long tini=System.nanoTime();
            utils.printArray(testing.allLongestString(test[i]));
            long tfin=System.nanoTime();
            System.out.println("Time in nanoseconds: "+ (tfin-tini));
        }
    }
}
