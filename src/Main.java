import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day, month;
        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day = input.nextInt();

        if (month == 1) {
            if ((day > 0) && (day <= 21)) {
                System.out.println("Oğlak burcusunuz.");
            } else if ((day >= 22) && (day <= 31)) {
                System.out.println("Kova burcusunuz.");
            }
        } else if (month == 2) {
            if ((day > 0) && (day <= 19)) {
                System.out.println("Kova burcusunuz.");
            } else if ((day >= 20) && (day <= 28)) {
                System.out.println("Balık burcusunuz.");
            }
        } else if (month == 3) {
            if ((day > 0) && (day <= 19)) {
                System.out.println("Balık burcusunuz.");
            } else if ((day >= 20) && (day <= 31)) {
                System.out.println("Koç burcusunuz.");
            }
        } else if (month == 4) {
            if ((day > 0) && (day <= 20)) {
                System.out.println("Koç burcusunuz.");
            } else if ((day >= 21) && (day <= 30)) {
                System.out.println("Boğa burcusunuz.");
            }
        }else if (month == 5) {
            if ((day > 0) && (day <= 21)) {
                System.out.println("Boğa burcusunuz.");
            } else if ((day >= 22) && (day <= 31)) {
                System.out.println("İkizler burcusunuz.");
            }
        }else if (month == 6) {
            if ((day > 0) && (day <= 22)) {
                System.out.println("İkizler burcusunuz.");
            } else if ((day >= 23) && (day <= 30)) {
                System.out.println("Yengeç burcusunuz.");
            }
        }else if (month == 7) {
            if ((day > 0) && (day <= 22)) {
                System.out.println("Yengeç burcusunuz.");
            } else if ((day >= 23) && (day <= 31)) {
                System.out.println("Aslan burcusunuz.");
            }
        }else if (month == 8) {
            if ((day > 0) && (day <= 22)) {
                System.out.println("Aslan burcusunuz.");
            } else if ((day >= 23) && (day <= 30)) {
                System.out.println("Başak burcusunuz.");
            }
        }else if (month == 9) {
            if ((day > 0) && (day <= 22)) {
                System.out.println("Başak burcusunuz.");
            } else if ((day >= 23) && (day <= 31)) {
                System.out.println("Terazi burcusunuz.");
            }
        }else if (month == 10) {
            if ((day > 0) && (day <= 22)) {
                System.out.println("Terazi burcusunuz.");
            } else if ((day >= 23) && (day <= 30)) {
                System.out.println("Akrep burcusunuz.");
            }
        }else if (month == 11) {
            if ((day > 0) && (day <= 21)) {
                System.out.println("Akrep burcusunuz.");
            } else if ((day >= 22) && (day <= 31)) {
                System.out.println("Yay burcusunuz.");
            }
        }else if (month == 12) {
            if ((day > 0) && (day <= 21)) {
                System.out.println("Yay burcusunuz.");
            } else if ((day >= 22) && (day <= 30)) {
                System.out.println("Oğlak burcusunuz.");
            }
        }
    }
}