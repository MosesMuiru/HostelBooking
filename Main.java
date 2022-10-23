import Account.CreateAccount;
import Hostels.Hostels;

public class Main {
        public static void main(String [] args)
        {
                
                CreateAccount accountOne = new CreateAccount();

               
                accountOne.detail();
                System.out.println();

                Hostels host = new Hostels();
                host.hostelAvailable();
                
                

            
        }
        
}
