// Java program
// SDK 15
// Author: Luka Čosić
public class Main {
    public static void main(String[] args) {
        System.out.println(
                "==========================================================" +
                "\nDobrodošli u Fizz-Buzz rješenje zadatka! Autor: Luka Čosić" +
                "\n==========================================================\n" +
                "\nSAŽETAK ZADATKA:\nRješenje generira brojeve od 1 do 100\n" +
                "Program za brojeve djeljive s 3 umjesto znamenke broja ispisati “Fizz”, za brojeve djeljive s 5 “Buzz”, a ako je broj djeljiv s 3 i 5, ispisat će “FizzBuzz”. \n" +
                "Nakon toga trebate zbrojiti sve vrijednosti “Fizz” i “Buzz” brojeva te od njih oduzeti ukupnu vrijednost svih “FizzBuzz” brojeva tako da na kraju ispišete konačan rezultat." +
                "\n\nRJEŠENJE ZADATKA:");
        int notFizzBuzz = 0;
        int fizzBuzz = 0;
        for (int i=1; i<=100; i++){
            if (i%3 == 0 && i%5 == 0){
                System.out.print(", FizzBuzz");
                fizzBuzz += i;
            }
            else if (i%3 == 0){
                System.out.print(", Fizz");
                notFizzBuzz += i;
            }
            else if (i%5 == 0){
                System.out.print(", Buzz");
                notFizzBuzz += i;
            }
            else if (i != 1) System.out.print(", " + i);
            else System.out.print(i); // ovaj slučaj je isključivo za prvi broj.
        }
        fizzBuzz = notFizzBuzz-fizzBuzz; //rezultat
        System.out.println("\nKonačan rezultat: " + fizzBuzz);
    }
}
