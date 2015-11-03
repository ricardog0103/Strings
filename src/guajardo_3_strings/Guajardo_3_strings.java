/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guajardo_3_strings;

import java.util.Random;
import java.util.Scanner;


public class Guajardo_3_strings {



static int magicnumber;
static int userguess;
static String username;
static Random randy = new Random();
static boolean playagain;
static int Counter = 10;
static Scanner theNumber1 = new Scanner(System.in);
static Scanner theNumber2 = new Scanner(System.in);

    public static void main(String[] args) {
        
      System.out.println("In english press 1");  
       System.out.println("En espanol oprime 2");
        int thereNumber = (1);
        int e = theNumber1.nextInt();
        
        if(e == thereNumber){
            englishVersion();
        }else {
            versionEspanol();
        }
        
        int thereNumbers = (2);
        int s = theNumber2.nextInt();
        
        if(e == thereNumbers){
            versionEspanol();
        }else {
            englishVersion();
        }
        
        
    }
    static void englishVersion() {
        playagain = true;
       magicnumber = randy.nextInt(1000);
        
        System.out.println("Hello lets play whats your name?");
        Scanner userinputname = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        //Two main ones we4 use
        //sc.nextInt();
       // sc.nextLine();
        username = userinputname.nextLine();
        System.out.println("Hello " + username + " lets play,you have 15 tries to match the number by the computer.");
        
        while (Counter > 0){
            playthegame();

        }
        
            
    }
    static void playthegame(){
        Scanner userinputnumbers = new Scanner(System.in);
        System.out.println("Please pika number");
        userguess = userinputnumbers.nextInt();
        if (magicnumber>userguess){
            System.out.println("Too low! try again");
            Counter--;
                    System.out.println("You have " + Counter + " guesses left!");
        }else{
            System.out.println("Too high! try again!");
            Counter--;
                    System.out.println("You have " + Counter + " guesses left!");
        }
        if(userguess == magicnumber){
            System.out.println("You win!");
            Counter = 0;
        }
    }
    static void versionEspanol() {
        playagain = true;
       magicnumber = randy.nextInt(1000);
        
        System.out.println("Hola vamos a jugar un juego cómo te llamas?");
        Scanner userinputname = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        //Two main ones we4 use
        //sc.nextInt();
       // sc.nextLine();
        username = userinputname.nextLine();
        System.out.println("Hola " + username + " bamos a jugar, tienes 15 oportunidades para adivinar el numero adivinado por la computadora.");
        
        while (Counter > 0){
            juegaELJuego();

        }
        
            
    }
    static void juegaELJuego(){
        Scanner userinputnumbers = new Scanner(System.in);
            System.out.println("Porfavor escoge un juago.");
                userguess = userinputnumbers.nextInt();
        if (magicnumber>userguess){
            System.out.println("Muy bajo trata de nuevo");
            Counter--;
                    System.out.println("Te sobran " + Counter + " mas oportunidades!");
        }else{
            System.out.println("Muy alto! Trata de nuevo!");
            Counter--;
                    System.out.println("Te sobran " + Counter + " mas oportunidades!!");
        }
        if(userguess == magicnumber){
            System.out.println("Ganastes porfin puedes dormir!");
            Counter = 0;
        }
    }

    
            
}

