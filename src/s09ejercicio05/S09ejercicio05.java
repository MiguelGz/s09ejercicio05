/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09ejercicio05;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S09ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("INGRESE LOS DIGITOS DE UN ISBN");
        String isbn = input.nextLine();
        
        int d1  = Integer.parseInt(isbn.substring(0, 1));
        int d2  = Integer.parseInt(isbn.substring(1, 2));
        int d3  = Integer.parseInt(isbn.substring(2, 3));
        int d4  = Integer.parseInt(isbn.substring(3, 4));
        int d5  = Integer.parseInt(isbn.substring(4, 5));
        int d6  = Integer.parseInt(isbn.substring(5, 6));
        int d7  = Integer.parseInt(isbn.substring(6, 7));
        int d8  = Integer.parseInt(isbn.substring(7, 8));
        int d9  = Integer.parseInt(isbn.substring(8));

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)% 11;

        System.out.println(" LOS DIGITOS DE UN ISBN ES :" + d10);
    }
    
}
