import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
       int a  = 100;
        int b  = 300;
        swap(a,b);
       System.out.println(a+" "+b);
        swap1(100,200);
        int [] sum1 = {1,5,3,4,5};
        arrar_change(sum1);

    }
     static void swap(int a, int b)
     {
         int temp = a;
         a = b;
         b = temp;
     }

                        // this swapping is not posssible due to i'm using a pass by value concept.
// In java primitive data-type(int,float,double,byte) should be considered as  type of pass by value.
// If we talk about non-primitie data-type it means these shoulb be considered as type of pass by reference.

    /* static String swap_non_primitive_data_type(String a)
     {
         a = "Rahul Singh";
         return a;
     } */
                  // if i trying to simple swapping method then should be possible-->
    static  void swap1(int a, int b)
    {
         int temp = a;
         a = b;
         b = temp;
        System.out.println(a+" "+b);
    }

       //--> If we try to change the value of  non-primitive data type(pass by reference) it will change--->
    static void arrar_change(int [] sum1)
    {
         sum1[0] = 100;
        System.out.println(Arrays.toString(sum1));
    }

}