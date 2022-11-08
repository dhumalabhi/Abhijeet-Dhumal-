import java.util.Scanner;





// This question is asked by Amazon. Given a string representing the sequence of moves a 
// robot vacuum makes, return whether or not it will return to its original position. The 
// string will only contain L, R, U, and D characters, representing left, right, up, and down 
// respectively.
// Ex: Given the following strings...
// "LR", return true
// "URURD", return false
// "RUULLDRD", return true






import java.util.Scanner;

class String04{
    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'U') y++;
            else if (ch == 'D') y--;
            else if (ch == 'R') x++;
            else if (ch == 'L') x--;
        }
        return x == 0 && y == 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
       
        System.out.println(judgeCircle(str1));
    }
}