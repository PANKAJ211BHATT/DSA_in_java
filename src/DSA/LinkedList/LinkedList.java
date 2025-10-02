package DSA.LinkedList;

public class LinkedList {
    private static int sizeOf = 0;

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null ){
            head =tail =newNode;
            sizeOf++;
            return;
        }
            newNode.next = head;
            head = newNode;
            sizeOf++;

    }
    public void addLast(int Data){
        Node newNode = new Node(Data);

        if(tail == null){
            head = tail= newNode;
            sizeOf++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        sizeOf++;

    }
    public void printLL(){
        Node currentNode = head;
        System.out.println("-----YOUR LINKED LIST----");
        if(detectTheCycle()){

            System.out.println("Please remove the Cycle ");
        }else{
            while(currentNode != null){
                System.out.print(currentNode.data + "---->");
                currentNode = currentNode.next;
            }
            System.out.print("NULL");
            System.out.println();
        }


    }
    public void removeFirst(){
        if(sizeOf==0){
            return;
        }
        head = head.next;
        sizeOf--;
    }

    public void removeLast(){
    if(sizeOf==0){
        return;
    }
        if(head.next==null){
            head=null;
            sizeOf--;
            return;
        }
        Node CurrentNode = head;
        while(CurrentNode.next.next != null ){
            CurrentNode = CurrentNode.next;
        }
        CurrentNode.next = null;
        sizeOf--;

    }

    public void addAt(int Index , int data){

        if(Index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (temp != null){
            if(i == Index-1){
                newNode.next = temp.next;
                temp.next = newNode;
                sizeOf++;
                return;
            }
            temp = temp.next;
            i++;


        }
        System.out.println("Index Not Found");
    }


    public int SizeOf(){
        return sizeOf;
    }

    public  int Search(int key){
        int index=0;
        Node CurrentNode = head;
        while(CurrentNode.next != null){
            if(CurrentNode.data == key){
                return index;
            }
            CurrentNode = CurrentNode.next;
            index++;
        }
        return -1;
    }

    public  int SearchRecursion(int key){
        Node CurrentNode = head;
        return SearchRecursionHelper(key,CurrentNode,0);
    }
    public  int SearchRecursionHelper(int key, Node CurrentNode,int index){
        if(CurrentNode.next == null){
            return -1;
        }
        if(CurrentNode.data == key){
            return index;
        }
        return SearchRecursionHelper(key,CurrentNode.next,index+1);
    }
//    public static void FindAndRemoveNthNodeFromEnd(){
//        Node temp = head;
//        int n= 0;
//        while(temp != null){
//            if(temp.next)
//        }
//    }


    public  Node FindMid(Node head){
        if (head == null) {
            return null; // list is empty
        }
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }

        public boolean checkpalindrome(){
            //find mid
            Node mid = FindMid(head);

            //reverse second half
            Node prev = null;
            Node Current = mid.next;
            Node next = null;
            while(Current != null){
                next = Current.next;
                Current.next= prev;
                prev = Current;
                Current = next;
            }
            Node head2 = prev;

            //check both LL
            Node current1 = head;
            while(head2.next != null){
                if(current1 != head2){
                    return false;
                }
            }
            return true;
        }



    public Boolean detectTheCycle(){
        Node slow =head;
        Node fast= head;
        if(fast.next.next == null){
            return false;
        }

    while(fast != null && fast.next != null ){

        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return true;
        }

    }
        return false;
    }
    public void RemoveCycle(){
        //detectCycle
        Node slow =head;
        Node fast= head;
        boolean Cycel = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
            if(slow == fast ){
                Cycel = true;
                break;
            }
        }

        slow = head;
        Node prev = null;
        while(slow != fast){
            slow= slow.next;
            prev = fast;
            fast = fast.next;
        }

        prev.next = null;
    }

    public static void reverseLinkedList(){
        if(head == null || head.next == null){
            return;
        }
        Node prev = null;
        Node Current = head;
        Node next = null;
        while(Current != null){
            next = Current.next;
            Current.next= prev;
            prev = Current;
            Current = next;
        }
        head = prev;

    }
    public  void ZicZac(){
        Node mid = FindMid(head);
        
        //reverse from mid to last

        Node prev = null;
        Node current = mid;
        Node next = null;
        
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node head2= prev;
        
        // make ZicZac
        Node Temp1 = head;
        Node Temp2 = head2;
        while (Temp2.next != null) {
            Node T1N = Temp1.next;
            Node T2N = Temp2.next;
            Temp1.next = Temp2;
            Temp1 = T1N;
            
            Temp2.next = Temp1;
            Temp2 = T2N;
        }

    }

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();

        LL.addLast(3);
        LL.addLast(5);
        LL.addLast(7);
        

        LL.printLL();
        LL.ZicZac();
        LL.printLL();


    }
}
