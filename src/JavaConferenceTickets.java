import java.util.Scanner;
public class JavaConferenceTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte ticketsSold = 0;
        final int no_ofparticipants = 100;
        while (ticketsSold <= no_ofparticipants){
            System.out.println("Total Tickets Left : " + (no_ofparticipants - ticketsSold));
            System.out.print("Enter your name : ");
            String name = sc.nextLine();
            sellTicket(name);
            ticketsSold++;

            if (ticketsSold == no_ofparticipants) {
                System.out.println("Sorry, the Tickets are sold-out!");
                break;
            }
        }
    }
    public static void sellTicket(String name){
        String participantName = name;
    }
}
