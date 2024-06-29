
import java.util.Scanner;

class buffer {
    public static void main(String [] args)
    {
        Scanner a=new Scanner(System.in);

       int i=0;
       while (i<5)
       {
            System.out.println("Enter the value:");
            String b = a.nextLine();
            
            StringBuffer sb = new StringBuffer();
            sb.append(b);


            String messager = sb.toString();
            System.out.println(messager);
            System.out.println(i);

continue;

        }

    }
}
