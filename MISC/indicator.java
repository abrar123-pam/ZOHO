import java.util.*;
class Node{

	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
	
	Node(int data,Node next){
		this.data = data;
		this.next = next;
	}
}

class SingleLinkedList{
	
	public Node addElements(int[] arr){
		Node head = null;
		for(int i=0;i<arr.length;i+= 2){
			
			int data = arr[i];
			int ind = arr[i+1];
			
			Node newNode = new Node(data);
			
			if(ind == 0){
				newNode.next = head;
				head = newNode;
			}else if (ind == 1) {
                if (head == null) {
                    head = newNode;
                } else{
					Node temp = head;
					while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = newNode;
				}
		}
	}
	return head;
	}
}


class indicator{

	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		SingleLinkedList sl = new SingleLinkedList();
		Node head = sl.addElements(arr);
		
		printIndicatorElements(head);
	}
	
	public static void printIndicatorElements(Node head){
		
		Node temp = head;
		
		
		
		while(temp != null){
			while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
		}
		

	}
}