package 接口抽象类继承;

public interface 子接口 extends 父接口 {
	//神马也没有
}

// 测试类
class TestInterface implements 子接口{

	@Override
	public String getName() {
		return "zhaoliu";
	}

	@Override
	public int getAge() {
		return 999;
	}

	
}