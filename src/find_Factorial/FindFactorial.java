package find_Factorial;

public class FindFactorial {
    public static void main(String[] args) {

       FindFactorial.Factorial f = FindFactorial.getFactorial(5);

        System.out.println("Factorial of " + f.getNumber() + " = " + f.getResult());
    }

    public static Factorial getFactorial (int number)
    {int result = 1;
    for (int i=1; i<=number; i++)
    {result = result * i;}
    return new Factorial(number, result);
    }

    public static class Factorial {
        private int number;
        private int result;

        public Factorial (int number, int result)
        {this.number = number;
        this.result = result;}
        public int getNumber()
        {return number;}
        public int getResult()
        {return number;}

    }
}
