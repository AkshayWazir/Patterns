import java.util.Scanner;

public class blabla {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, rStart, rEnd, S, temp = 1;
        a = scn.nextInt();
        rStart = a - 1;
        rEnd = a - 1;
        for (int i = 0; i < a; i++) {
            S = temp;
            for (int j = 0; j < a * 2 + 1; j++) {

                if (i <= (a / 2)) {
                    if (j >= rStart && j <= rEnd) {
                        if (j < (a / 2) * 2) {
                            System.out.print(" " + S + " ");
                            S += 1;
                        } else {
                            System.out.print(" " + S + " ");
                            S -= 1;
                        }

                    } else {
                        System.out.print("   ");
                    }
                } else {
                    if (j >= rStart && j <= rEnd) {
                        if (j < (a / 2) * 2) {
                            System.out.print(" " + S + " ");
                            S += 1;
                        } else {
                            System.out.print(" " + S + " ");
                            S -= 1;
                        }
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            if (i < a / 2) {
                rStart -= 1;
                rEnd += 1;
                temp += 1;
                System.out.println();
            } else {
                rStart += 1;
                rEnd -= 1;
                temp -= 1;
                System.out.println();
            }
        }
    }
}
