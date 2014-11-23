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
public class U4_2 {
    public static void main(String [] args){
        String names[]={"Mariya", "Tanya","dariya","gergina"};
        letterInNames (names, "y");
    }
   public static void letterInNames(String m[], String search){
       System.out.println("letterInNames"+search+":");
               for(int i=0;i<m.length;i++)
                if(m[i].toLowerCase().contains(search.toLowerCase()))
        System.out.println(m[i]);
       
   } 
}
