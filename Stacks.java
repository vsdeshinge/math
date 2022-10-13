//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Stacks {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println(" stack Implementation using array");
        System.out.println(" enter the size of the stack");
        int size = sc.nextInt();
        ArrayStack stack = new ArrayStack(size);

        while(true) {
            while(flag) {
                System.out.println("1,Push the element in stack");
                System.out.println("2,pop an element from stack");
                System.out.println("3, Display the stack");
                System.out.println("select your option");
                int ch = sc.nextInt();
                int ele;
                switch (ch) {
                    case 1:
                        System.out.println("Enter the element to push");
                        ele = sc.nextInt();
                        if (!stack.push(ele)) {
                            System.out.println("stack overflow");
                            break;
                        } else {
                            System.out.println("" + ele + "Succefully pushed ");
                        }
                        break;
                    case 2:
                        ele = stack.pop();
                        if (ele == -1) {
                            System.out.println("stack underflow");
                        } else {
                            System.out.println("" + ele + "popeed out of the stack");
                        }
                        break;
                    case 3:
                        System.out.println("stack content");
                        stack.printStack();
                        break;
                    case 4:
                        flag = false;
                        break;
                    default:
                        System.out.println("invalid choice please try again");
                }
            }

            sc.close();
            return;
        }
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class ArrayStack {
    int top;
    int maxsize;
    int[] ary;

    ArrayStack(int size) {
        this.ary = new int[size];
        this.top = -1;
        this.maxsize = size;
    }

    void printStack() {
        if (!this.isEmpty()) {
            for(int i = this.top; i > -1; --i) {
                System.out.println(this.ary[i]);
            }
        } else {
            System.out.println("stack is Empty");
        }

    }

    boolean isEmpty() {
        return this.top < 0;
    }

    boolean isFull() {
        return this.top >= this.maxsize - 1;
    }

    boolean push(int x) {
        if (this.isFull()) {
            return false;
        } else {
            this.ary[++this.top] = x;
            return true;
        }
    }

    int pop() {
        return this.isEmpty() ? -1 : this.ary[this.top--];
    }
}
