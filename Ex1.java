import FormatIO.*;

public class Ex1 {
	
	public static void main(String[] arg){
		
		//defining variables
		int numOfItems;
		double costOfItem;
		int costOfItemPence;
		int totalCost;
		String nameOfItem;
		
		//prompting to enter number of items, 
		Console con = new Console();
		
		con.println("Please enter number of items you need to order");
		numOfItems = con.readInt();
		
		
		//name of item
		con.println("Please enter the name of the item you need to order");
		nameOfItem = con.readWord();
		
		
				//special items
				if(nameOfItem.equals("light-bulb"))
				{
					costOfItemPence = 77;
					con.println("You're buying a bulb that cost 77 Pence a piece");
				}
				else if(nameOfItem.equals("battery"))
				{
					costOfItemPence = 55;
				    con.println("You're buying a battery that cost 55 Pence a piece");
				}		
				else if(nameOfItem.equals("torch"))
				{	
					costOfItemPence = 399;
				    con.println("You're buying a torch that cost 3.99 pounds a piece");
				}
				
				//all other items
				else{
				con.println("Please enter the cost of a single item");
				costOfItem = con.readDouble();
				
				costOfItemPence =  (int) (costOfItem * 100.0);
				}
	
		
		//calculating total cost and cost for each person
		totalCost = numOfItems * costOfItemPence + 450;
		
		//applying total cost for orders over 40 pounds
		
		if(numOfItems>=40){
			
			
			con.println("We're happy to tell you that you qualify for a 10% discount, original price is: " + totalCost/100 + "." +totalCost%100);
			
			totalCost = (int) (totalCost * .90 );
			
			con.println("new price is: "+ totalCost/100 + "." + totalCost%100);
		}
		
		// else{ if() { } else{// no discount}
		
		//}
		else {
			
			
			if(totalCost > 40 * costOfItemPence + 450 && numOfItems < 40){
			
			
			
				con.println("It is actually cheaper to get 40 items because you qualify for a discount, your original order costs: " + totalCost/100 + "." + totalCost%100);
			
				numOfItems = 40;
				totalCost = numOfItems * costOfItemPence + 450;
				totalCost = (int) (totalCost * .9);
				
				con.println("your new order costs: " + totalCost/100 + "." + totalCost%100);
			
		}
			
			else{
				
				totalCost = numOfItems * costOfItemPence + 450;
				con.println("You didn't qualify for any discount. Total cost is: " + totalCost/100 + "." + totalCost%100);
				
			}
		}
		
		
		
		//singleShare =  totalCost / 3 / 100.0;
		
		
		
		
		if(totalCost % 3 == 0){
			int costEqual = totalCost/3;
			con.println("Each person should pay: " + costEqual / 100 + "." + costEqual % 100);}
		
		else if (totalCost % 3 != 0){
			int person23 = totalCost/3;
			int firstPersonShare = person23 + totalCost%3;
			
			//con.println("person23  " + person23/100 +"."+person23%100 );
			
			con.println(String.format("First person should pay  %d.%d", firstPersonShare/100, firstPersonShare%100));
			con.println(String.format("The second/third person should pay %d.%d", person23/100, person23%100));
		}
			
		/*	int fistPersonShare = ((totalCost % 3) + (totalCost / 3))/100;
			con.println("First person should pay: " + fistPersonShare);
			con.println("Other two people should pay: " + ( totalCost / 3) /100 + " each"); }
			 
		*/
		//Calculating number of items for each person
		//if the number of items is divisible by 3
		if(numOfItems % 3 == 0){ 
			con.println("Each person gets: " + numOfItems/3 + " " + nameOfItem + "s");
		}
		
		
		//if the number of items has extra
		else{
			int firstPersonItems = numOfItems / 3 + numOfItems % 3;
			con.println("First person gets: " + firstPersonItems + " " + nameOfItem + "s");
			con.println("Other two people get: " + numOfItems / 3 + " each");
		}
	}

}
