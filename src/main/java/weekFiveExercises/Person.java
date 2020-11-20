package weekFiveExercises;

import java.util.Objects;

public class Person implements Comparable<Person>
{
	private String name;
	private int age;

	public Person(String name) {
		this(name, 10);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				" age='" + getAge() + '\'' +
				'}';
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.getName());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person Person = (Person) o;
		return age == Person.age &&
				Objects.equals(name, Person.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}
