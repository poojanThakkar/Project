import java.util.*;

class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO,\nEnter The Size of The array :- ");
        int size = sc.nextInt();
        work w = new work(size);
        boolean flag = false;

        do{
            System.out.println("Which Opration do you want to do ?");
            System.out.println("[1] Push");
            System.out.println("[2] Pop");
            System.out.println("[3] Peep");
            System.out.println("[4] Change");
            System.out.println("[5] Display an Array");


            System.out.println("Enter the no. of opration from above.......!");
            int a = sc.nextInt();

            switch(a){
                case 1 : {
                    System.out.println("Enter the element :- ");
                    int elm = sc.nextInt();
                    w.push(elm);
                    break;
                }

                case 2 : {
                    w.pop();
                    break;
                }

                case 3 : {
                    System.out.println("Enter Index No. :- ");
                    int x = sc.nextInt();
                    w.peep(x);
                    break;
                }

                case 4 : {
                    System.out.println("Enter Index No. :- ");
                    int x = sc.nextInt();
                    System.out.println("Enter Element No. :- ");
                    int y = sc.nextInt();
                    w.change(x, y);
                    break;
                }

                case 5 : {
                    w.diplay();
                }
                default : {
                    System.out.println("Enter right no.");
                }
            }
        }while(flag != true);
        sc.close();
    }
}

class work{
    static int top = -1; 
    int size;
    //String s;
    int i[];
    work(int size){
        this.size = size;
        i = new int[size];
    }

    void push(int x){
        top++;
        i[top] = x;
    }

    void pop(){
        top--;
    }

    void peep(int x){
        if(top - x +1 <= 0){
            System.out.println("Stack is UnderFlow in pEEp");
        }
        else{
            System.out.println(top-x+1);
        }
    }

    void change(int x, int y){
        if(top - x +1 <= 0){
            System.out.println("Stack is UnderFlow in Change");
        }
        else{
            i[top-x+1] = y;
        }
    }

    void diplay(){
        for(int j = top; j>=0 ; j--){
            System.out.println(i[top]);
        }
    }
}