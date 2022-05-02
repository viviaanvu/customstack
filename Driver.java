/******************************************************************************************************

 Name - Vivian Vu
 Date - 4/3/20
 Course - CMSC 256

 Project 4

 File Name - Driver
 File Purpose - Contains the main method that calls the CustomStack class and implements push, pop,
 peek, and display methods as well as connecting to Bridges and displays the Bridges visualizer.

 ******************************************************************************************************/

package cmsc256;

import bridges.base.SLelement;
import bridges.connect.Bridges;

public class Driver extends CustomStack {

    public static void main (String[] args) throws Exception {

        Bridges bridges = new Bridges (4, "vivitrinhvu", "145852909132");
        bridges.setTitle("Stack Visualiser - Vivian Vu");
        bridges.setDescription("-");

        SLelement<Integer> el0 = new SLelement<> (256);
        SLelement<Integer> el1 = new SLelement<> (10);
        SLelement<Integer> el2 = new SLelement<> (18);
        SLelement<Integer> el3 = new SLelement<> (20);
        SLelement<Integer> el4 = new SLelement<> (2018);

        el0.setNext(el1);
        el1.setNext(el2);
        el2.setNext(el3);
        el3.setNext(el4);

        CustomStack <SLelement<Integer>> stack = new CustomStack<>();
        stack.push(el4);
        stack.push(el3);
        stack.push(el2);
        stack.push(el1);
        stack.push(el0);

        bridges.setDataStructure(el0);
        bridges.visualize();

        CustomStack<Integer> list = new CustomStack<>();

        list.push(256);
        list.push(10);
        list.push(18);
        list.push(20);
        list.push(2018);

        list.display();

        list.pop();
        list.pop();

        list.display();

        list.peek();
        list.display();

        list.pop();
        list.pop();
        list.pop();

        list.display();

    }

}
