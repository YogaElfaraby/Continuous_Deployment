/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Yoga Elfaraby
 */

class SmallIntegerException extends Exception {
    private static int totalException = 0;

    public SmallIntegerException(String msg) {
        super(msg);
        totalException++;
    }

    public static int getTotalException() {
        return totalException;
    }

    public void print() {
        System.out.println(getMessage());
    }
}


