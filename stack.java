import java.util.*;
class stack{
 	public static void main(String args[]){
		Scanner obj =new Scanner(System.in);
		int ch;
		int top=-1;
		int n;
		System.out.println("Enter the size");
		n=obj.nextInt();
		int s[]=new int[n];
		
		do{
			System.out.println("1.PUSH ");
		System.out.println("2.POP ");
		System.out.println("3.PEEK ");
		System.out.println("4.DISPLAY ");
		System.out.println("5.IS EMPTY ");
		System.out.println("Select your Option  ");
		ch=obj.nextInt();
		switch(ch){
			case 1:
					if(top!=n)
					{
						System.out.println(" Enter the Element to be inserted :- ");
						s[++top]=obj.nextInt();
						System.out.println("Inserted to the Stack :- ");
					}	
				break;
			case 2:
				if(top==-1){
					System.out.println("Stack Under Flow");
				}
				else
				{
					top=top-1;
					System.out.println("One Element is deleted");
				}
				break;
			case 3:
				System.out.println("TOP Of Stack is :" + s[top] );
				break;
			case 5:
				if(top==-1){
					System.out.println("Stack Is Empty!!");
				}
				else{
					System.out.println("Stack is not Empty !!");
				}
				break;
			case 4 :
				if(top==-1){
					System.out.println("Stack Is Empty!!");
				}
				else{
					System.out.println("Stack Elements are!!");
					for (int i=0;i<=top;i++){
							System.out.println(s[i]);
						}
			
				}
				break;
	}
		System.out.println("1.Exit ");
		System.out.println("0.Continue");
		ch=obj.nextInt();
		} while(ch==0);
}
}