import java.util.*;
import java.sql.*;
import java.io.*;

class op{
    public static void main(String[] args) throws Exception {
        String driverName = "com.mysql.cj.jdbc.Driver";
        Class.forName(driverName);
        String dburl="jdbc:mysql://localhost:3306/gpay";
        String dbid="root";
        String dbpass="";
        Connection con = DriverManager.getConnection(dburl,dbid,dbpass);
        Statement st = con.createStatement();

        Scanner sc = new Scanner(System.in);

        int ch = 0;
        do{
            System.out.println("---Gpay---");
            System.out.println("[1] Sign Up");
            System.out.println("[2] Log IN");
            System.out.println("[3] change pin");
            System.out.println("[4] Exit.");
            System.out.println();
            System.out.print("Entre Your choice :- ");
            ch = sc.nextInt();
            long Mobile;
            String lenth;
            switch(ch){
                case 1 : {
                    System.out.print("Mobile Number :- ");
                    Mobile = sc.nextLong();
                    System.out.print("Password :- ");
                    int pass = sc.nextInt();

                    String Query = "select Mo_No,Password from user where Mo_no = " + Mobile + ";";

                    Statement s = con.createStatement();

                    ResultSet r = s.executeQuery(Query);
                    int cpass = 0;
                    long cmo = 0;
                    while(r.next()){
                        cmo = r.getLong("Mo_No"); 
                        cpass = r.getInt(2);
                    }
                    if(Mobile == cmo && pass == cpass){
                        System.out.println("SuccessFully Loged In\nWELCOME BACK...........");  
                        
                            System.out.println();
                            int se = 0;
                            int pay = 0;
                            int pin = 0;
                            String sql;
                            int c_pas = 0;
                            String a_no = "";
                            do{
                                System.out.println("[1]. Transfer Money By UPI ID");
                                System.out.println("[2]. Transfer Money To Phone Number");
                                System.out.println("[3]. Bank Transfer");
                                System.out.println("[4]. Pay Bills");
                                System.out.println("[5]  Exit");
                                se = sc.nextInt();
                                switch(se){
                                    case 1 : {
                                        System.out.println("Entre UPI ID");
                                        String upi = sc.next();
                                        do{
                                            System.out.println("Entre Amount to Pay");
                                            pay = sc.nextInt();
                                            System.out.println("Pin");
                                            pin = sc.nextInt();

                                            sql = "Select Pass,Acc_No from user_bank_details where Mo_no = " + Mobile + ";";
                                            ResultSet rs = st.executeQuery(sql);

                                            while(rs.next()){
                                                c_pas = rs.getInt("Pass");
                                                a_no = rs.getString("Acc_No");
                                            }

                                            if(pin == c_pas){
                                                System.out.println("SucceFully Transfered");
                                                System.out.println();
                                                System.out.println("Rs." + pay);
                                                System.out.println("From :- " + a_no);
                                                System.out.println("To :- " + upi);

                                                BufferedWriter bw = new BufferedWriter(new FileWriter(Mobile + ".txt", true));
                                                bw.newLine();                                                
                                                bw.write("Rs." + pay);
                                                bw.newLine();
                                                bw.write("From :- " + a_no);
                                                bw.newLine();
                                                bw.write("To :-  " + upi);
                                                bw.newLine();
                                                bw.write("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                                                bw.close();
                                            }
                                        }while(pin != c_pas);
                                        break;
                                    }

                                    case 2 : {
                                        String lent;
                                        long M = 0;
                                        do{
                                            System.out.print("Entre Mobile No :");
                                            M = sc.nextLong();
                                            lent = String.valueOf(M);

                                        }while(lent.length()!=10);

                                       do{
                                            System.out.println("Entre Amount to Pay");
                                            pay = sc.nextInt();
                                            System.out.println("Pin");
                                            pin = sc.nextInt();

                                            sql = "Select Pass,Acc_No from user_bank_details where Mo_no = " + Mobile + ";";
                                            ResultSet rs = st.executeQuery(sql);

                                            while(rs.next()){
                                                c_pas = rs.getInt("Pass");
                                                a_no = rs.getString("Acc_No");
                                            }

                                            if(pin == c_pas){
                                                System.out.println("SucceFully Transfered");
                                                System.out.println();
                                                System.out.println("Rs." + pay);
                                                System.out.println("From :- " + a_no);
                                                System.out.println("To :- " + M);

                                                BufferedWriter bw = new BufferedWriter(new FileWriter(Mobile + ".txt", true));
                                                bw.newLine();
                                                bw.write("Rs." + pay);
                                                bw.newLine();
                                                bw.write("From :- " + a_no);
                                                bw.newLine();
                                                bw.write("To :-  " + M);
                                                bw.newLine();
                                                bw.write("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                                                bw.close();
                                            }
                                        }while(pin != c_pas);
                                        break;
                                    }

                                    case 3 : {
                                        System.out.println("Entre Bank Account No.");
                                        long bac = sc.nextLong();
                                        System.out.println("Entre IFSC Code :- ");
                                        String ifsc = sc.next();
                                        System.out.println("Entre Account Holder Name :- ");
                                        String holder = sc.next();
                                        System.out.println();

                                        do{
                                            System.out.println("Entre Amount to Pay");
                                            pay = sc.nextInt();
                                            System.out.println("Pin");
                                            pin = sc.nextInt();

                                            sql = "Select Pass,Acc_No from user_bank_details where Mo_no = " + Mobile + ";";
                                            ResultSet rs = st.executeQuery(sql);

                                            while(rs.next()){
                                                c_pas = rs.getInt("Pass");
                                                a_no = rs.getString("Acc_No");
                                            }

                                            if(pin == c_pas){
                                                System.out.println("SucceFully Transfered");
                                                System.out.println();
                                                System.out.println("Rs." + pay);
                                                System.out.println("From :- " + a_no);
                                                System.out.println("To :- " + bac);

                                                
                                                BufferedWriter bw = new BufferedWriter(new FileWriter(Mobile + ".txt", true));
                                                bw.newLine();                                                
                                                bw.write("Rs." + pay);
                                                bw.newLine();
                                                bw.write("From :- " + a_no);
                                                bw.newLine();
                                                bw.write("To :-  " + bac);
                                                bw.newLine();
                                                bw.write("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                                                bw.close();
                                            }
                                        }while(pin != c_pas);
                                        break;
                                    }

                                    case 4 : {

                                        int dum = 0;
                                        do{
                                            System.out.println("[1]. Mobile Recharge");
                                            System.out.println("[2]. Electricity Bill");
                                            System.out.println("[3]. Piped Gas Bill");
                                            System.out.println("[4]. Exit");
                                            System.out.println();
                                            dum = sc.nextInt();

                                            switch(dum){
                                                case 1 : {
                                                    String len;
                                                    long Mo = 0;
                                                    do{
                                                        
                                                        System.out.print("Entre Mobile No :");
                                                        Mo = sc.nextLong();
                                                        len = String.valueOf(Mo);

                                                    }while(len.length()!=10);

                                                    System.out.println("Entre SIM card Company :-");
                                                    String comp = sc.next(); 

                                                    do{
                                                        System.out.println("Entre Amount to Pay");
                                                        pay = sc.nextInt();
                                                        System.out.println("Pin");
                                                        pin = sc.nextInt();

                                                        sql = "Select Pass,Acc_No from user_bank_details where Mo_no = " + Mobile + ";";
                                                        ResultSet rs = st.executeQuery(sql);

                                                        while(rs.next()){
                                                            c_pas = rs.getInt("Pass");
                                                            a_no = rs.getString("Acc_No");
                                                        }

                                                        if(pin == c_pas){
                                                            System.out.println("SucceFully Transfered");
                                                            System.out.println();
                                                            System.out.println("Rs." + pay);
                                                            System.out.println("From :- " + a_no);
                                                            System.out.println("To :- " + comp + " Telecom Company");


                                                            BufferedWriter bw = new BufferedWriter(new FileWriter(Mobile + ".txt", true));
                                                            bw.newLine();                                                
                                                            bw.write("Rs." + pay);
                                                            bw.newLine();
                                                            bw.write("From :- " + a_no);
                                                            bw.newLine();
                                                            bw.write("To :-  " + comp + " Telecom Company");
                                                            bw.newLine();
                                                            bw.write("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                                                            bw.close();
                                                        }
                                                    }while(pin != c_pas);
                                                    break;
                                                }

                                                case 2 : {
                                                    System.out.println("Entre Customer No.");
                                                    long c = sc.nextLong();

                                                    System.out.println("Entre State :- ");
                                                    String stat = sc.next();
                                                    
                                                    do{
                                                        System.out.println("Entre Amount to Pay");
                                                        pay = sc.nextInt();
                                                        System.out.println("Pin");
                                                        pin = sc.nextInt();

                                                        sql = "Select Pass,Acc_No from user_bank_details where Mo_no = " + Mobile + ";";
                                                        ResultSet rs = st.executeQuery(sql);

                                                        while(rs.next()){
                                                            c_pas = rs.getInt("Pass");
                                                            a_no = rs.getString("Acc_No");
                                                        }

                                                        if(pin == c_pas){
                                                            System.out.println("SucceFully Transfered");
                                                            System.out.println();
                                                            System.out.println("Rs." + pay);
                                                            System.out.println("From :- " + a_no);
                                                            System.out.println("To :- " + stat + " vij Company LTD.");

                                                            BufferedWriter bw = new BufferedWriter(new FileWriter(Mobile + ".txt", true));
                                                            bw.newLine();                                                
                                                            bw.write("Rs." + pay);
                                                            bw.newLine();
                                                            bw.write("From :- " + a_no);
                                                            bw.newLine();
                                                            bw.write("To :-  " + stat + " vij Company LTD.");
                                                            bw.newLine();
                                                            bw.write("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                                                            bw.close();
                                                        }
                                                    }while(pin != c_pas);
                                                    break;
                                                }

                                                case 3 : {
                                                    System.out.println("Entre Customer No.");
                                                    long g = sc.nextLong();

                                                    System.out.println("Entre State :- ");
                                                    String stat = sc.next();
                                                    
                                                    do{
                                                        System.out.println("Entre Amount to Pay");
                                                        pay = sc.nextInt();
                                                        System.out.println("Pin");
                                                        pin = sc.nextInt();

                                                        sql = "Select Pass,Acc_No from user_bank_details where Mo_no = " + Mobile + ";";
                                                        ResultSet rs = st.executeQuery(sql);

                                                        while(rs.next()){
                                                            c_pas = rs.getInt("Pass");
                                                            a_no = rs.getString("Acc_No");
                                                        }

                                                        if(pin == c_pas){
                                                            System.out.println("SucceFully Transfered");
                                                            System.out.println();
                                                            System.out.println("Rs." + pay);
                                                            System.out.println("From :- " + a_no);
                                                            System.out.println("To :- " + stat + " Online Gas Company LTD.");

                                                            BufferedWriter bw = new BufferedWriter(new FileWriter(Mobile + ".txt", true));
                                                            bw.newLine();                                                
                                                            bw.write("Rs." + pay);
                                                            bw.newLine();
                                                            bw.write("From :- " + a_no);
                                                            bw.newLine();
                                                            bw.write("To :-  " + stat + " Online Gas Company LTD.");
                                                            bw.newLine();
                                                            bw.write("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                                                            bw.close();
                                                        }
                                                    }while(pin != c_pas);
                                                    break;
                                                }
                                                default : {
                                                    break;
                                                }
                                            }
                                        }while(dum!=4);
                                    break;
                                    }
                                     default :{
                                            break;
                                    }
                                }
                                
                            }while(se!=5);


                    }
                    break;
                }

                case 2 : {
                    System.out.println("Entre Your Name :");
                    System.out.print("Username :- ");
                    String name = sc.next();
                    
                    do{
                        System.out.println("Entre Your Mobile No :");
                        System.out.print("Mobile No :- ");
                        Mobile = sc.nextLong();
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
                    p.setLong(2,Mobile);
                    p.setInt(3, cpass);
                    int r = p.executeUpdate();

                    if(r>0){
                        System.out.println("Entre Your Bank Name :- ");
                        String b_name = sc.next();
                        Random re = new Random();
                        int acc1 = re.nextInt(1001, 10000);
                        int acc2 = re.nextInt(1001, 10000);
                        int acc_c;
                        System.out.println("Account 1 :- " + "***" + acc1);
                        System.out.println("Account 2 :- " + "***" + acc2);
                        System.out.print("This bank has two accounts on your mobile number.\nSelect only one account :- ");
                        acc_c = sc.nextInt();
                        
                        System.out.println("Entre Bank Account Type :- ");
                        String b_type = sc.next();
                        System.out.println("Entre Bank Account Password :- ");
                        int Password = sc.nextInt();

                        String in = "insert into user_bank_details(Mo_no, Bank_name,Acc_No, Acc_type,Pass) values(?,?,?,?,?);";
                        PreparedStatement pst = con.prepareStatement(in);
                        pst.setLong(1,Mobile);
                        pst.setString(2, b_name);
                        pst.setString(4,b_type);
                        pst.setInt(5, Password);
                        if(acc_c == 1){
                            pst.setString(3, ("***" + acc1));
                        }
                        else if(acc_c == 2){
                            pst.setString(3, ("***" + acc2));
                        }
                        else{
                            pst.setString(3, ("***" + acc1));

                        }

                        int a = pst.executeUpdate();

                        if(a>0){
                            System.out.println();
                            System.out.println("Data added SuccessFully");
                            System.out.println();
                            int se = 0;
                            int pay = 0;
                            int pin = 0;
                            String sql;
                            int c_pas = 0;
                            String a_no = "";
                            do{
                                System.out.println("[1]. Transfer Money By UPI ID");
                                System.out.println("[2]. Transfer Money To Phone Number");
                                System.out.println("[3]. Bank Transfer");
                                System.out.println("[4]. Pay Bills");
                                System.out.println("[5]  Exit");
                                se = sc.nextInt();
                                switch(se){
                                    case 1 : {
                                        System.out.println("Entre UPI ID");
                                        String upi = sc.next();
                                        do{
                                            System.out.println("Entre Amount to Pay");
                                            pay = sc.nextInt();
                                            System.out.println("Pin");
                                            pin = sc.nextInt();

                                            sql = "Select Pass,Acc_No from user_bank_details where Mo_no = " + Mobile + ";";
                                            ResultSet rs = st.executeQuery(sql);

                                            while(rs.next()){
                                                c_pas = rs.getInt("Pass");
                                                a_no = rs.getString("Acc_No");
                                            }

                                            if(pin == c_pas){
                                                System.out.println("SucceFully Transfered");
                                                System.out.println();
                                                System.out.println("Rs." + pay);
                                                System.out.println("From :- " + a_no);
                                                System.out.println("To :- " + upi);

                                                BufferedWriter bw = new BufferedWriter(new FileWriter(Mobile + ".txt", true));
                                                bw.newLine();
                                                bw.write("Rs." + pay);
                                                bw.newLine();
                                                bw.write("From :- " + a_no);
                                                bw.newLine();
                                                bw.write("To :- " + upi);
                                                bw.newLine();
                                                bw.write("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                                                bw.close();
                                            }
                                        }while(pin != c_pas);
                                        break;
                                    }

                                    case 2 : {
                                        String lent;
                                        long M = 0;
                                        do{
                                            System.out.print("Entre Mobile No :");
                                            M = sc.nextLong();
                                            lent = String.valueOf(M);

                                        }while(lent.length()!=10);

                                       do{
                                            System.out.println("Entre Amount to Pay");
                                            pay = sc.nextInt();
                                            System.out.println("Pin");
                                            pin = sc.nextInt();

                                            sql = "Select Pass,Acc_No from user_bank_details where Mo_no = " + Mobile + ";";
                                            ResultSet rs = st.executeQuery(sql);

                                            while(rs.next()){
                                                c_pas = rs.getInt("Pass");
                                                a_no = rs.getString("Acc_No");
                                            }

                                            if(pin == c_pas){
                                                System.out.println("SucceFully Transfered");
                                                System.out.println();
                                                System.out.println("Rs." + pay);
                                                System.out.println("From :- " + a_no);
                                                System.out.println("To :- " + M);

                                                BufferedWriter bw = new BufferedWriter(new FileWriter(Mobile + ".txt", true));
                                                bw.newLine();                                                
                                                bw.write("Rs." + pay);
                                                bw.newLine();
                                                bw.write("From :- " + a_no);
                                                bw.newLine();
                                                bw.write("To :- " + M);
                                                bw.newLine();
                                                bw.write("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                                                bw.close();
                                            }
                                        }while(pin != c_pas);
                                        break;
                                    }

                                    case 3 : {
                                        System.out.println("Entre Bank Account No.");
                                        long bac = sc.nextLong();
                                        System.out.println("Entre IFSC Code :- ");
                                        String ifsc = sc.next();
                                        System.out.println("Entre Account Holder Name :- ");
                                        String holder = sc.next();
                                        System.out.println();

                                        do{
                                            System.out.println("Entre Amount to Pay");
                                            pay = sc.nextInt();
                                            System.out.println("Pin");
                                            pin = sc.nextInt();

                                            sql = "Select Pass,Acc_No from user_bank_details where Mo_no = " + Mobile + ";";
                                            ResultSet rs = st.executeQuery(sql);

                                            while(rs.next()){
                                                c_pas = rs.getInt("Pass");
                                                a_no = rs.getString("Acc_No");
                                            }

                                            if(pin == c_pas){
                                                System.out.println("SucceFully Transfered");
                                                System.out.println();
                                                System.out.println("Rs." + pay);
                                                System.out.println("From :- " + a_no);
                                                System.out.println("To :- " + bac);

                                                BufferedWriter bw = new BufferedWriter(new FileWriter(Mobile + ".txt", true));
                                                bw.newLine();                                                
                                                bw.write("Rs." + pay);
                                                bw.newLine();
                                                bw.write("From :- " + a_no);
                                                bw.newLine();
                                                bw.write("To :- " + bac);
                                                bw.newLine();
                                                bw.write("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                                                bw.close();
                                            }
                                        }while(pin != c_pas);
                                        break;
                                    }

                                    case 4 : {

                                        int dum = 0;
                                        do{
                                            System.out.println("[1]. Mobile Recharge");
                                            System.out.println("[2]. Electricity Bill");
                                            System.out.println("[3]. Piped Gas Bill");
                                            System.out.println("[4]. Exit");
                                            System.out.println();
                                            dum = sc.nextInt();

                                            switch(dum){
                                                case 1 : {
                                                    String len;
                                                    long Mo = 0;
                                                    do{
                                                        
                                                        System.out.print("Entre Mobile No :");
                                                        Mo = sc.nextLong();
                                                        len = String.valueOf(Mo);

                                                    }while(len.length()!=10);

                                                    System.out.println("Entre SIM card Company :-");
                                                    String comp = sc.next(); 

                                                    do{
                                                        System.out.println("Entre Amount to Pay");
                                                        pay = sc.nextInt();
                                                        System.out.println("Pin");
                                                        pin = sc.nextInt();

                                                        sql = "Select Pass,Acc_No from user_bank_details where Mo_no = " + Mobile + ";";
                                                        ResultSet rs = st.executeQuery(sql);

                                                        while(rs.next()){
                                                            c_pas = rs.getInt("Pass");
                                                            a_no = rs.getString("Acc_No");
                                                        }

                                                        if(pin == c_pas){
                                                            System.out.println("SucceFully Transfered");
                                                            System.out.println();
                                                            System.out.println("Rs." + pay);
                                                            System.out.println("From :- " + a_no);
                                                            System.out.println("To :- " + comp + " Telecom Company");

                                                            BufferedWriter bw = new BufferedWriter(new FileWriter(Mobile + ".txt", true));
                                                            bw.newLine();
                                                            bw.write("Rs." + pay);
                                                            bw.newLine();
                                                            bw.write("From :- " + a_no);
                                                            bw.newLine();
                                                            bw.write("To :- " + comp + " Telecom Company");
                                                            bw.newLine();
                                                            bw.write("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                                                            bw.close();
                                                        }
                                                    }while(pin != c_pas);
                                                    break;
                                                }

                                                case 2 : {
                                                    System.out.println("Entre Customer No.");
                                                    long c = sc.nextLong();

                                                    System.out.println("Entre State :- ");
                                                    String stat = sc.next();
                                                    
                                                    do{
                                                        System.out.println("Entre Amount to Pay");
                                                        pay = sc.nextInt();
                                                        System.out.println("Pin");
                                                        pin = sc.nextInt();

                                                        sql = "Select Pass,Acc_No from user_bank_details where Mo_no = " + Mobile + ";";
                                                        ResultSet rs = st.executeQuery(sql);

                                                        while(rs.next()){
                                                            c_pas = rs.getInt("Pass");
                                                            a_no = rs.getString("Acc_No");
                                                        }

                                                        if(pin == c_pas){
                                                            System.out.println("SucceFully Transfered");
                                                            System.out.println();
                                                            System.out.println("Rs." + pay);
                                                            System.out.println("From :- " + a_no);
                                                            System.out.println("To :- " + stat + " vij Company LTD.");

                                                            BufferedWriter bw = new BufferedWriter(new FileWriter(Mobile + ".txt", true));
                                                            bw.newLine();
                                                            bw.write("Rs." + pay);
                                                            bw.newLine();
                                                            bw.write("From :- " + a_no);
                                                            bw.newLine();
                                                            bw.write("To :- " + stat + " vij Company LTD.");
                                                            bw.newLine();
                                                            bw.write("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                                                            bw.close();
                                                        }
                                                    }while(pin != c_pas);
                                                    break;
                                                }

                                                case 3 : {
                                                    System.out.println("Entre Customer No.");
                                                    long g = sc.nextLong();

                                                    System.out.println("Entre State :- ");
                                                    String stat = sc.next();
                                                    
                                                    do{
                                                        System.out.println("Entre Amount to Pay");
                                                        pay = sc.nextInt();
                                                        System.out.println("Pin");
                                                        pin = sc.nextInt();

                                                        sql = "Select Pass,Acc_No from user_bank_details where Mo_no = " + Mobile + ";";
                                                        ResultSet rs = st.executeQuery(sql);

                                                        while(rs.next()){
                                                            c_pas = rs.getInt("Pass");
                                                            a_no = rs.getString("Acc_No");
                                                        }

                                                        if(pin == c_pas){
                                                            System.out.println("SucceFully Transfered");
                                                            System.out.println();
                                                            System.out.println(pay);
                                                            System.out.println("From :- " + a_no);
                                                            System.out.println("To :- " + stat + " Online Gas Company LTD.");

                                                            BufferedWriter bw = new BufferedWriter(new FileWriter(Mobile + ".txt", true));
                                                            bw.newLine();
                                                            bw.write("Rs." + pay);
                                                            bw.newLine();
                                                            bw.write("From :- " + a_no);
                                                            bw.newLine();
                                                            bw.write("To :- " + stat + " Online Gas Company LTD.");
                                                            bw.newLine();
                                                            bw.write("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                                                            bw.close();
                                                        }
                                                    }while(pin != c_pas);
                                                    break;
                                                }
                                                default : {
                                                    break;
                                                }
                                            }

                                        }while(dum!=4);

                                       
                                    break;
                                    }
                                     default :{
                                            break;
                                    }
                                }
                                
                            }while(se!=5);
                        }
                        else{
                            break;
                        }
                    }
                    break;
                }
                
                case 3 : {
                    System.out.print("Mobile Number :- ");
                    Mobile = sc.nextLong();
                    System.out.print("Password :- ");
                    int pass = sc.nextInt();
                    System.out.println("Entre Your New Pin");
                    int ne  = sc.nextInt();

                    String Query = "update user set Password = ? where Mo_No = ?";

                    PreparedStatement p = con.prepareStatement(Query);
                    p.setInt(1, ne);
                    p.setLong(2, Mobile);
                    int r = p.executeUpdate();
                    if(r>0){
                        System.out.println("Success");
                    }
                    else{
                        System.out.println("False");
                    }
                    break; 
                }
            }

        }while(ch!=4);
        sc.close();
    }
}