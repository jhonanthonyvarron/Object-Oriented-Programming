import java.util.*;

public class Instructor
{
	public ArrayList<Student> students;
	public ArrayList<Course> course;
	public ArrayList<Grade> grades;
	public String instructorName;
	public String subject;
	public String offeringNumber;


	public Instructor() //String course, String instructorName, String subject, String offeringNumber, double grades)
	{
		this.students = new ArrayList<Student>();
		/*this.course = course;
		this.instructorName = instructorName;
		this.subject = subject;
		this.offeringNumber = offeringNumber;
		this.grades = grades;*/
	}

	public Instructor(ArrayList<Student> students) //String course, String instructorName, String subject, String offeringNumber, double grades)
	{
		this.students = students;
		/*this.course = course;
		this.instructorName = instructorName;
		this.subject = subject;
		this.offeringNumber = offeringNumber;
		this.grades = grades;*/
	}

	public Instructor(String instructorName) //String course, String instructorName, String subject, String offeringNumber, double grades)
	{
		this.students = new ArrayList<Student>();
		this.course = new ArrayList<Course>();
		this.instructorName = instructorName;
		this.subject = subject;
		this.offeringNumber = offeringNumber;
		this.grades = new ArrayList<Grade>();
	}

	@Override
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		//return this.students; // + this.course + this.instructorName + this.subject + this.offeringNumber this.grades;
		for (var x : this.students)
		{
			s.append(x.toString());
		}

		return s.toString();
	}
}