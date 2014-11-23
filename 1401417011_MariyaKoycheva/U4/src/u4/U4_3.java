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
public class U4_3 {
    public static void main(String [] args){
        String names[]={"Mariya", "Tanya","dariya","gergina","Darin"};
        endNames (names, "n");
    }
   public static void endNames(String m[], String search){
       System.out.println("Names end with "+search+":");
               for(int i=0;i<m.length;i++)
                if(m[i].toLowerCase().endsWith(search.toLowerCase()))
        System.out.println(m[i]);
}
}
