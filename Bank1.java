import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.math.*;
import java.text.*;
public class Bank1
{
	public static void main(String[] args)
	{
		System.out.println("BANK ADMIN MENU\n");
		System.out.println("Please enter a menu option:");
		System.out.println("1: Add customer to the bank");
		System.out.println("2: Change customer name");
		System.out.println("3: Check accout balance");
		System.out.println("4: Modify account balance");
		System.out.println("5: Bank Summary");
		System.out.println("0: Quit");
		Scanner sc=new Scanner(System.in);
		Vector<String> accName=new Vector<String>();
		Vector<Double> accBalance=new Vector<Double>();
		Vector<Integer> customerID=new Vector<Integer>();
		int size=0;
		int f=0;
		while(true)
		{
			System.out.println("\nEnter your selection:");
			int userInput=sc.nextInt();
			switch(userInput)
			{
				case 1:
					System.out.println("\nAdd customer menu");
					System.out.println("Enter account holder's name:");
					sc.nextLine();
					String name=sc.nextLine();
					accName.add(name);
					System.out.println("Enter account balance:");
					double balance=sc.nextDouble();
					accBalance.add(balance);
					size++;
					System.out.println("Your customer ID is: "+size);
					customerID.add(size);
					break;
				case 2:
					System.out.println("\nChange customer name menu");
					if(size==0)
						System.out.println("Error! No customer detail exists!");
					else
					{
						System.out.println("Enter customer ID:");
						int id=sc.nextInt();
						if(id>size)
							System.out.println("Error! No customer detail exists!");
						else
						{
							System.out.println("Current name is: "+accName.get(id-1));
							sc.nextLine();
							System.out.println("Enter modified name:");
							String newName=sc.nextLine();
							accName.set(id-1,newName);
							System.out.println("Modified name is: "+accName.get(id-1));
						}
					}
					break;
				case 3:
					System.out.println("\nCheck account balance menu");
					if(size==0)
						System.out.println("Error! No customer detail exists!");
					else
					{
						System.out.println("Enter customer ID:");
						int id=sc.nextInt();
						if(id>size)
							System.out.println("Error! No customer detail exists!");
						else
							System.out.println("Current balance is "+accBalance.get(id-1));
					}
					break;
				case 4:
					System.out.println("\nModify account balance menu");
					if(size==0)
						System.out.println("Error! No customer detail exists!");
					else
					{
						System.out.println("Enter customer ID:");
						int id=sc.nextInt();
						if(id>size)
							System.out.println("Error! No customer detail exists!");
						else
						{
							System.out.println("Current balance is: "+accBalance.get(id-1));
							System.out.println("Enter new balance:");
							double newBalance=sc.nextDouble();
							accBalance.set(id-1,newBalance);
							System.out.println("New balance is: "+accBalance.get(id-1));
						}
					}
					break;
				case 5:
					System.out.println("\nBank summary menu\n");
					double total=0.0;
					for(int i=0;i<size;i++)
					{
						System.out.println("Customer ID: "+customerID.get(i));
						System.out.println("Customer name: "+accName.get(i));
						System.out.println("Current balance: "+accBalance.get(i));
						System.out.println();
						total+=accBalance.get(i);
					}
					System.out.println("Total wealth in the bank is: "+total);
					break;
				case 0:
					f=1;
					break;
				default:
					System.out.println("\nInvalid Entry!");
					break;
			}
			if(f==1)
				break;
		}
	}
}