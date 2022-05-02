/******************************************************************************************************

 Name - Vivian Vu
 Date - 4/3/20
 Course - CMSC 256

 Project 4

 File Name - CustomStack
 File Purpose - Class implements the StackInterface<T> and creates each method for pop, push, peek,
 as well as isEmpty and clear methods.

 ******************************************************************************************************/

package cmsc256;

import bridges.base.SLelement;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class CustomStack<T>  implements StackInterface<T>{

    // initialize private instance variables
    private ArrayList<T> list = new ArrayList<>(); // create new list
    private SLelement<T> top; // first element in list

    // DEFAULT CONSTRUCTOR
    public CustomStack () {
        top = null;
    }

    // PARAMETERIZED CONSTRUCTOR
    public CustomStack (T node) {
        top = new SLelement<T>(node);
    }

    // push method - adds new entry to the top of stack
    public void push (T entry)  {

        // if entry is null throw an exception
        if (entry == null) {
            throw new IllegalArgumentException();
        }

        // adds new entry
        top = new SLelement<T> (entry, top);
        list.add(entry);
    }

    // pop - removes top entry from the stack and returns the new entry
    public T pop () {

        // checks if stack is empty is true throws an exception
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        // removes entry from the stack
        T entry = top.getValue();
        list.remove(entry);
        top = top.getNext();
        return entry;
    }

    // peek - returns the top value
    public T peek () {

        //checks if stack is empty is true throws an exception
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.getValue();
    }

    // checks if stack is empty
    public boolean isEmpty () {
        return list.isEmpty();
    }

    // clears the stack
    public void clear () {
        list.clear();
    }

    public void display () {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            SLelement<T> current = top;
            StringBuffer output = new StringBuffer();
            output.append("Top of Stack: " + current.getValue() + "\n");

            while (current.getNext() != null) {
                current = current.getNext();

                if (current.getNext() == null){
                    output.append("Stack bottom: ");
                }
                else {
                    output.append("             ");
                }

                output.append(current.getValue() + "\n");
            }

            System.out.println(output.toString());

        }
    }

}
