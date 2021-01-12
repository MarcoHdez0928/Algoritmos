/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesignal.Test.ArraysAndString;
import codesignal.MyCoding.ArraysAndString.matrixElementsSums;
import CrackingCodingInterview.MyTest.Generate.utilsForMatrix;
/**
 *
 * @author MarcoHdez
 */
public class TestMatrixElementsSum {
    public static void main(String[] args){
        int[][][] test= {{{0,0,0,0,0},{1,2,3,4,5},{6,7,8,95,5},{2,1,5,4,8},{3,6,5,2,1},{8,5,52,1,6}},
                         {{0,8,5,0,0},{1,2,3,4,5},{6,7,8,95,5},{2,0,5,4,8},{3,6,5,2,1},{8,5,52,1,6}},
                         {{1,0,7,0,9},{0,2,0,4,0},{6,7,8,95,5},{2,1,5,4,8},{3,6,5,2,1},{8,5,52,1,6}},
                         {{5,7,8,2,1},{1,2,3,4,5},{6,7,8,95,5},{2,1,5,4,8},{3,6,5,2,1},{8,5,52,1,6}},
                         {{6,7,4,6,0},{1,2,3,4,5},{6,0,8,95,5},{0,1,5,4,8},{3,6,5,2,1},{8,5,52,1,6}},
                         {{1,2,3,4,5},{0,0,0,0,0},{6,7,8,95,5},{2,1,5,4,8},{3,6,5,2,1},{8,5,52,1,6}}
        };
        matrixElementsSums testing=new matrixElementsSums();
        utilsForMatrix utils=new utilsForMatrix();
        for(int i=0;i<test.length;i++){
            System.out.println("######## Test No:"+(i+1)+" ########");
            utils.printMatrix(test[i], 2);
            long tini=System.nanoTime();
            System.out.print("Costo Total:"+testing.matrixElementsSums(test[i]));
            long tfin=System.nanoTime();
            System.out.println("  Time in nanoseconds: "+(tfin-tini));
        }
    }
}
