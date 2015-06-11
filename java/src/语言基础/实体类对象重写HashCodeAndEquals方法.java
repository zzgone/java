package 语言基础;

public class 实体类对象重写HashCodeAndEquals方法 {
	// 快捷方法，eclipse右键，source，生成hashCode and equals 即可
}

class Cat{
	
	private String name;
	private int age;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Cat other = (Cat) obj;
		
		if (age != other.age)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
}

class Test{
	
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.setAge(10);
		c1.setColor("hei");
		c1.setName("kity");
		
		Cat c2 = new Cat();
		c2.setAge(10);
		c2.setColor("hei");
		c2.setName("kity");
		
		System.out.println(c2.hashCode() == c1.hashCode());
		
		Cat c3 = c1;
		System.out.println(c1.equals(c3));
		
	}
}