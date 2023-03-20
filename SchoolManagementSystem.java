import java.util.ArrayList;


import java.util.*;

//A school management system that keeps track of student records, class schedules, and 
//academic performance. The system can consist of classes such as Student, Course, 
//Instructor, and Grade, which can manage and record relevant academic information.

public class SchoolManagementSystem
{
	public static void main(String[]args)
	{
		//Array List of Students
		Instructor i1 = new Instructor("Jhon Anthony Varron");
		
		i1.students.add(new Student("Jhon Anthony Varron"));
		System.out.println(i1);

























		/*Student student1 = new Student("Jhon Anthony Varron", "21-1-01234");
		Course course1 = new Course("Bachelor of Science in Computer Science");
		Instructor instructor1 = new Instructor ("Prof. Juan dela Cruz", "Intermediate Programming");
		Grade grade1 = new Grade(92.76, 90.82);
		
		System.out.println(student1);
		System.out.println(course1);
		System.out.println("\n" + "---------------------------------------------------------");

		System.out.println(instructor1);

		System.out.println("---------------------------------------------------------");
		System.out.println("Midterm" + "\t" + "|" + "\t" + "Final" + "\t" + "|" +"\t" + "Average" + "\t" + "|" + "\t" + "Remarks" + "\t" + "|");
		System.out.println("---------------------------------------------------------");
		System.out.println(grade1);*/
	}
}