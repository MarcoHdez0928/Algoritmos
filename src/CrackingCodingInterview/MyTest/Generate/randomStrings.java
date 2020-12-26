/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyTest.Generate;

import java.util.Random;

/**
 *
 * @author MarcoHdez
 */
public class randomStrings {
    public randomStrings(){
        
    }
    public String generateRandomString(String characters,int longitud){
        char[] chars = characters.toCharArray(); 
        StringBuilder sb = new StringBuilder(longitud); 
        Random random = new Random(); 
        for (int i = 0; i < longitud; i++) { 
            char c = chars[random.nextInt(chars.length)]; 
            sb.append(c); 
        } 
        return sb.toString(); 
        
    }
    
}
