package Lab02;

public class MessageQueue {

    public MessageQueue(int capacity){
        elements = new Message[capacity];
        count = 0;
        head = 0;
        tail = 0;
    }
    public Message remove(){
        Message r = elements[head];
        head = (head + 1) % elements.length;
        count--;
        return r;
    }
    public void add(Message aMessage){
        elements[tail] = aMessage;
        tail = (tail + 1)% elements.length;
        count++;
    }
    public int size(){
        return count;
    }
    public Message peek(){
        return elements[head];
    }

    private Message[]elements;
    private int head;
    private int tail;
    private int count;

}
