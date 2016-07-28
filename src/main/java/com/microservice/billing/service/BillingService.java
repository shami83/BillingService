package com.microservice.billing.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.microservice.billing.model.BillStatus;
import com.microservice.billing.utility.PriceCatalog;



@Path("/billing")
public class BillingService {
	
	
	@GET
	@Path("{name}")
	@Produces(MediaType.TEXT_XML)
	public BillStatus getOrderStatus(@PathParam("name")String name)
	{
		
		System.out.println("Check Item in Inventory ==>" + name);
		return PriceCatalog.getCatalog().getStatus(name.toLowerCase());
	}

}
