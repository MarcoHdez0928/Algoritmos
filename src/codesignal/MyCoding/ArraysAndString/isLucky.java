/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesignal.MyCoding.ArraysAndString;

/**
 *
 * @author MarcoHdez
 */
public class isLucky {
    public boolean isLucky(int n){
        int sum=0;
        int count=0;
        int sumValid=0;
        int resp=n;
        do{
            sum+=n%10;
            count++;
            n=n/10;
        }while(n/10>0);
        sum+=n%10;
        count++;
        for(int i=0;i<count/2;i++){
            sumValid+=resp%10;
            sum-=resp%10;
            resp=resp/10;            
        }
        if(count%2==1){
            sum-=resp%10;
        }
        
        return sum==sumValid;
    }
  
}
