package hash;

public class StudInf {
	private int age;
	private int count;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public StudInf(int age,int count) {   
		super();
		this.age = age;
		this.count = count;
	}
	public StudInf(int age) {
		super();
		this.age = age;
	}
	
	public int HashTable() {
		return age;
	}
	@Override
	public String toString() {
		return "StudInf [age=" + age + ", count=" + count + "]";
	}
	
	
}
