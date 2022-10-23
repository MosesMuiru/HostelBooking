package Account;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CreateAccount {
        Scanner scanner = new Scanner(System.in);
        private String name;
        private String emailAddress;
        private String password;
        private int age;

        List<CreateAccount>one = new ArrayList<>();

        //

//       public CreateAccount(){
//         this.name = name;
//         this.emailAddress = emailAddress;
//          this.password = password;
//         this.age  = age;

//         }
        //the setters
        public String getName(){
                
                return scanner.next();
        }
     
        //emailAddress
        public String Email(){
                this.emailAddress = scanner.next();
                return emailAddress;
        }

        public void setPassword(){
                System.out.println("please input the password >6 char");
                String password = scanner.next();
                if(password.length() <5){
                        System.out.println("the password is simple");
                        setPassword();
                }
                else this.password = password;

        }
        public String getPassword(){
                return password;
        }
        public void setAge(){
                System.out.println("enter your age");
                int age = scanner.nextInt();
                this.age = age;
        }
        public int getAge(){
                return age;
        }

        //creating an arrar of the input done in there
        // public List<CreateAccount>details(){
        //         one.add(CreateAccount.this.getAge());
        // }


        //creating the method containing the methods to be called after creation of the account
        public void detail(){
                System.out.println("input you name");
                getName();

                System.out.println("input your age");
                setAge();
                getAge();

                System.out.println("input your email address");
                Email();

                // password;
                setPassword();
                getPassword();

                
        }

}
