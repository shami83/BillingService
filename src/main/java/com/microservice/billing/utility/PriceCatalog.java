package com.microservice.billing.utility;

import java.util.HashMap;
import java.util.Map;

import com.microservice.billing.model.BillStatus;

public class PriceCatalog {
	
	private static PriceCatalog calalog=new PriceCatalog();
	private Map<String,String> priceMap=new HashMap<String,String>();
	private PriceCatalog()
	{
		init();
	}
	
	private void init()
	{
		priceMap.put("pen", "10");
		priceMap.put("shirt", "1000");
		priceMap.put("televison", "20000");
		priceMap.put("ac", "30000");
		priceMap.put("smartphone", "14000");
		priceMap.put("radio", "2000");
		priceMap.put("musicbox", "20000");
		priceMap.put("bike", "66000");
		priceMap.put("scooter", "26000");
		priceMap.put("pant", "100");
		priceMap.put("harddisc", "3000");
		// end of map
		
		
	}
	
	public static PriceCatalog getCatalog()
	{
		return calalog;
	}
	
	public BillStatus getStatus(String key)
	{
		BillStatus status= new BillStatus();
		if(key == null || priceMap.get(key)==null)
		{
			status.setItem("Sorry" + key + " Not found in Inventory!!");
			status.setPrice("Not Applicable");
			return status;
		}
		status.setItem(key.toUpperCase());
		String price =  priceMap.get(key) + " Rupees only.";
		status.setPrice(price);
		return status;
	}
	
	
	

}
