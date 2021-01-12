/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyCoding.LinkedList;
import CrackingCodingInterview.MyTest.Generate.Node;
/**
 *
 * @author MarcoHdez
 */
public class TestImplementNode {
    public static void main(String[] args){
        Character.toChars(52);
        
        Node n=new Node(1);
        n=n.addFront(15);
        n.appendToTail(2);
        n.appendToTail(5);
        n.appendToTail(6);
        n.appendToTail(3);
        n=n.addFront(10);
        n.printNodes();
        n=n.reverseNodes();
        n.printNodes();
        n=n.sortAsc();
        n.printNodes();
        n.deleteNode(5);
        n.printNodes();
        n.appendToTail(5);
        n.appendToTail(8);
        n.appendToTail(4);
        n=n.addFront(20);
        n=n.addFront(25);
        n.appendToTail(5);
        n.appendToTail(8);
        n.appendToTail(4);
        n=n.addFront(20);
        n=n.addFront(25);
        n.appendToTail(5);
        n.appendToTail(8);
        n.appendToTail(4);
        n=n.addFront(20);
        n=n.addFront(25);
        n.printNodes();
        n=n.reverseNodes();
        n.printNodes();
        n=n.removeDumps(n);
        n.printNodes();
        n=n.sortAsc();
        n.printNodes();
    }
}
