/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesignal.Test.ArraysAndString;
import codesignal.MyCoding.ArraysAndString.addBorder;
import CrackingCodingInterview.MyTest.Generate.utilsForMatrix;
/**
 *
 * @author MarcoHdez
 */
public class TestAddBorder {
    public static void main(String[] args){
        utilsForMatrix utils=new utilsForMatrix();
        String[][] test={{"abd","cgr","our","mjh","ied","mhs"},
                        {"c","r","D","d","i","e"},
                        {"ad","cd","ed","dc","ie","df","df","sx"},
                        {"1"},
                        {"b","r","c","a","i","a","a","y"}};
        addBorder testing=new addBorder();
        for(int i=0;i<test.length;i++){
            System.out.println("##### Test No: "+(i+1));
            utils.printArray(test[i]);
            long tini=System.nanoTime();
            utils.printArray(testing.addBorder(test[i]));
            long tfin=System.nanoTime();
            System.out.println("Time in nanoseconds: "+ (tfin-tini));
        }
    }
    
}
