package Hostels;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//here list all the hostels available


        //show the list of the hostel so a sthe person can choice from
       
public class Hostels {
        Scanner scanner = new Scanner(System.in);

       
        public void hostelAvailable(){
               List<String>hostelAreas = new ArrayList<>();

               System.out.println("1. Town\n 2.Milimani \n3.Lurambi \n4.Teazone \n5.exit  ");

               

                System.out.println("enter the area you want to live");
               int choice = scanner.nextInt();
             List<String>hostels = new ArrayList<>();

               switch (choice) {
                case 1:
                   System.out.println(" 1.Juja ap. 2.Lama ap 3.Kimbo");
                    //show the hostel available
                    

                        booking();

                       break;

               case 2:
              
              System.out.println("1.Luinsuit hostels 2. apache hostels 3. hostelone");
            
               
               booking();
               break;

               case 3:
               System.out.println("1.Lurambi one star 2 africa five star 3 welcome");
               
               booking();
               break;

               case 4:
               System.out.println("1.sichirai one love 2. all in one 3. sich main hostel");
               booking();
               break;
               case 5:
               break;
                default:
                        break;
               }
        }

               //methods that loops one the list of hostel available

        
               //function that allows one to book a hostel
                void booking(){
                // System.out.println("enter the choice of home you want");
                int choice = scanner.nextInt();
                int rent = 0;
                switch(choice)
                {
                        case 1:
                        rent = 2000;
                        System.out.println("rent = "+rent);
                        break;

                        case 2:
                        rent = 3000;
                        System.out.println("rent = "+rent);
                        break;

                        case 3:
                        rent = 3000;
                        System.out.println("rent = " + rent);
                        break;

                        case 4:
                        rent = 5000;
                        System.out.println("remt = " + rent);
                        break;

                }

               
                
        }

        //method that calles all of them
      
}
