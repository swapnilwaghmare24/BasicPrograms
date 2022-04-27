package Com.Bridgelabz;

public class LeapYear
{
    public static void main(String[] args)
    {

        System.out.println("Leap years between 2000 to 2050");
        for(int i=2000;i<=2050;i++)
        {
            if(i%400==0||i%4==0 &&i %100!=0)
            {
                System.out.println(i+" is Leap year");
            }
        }
    }
}

