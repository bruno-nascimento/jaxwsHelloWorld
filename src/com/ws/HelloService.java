package com.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ws.Service")
public class HelloService implements Service {

	@Override
	public String getHelloWorldAsString() {
		return "Hello World JAX-WS";
	}

}