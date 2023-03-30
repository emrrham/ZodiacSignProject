import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;

        System.out.println("Please enter the Month of your birth : (example = 12,3)");
        month = input.nextInt();
        if (month >= 1 && month <= 12){

        }else System.out.println("Wrong Number ");

        System.out.println("Please enter the day of your birth : ");
        day = input.nextInt();
        if (day >= 1 && day <=31){

        }else System.out.println("Wrong Number");


        if (month == 1) {
            if ((day <= 21)) {
                System.out.println("Capricorn");
            } else if ( (day <= 31)) {
                System.out.println("Aries");
            }
        }if (month == 2) {
            if ((day >= 1) && day <= 18) {
                System.out.println("Aquarius");
            } else if ( (day <=29 )) {
                System.out.println("Pisces");
            }
        }if (month == 3) {
            if (  day <= 20) {
                System.out.println("Pisces");
            } else if  ((day <= 31)) {
                System.out.println("Aries");
            }
        }if (month == 4) {
            if ( day <= 19) {
                System.out.println("Aries");
            } else if ( (day <= 30)) {
                System.out.println("Taurus");
            }
        }if (month == 5) {
            if ( day <= 20) {
                System.out.println("Taurus");
            } else if (  (day <= 31)) {
                System.out.println("Gemini");
            }
        }if (month == 6) {
            if ( day <= 21) {
                System.out.println("Gemini");
            } else if ( (day <= 31)) {
                System.out.println("Cancer");
            }
        }if (month == 7) {
            if (  day <= 21) {
                System.out.println("Cancer");
            } else if ( (day <= 31)) {
                System.out.println("Leo");
            }
        }if (month == 8) {
            if (  day <= 21) {
                System.out.println("Leo");
            } else if ( (day <= 31)) {
                System.out.println("Virgo");
            }
        }if (month == 9) {
            if (  day <= 21) {
                System.out.println("Virgo");
            } else if ( (day <= 31)) {
                System.out.println("Libra");
            }
        }if (month == 10) {
            if ( day <= 21) {
                System.out.println("Libra ");
            } else if (  (day <= 31)) {
                System.out.println("Scorpio");
            }
        }if (month == 11) {
            if (  day <= 21) {
                System.out.println("Scorpio");
            } else if ( (day <= 31)) {
                System.out.println("Sagittarius");
            }
        }if (month == 12) {
            if ( day <= 21) {
                System.out.println("Sagittarius");
            } else if ( (day <= 31)) {
                System.out.println("Capricorn");
            }
        }
    }
}
