package simpleAssignment;

import java.util.Stack;

public class UndoStack {
    public static void main(String[] args) {
        Stack<String> undoStack = new Stack<>();

        undoStack.push("Hello");
        undoStack.push("Hello World");
        undoStack.push("Hello World!");

        System.out.println("Current text: " + undoStack.peek()); // Hello World!

        undoStack.pop();
        System.out.println("After undo: " + undoStack.peek()); // Hello World

        undoStack.pop();
        System.out.println("After second undo: " + undoStack.peek()); // Hello
    }
}

