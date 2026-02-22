import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //bool kanban that's true (not constant)
        boolean kanban = true;

        //scanner object!
        Scanner sc = new Scanner(System.in);

        //while kanban == true loop
        while (kanban){
            //print MainMenu()
            //1) Exit/Back()
            //2) MakeTicket()
            //3) GetTicket(id)
            //4) ListTickets()
            //5) UpdateTicketContent(id)
            //6) DeleteTicket()
            printMenu();

            //save user input to variable
            int choice = sc.nextInt();

            //switch statement to read user input
            switch (choice){
                case 1:{
                    kanban = false;
                }
                case 2:{
                    //prompt user for ticket name
                    //prompt user for ticket content
                    //display ticket info
                    //any button to return to main menu
                }
                case 3:{
                    //prompt user for ticket id
                    //display ticket info
                    //any button to return to main menu

                }
                case 4:{
                    //calls function to list all tickets
                    //any button to return to the main menu

                }
                case 5:{
                    //prompts user for ticket id
                    //display ticket info
                    //confirm editing
                    //if so, prompts user for content
                    //if not, return to main menu

                }
                case 6:{
                    //prompt user for itcket id
                    //display ticket info
                    //confirms ticket deletion
                    //if not, return to main menu
                    //if so, confirms deletion
                    //any button to return to the main menu

                }
            }
        }





    }

    static void printMenu(){
        System.out.println("""
        Please enter the number for the task you want to complete:
        
        1) Exit / Back
        2) MakeTicket()
        3) GetTicket(id)
        4) ListTickets()
        5) UpdateTicketContent(id)
        6) DeleteTicket()
        """);

    }
}