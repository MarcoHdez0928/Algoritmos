/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesignal.Test.ArraysAndString;
import codesignal.MyCoding.ArraysAndString.almosIncreasingSequence;
import CrackingCodingInterview.MyTest.Generate.utilsForMatrix;
/**
 *
 * @author MarcoHdez
 */
public class TestAlmostIncreasingSequence {
    public static void main(String args[]){
        almosIncreasingSequence testing=new almosIncreasingSequence();
        utilsForMatrix utils=new utilsForMatrix();
        int[][] test={{1,2,1,2},
                    {1,3,2,1},
                    {10,1,2,3,4,5},
                    {1,1,1,2,3},
                    {0,-2,5,6},
                    {1,2,3,4,5,3,5,6},
                    {1,1},
                    {10,1,2,3,4,5,3,5,6,1},
        {3,5,67,98,3},
        {1,2,3,4,3,6} };
        for(int i=0;i<test.length;i++){
            System.out.println("###### Test No: "+(i+1)+" ######");
            utils.printArray(test[i],2);
            long tIniA=System.nanoTime();
            System.out.println(testing.almostIncreasingSequencePre(test[i]));
            long tFinA=System.nanoTime();
            System.out.println("Time in nanoseconds: "+ (tFinA-tIniA));
            long tIniB=System.nanoTime();
            System.out.println(testing.almostIncreasingSequence(test[i]));
            long tFinB=System.nanoTime();
            System.out.println("Time in nanoseconds: "+ (tFinB-tIniB));
        }
        
    }
}
