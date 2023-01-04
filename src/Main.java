
    import java.util.Scanner;  // Import the Scanner class
    import java.util.Random;
    public class Main {
         static void switchName(String First1,String Last1){
            String Temp = First1;
            First1 = Last1;
            Last1 = Temp;
            // comment added to check Git sync  HELLO  worls
            System.out.println("name in reverse is " + First1 + " " + Last1);
        }
        static void replaceLeadLetterWithNext(String First1,String Last1){
            First1=randomChar()+First1.substring(1);
            Last1 =randomChar()+Last1.substring(1);
            System.out.println("Your new Name is " + First1 + " " + Last1);
        }
        private static char randomChar() {
            Random r = new Random();
            return (char)(r.nextInt(26) + 'A');
        }

    public static void main(String[] args) {

        System.out.println("Enter First Name: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String First = reader.next();
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter Last Name: ");
        String Last = reader2.next();
        Names person_name;
        person_name = new Names(First, Last);
        System.out.println("first letter is A" + " is " + person_name.CheckFirstisA());
        System.out.println("name is " + First + " " + Last);
        switchName(First, Last);
        replaceLeadLetterWithNext(First,Last);
    }

}