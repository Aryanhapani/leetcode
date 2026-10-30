class LRUCache {
    int size;
    linklist linkedlist=new linklist();
    HashMap<Integer,Node> hashmap=new HashMap<>();


    public LRUCache(int capacity) {
        this.size=capacity;
    }
    
    public int get(int key) {
        if(hashmap.containsKey(key)){
            Node temp=hashmap.get(key);
            linkedlist.movetofront(temp);
            return temp.value;
        }

        return -1;
        
    }
    
    public void put(int key, int value) {
        if(hashmap.containsKey(key)){
            Node temp=hashmap.get(key);

            temp.value=value;

            linkedlist.movetofront(temp);
            return;
        }

        if(hashmap.size()==size){

                Node temp=linkedlist.tail;

                hashmap.remove(temp.key);


                linkedlist.delete(temp);

            
        }

        Node nn=new Node(key,value);

        hashmap.put(key,nn);

        linkedlist.insertatfornt(nn);
        
    }
}

class linklist{
    Node head;
    Node tail;

    public void insertatfornt(Node nn){
        nn.prev=null;
        nn.next=head;

        if(head==null){
            head=tail=nn;
        }else{
            head.prev=nn;
            head=nn;
        }
    } 

    public void delete(Node nn){
        if(nn.prev != null){
            nn.prev.next=nn.next;
        }else{
            head=nn.next;
        }

        if(nn.next != null){
            nn.next.prev=nn.prev;
        }else{
            tail=nn.prev;
        }

        nn.prev=null;
        nn.next=null;
    }

    public void movetofront(Node nn){
        if(head==null){
            return;
        }

        delete(nn);
        insertatfornt(nn);
    }
}

class Node{
    int key;
    int value;
    Node next;
    Node prev;

    Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */