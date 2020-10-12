package entities;

public class Stack {

	private int element[];
	private int top;
	
	public Stack() {
		
	}
	
	public Stack(int quantityOfElements){
		element = new int[quantityOfElements];
		top = -1;
	}
	
	public int getElement() {
		return element[top];
	}


	public int getTop() {
		return top;
	}
	
	public boolean isFull() {
		return (top > element.length);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	
	public void push(int element) {
		if(isFull()){
			throw new RuntimeException("Stack overflow!");
		}else {
			top++;
			this.element[top] = element;
		}
	}
	
	
	public int pop() {
		int e = element[top];
		top--;
//		if(isEmpty()) 
//			throw new RuntimeException("Empty Stack!");	
		return e;
	}
	
	public int size() {
		return (top+1);
	}
	
	
	public void printStack() {
		int aux = top;
		while(aux > -1) {
			System.out.print("["+element[aux]+"]");
			aux--;
		}
		System.out.println("");
	}
	
}
