import java.util.*;

class opration{
    class Node{
        String data;
        Node next;
        Node Previos;

        Node(String link){
            data = link;
            Previos = null;
            next = null;
        }
    }
        
    Node first = null;

    void insert(String link) {
        Node n = new Node(link);
        if (first != null) {
            n.next = first;
            first.Previos = n;
        }
        first = n;
    }

    void deleteValue(String link) {
        if (first == null) {
            System.out.println("LINKED LIST IS EMPTY");
        } else if (first.next==null&&first.data.equalsIgnoreCase(link)) {
            System.out.println(first.data);
            first=null;
            System.out.println("Delete SuccesFully");
        } 
        else if(first.next!=null&&first.data.equalsIgnoreCase(link))
        {
            first = first.next;
            first.Previos = null;
            System.out.println("Delete SuccesFully");
        }
        else {
            Node temp = first;
            while (temp.next != null && !temp.data.equalsIgnoreCase(link)) {
                temp = temp.next;
            }
            if (temp.data.equalsIgnoreCase(link)) {
                if (temp.next != null) {
                    temp.Previos.next = temp.next;
                    temp.next.Previos = temp.Previos;
                } else {
                    temp.Previos.next = null;
                    temp.Previos = null;
                }
                System.out.println("Delete SuccesFully");
            } else {
                System.out.println("VALUE NOT FOUND");
            }
        }
    }
    
    void deleteAll(){
        first = null;
        System.out.println("Delete SuccesFully");
    }

    void display() {
        Node temp = first;
        while (temp != null) {
            System.out.println("https://www."+temp.data + ".com/");
            temp = temp.next;
        }
    }
}

class History {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        opration w = new opration();
        System.out.println("WELCOME :-");
        System.out.println();
        Thread.sleep(1000);
        int choice = 0;
        do{
            System.out.println("[1] New Tab");
            System.out.println("[2] History");
            System.out.println("What would you do ?");
            choice = sc.nextInt();

            switch(choice){
                case 1 : {
                    System.out.print("Search Here :- ");
                    sc.nextLine();
                    String search = sc.nextLine();
                    w.insert(search);
                    break;
                }

                case 2 : {
                    System.out.println();
                    System.out.println("History :-");
                    System.out.println();
                    w.display();
                    System.out.println();
                    System.out.println("Would you like to delete any history ?");
                    sc.nextLine();
                    String ans = sc.nextLine();
                    if(ans.equalsIgnoreCase("Yes")){
                        System.out.println("[1] Delete all the History");
                        System.out.println("[2] Delete Particular WebSite History");
                        System.out.println("what would you do ? ");
                        int d = sc.nextInt();
                        if(d==1){
                            w.deleteAll();
                        }
                        else if(d==2){
                            System.out.println("Which History would you like to delete ?");
                            
                            String delete = sc.next();
                            w.deleteValue(delete);
                        }
                    }
                    break;
                }
            }

        }while(choice!=3);

        sc.close();
    }    
}