package Stacks;

public class Main
{
    public static void main(String[] args)
    {

        Stack myStack = new Stack(4);


        myStack.push("1");
        System.out.println(myStack.peek());
        myStack.push("2");
        System.out.println(myStack.peek());
        myStack.push("3");
        System.out.println(myStack.peek());
        myStack.push("4");
        System.out.println(myStack.peek());
        myStack.push("5");
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());


    }

}
