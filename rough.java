/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author reva94
 */
import java.util.Scanner;
public class rough
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        boolean flag=true;
        System.out.println("stack implementation using array");
        System.out.println("enter the size of the stack");
        int size=read.nextInt();
        ArrayStack stack = new ArrayStack(size);
        while(flag){
             System.out.print("1.push element in stack");
             System.out.print("2.pop an element from stack");
             System.out.println("3.display the stack");
             System.out.print("4.exit");
             int ch=read.nextInt();
             switch(ch){
                 case 1:System.out.print("enter the elemts to push:");
                 int ele=read.nextInt();
                 if(stack.push(ele))
                     System.out.println(ele+"succesfully pushed on stack");
                 else
                     System.out.println("stack overflow");
                 case 2: ele=stack.pop();
                 if(ele==-1)
                     System.out.println("Stack underflow");
                 else
                     System.out.println(ele+"popped out of thye stacki");
                 case 3: System.out.println("satck content");
                 stack.printStack();
                 break;
                 case 4: flag=false;
                 break;
                 default:System.out.println("invalid choice try again....");
                 
                 
                 
               
             
            
        
                
            
        }
        read.close();
        
        
        // TODO code application logic here
    }
    
}
class ArrayStack{
    int top;
    int maxSize;
    int a[];
    ArrayStack(int size){
        a=new int[size];
        top=-1;
        maxSize=size;
    }
    void printStack(){
        if(!isEmpty()){
            for(int i=top;i>-1;i--)
                System.out.println(a[i]);
        
        
    }
        else
            System.out.println("Stack is empty");
        
        
    }
    boolean isEmpty(){
        return (top<0);
    }
    boolean isFull(){
        return (top>=(maxSize-1));
        
    }
    boolean push(int x){
        if(isFull())
            return false;
        else{
            a[++top]=x;
            return true;
        }
    }
    int pop(){
        if(isEmpty())
            return -1;
        else
            return a[top--];
    }
}
}