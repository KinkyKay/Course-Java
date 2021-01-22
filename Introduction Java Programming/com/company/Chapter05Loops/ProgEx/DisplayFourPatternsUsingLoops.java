package com.company.Chapter05Loops.ProgEx;


public class DisplayFourPatternsUsingLoops {
    // Use nested loops that display the following patterns in four separate programs:
    /*  Pattern A       Pattern B       Pattern C       Pattern D
        *               * * * * * *             *       * * * * * *
        * *             * * * * *             * *         * * * * *
        * * *           * * * *             * * *           * * * *
        * * * *         * * *             * * * *             * * *
        * * * * *       * *             * * * * *               * *
        * * * * * *     *             * * * * * *                 *
     */
    public static void main(String[] args) {
        System.out.println("\n\nPattern A");
        for (int i = 1; i <= 6; i++) {
            for(int j = 1 ; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n\nPattern B");
        for (int i = 6; i <= 6; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n\nPattern C");
        for (int i = 1; i <= 6; i++)    {
            for (int k = 1; k <= 6 - i; k++){
                System.out.print("  ");
            }
            for (int j = 1; j <=  i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n\nPattern D");
        for (int i = 1; i <= 6; i++) {
            for (int j = i; j > 1; j--){
                System.out.print("  ");
            }
            for (int j = 1; j <= 6 + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
