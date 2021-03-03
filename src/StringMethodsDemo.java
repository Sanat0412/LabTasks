import java.util.Scanner;

/* we are going to implement the String method
task 1: Print the length of input String

task 2: Print all the character of given string
input like: Hello World
output like: H, e, l, l, o, , W, o, r, l, d

task 3: Print all the character of given string in the below format using a method called
void display (String str)


hello world
 */
public class StringMethodsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        // Task 1 : getting the length
        System.out.println("Total no. of character : " + str.length());

        // Task 2
        for (int i = 0;i < str.length();i++) {
            if (i != str.length() - 1)
                System.out.print(str.charAt(i) + ", ");
            else
                System.out.print(str.charAt(i));
        }
    }
}
