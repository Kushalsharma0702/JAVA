import java.util.Scanner;
public class Max {
    public static void main(String[] args){
    Scanner lele = new Scanner(System.in);
    int num1 = lele.nextInt();
    int num2 = lele.nextInt();
    int num3 = lele.nextInt();
//     if (num1<num2){
//         System.out.println(num2+"Is the largest num");
//     }else if (num2<num3){
//         System.out.println(num3+"Is the largest number");
//     } else {
//         System.out.println(num1+"Is the largest number");
//     }
//   }
// 
int result = Math.max(num3,Math.max(num1, num2));
System.out.println(result + " krle ab gauranshi se baat jaa ab ");
    lele.close();
    }
}