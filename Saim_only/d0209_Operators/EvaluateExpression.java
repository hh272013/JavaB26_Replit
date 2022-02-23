package d0209_Operators;

public class EvaluateExpression {
    public static void main(String[] args) {
        int x = 2 + 3 * 2 / 1;
             // 2 +   6   / 1;
             // 2 +   6;
             // 8;
        System.out.println("x = "+x);
        System.out.println("========");
        int y = ( 2 + 3 ) * 2;
                // 5      * 2;
                // 10;
        System.out.println("y = "+y);
        System.out.println("========");
        int w = 78 / 2 * 2 + 3 - 5 % 5;
            //  39     * 2 + 3 - 5 % 5;
            //  78         + 3 - 5 % 5;
            //  78         + 3 -     0;
            //  81
        System.out.println("w = "+w);
        System.out.println("========");
        int i = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2;
        //      8 + 2 + 3 + 5 - 2 - 1- 0 + 2;
        //                 18 - 2 - 1    + 2;
        //                 18 - 2 + 1;
        //                 18 - 1;
        //                 17;
        System.out.println("i = " + i);
        System.out.println("========");
        int a = 8;    // a = 8;
        int b = a--;  // b = 8; a = 7;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("========");
        a = 1; // 1 => 0 => 1 => 0
        b = -a-- + a++ / -a-- * --a;
        //  -1-- + -2++ / -(-1)-- * -3;
        //  -1   + -2   / 1 * 3;
        //  -1   +  -2  / 3;
        //  -1   +  -2/3;
        //  - 5 / 4;
        //  -1
        System.out.println("a = "+ a ); // => -1
        System.out.println("b = "+ b);  // -1
        System.out.println("========");
        int A = 50; // 49 => 49++ => 50-- =>   49++;
        int B =       --A +  A++  +  A--  +    A++;
        //            49  +  49   +  50   +    49;
        //           197
        System.out.println("A = "+A);
        System.out.println("B = "+B);
        System.out.println("========");
        int X = 4; // 4 => 5;
        int Y = X * 4 - X++;
        // 4 * 4 - 4 => 16 - 4 => 12
        System.out.println("X = "+X);
        System.out.println("Y = "+Y);
        System.out.println("========");

        int t = 100; // 101 => 101 => 100 => 101 => 100
        int p = - ++t * -t-- / t++ + --t;
        //   -101 * -101/102 + 102
        //   10201 / 102   + 102
        //   100  + 102
        //   202
        System.out.println("t = "+t);
        System.out.println("p = "+p);
        System.out.println("========");

        int R = 20; // 20 => 19 => 19 => 18
        int W = -R-- + -R++ + --R * R-- % 2;
        //      -20  + -19  +  19 * 19 % 2;
        //      -20  + -19  +  1;
        //      -38;
        System.out.println("R = "+R);
        System.out.println("W = "+W);
        System.out.println("========");

        int M = 300; // 301 => 301 => M=300
        int N = 400; // 400 => N=400
        int U = ++M + N++ - M-- % 2 + --N % 2;
        //      301 + 400 - 301 % 2 + 400 % 2;
        //      301 + 400 -  1  +  0 ;
        //      700;
        System.out.println("M = "+M);
        System.out.println("N = " + N);
        System.out.println("U = " + U);
























    }
}
