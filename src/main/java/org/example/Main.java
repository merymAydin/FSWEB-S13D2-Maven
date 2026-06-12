package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int num){
        String a = Integer.toString(num);
        int i;
        if (a.charAt(0) == '-') {
            i = 1;
        } else {
            i = 0;
        }

        int j=a.length()-1;

        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }

        int total = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                total += i;
            }
        }

        return total == num;
    }

    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }

        String[] nums = {"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"};

        String str = String.valueOf(num);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0'; // char → int dönüşüm
            result += nums[digit] + " ";
        }

        return result.trim(); // sondaki boşluğu sil
    }
}
