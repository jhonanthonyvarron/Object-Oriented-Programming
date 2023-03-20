import java.util.*;

public class Course
{
	public String courseName;
	
	public Course(String courseName)
	{
		this.courseName = courseName;	
	}
	@Override
	public String toString()
	{
		return this.courseName;
	}

}