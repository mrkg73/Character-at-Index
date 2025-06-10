import java.util.Scanner;
public class Find
{

    public static void main(String[] args)
    {
        System.out.println("Enter the your text please:");
        Scanner sn = new Scanner(System.in);
        String text=sn.nextLine();
        System.out.println("enter the index you want to retrieve:");
        int nm= sn.nextInt();
        System.out.println("char at index" + nm +" is " + text.charAt(nm));


    }

}
