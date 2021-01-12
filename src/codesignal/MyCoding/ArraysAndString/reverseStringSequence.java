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
public class reverseStringSequence {
    public String reverseString(String s){
        Stack<Integer> pila=new Stack<Integer>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                pila.push(i);
            }
            else if(s.charAt(i)==')'){
                int index =pila.pop();
                s=s.substring(0, index)+reverse(s.substring(index, i+1).replace("(", "#").replace(")", "#"))+s.substring(i+1, s.length());
            }
        }
        return s.replaceAll("#", "");
    }
    public String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
}
