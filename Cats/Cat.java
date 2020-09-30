/**
 * A Cat class
 */
public class Cat {
	
	//attributes
	private String name;
    private Date birthDate;
    private boolean hasLongHair;

    /**
     * Fully specified constructor - all fields passed in
     * 
     * @param newName  - name of the cat
     * @param longHair - true if long haired
     * @param newDate  - birth date
     */
	public Cat(String newName, boolean longHair, Date newDate) {
		setName(newName); //like this
		setLongHair(longHair);
		setBirthDate(newDate);
	}

    //"setters" - methods to set private attributes

	public void setName(String newName) {
		name = newName;
	}
	
	public void setLongHair(boolean newLongHair) {
		hasLongHair = newLongHair;
	}
	
	public void setBirthDate(Date newDate) {
		if (newDate!=null)
			birthDate = newDate;
	}

	//"getters" - methods to get private attributes
	public String getName() {
		return name;
		//everything bellow a return statment won't run		
	}
	
	public boolean isLongHair() {
		return hasLongHair;
	}
	
	public Date getBirthDate() {
		return new Date(birthDate);
    }
    
	/**
	 * toString method - converts the Cat contents into a String that can be printed by 
	 * whoever calls this method
	 */
	public String toString() {
		String result = "Cat, Name:" + name + ", ";
		if (hasLongHair) {
			result+="long-haired, ";
		}
		else result+="short-haired, ";
		result += "birthdate: " + birthDate;
		return result;
	}

}
