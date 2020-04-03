/**
 * @author Administrator
 */
public class Queue {
    private int font = 0;
    private int rear = 0;
    private char []chars;

    Queue(int size){
        chars = new char[size];
    }

    void printQueue(){
        for (char aChar : chars) {
            System.out.print(aChar+",");
        }
        System.out.println();
    }

    void offer(char c){
        if (isFull()){
            throw new IndexOutOfBoundsException("队列元素已满");
        }else {
            chars[rear] = c;
            rear = (rear+1)%chars.length;
        }
    }

    void poll(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("队列已空");
        }else {
            font = (font+1)%chars.length;
        }
    }

    boolean isEmpty(){
        return font == rear;
    }

    boolean isFull(){
        return (rear+1)%chars.length == font;
    }

    void clear(){
        font = 0;
        rear = 0;
    }

    char peek(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("当前队列没有元素");
        }
        return chars[font];
    }
}
