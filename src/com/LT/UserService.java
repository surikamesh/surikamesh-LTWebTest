package com.LT;  

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;  

@Path("/LTService") 

public class UserService {
	
  
   @GET 
   @Produces(MediaType.TEXT_PLAIN) 
   public Response getLocation(@QueryParam("userId") String userId){ 
	   System.out.println(userId);
	   String locationDetail= UserDao.locDetails.get(userId)!=null ? UserDao.locDetails.get(userId):" NO Data ";
      return Response.ok(200).entity(locationDetail).build(); 
   }  
   
   @PUT 
   @Consumes(MediaType.TEXT_PLAIN)
   @Produces(MediaType.TEXT_PLAIN) 
   public Response updateLocation(String latLong){ 
	   String usrId=UserDao.getUserId();
	   UserDao.locDetails.put(usrId, latLong);
	   System.out.println("data received : "+latLong +" user id : "+usrId);
	   String stage=UserDao.locDetails.containsKey(usrId)?"Sucess: "+usrId :"Failed";
	   return  Response.ok(200).entity(stage).build();
	   	   
   }
}