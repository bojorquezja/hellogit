package com.mitocode.beans;

import org.springframework.stereotype.Component;

import com.mitocode.interfaces.IEquipo;

@Component
public class Juventus implements IEquipo{
	
	public String mostrar() {
		// TODO Auto-generated method stub
		return "Juventus";
	}

}
