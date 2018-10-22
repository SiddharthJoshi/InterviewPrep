import dataStructures.Stacks;

public class StackTester {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Stacks s = new Stacks();
		s.display();
		if(s.isEmpty()) System.out.println("Stack is empty");
		s.pop();
		s.stackLen();
		for(int i=1;i <=10;i++) {
			s.push(i);
			s.display();
		}
		s.stackTop();
		s.stackLen();
		
		for(int i = 1; i<=10;i++) {
			s.pop();
			s.display();
		}
	}

}
