/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesignal.Test.ArraysAndString;
import codesignal.MyCoding.ArraysAndString.sortByHeight;
import CrackingCodingInterview.MyTest.Generate.utilsForMatrix;
/**
 *
 * @author MarcoHdez
 */
public class TestSortByHeight {
    public static void main(String args[]){
        utilsForMatrix utils=new utilsForMatrix();
        sortByHeight testing=new sortByHeight();
        int[][] test={{-1,-1},
                    {-1,1,5,3,-1},
                    {9,-1,1,5,3,-1},
                    {2,1,5,3,8}
        };
        for(int i=0;i<test.length;i++){
            System.out.println("##### Test No: "+ (i+1));
            utils.printArray(test[i], 2);
            long tini=System.nanoTime();
            test[i]= testing.isSortingByHeight(test[i]);
            long tfin=System.nanoTime();
            utils.printArray(test[i], 2);
            System.out.println("Time in nanoseconds: "+(tfin-tini));
        }
    }
}
