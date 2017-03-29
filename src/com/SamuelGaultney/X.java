package com.SamuelGaultney;

import java.util.Scanner;

/**
 * Created by Samuel on 3/29/2017.
 */
public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please enter your number: ");
        this.x = x.nextInt();
    }

    public void x() {
        for(int x = 1; x < 13; x++) {
            System.out.println(x + " times " + this.x + " equals " + x * this.x );
        }
    }
}
