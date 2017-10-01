import java.util.Scanner;
class Telephone_Directory
{
    static Scanner sc = new Scanner(System.in);
    public static void main()
    {
        //   Accepting the Data
        System.out.println("Enter the NUMBER of records");
        int a = sc.nextInt();
        String x[] = acceptName(a);
        String y[] = acceptNumber(a);

        //   Program Starts Here
        System.out.println("Telephone Directory");
        System.out.println("1. Add an Entry");
        System.out.println("2. Search For an Entry");
        System.out.println("3. List of all the entries");
        System.out.println("4. Exit the program");

        boolean quit = false;
        while(!quit)
        {
            int len = x.length - 1;

            // Extra Array for storing new variables

            String ea[] = new String[20];   String eb[] = new String[20];
            for(int i = 0;i<=len;i++)
            {
                ea[i] = x[i];
                eb[i] = y[i];
            }

            System.out.println("Enter your choice\n\n\n");  
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:

                System.out.println("Enter Name");
                String a1 = sc.next();
                System.out.println("Enter Number");
                String b1 = sc.next();
                len++;

                ea[len] = a1;
                eb[len] = b1;

                System.out.println("Entry Added");
                break;

                case 2:
                System.out.println("Enter the entry you want to search");
                String search = sc.next();
                for(int i = 0;i<=len;i++)
                {
                    if(x[i] == search || y[i] == search)
                    {
                        System.out.println("Entry found at index"+ i);
                    }
                }

                break;
                case 3:

                printArray(ea);
                printArray(eb);

                break;
                case 4: 

                quit = true;

                break;
                default:  System.out.println("Invalid choice");
            }
        }

    }

    public static String[] acceptName(int a)
    {
        String Names[] = new String[a];
        for(int i = 0;i<a;i++)
        {
            System.out.println("Enter Name for Record No."+ (i+1));
            Names[i] = sc.next();
        }
        return Names;
    }

    public static String[] acceptNumber(int a)
    {   String Number[] = new String[a];
        for(int i = 0;i<a;i++)
        {
            System.out.println("Enter Number for Record No."+ (i+1));
            Number[i] = sc.next();
        }
        return Number;
    }

    public static void printArray(String a[])
    {
        for(String a1 : a)
        {
            if(a1 != null)
           
           
            
            System.out.println(a1);

        }
    }

}
