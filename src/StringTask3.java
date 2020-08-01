import java.util.Scanner;

/*task 3: Print all the character of given string in the below format using a method called
void display (String str)
input like: Hello World
output like: H, e, l, l, o, , W, o, r, l, d
 */
public class StringTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        display(str);
    }
    public static void display(String a){
        for (int i = 0;i < a.length();i++) {
            if (i != a.length() - 1)
                System.out.print(a.charAt(i) + ", ");
            else
                System.out.print(a.charAt(i));
        }
    }
}
