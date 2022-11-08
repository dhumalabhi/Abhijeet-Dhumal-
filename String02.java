


// Note: a palindrome is a sequence of characters that reads the same forwards and 
// backwards.
// Ex: Given the following strings...
// "A man, a plan, a canal: Panama.", return true

import java.util.Scanner;
class String02{
    static public boolean isPalindrome(String str){
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length/2;i++){

            if(arr[i]==arr[arr.length-1-i]){
                continue;
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(isPalindrome(str));
        
    }
}