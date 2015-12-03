/**
 * Created by xushu on 2015/10/15.
 */

public class Sword {
    public static void main(String[] args) {
        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j <= 5 - i || j >= 5 + i) {
                    System.out.print(" ");
                } else if (i <= 3) {
                    System.out.print("*");
                } else if (4 <= i || i <= 14) {
                    if (j < 3 || j > 7) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }

            }
            System.out.println("");
        }
        int k1 = 9, k2 = 0;
        for (int i = 15; i <= 17; i++) {
            for (int a = 0; a <= k2; a++) {
                if (a > 0)
                    System.out.print(" ");
            }
            for (int j = 1; j <= k1; j++) {
                System.out.print("*");
            }
            System.out.println("");
            k1 = k1 - 2;
            k2 = k2 + 1;
        }
        for(int i=18;i<=22;i++){
            for(int j=1;j<=9;j++){
                if(j>=4&&j<=6){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        }
    }