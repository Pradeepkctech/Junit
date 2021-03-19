package com.training.testtimeout;

public class MessageUtils {
private String name;

public  MessageUtils(String name) {
	this.name=name;
	
}
public String print() {
System.out.println(name);
return name;
}

public String welcome() {
	name="Welcome"+name;
	System.out.println(name);
	return name;
}
}
