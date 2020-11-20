package weekFiveExercises;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{
	public static void main(String[] args)
	{
		Map<Person, List<Hobby>> persons = new HashMap<>();

		Person person1= new Student("George",22);
		Person person2 = new Person("Sheila", 76);
		Person person3 = new Employee ("Mike", 42);

		Address address1 =  new Address("Central Park", 35, 3233);
		Address address2 = new Address("New york Stadium", 56, 6565);
		Address address3 = new Address("Atlanta Stadium", 4, 4334);
		Address address4 = new Address("Home", 13,4434);

		List<Address> addressList1 = new ArrayList<>();
		addressList1.add(address1);

		List<Address> addressList2 = new ArrayList<>();
		addressList2.add(address2);
		addressList2.add(address3);

		List<Address> addressList3 = new ArrayList<>();
		addressList3.add(address4);

		Hobby hobby1 = new Hobby("Football", 3, addressList2);
		Hobby hobby2 = new Hobby("Gardening",4,addressList1);
		Hobby hobby3 = new Hobby("Jogging",7, addressList3);

		List<Hobby> hobbies1 = new ArrayList<>();
		hobbies1.add(hobby1);
		hobbies1.add(hobby3);

		List<Hobby> hobbies2 = new ArrayList<>();
		hobbies2.add(hobby2);

		List<Hobby> hobbies3 = new ArrayList<>();
		hobbies3.add(hobby3);

		persons.put(person1,hobbies1);
		persons.put(person2,hobbies2);
		persons.put(person3,hobbies3);

		for (Map.Entry<Person, List<Hobby>> person : persons.entrySet()) {
			if (person.getKey().equals(person1))
			{
				List<Hobby> hobbyList = person.getValue();
				for(Hobby hobby : hobbyList)
				{
					System.out.println(person.getKey().getName() + " has " + hobby.getHobbyName() + " as a hobby and it's practicing at "
							+ hobby.getHobbyLocations() );
				}
			}
		}

	}
}
