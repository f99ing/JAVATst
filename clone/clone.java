
/*************************************************************************
 *   
 *compile:	javac clone.java Employee.java

	run:	java clone

result:		123456
			cxf
			John

 *************************************************************************/

public class clone {

    public static void main(String[] args) {
        Employee original = new Employee();

		original.employeeID = 123456;
		original.firstName = "John";
		original.lastName = "Smith";
		try
		{
			Employee myClone = (Employee)(original.clone());
			myClone.firstName="cxf";
			System.out.println(myClone.employeeID);
			System.out.println(myClone.firstName);
			System.out.println(original.firstName);
		}
		catch (Exception e)
		{
		}
    }
}

