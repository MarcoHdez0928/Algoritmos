/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingCodingInterview.MyTest.Generate;

/**
 *
 * @author MarcoHdez
 */
public class Node {
    Node next=null;
    int data;
    public Node(int value){
        data=value;
    }
    public void appendToTail(int value){
        Node n=this;
        while(n.next!=null){
            n=n.next;
        }
        n.next=new Node(value);
    }
    public Node addFront(int value){
        Node head=new Node(value);
        head.next=this;
        return head;
    }
    public void printNodes(){
        Node n=this;
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.print("null\n");
    }
    public Node reverseNodes(){
        Node nAct=this;
        Node nHead=null;
        while(nAct!=null){
            if(nHead==null){
                nHead= new Node(nAct.data);
            }                
            else{
                nHead=nHead.addFront(nAct.data);
            }
            nAct=nAct.next;
        }
        return nHead;
    }
    public Node sortAsc(){
        Node n=this;
        Node nHead=null;
        while(n!=null){
            Node next=n.next;
            if(nHead==null){
                nHead=new Node(n.data);
            }
            else{
                if(n.data<nHead.data){
                    n.next=nHead;
                    nHead=n;                    
                }
                else{
                    Node SelNodo=nHead;
                    while(SelNodo!=null){
                        if(SelNodo.next==null){
                            SelNodo.next=new Node(n.data);
                            break;
                        }
                        else if(SelNodo.next.data>n.data){                            
                            n.next=SelNodo.next;
                            SelNodo.next=n;
                            break;
                        }
                        SelNodo=SelNodo.next;
                    }
                    
                }
            }
            n=next;
        }
        return nHead;
    }
    public Node deleteNode(int value){
        Node n=this;
        Node head=n;
        if(n.data==value){
            return n.next;
        }
        while(n!=null){
            if(n.next!=null){
                if(n.next.data==value){
                    n.next=n.next.next;
                }                
            }
            n=n.next;
        }
        return head;
    }
    public Node removeDumps(Node n){
        Node head=n;
        Node next;
        while(n!=null){
            next=n;
            while(next.next!=null){
                if(n.data==next.next.data){
                    next.next=next.next.next;
                }else
                    next=next.next;
            }
            n=n.next;
        }
        return head;
    }
}
