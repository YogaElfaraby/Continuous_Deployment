/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Yoga Elfaraby
 */
public class main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Small Integer Tester");

        while (true) {
            System.out.print("Masukkan integer: ");
            String input = scanner.nextLine();

            if (input.equals("-99")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                if (num < 0) {
                    throw new SmallIntegerException("nilai lebih kecil dari 0");
                } else if (num > 9) {
                    throw new SmallIntegerException("nilai lebih besar dari 9");
                } else {
                    System.out.println("nilai benar");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input harus integer");
            } catch (SmallIntegerException e) {
                e.print();
                System.out.println("Jumlah Small Integer Exception: " + SmallIntegerException.getTotalException());
            }
        }
    }
    
}
