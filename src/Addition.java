import java.util.Scanner;

public class Addition {

    private static int a ;
    private static int b ;


    public static void main (String[] args){

        int total;
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Please, code a number : ");
            a = scan.nextInt();
            System.out.println("please, code another number :");
            b = scan.nextInt();

            if(a>1000 || a<1){
                System.out.println(" you chose " + a + " \nplease chose the first number between 1 and 1000");
                a = scan.nextInt();
            }

            if(b>1000 || b<1){
                System.out.println(" you chose " + b + " \nplease chose the first number between 1 and 1000");
                b = scan.nextInt();
            }

            total = sum(a,b);
            System.out.println("la somme vaut : " + total + "\n");
        }

    }

    public static int sum(Integer a, Integer b){

       return a+b;

    }
}




