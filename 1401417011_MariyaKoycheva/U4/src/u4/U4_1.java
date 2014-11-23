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
public class U4_1 {
    public static void main(String [] args){
        String names[]={"Мария","Ивелина", "Таня", "Ивайла"};
        низовеЗапочващиС(names, "Т");
        
    }
    public static void низовеЗапочващиС(String m[], String search){
        System.out.println("Низове започващи с " + search + ":");
        for(int i=0; i<m.length; i++)
        if(m[i].startsWith(search))
        System.out.println(m[i]);

 

 }
}
