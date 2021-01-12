/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesignal.MyCoding.ArraysAndString;

import java.util.Stack;

/**
 *
 * @author MarcoHdez
 */
public class almosIncreasingSequence {
    public boolean almostIncreasingSequence(int[] sequence){
        int preAnt=Integer.MIN_VALUE;
        int ant=Integer.MIN_VALUE;
        boolean flag=false;
        for(int i=0;i<sequence.length;i++){
            if(sequence[i]>ant){
                preAnt=ant;
                ant=sequence[i];
            }
            else{
                if(flag){
                    return false;
                }
                flag=true;
                if(sequence[i]>preAnt){
                    ant=sequence[i];
                }
                //else{
                //    return false;
                //}
            }
        }
        return true;
    }
    public boolean almostIncreasingSequencePre(int[] sequence) {
        boolean flag=false;
        int len =sequence.length;
        Stack<Integer> pila = new Stack<Integer>(); 
        pila.push(Integer.MIN_VALUE);
        for(int i=0;i<len;i++){
            if(sequence[i]>pila.peek()){
                pila.push(sequence[i]);
            }else{
                if(flag)
                    return false;
                flag=true;
                int val=pila.pop();
                if(sequence[i]> pila.peek()){
                    pila.push(sequence[i]);                
                }else{
                    if(i+1==len)
                        return true;
                    else
                        pila.push(val);
                }
            }


        }
        return true;
    }
  
}
