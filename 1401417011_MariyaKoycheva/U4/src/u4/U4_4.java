/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u4;

/**
 *
 * @author fmi
 */
public class U4_4 {
    public static void main(String [] args){
        String[] names={"Mariya", "Tanya","dariya","gergina", "RADOST", "Radost"};
        onlyUpper(names);
    }
public static void onlyUpper(String[] arr){
    for(String  i:arr){
        if(i.matches("^[A-Z].*"/*{"+i.length()+"}"*/)){
            System.out.println(i);
        }
    }
}   
                
}

