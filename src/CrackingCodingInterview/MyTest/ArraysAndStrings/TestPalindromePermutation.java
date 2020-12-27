/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyTest.ArraysAndStrings;
import CrackingCodingInterview.MyCoding.ArraysAndStrings.palindromePermutation;
import CrackingCodingInterview.BookCoding.ArraysAndStrings.PalindromePermutationBook;
/**
 *
 * @author MarcoHdez
 */
public class TestPalindromePermutation {
    public static void main(String args[]){
        palindromePermutation prueba =new palindromePermutation();
        PalindromePermutationBook pruebaB = new PalindromePermutationBook();
        String str="ania antta  llaviaania antta  llaviania antta  llaviaania antta  llaviania antta  llaviaania antta  llaviaanania antta  llaviaania antta  llaviaania antta  llaviaia antta  llaviaaania antta  llaviaaania antta  llaviaania antta  llaviaania antta  llaviania antta  llaviaania antta  llaviania antta  llaviaania antta  llaviaanania antta  llaviaania antta  llaviaania antta  llaviaia antta  llaviaaania antta  llaviaaania antta  llaviaania antta  llaviaania antta  llaviania antta  llaviaania antta  llaviania antta  llaviaania antta  llaviaanania antta  llaviaania antta  llaviaania antta  llaviaia antta  llaviaaania antta  llaviaaania antta  llaviaania antta  llaviaania antta  llaviania antta  llaviaania antta  llaviania antta  llaviaania antta  llaviaanania antta  llaviaania antta  llaviaania antta  llaviaia antta  llaviaaania antta  llaviaaania antta  llavia";
        long tini=System.currentTimeMillis();
        System.out.println(prueba.isPalindromePermutation(str));
        long tfin=System.currentTimeMillis();
        System.out.println("Tiempo de ejecucion:" + (tfin-tini));
        
        long tiniB=System.currentTimeMillis();
        System.out.println(pruebaB.isPalindromePermutationBook(str));
        long tfinB=System.currentTimeMillis();
        System.out.println("Tiempo de ejecucion:" + (tfinB-tiniB));
    }
}
