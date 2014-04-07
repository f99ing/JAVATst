public class Employee implements Cloneable {
	public int employeeID;
	public String firstName;
	public String lastName;
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}