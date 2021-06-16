package palindrome;

public class Palindrome {

    public static void main(String[] args) {
        int r, sum = 0, temp;
        int n = 565;// Check this no is palindrome or not  

        temp = n;
        while (n > 0) {
            r = n % 10;  //getting remainder  
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("This is palindrome number ");
        } else {
            System.out.println("This is not palindrome");
        }
    }

}
