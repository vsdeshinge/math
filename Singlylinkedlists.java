import java.util.*;
class SinglyLinkList{
    class Node{
        int data;
        Node link;
        Node(int d){
            data = d;
            link = null;
        }

    }
    Node head;
    SinglyLinkList(){
        head = null;
    }
    public void addFirst(int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.link = head;
            head = newNode;
        }
    }

    public void addlast(int d){
        Node newNode = new Node(d);
        if( head == null){
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.link != null){
                temp = temp.link;

            }
            temp.link = newNode;
        }
    }


    public void display(){
        if(head == null){
            System.out.println("the list is Empty");
        }
        else{
            Node temp = head;
            while(temp.link != null){
                System.out.println(temp.data);
                head = temp.link;
            }
        }
    }

    public void search(int k){
        Node temp = head;
        while(temp.link != null){
            if(temp.data == k){
                System.out.println("the given number is found in linked list");
                return;
            }


        }
        System.out.println("not found");
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = false;
        SinglyLinkList sl = new SinglyLinkList();
        while(!loop){
            System.out.println("press 1, to add to first");
            System.out.println("press 2, to add last");
            System.out.println("press 3, to display the list");
            System.out.println("press 4, to search in the list");
            System.out.println("press 5, to exit");
            int userinput = sc.nextInt();
            switch (userinput){
                case 1: int a = sc.nextInt();
                    sl.addFirst(a);
                    break;
                case 2: int b = sc.nextInt();
                    sl.addlast(b);
                    break;
                case 3: sl.display();
                    break;
                case 4 : int c = sc.nextInt();
                    break;
                case 5: loop = false;
                    break;
                default:
                    System.out.println("please enter a valid number");
                    break;





            }
        }

    }
}