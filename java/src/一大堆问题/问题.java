package 一大堆问题;

public class 问题 {

	// coutinue
	// return
	// break

	// static
	// final
	// finaly
	// ...

	// 遗留问题，hashcode 与 equals 区别
	// Integer itg_e = 1231;
	// if(itg_d == itg_e){// 条件不成立，包装类判断两个对象是否相等不能用 == ，如果是int类型则可以用
	// System.out.println("==");
	// }
	// if(itg_d.equals(itg_e)){//条件成立
	// System.out.println("equals");
	// }
	// if(itg_d.hashCode() == itg_e.hashCode()){
	// System.out.println("itg_d.hashCode()=");
	// System.out.println(itg_d.hashCode());
	// System.out.println("itg_e.hashCode()=");
	// System.out.println(itg_e.hashCode());
	// System.out.println("hash code");
	// }

	// 疑问，set集合如果添加两组student数据，属性值全部一样，但hashCode不同 会引发什么？

	/* hashCode.
	 * 
	 * 去除集合、数组中的重复数据，增加，删除值。
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 语言的设计者们为什么会这样设计？比如说很常见的一个问题：abstract（抽象）类不能用final进行修饰。这个问题比较好理解：
	 * 因为一个类一旦被修饰成了final
	 * ，那么意味着这个类是不能被继承的，而abstract（抽象）类又不能被实例化。如果一个抽象类可以是final类型的
	 * ，那么这个类又不能被继承也不能被实例化，就没有存在的意义。
	 * 语言的设计者们为什么会这样设计？比如说很常见的一个问题：abstract（抽象）类不能用final进行修饰
	 * 。这个问题比较好理解：因为一个类一旦被修饰成了final
	 * ，那么意味着这个类是不能被继承的，而abstract（抽象）类又不能被实例化。如果一个抽象类可以是final类型的
	 * ，那么这个类又不能被继承也不能被实例化，就没有存在的意义。
	 */
}
