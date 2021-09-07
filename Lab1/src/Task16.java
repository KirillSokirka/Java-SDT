import java.util.Scanner;

public class Task16 {
      public static void Execute() {
          int a, b;
          Scanner input = new Scanner(System.in);
          while(true) {
              try {
                  System.out.print("Введіть сторони прямокутника: ");
                  a = Integer.parseInt(input.next());
                  b = Integer.parseInt(input.next());
                  if(a <= 0 || b <= 0)
                      throw new IllegalArgumentException();
                  break;
              } catch (NumberFormatException ex) {
                  System.out.println("ВВведенні данні мають бути числом");
              } catch (IllegalArgumentException ex) {
                  System.out.println("Введенне число має бути додатнім");
              }
          }
          System.out.print("Довжина дігоналі -> " + Math.sqrt(a*a + b*b));
          System.out.print("\nПлоща прямокутника -> " + a*b);
          System.out.print("\nПериметр прямокутника -> " + 2*(a+b));
      }
}
