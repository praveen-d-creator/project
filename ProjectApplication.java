package com.inautix.application;
import com.inautix.dao.*;
public class ProjectApplication {

	public static void main(String[] args) {
		ProjectDao p=new ProjectDao();
		p.select();
		//p.update("Moto",1);
		//p.delete(2);
	}
}
