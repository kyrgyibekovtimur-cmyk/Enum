import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
         System.out.println("Write Day");

         String d = scanner.nextLine().toUpperCase();

Days day = Days.valueOf(d);

             switch (day) {
                 case MONDAY:
                     System.out.println("Дуйшөмбү куну жава окуйм");
                    break;
                 case TUESDAY:
                     System.out.println("Шейшемби куну жава окуйм");
                     break;
                 case WEDNESDAY:
                     System.out.println("Шаршемби куну жава окуйм");
                     break;
                 case THURSDAY:
                     System.out.println("Бейшемби куну жава окуйм");
                     break;
                 case FRIDAY:
                     System.out.println("Жума куну жава окуйм");
                     break;
                 case SATURDAY:
                     System.out.println("Ишемби куну эс алам");
                     break;
                 case SUNDAY:
                     System.out.println("Жекшемби куну эс алам");
                     break;
                 }
             }
         }
