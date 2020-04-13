package onlineBookstore;

//author: xiling wang 101047930

import java.util.ArrayList;

public class customer extends Thread{
	private int id;
	private ArrayList<Integer> bookList;
	
	public customer (int id) {
		this.id=id;
		System.out.println("you are in customer interface now");
		bookList = new ArrayList<Integer>();
		
		
	}
	
	public void inputController (String func) {
		
		String[] funcList= func.split(" ");
		
		if(funcList.length==1) {
			System.out.println("invalid input");
		}else if(funcList.length==2) {
			
			switch(funcList[0]){
			case "select": 
				
				selectBook(Integer.parseInt(funcList[1]));
				
				break;
			case "remove":
				removeBook(Integer.parseInt(funcList[1]));
				break;
			case "add":
				addBook(Integer.parseInt(funcList[1]));
				break;
			case "search":
				searchBookName(funcList[1]);
				break;
			default:
				System.out.println("invalid input, type again");
			
		}
		}else if(funcList.length==3) {
			switch(funcList[0]) {
				case "search":
					if(funcList[1].equals("name")) searchBookName(funcList[2]);
					else if (funcList[1].equals("genre")) searchGenre(funcList[2]);
					else if (funcList[1].equals("order")) searchOrder(funcList[2]);
					break;
				case "author":
					searchAuthor (funcList[1],funcList[2]);
					break;
				default:
					System.out.println("invalid input, type again");
				
			}
		}
		
		
	}
	
	public void selectBook (int bookID) {
		System.out.println("book is selected");
		//let customer to view the details of the book: price, page number, name, genre, author...
		
	}
	
	public void addBook (int bookID) {
		bookList.add(bookID);
		System.out.println("book is added");
	}
	
	public boolean removeBook (int bookID) {
		for(int i=0; i<bookList.size();i++) {
			if(bookList.get(i)==bookID) {
				bookList.remove(i);
				System.out.println("book is removed");
				return true; 
			}
		}
		System.out.println("there is no such book in your basket");
		return false;
		
	}
	
	public void searchBookName (String name) {
		//print all the books contain user's input along with their bookID
		System.out.println("searching book...");
	}
	
	public void searchGenre (String genre) {
		//print all the books in this genre along with bookID
		System.out.println("searching genre...");
	}
	
	public void searchAuthor (String authorFisrtname, String authorLastName) {
		//print all the books of this author along with bookID
		System.out.println("searching author...");
	}
	
	public void searchOrder (String ordernum) {
		//print all the order information of relative order number
		System.out.println("searching order...");
	}
	
	
	
}
