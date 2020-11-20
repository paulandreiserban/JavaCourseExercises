package weekFiveExercises;
public class Address
{
	private String street;
	private Integer streetNumber;
	private Integer postalCode;

	public Address(String street, Integer streetNumber, Integer postalCode)
	{
		this.street = street;
		this.streetNumber = streetNumber;
		this.postalCode = postalCode;
	}

	/**
	 * Gets street.
	 *
	 * @return value of street
	 */
	public String getStreet()
	{
		return street;
	}
}
