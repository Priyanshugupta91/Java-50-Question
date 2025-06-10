public class AmericanFlag {
    public static void main(String[] args) {
        int Totalline = 15;
        for (int i = 0; i < Totalline; i++) {
            if(i<9){
                if(i%2==0)
                    System.out.print("* * * * * ");
                else
                    System.out.print("* * * * * * ");
                
                System.out.println("========================");
                }
                else
                    System.out.println("==================================");

            }
            
        }
    }
    

