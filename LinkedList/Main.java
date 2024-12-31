package linkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);//4
        myLinkedList.insertAtBeginning(3);//3->4
        myLinkedList.insertAtLast(6);//3->4->6
        myLinkedList.insert(3,5);//3->4->5->6
        myLinkedList.insert(1,1);//1->3->4>5>6
        myLinkedList.insert(2,2);//1->2->3->4>5>6
        myLinkedList.insert(7,7);//1->2->3->4>5>6>7
        myLinkedList.deleteFirst();//2->3->4>5>6>7
        myLinkedList.deleteLast();//2->3->4>5>6
        myLinkedList.deleteAtPos(3);//2->3->5>6
        myLinkedList.insert(1,1);//1->2->3->5>6
        myLinkedList.insertInSorted(4);//1->2->3->4->5->6
//        System.out.println(myLinkedList.nthfromend(5));
//        System.out.println(myLinkedList.hasCyclefirstApproach());
//        System.out.println(myLinkedList.hasCycleSecondApproach());
        //myLinkedList.insertInSorted(0);
        myLinkedList.reverse();//6>5>3>2>1
       // System.out.println(myLinkedList.search(3));
        myLinkedList.printelements();
      //System.out.println("middle element " +myLinkedList.middleElement());
       // myLinkedList.printelements();


    }

}
