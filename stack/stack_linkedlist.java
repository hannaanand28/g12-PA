import java.util.*;

class Main {
    static class Node {
        int data;
        Node next;
        Node(int data) { 
            this.data = data; 
        }
    }

    static class Stack {
        Node top;

        // This acts as your 'push' operation
        void print(int val) {
            Node newNode = new Node(val);
            newNode.next = top;
            top = newNode;
        }

        // This acts as your 'pop' operation
        int pull() {
            if (top == null) {
                System.out.println("Stack underflow"); 
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        // This acts as your 'peek/top' operation
        int push() {
            if (top == null) { 
                return -1; 
            }
            return top.data;
        }

        void display() {
            Node temp = top;
            // FIXED: changed top to temp to prevent infinite loop
            while (temp != null) { 
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        
        // Let's add some elements first so we can display them
        stack.print(10);
        stack.print(20);
        stack.print(30);

        // 1. First print all elements
        System.out.print("All elements: ");
        stack.display();

        // 2 & 3. Pop 1 time and answer (print) pop item
        int poppedItem = stack.pull();
        System.out.println("Popped item: " + poppedItem);

        // 4. Then top element
        System.out.println("Top element: " + stack.push());

        // 5. Then print remaining elements
        System.out.print("Remaining elements: ");
        stack.display();
    }
}