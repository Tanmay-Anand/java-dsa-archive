package dsa.hashing;

import java.util.Scanner;

public class CharacterHashing {

    public void countChar(char target, char[] arr) {
        // ASCII has 256 possible values
        int[] hash = new int[256];

        // count character frequencies
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        // print frequency of target character
        System.out.println(hash[target]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take array size
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        char[] arr = new char[size];

        // take array elements
        System.out.println("Enter " + size + " characters:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
        }

        // take character to count
        System.out.print("Enter character to count: ");
        char target = sc.next().charAt(0);

        CharacterHashing ch = new CharacterHashing();
        ch.countChar(target, arr);

        sc.close();
    }
}
