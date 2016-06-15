package collectionsassign;

public class Student implements Comparable<Student> {
	private String name;
	private int id;
	private String city;
	
	public Student(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString(){
		return name +"  "+ id +"  "+ city;
	}
	
	
	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
	}
	
}
