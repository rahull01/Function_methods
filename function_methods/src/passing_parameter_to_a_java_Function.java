public class passing_parameter_to_a_java_Function {
    public static void main(String[] args) {
        parameter(8,7);  // Function is called parameter and it takes two parameter a and b both take a int value.
    }
    static void  parameter(int a,int b) // i provided here two parameter both parameter tyoe is int
    {
        int sum = a + b;
        System.out.println(sum);

    }
}

