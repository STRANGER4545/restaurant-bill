package bill;
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		System.out.println("-----------WELCOME TO PIZZAMANIA-----------\n");
		System.out.println("Which pizza: (1.veg pizza   2.Non-veg pizza  3.Delux veg pizza  4.Delux Non-veg pizza..)");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			pizza vegpizza=new pizza(true);
			vegpizza.addExtraToppings();
			vegpizza.addExtraCheese();
			vegpizza.takeAway();
			vegpizza.getBill();
			break;
		case 2:
			pizza nonvegpizza=new pizza(false);
			nonvegpizza.addExtraToppings();
			nonvegpizza.addExtraCheese();
			nonvegpizza.takeAway();
			nonvegpizza.getBill();
			break;
		case 3:
			DeluxPizza veg=new DeluxPizza(true);
			veg.basePizzaPrice=550;
			veg.addExtraToppings();
			veg.addExtraCheese();
			veg.takeAway();
			veg.getBill();
			break;
		case 4:
			DeluxPizza nonveg=new DeluxPizza(false);
			nonveg.basePizzaPrice=650;
			nonveg.addExtraToppings();
			nonveg.addExtraCheese();
			nonveg.takeAway();
			nonveg.getBill();
			break;
		default:
			System.out.println("enter correctly!!!");
			return;
		}
		sc.close();
	
	}
}