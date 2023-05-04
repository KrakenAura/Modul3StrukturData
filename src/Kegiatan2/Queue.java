package Kegiatan2;

public class Queue { Node front;
    Node rear;
    int count;

    Queue() {
        this.front = null;
        this.rear = null;
        this.count = 0;
    }

    public void enqueue(String data) {
        Node new_node = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = new_node;
        } else {
            this.rear.next = new_node;
            this.rear = new_node;
        }
        this.count++;
    }

    public String dequeue() {
        if (this.front == null) {
            return null;
        }
        Node temp = this.front;
        this.front = temp.next;
        if (this.front == null) {
            this.rear = null;
        }
        this.count--;
        return temp.data;
    }

    public String peek() {
        if (this.front == null) {
            return null;
        }
        return this.front.data;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public int size() {
        return this.count;
    }

}
