/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanantoniomarcoadivino;

import java.util.Scanner;

/**
 *
 * @author J M
 */
public class JuanAntonioMarcoAdivino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (Math.random()*(50-10+1)+10);
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce un valor de X entre 10 y 50: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.println("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
    

