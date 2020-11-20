package weekFiveExercises;
public class Student extends Person
{
	public Student(String name) {
		super(name);
	}

	public Student(String name, int age){
		super(name, age);
	}

	@Override
	public String toString() {
		return "Student{" +
				"nume='" + getName() + '\'' +
				"varsta='" + getAge() + '\'' +
				'}';
	}
}
