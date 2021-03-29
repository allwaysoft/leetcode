import java.util.Arrays;
import java.util.Stack;

class MyQueue {
    private Stack<Integer> a;// ����ջ
    private Stack<Integer> b;// ���ջ
    
    public MyQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }
    
    public void push(int x) {
        a.push(x);
    }
    
    public int pop() {
        // ���bջΪ�գ���aջȫ��������ѹ��bջ�У�Ȼ��b.pop()
        if(b.isEmpty()){
            while(!a.isEmpty()){
                b.push(a.pop());
            }
        }
        return b.pop();
    }
    
    public int peek() {
        if(b.isEmpty()){
            while(!a.isEmpty()){
                b.push(a.pop());
            }
        }
        return b.peek();
    }
    
    public boolean empty() {
        return a.isEmpty() && b.isEmpty();
    }


    public static void main(String[] args) {


		MyQueue obj = new MyQueue();
		int x=1;
		
		 obj.push(x);
		 int param_2 = obj.pop();
		 int param_3 = obj.peek();
		 boolean param_4 = obj.empty();
	}
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */