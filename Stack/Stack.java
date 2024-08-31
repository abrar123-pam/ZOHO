/*class Stack{
	
	int siz = 1000;
	int[] arr = new int[siz];
	int top = -1;
	
	void push(int x){
		top++;
		arr[top] = x;
	}
	
	int pop(){
		int x = arr[top];
		top = top - 1;
		return x;
	}
	
	int top(){
		return arr[top];
	}
	
	int size(){
		return top+1;
	}
	
	boolean isEmpty(){
		if(top == -1)
			return true;
		
		return false;
	}
	

} */
class Stack{
	
	int siz = 1000;
	char[] arr = new char[siz];
	int top = -1;
	
	void push(char x){
		top++;
		arr[top] = x;
	}
	
	void pop(){
		top--;
	}
	
	char top(){
		return arr[top];
	}
	
	int size(){
		return top+1;
	}
	
	boolean isEmpty(){
		return (top == -1);
	}
	

} 