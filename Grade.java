import java.util.*;

public class Grade
{
	public double midtermGrade;
	public double finalGrade;
	
	public Grade(double midtermGrade, double finalGrade)
	{
		this.midtermGrade = midtermGrade;
		this.finalGrade = finalGrade;
	}

	public String computeMidGrade()
	{
		if(midtermGrade>=96.00 && midtermGrade<=100.00)
			return "1.00";
		else if(midtermGrade>=91.50 && midtermGrade<=95.99)
			return "1.25";
		else if(midtermGrade>=87.00 && midtermGrade<=91.49)
			return "1.50";
		else if(midtermGrade>=82.50 && midtermGrade<=86.99)
			return "1.75";
		else if(midtermGrade>=78.00 && midtermGrade<=82.49)
			return "2.00";
		else if(midtermGrade>=73.50 && midtermGrade<=77.99)
			return "2.25";
		else if(midtermGrade>=69.00 && midtermGrade<=73.49)
			return "2.50";
		else if(midtermGrade>=64.50 && midtermGrade<=68.99)
			return "2.75";
		else if(midtermGrade>=60.00 && midtermGrade<=64.49)
			return "3.00";
		else if(midtermGrade>=52.50 && midtermGrade<=59.99)
			return "3.25";
		else if(midtermGrade>=45.00 && midtermGrade<=52.49)
			return "3.50";
		else if(midtermGrade>=37.50 && midtermGrade<=44.99)
			return "3.75";
		else if(midtermGrade>=30.00 && midtermGrade<=37.49)
			return "4.00";
		else if(midtermGrade>=22.50 && midtermGrade<=29.99)
			return "4.25";
		else if(midtermGrade>=15.00 && midtermGrade<=22.49)
			return "4.50";
		else if(midtermGrade>=7.50 && midtermGrade<=14.99)
			return "4.75";
		else
			return "5.00";
	}

	public String computeFinalGrade()
	{
		if(finalGrade>=96.00 && finalGrade<=100.00)
			return "1.00";
		else if(finalGrade>=91.50 && finalGrade<=95.99)
			return "1.25";
		else if(finalGrade>=87.00 && finalGrade<=91.49)
			return "1.50";
		else if(finalGrade>=82.50 && finalGrade<=86.99)
			return "1.75";
		else if(finalGrade>=78.00 && finalGrade<=82.49)
			return "2.00";
		else if(finalGrade>=73.50 && finalGrade<=77.99)
			return "2.25";
		else if(finalGrade>=69.00 && finalGrade<=73.49)
			return "2.50";
		else if(finalGrade>=64.50 && finalGrade<=68.99)
			return "2.75";
		else if(finalGrade>=60.00 && finalGrade<=64.49)
			return "3.00";
		else if(finalGrade>=52.50 && finalGrade<=59.99)
			return "3.25";
		else if(finalGrade>=45.00 && finalGrade<=52.49)
			return "3.50";
		else if(finalGrade>=37.50 && finalGrade<=44.99)
			return "3.75";
		else if(finalGrade>=30.00 && finalGrade<=37.49)
			return "4.00";
		else if(finalGrade>=22.50 && finalGrade<=29.99)
			return "4.25";
		else if(finalGrade>=15.00 && finalGrade<=22.49)
			return "4.50";
		else if(finalGrade>=7.50 && finalGrade<=14.99)
			return "4.75";
		else
			return "5.00";
	}

	public String computeSubAve()
	{
		if((midtermGrade + finalGrade)/2>=96.00 && (midtermGrade + finalGrade)/2<=100.00)
			return "1.00";
		else if((midtermGrade + finalGrade)/2>=91.50 && (midtermGrade + finalGrade)/2<=95.99)
			return "1.25";
		else if((midtermGrade + finalGrade)/2>=87.00 && (midtermGrade + finalGrade)/2<=91.49)
			return "1.50";
		else if((midtermGrade + finalGrade)/2>=82.50 && (midtermGrade + finalGrade)/2<=86.99)
			return "1.75";
		else if((midtermGrade + finalGrade)/2>=78.00 && (midtermGrade + finalGrade)/2<=82.49)
			return "2.00";
		else if((midtermGrade + finalGrade)/2>=73.50 && (midtermGrade + finalGrade)/2<=77.99)
			return "2.25";
		else if((midtermGrade + finalGrade)/2>=69.00 && (midtermGrade + finalGrade)/2<=73.49)
			return "2.50";
		else if((midtermGrade + finalGrade)/2>=64.50 && (midtermGrade + finalGrade)/2<=68.99)
			return "2.75";
		else if((midtermGrade + finalGrade)/2>=60.00 && (midtermGrade + finalGrade)/2<=64.49)
			return "3.00";
		else if((midtermGrade + finalGrade)/2>=52.50 && (midtermGrade + finalGrade)/2<=59.99)
			return "3.25";
		else if((midtermGrade + finalGrade)/2>=45.00 && (midtermGrade + finalGrade)/2<=52.49)
			return "3.50";
		else if((midtermGrade + finalGrade)/2>=37.50 && (midtermGrade + finalGrade)/2<=44.99)
			return "3.75";
		else if((midtermGrade + finalGrade)/2>=30.00 && (midtermGrade + finalGrade)/2<=37.49)
			return "4.00";
		else if((midtermGrade + finalGrade)/2>=22.50 && (midtermGrade + finalGrade)/2<=29.99)
			return "4.25";
		else if((midtermGrade + finalGrade)/2>=15.00 && (midtermGrade + finalGrade)/2<=22.49)
			return "4.50";
		else if((midtermGrade + finalGrade)/2>=7.50 && (midtermGrade + finalGrade)/2<=14.99)
			return "4.75";
		else
			return "5.00";	
	}

	public String remarks()
	{
		if((midtermGrade + finalGrade)/2>=60.00)
			return "Passed";
		else
			return "Failed";
	}

	@Override
	public String toString()
	{
		return computeMidGrade() + "\t" + "|" + "\t" + computeFinalGrade() + "\t" + "|" + "\t" + computeSubAve() + "\t" + "|" + "\t" + remarks() + "\t" + "|";
	}
}