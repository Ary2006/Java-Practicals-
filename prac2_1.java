import java.util.*;

class Microsoft
{
    private float productNo;
    private String productName;
    private String activationKey;
    private float priceofProduct;

    public float getProductNo(Scanner sc)
    {
        this.productNo = sc.nextFloat();
        return productNo;
    }

    public String getProductName(Scanner sc)
    {
        sc.nextLine();
        this.productName = sc.nextLine();
        return productName;
    }

    public void setActivationKey(Scanner sc)
    {
        this.activationKey = sc.nextLine();
        getActivationKey();
    }

    public String getActivationKey()
    {
        return activationKey;
    }

    public float getPriceofProduct(Scanner sc)
    {
        this.priceofProduct = sc.nextFloat();
        return priceofProduct;
    }

    public void search(String temp_name , float temp_num)
    {
        if(temp_name.equals(productName) && temp_num == productNo)
        {
            display();
        }
        else
        {
            System.out.println("\nProduct not found");
        }
    }

    public void display()
    {
        System.out.println("\n\nProduct number : " + productNo);
        System.out.println("Product name : " + productName);
        System.out.println("Product price : " + priceofProduct);
        System.out.println("Product activation key : " + activationKey);
    }

};

public class prac2_1 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            Microsoft m = new Microsoft();
            System.out.println("WELCOME TO MICROSOFT STORE ");

            while(true)
            {
                System.out.println("\nEnter 1 to take input of the data ");
                System.out.println("Enter 2 to print the data ");
                System.out.println("Enter 3 to exit ");
                System.out.print("\nEnter your choice : ");
                int a = sc.nextInt();

                switch(a)
                {

                    case 1 ->                     
                    {
                        System.out.print("\n\nEnter the number of times you want to enter the data : ");
                        int p = sc.nextInt();
                        sc.nextLine();

                        for(int i = 0 ; i < p ; i++)
                        {
                            System.out.print("\n\nEnter the product number : ");
                            m.getProductNo(sc);
                            System.out.print("Enter the product name : ");
                            m.getProductName(sc);
                            System.out.print("Enter the product activationkey : ");
                            m.setActivationKey(sc);
                            System.out.print("Enter the product price : ");
                            m.getPriceofProduct(sc);
                            sc.nextLine();
                        }
                    }

                    case 2 ->                     
                    {
                        System.out.print("Enter the product number : ");
                        float temp_num = sc.nextFloat();
                        sc.nextLine();
                        System.out.print("Enter the product name : ");
                        String temp_name = sc.nextLine();
                        m.search(temp_name,temp_num);
                    }

                    case 3 -> 
                    {
                        System.exit(0);
                    }
                }
            }
        }
    }
}
