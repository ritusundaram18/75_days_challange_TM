class MyCircularQueue {
    int qu[];
    int qsize=0;
    int rear=0;
    int front=0;

    public MyCircularQueue(int k) {
        qu=new int[k];
        Arrays.fill(qu,-1);
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()) {
            rear=front=0;
            qu[rear]=value;
            qsize++;
            return true;
        }
       
         rear++;
         qsize++;
         rear=rear % qu.length;
         qu[rear]=value;
         return true;
        
    }
    
    public boolean deQueue() {
        if(isEmpty())   return false;
        
        qu[front]=-1;
        qsize--;
        front++;
        front=front %qu.length;
        return true;
    }
    
    public int Front() {
        return qu[front];
    }
    
    public int Rear() {
        return qu[rear];
    }
    
    public boolean isEmpty() {
        return qsize==0;
        
    }
    
    public boolean isFull() {
        return qsize==qu.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */