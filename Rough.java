import java.util.Scanner;

class student extends Rough {
    int reg2;
    void input(Scanner sc) {
        System.out.println("reg no ");
        reg2 = sc.nextInt();

    }

    public void displayTheValues() {
        System.out.println("reg number  : " + reg2);

    }
}

public class Rough{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of student : ");
        int size = read.nextInt();
        // int reg;// , marks2
        student[] obj2 = new student[size];

        for (int i = 0; i < size; i++) {
            obj2[i].input(read);
        }
        for (int i = 0; i < size; i++) {
            obj2[i].displayTheValues();
        }
        read.close();
    }
}




import java.util.Scanner;

class student extends Main {
    int[] collect;
    int siz;
    student(int sz){
        collect = new int[sz];
        siz = sz;

    }


    void input(Scanner sc) {
        for (int i = 0; i < siz; i++) {
            System.out.println("reg no ");
            collect[i] = sc.nextInt();
        }

    }
    void display(){
        for (int i = 0; i < siz; i++) {
            System.out.println("reg number  : " + collect[i]);

        }
    }


}

public class Main{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of student : ");
        int size = read.nextInt();
        // int reg;// , marks2
        student obj2 = new student(size);
        obj2.input(read);
        obj2.display();


        read.close();
    }
}