import java.util.Scanner;

public class BufferConcatenateBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Builder Object : ");
        StringBuilder s = new StringBuilder(sc.nextLine());
        System.out.println("Enter the Buffer Object : ");
        StringBuffer s1 = new StringBuffer(sc.nextLine());
        System.out.print("Concatenate String : " + (s.append(" ").append(s1)));
    }
}
