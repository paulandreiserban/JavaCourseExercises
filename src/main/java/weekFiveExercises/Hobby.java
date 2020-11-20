package weekFiveExercises;
import java.util.List;

public class Hobby
{
	private String name;
	private Integer frequency;
	private List<Address> addressList;

	public Hobby(String name, Integer frequency,List<Address> addressList)
	{
		this.name = name;
		this.frequency = frequency;
		this.addressList = addressList;
	}

	public String getHobbyName()
	{
		return name;
	}

	public String getHobbyLocations()
	{
		String locations = "";
		for(Address address : addressList)
		{
			//System.out.println(address.getStreet());
			locations = locations + address.getStreet() + " and ";
		}

		locations = locations.substring(0,locations.length() - 5);
		return  locations;
	}

}
