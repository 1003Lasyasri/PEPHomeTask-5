package com.epam.Loggingdemo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;

class Constructioncost
{
	String material;
	int area;
	String automation;
	int price;
	Constructioncost(String material,int area,String automation)
	{
		this.material=material;
		this.area=area;
		this.automation=automation;
		this.price=0;
	}
	int calculateCost()
	{
		if(material.equalsIgnoreCase("standard"))
		{
			if(automation.equalsIgnoreCase("fully"))
				price+=1900*area;//1200->standard&&700->fully
			else
				price+=1200*area;
		}
		else if(material.equalsIgnoreCase("above standard"))
		{
			if(automation.equalsIgnoreCase("fully"))
				price+=2200*area;//1500->high standard&&700->fully
			else
				price+=1500*area;
		}
		else if(material.equalsIgnoreCase("high standard"))
		{
			if(automation.equalsIgnoreCase("fully"))
				price+=2500*area;//1800->high standard&&700->fully
			else
				price+=1800*area;
		}
		return price;
	}
}
public class Demo
{
	private static final Logger LOGGER=LogManager.getLogger(Demo.class);
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter material type");
		String material= scanner.nextLine();
		System.out.println("Enter area");
		int area= scanner.nextInt();
		System.out.println("Enter automation type");
		String automation=scanner.next();
		Constructioncost cost=new Constructioncost(material,area,automation);
		int finalPrice=cost.calculateCost();
		LOGGER.debug("Total Constructio cost is:"+finalPrice);

	}

}



