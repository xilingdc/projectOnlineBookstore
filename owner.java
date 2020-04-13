package onlineBookstore;

//author: xiling wang 101047930

public class owner extends Thread{
	
	public owner () {
		System.out.println("you are in Book Owner interface now.");
		
		
	}
	
	public void inputController (String func) {
		String[] funcList= func.split(" ");
		if(funcList.length==1) {
			System.out.println("invalid input");
		}else if (funcList.length==2) {
		switch (funcList[0]) {
				case "delete": 
					deleteBook(Integer.parseInt(funcList[1]));
					break;
				case "add":
					addBook(Integer.parseInt(funcList[1]));
					break;
				case "email":
					publisherEmail(funcList[1]);
					break;
				default:
					System.out.println("invalid input, type again");
		}
		}
	}

	
	
	public void deleteBook(int ID) {
		//delete the relative book in Book table
		System.out.println("book has been deleted");
	}
	
	public void addBook(int ID) {
		//add the relative book in Book table
		System.out.println("book has been added");
	}
	
	public void publisherEmail (String publisherName) {
		System.out.print("publisherName's email is:");
		//print publisher's email
	}
	
}
