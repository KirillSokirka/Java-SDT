import java.util.Scanner;

public class Task16 {
      public static void main(String[] args) {
          int a, b;
          Scanner input = new Scanner(System.in);
          while(true) {
              try {
                  System.out.print("Enter the sides of rectangle: ");
                  a = Integer.parseInt(input.next());
                  b = Integer.parseInt(input.next());
                  if(a <= 0 || b <= 0)
                      throw new IllegalArgumentException();
                  break;
              } catch (NumberFormatException ex) {
                  System.out.println("The entered data must be number");
              } catch (IllegalArgumentException ex) {
                  System.out.println("The entered numbers must be positive");
              }
          }
          input.close();
          System.out.print("The lentgh of diagonal -> " + Math.sqrt(a*a + b*b));
          System.out.print("\nThe Square of rectangle -> " + a*b);
          System.out.print("\nThe Perimeter of rectangle -> " + 2*(a+b));
      }
}
