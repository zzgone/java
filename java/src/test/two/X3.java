package test.two;

import test.three.X2;
import 接口抽象类继承.子接口;
import 接口抽象类继承.父接口;


public interface X3 extends X2{

	int age = 20;
	String name = "lisi";
	
	int getMoeny();
}



class Te implements X3{

	@Override
	public int getMoeny() {
		
		return X2.age;
	}


	public static void main(String[] args) {
		Te t= new Te();
		System.out.println(t.getMoeny());
		
	}

	
}