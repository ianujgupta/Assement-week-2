package org.dxctraining.HotelManagement.ui;

import javax.tools.JavaCompiler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GuestMain {
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	        context.register(JavaCompiler.class);
	        context.refresh();
	}
	
}