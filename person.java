import java.util.Scanner;
public class person {
	int id;
	int age;
	String name;
	public person(int id,  int age, String name) {
		this.id= id;
		this.name= name;
		this.age= age;
		}

public void show() {
	System.out.println("Id" +   id);
	System.out.println("Name"+   name);
	System.out.println("Age"+  age);
}

public static void main( String[] args) {
	int id;String name; int age;
	Scanner sc = new Scanner(System.in);
	
	person[] team = new  person[5]; 
	for(int i=0;i< team.length; i++) {
		System.out.print("Enter person id:");
		id =sc.nextInt();
		System.out.print("Enter person name:");
		name =sc.next();
		System.out.print("Enter person age:");
		age =sc.nextInt();
		team[i]= new person(id,age,name);
		
	}
	for(int i=0;i<team.length;i++) {
		team[i].show();
	}
	
	
	}
}
	
	
	
	
	
	
	
	
	
