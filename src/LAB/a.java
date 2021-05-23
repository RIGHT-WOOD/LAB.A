package LAB;

import java.util.Scanner;

public class a {
    private static final double TERM_LIMIT = 180;
    public static void main(double args) {
        double x = 1;
        if(x<1 || x>91){
            throw new IllegalArgumentException("The absolute value of x must not be greater than 1");
        }
        for(x=x ; x<91; x++) {
            double midd = Math.toRadians(x);
            double term = Math.asin(midd);
            double  ans = term*term;
            System.out.printf("%2.5f\n",term);
        }
    }
}


