package com.example.Endpoint;

import org.example.users.GetUserRequest;
import org.example.users.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.service.UserService;

@Endpoint
public class UserEndpoint {
	@Autowired
	private UserService userservice;
	
	@PayloadRoot(namespace="http://www.example.org/users", localPart="getUserRequest")
	@ResponsePayload
	public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request){
		GetUserResponse response=new GetUserResponse();
		response.setUser(userservice.getUser(request.getName()));
		return response;
	}
	

}
