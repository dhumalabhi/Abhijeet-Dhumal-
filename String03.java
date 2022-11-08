

// This question is asked by Google. Given a string, return whether or not it uses 
// capitalization correctly. A string correctly uses capitalization if all letters are capitalized, 
// no letters are capitalized, or only the first letter is capitalized.
// Ex: Given the following strings...
// "USA", return true
// "Calvin", return true
// "compUter", return false
// "coding", return true

import java.util.Scanner;
class String03{
    static public boolean capitalization(String word) {
        if(word.length() < 2) return true;
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            for(int i = 2; i < word.length(); i++){
                if(Character.isLowerCase(word.charAt(i))) return false;
            }
        }
        else{
            for(int i = 1; i < word.length(); i++){
                if(Character.isUpperCase(word.charAt(i))) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a String");
        String str=sc.next();
        System.out.println(capitalization(str));
    }
}