package mypackage;
import java. io.*;
import java.io.IOException;
import java.util.*;
public class filecart {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("C:\\Users\\deeks\\Desktop\\filesio") ;
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		int option;
		int suboption;
		System.out.println(" File Application Assingment developer : Deekshitha patil");
		System.out.println("File  Related Application");

		do
		{
			System.out.println("Choose your option");
			System.out.println("1 - Display the Current File Name");
			System.out.println("2 - Display the user interface");
			System.out.println("3 - Exit");
			option =sc.nextInt();
			switch(option) {
			case 1:
				//creating a file
				if(file.isDirectory()) {
					List<String>f= Arrays.asList(file.list());
					Collections.sort(f);
					for(String s1:f) {
						System.out.println(s1);
					}
				}
				break;
				//case 2		
			case 2:  
				//logic to display the user
				//interface to perform various operations of file
			System.out.println("You are in Case 2");
			System.out.println("Choose the operation to do...");
			System.out.println("11 - Add File");
			System.out.println("12 - Delete File");
			System.out.println("13- Search File");
			System.out.println("14- Back to Main Menu");
			suboption=sc.nextInt();
		switch(suboption) {
			case 11:
				//  writing a logic to add a file
				System.out.println("Enter the file name ");				
				String fileName=s.nextLine();
				fileName=fileName+".txt";
				File add=new File(file+"/"+fileName);
				if(add.createNewFile()) {
					System.out.println("The file is created");
				}
				else {
					System.out.println("This file already exists\ntry with other file name ");
				}
				
				break;
			case 12:
				 //to delete a file
				System.out.println("enter file name :");
				  fileName =s.nextLine();
				  fileName=fileName+".txt";
				File d=new File(file+"/"+fileName);
				if(d.delete()) {
					System.out.println("The file is delete");
				}
				else {
				System.out.println("No such file exist");	
				}
				break;
			case 13: 
				 //searching a file
				System.out.println("Enter the file name to be searched");
				fileName=s.nextLine();
				fileName=fileName+".txt";
				File search= new File(file+"/"+fileName);
				if(search.isFile()) {
					System.out.println("The file name is found "+fileName);
				}
				else {
					System.out.println("File has not found");
				}
				break;
			case 14:
		}	break;
		case 3:
				System.out.println("The application is closed");
				return;
			default:
					System.out.println("invalid option try again");
					break;
	}
		}while(true);
		}
			
		}
	
