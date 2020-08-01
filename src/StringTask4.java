import java.util.Scanner;
/*
task 4: Store all the character of given input_string, in a character array char[] arr,
defining a method called char[]stringToArray(String input_string)
 */

public class StringTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        char []arr = StringToArray(str);
        for (int i = 0;i < arr.length;i++) {
            if (i != str.length() - 1)
                System.out.print(arr[i] + ", ");
            else
                System.out.print(arr[i]);
        }
    }
    public static char[] StringToArray(String a){
        return (a.toCharArray());
    }
}
