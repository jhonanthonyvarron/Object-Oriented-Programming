import java.util.*;

public class Student
{
	public String studentName;
	public String idNum;
	
	public Student(String studentName)
	{
		this.studentName = studentName;
		//this.idNum = idNum;
	}

	@Override
	public String toString()
	{
		return this.studentName; // + this.idNum;
	}
		

}