/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesignal.Test.ArraysAndString;
import codesignal.MyCoding.ArraysAndString.alternatingSums;
import CrackingCodingInterview.MyTest.Generate.utilsForMatrix;
/**
 *
 * @author MarcoHdez
 */
public class TestAlternatingSums {
    public static void main(String[] args){
        utilsForMatrix utils=new utilsForMatrix();
        alternatingSums testing=new alternatingSums();
        int[][] test={{1,2,3,4,5},
                    {6,7,8,9},
                    {10,2,13,3,5},
                    {1},
                    {1,0},
                    {0,0},
                    {0,1},
                    {0,0,0,0,0,3,5}
        };
        for(int i=0;i<test.length;i++){
            System.out.println("##### Test No: "+ (i+1));
            utils.printArray(test[i],2);
            long tini=System.nanoTime();
            utils.printArray(testing.alternatingSums(test[i]),3);
            long tfin=System.nanoTime();
            System.out.println("Time in nanoseconds: "+(tfin-tini));
        }
    }
}
