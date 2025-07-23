import java.util.Scanner;
class MyStack {
    int top = -1;
    int size;
    int[] stack;
    MyStack(int size) {
        this.size = size;
        stack = new int[size];
    }
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}
public class stackop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack s = new MyStack(3); 

        while (true) {
            System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
