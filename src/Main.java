import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

         Days day = Days.TUESDAY;



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
                     System.out.println("Ишемби куну жава окуйм");
                     break;
                 case SUNDAY:
                     System.out.println("Жекшемби куну жава окуйм");
                     break;
                 }
             }
         }
