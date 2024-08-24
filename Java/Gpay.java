import java.sql.*;
import java.util.*;

class Work{

    boolean connections() throws Exception{
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        String url = "jdbc:mysql://localhost:3306/Gpay";
        String user = "root";
        String pass = "";
        Connection con = DriverManager.getConnection(url, user, pass);
        if(con!=null){
            // System.out.println("Success");
            return true;
        }
        else{
            // System.out.println("failed");
            return false;
        }
    }

    boolean signin() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("-----GPAY-----");
        Thread.sleep(2);

        String url = "jdbc:mysql://localhost:3306/Gpay";
        String user = "root";
        String pas  = "";
        Connection con = DriverManager.getConnection(url, user, pas);

        String choice;
        boolean check = false;
        do{
            System.out.println("[1] Sign Up");
            System.out.println("[2] Log IN");
            System.out.println("Are You Exsisting User ?");
            choice = sc.next();

            if(choice.equalsIgnoreCase("Yes")){
                System.out.print("Username :- ");
                String name = sc.next();
                System.out.print("Password :- ");
                int pass = sc.nextInt();

                String Query = "select User_name,Password from user where User_name = '"+name+"';";

                Statement s = con.createStatement();

                ResultSet r = s.executeQuery(Query);
                int cpass=0;
                String cname="";
                while(r.next()){
                    cname = r.getString(1); 
                    cpass = r.getInt(2);
                }
                if(name.equalsIgnoreCase(cname) && pass == cpass){
                    System.out.println("SuccessFully LogedIn\nWELCOME BACK...........");
                    check = true;  
                    break; 
                }
                else{
                    System.out.println("Error");
                    check = false;
                }


            }
            else{
                Thread.sleep(2);
                System.out.println("Entre Your Name :");
                System.out.print("Username :- ");
                String name = sc.next();
                
                int Mobile;
                String lenth;
                do{
                    System.out.println("Entre Your Mobile No :");
                    System.out.print("Mobile No :- ");
                    Mobile = sc.nextInt();
                    lenth = String.valueOf(Mobile);

                }while(lenth.length()!=10);    

                int pass,cpass;
                do{
                    System.out.println("Create Your New Password :");
                    System.out.print("Password :- ");
                    pass = sc.nextInt();
                    System.out.println("Confirm Password :-");
                    cpass = sc.nextInt();
                }while(pass!=cpass);
                if(pass == cpass){
                    Thread.sleep(2);
                    System.out.println("SuccessFully Loged IN");
                }

                String Query = "insert into user(User_name,Mo_no,Password) values(?,?,?)";

                PreparedStatement p = con.prepareStatement(Query);
                p.setString(1, name);
                p.setInt(2,Mobile);
                p.setInt(3, cpass);
                int r = p.executeUpdate();
                
                if(r>0){
                    check = true;
                    break;
                }
                else{
                    check = false;
                }
                
            }

        }while(choice!=null);
        sc.close();
        
        if(check == true){
            return true;
        }
        else{
            return false;
        }
    }

    void hello()throws Exception{
        Scanner sc1 = new Scanner(System.in);
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        String url = "jdbc:mysql://localhost:3306/Gpay";
        String user = "root";
        String pass = "";
        Connection con = DriverManager.getConnection(url, user, pass);

        Statement st = con.createStatement(); 
        // System.out.println("enter user id");
        // sc1.nextLine();
        // int rp = sc1.nextInt();
        String s = "create table g (User_ID int,User_Name varchar(20) constraint a foreign key (User_ID) references User (User_ID))";
        ResultSet r = st.executeQuery(s);

        

    }
    

}


class desktop{
    public static void main(String[] args) throws Exception {
        Work w = new Work();
        boolean connections = w.connections();
        boolean c = false;
        if(connections == true){
            c = w.signin();
        }
        
        // if(c==true){

        // }

        w.hello();
    }
}