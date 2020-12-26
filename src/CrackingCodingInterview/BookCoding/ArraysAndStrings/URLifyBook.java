/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.BookCoding.ArraysAndStrings;

/**
 *
 * @author MarcoHdez
 */
public class URLifyBook {
    public char[] replaceSpaces(char[] str,int trueLength){
        int numberOfSpaces=countOfChar(str,0,trueLength,' ');
        int newIndex= trueLength-1+numberOfSpaces*2;
        if(newIndex+1<str.length) str[newIndex+1]='\0';
        for(int oldIndex=trueLength-1; oldIndex>=0;oldIndex -=1){
            if(str[oldIndex]==' '){
                str[newIndex]='0';
                str[newIndex -1]='2';
                str[newIndex -2]='%';
                newIndex -=3;
            }
            else{
                str[newIndex]=str[oldIndex];
                newIndex -=1;
            }
        }
        return str;
    }
    int countOfChar(char[] str,int start,int end, int target){
        int count=0;
        for(int i=start; i<end;i++){
            if(str[i]==target)
                count++;
        }
        return count;
    }
}
