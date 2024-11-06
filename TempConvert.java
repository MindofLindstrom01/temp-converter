import java.util.Scanner;

public class TempConvert {
    static Scanner scan = new Scanner(System.in);
    public static TempConvert m = new TempConvert();


public static void main (String[] args){
    convtemp();
    

}


static String convtemp()

    {
    int option;
    System.out.println("Please choose which temperature scale to convert to");
    System.out.println("0. Fahrenheit");
    System.out.println("1. Celsius");
    option = scan.nextInt();
    

    switch(option) {

        case 0:
            System.out.println("Converting to Fahrenheit");
            System.out.println("Please enter the temperature you wish to convert");
            int temp = scan.nextInt();
            Fahrenheit(temp);
            break;
        case 1:
            System.out.println("Converting to Celsius");
            System.out.println("Please enter the temperature you wish to convert");
            int temp2 = scan.nextInt();
            Celsius(temp2);
            break;






    }
        return "";
    }

public static void Celsius (int a)

    {
        int temp = (a-32)*5/9;
        System.out.println("Your conversion is: "+ temp + " degrees Celsius");
    }

public static void Fahrenheit (int b)

    {
        int temp = b * 9/5 + 32;
        System.out.println("Your conversion is: "+ temp + " degrees Fahrenheit");
    }


}