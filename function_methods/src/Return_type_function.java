import java.util.Scanner;

//  FUNCTION IN JAVA CAN ALSO RETURN A VALUE , WHICH IS SPECIFIED BY THE RETURN TYPE OF THE FUNCTION.
public class Return_type_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your first value :  ");

        int e = sc.nextInt();
        System.out.print("enter your second value : ");
        int f = sc.nextInt();
        int sum =add(e,f); // here the call add() and passing two values.
        System.out.println(sum);
    }
    static int add(int a,int b) // The function is called add() and it takes two parameter both is type of int .
    {
        //int sum = a + b;
        return a +b; // And here the returning the sum of both of parameter.
    }
}
