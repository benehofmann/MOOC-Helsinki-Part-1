import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
int odd = 0;
int even = 0;
int sum = 0; 
int number;
number = Integer.parseInt(reader.nextLine());
int zähler = 0;
double average;


     while (number >= 0) {
    if (number % 2 == 0) {
        ++even;
        }
    if (number % 2 != 0) {
        ++odd;
        }
    sum = sum + number;
    number = Integer.parseInt(reader.nextLine());
    ++zähler;
    
    } 
 

average = (double)sum / zähler;   // in double eine variable   
System.out.println("Thank you and see you again later!");
System.out.println("The sum is " + sum);
System.out.println("How many numbers " + zähler);
System.out.println("Average " + average);
System.out.println("Even numbers " + even);
System.out.println("Odd numbers " + odd);
}                       
   }

/*

        Scanner reader = new Scanner(System.in);
 
9
  
 
10
         int sum = 0;
 
11
         int numbers = 0;
 
12
         int even = 0;
 
13
         
 
14
         System.out.println("Type numbers:");
 
15
         while (true) {
 
16
             int number = Integer.parseInt(reader.nextLine());
 
17
             if (number == -1) {
 
18
                 break;
 
19
             }
 
20
             
 
21
             sum += number;
 
22
             numbers++;
 
23
             if (number % 2 == 0) {
 
24
                 even++;
 
25
             }
 
26
         }
 
27
  
 
28
         double average = (double) sum / numbers;
 
29
         int odd = numbers - even;
 
30
         System.out.println("Thank you and see you later!");
 
31
         System.out.println("The sum is " + sum);
 
32
         System.out.println("How many numbers: " + numbers);
 
33
         System.out.println("Average: " + average);
 
34
         System.out.println("Even numbers: " + even);
 
35
         System.out.println("Odd numbers: " + odd);
 
36
     }
 
37
 }
 
38
  
 


*/