
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variables
    
    }
    
    /*
     * metodo que imprime los multiplos de 5 entre 10 y 95
     */
    public void multiplesOfFive()
    {
        int num = 15;
        while (num < 95)
        {
            System.out.println(num);
            num += 5;
        }
    }
    
    /*
     * metodo que suma los numeros del 0 al 10
     */
    public void sumValues()
    {
        int num = 0;
        int suma = 0;
        while (suma < 11)
        {
            suma += num;
            num = num + 1;
        }
        System.out.println("La suma de los números del 0 al 10 es: " + suma);
    }
    
    /*
     * metodo que recibe dos parámetros enteros `a` y `b` y muestre la suma 
     * de los valores comprendidos entre dichos parámetros
     */
    public void sumValuesInterval(int a, int b)
    {
        int suma = 0;
        int num = a;
        while (num <= b)
        {
            suma += num;
            num = num + 1;
        }
        System.out.println("La suma de los números comprendidios entre " + a + " y " + b + " es: " + suma);
    }
    
    /*
     * Método que nos dice si el numero introducido es primo o no
     */
    public boolean isPrime(int n)
    {
        boolean numPrime = true;
        int div = 2;
        
        while (numPrime && div < n)
        {
            if (n % div == 0)
            {
                numPrime = false;
            }
            else
            {
                div = div + 1;
            }
        }
        return numPrime;
    }
}
