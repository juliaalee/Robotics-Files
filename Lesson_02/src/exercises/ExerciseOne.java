package exercises;

/*
Lesson _02
In this exercise, you will use if, else if, and else statements to determine dedication of robotics members depending on build season hours
For example:
300+ hours: dedication level = "dedication on steroids"
200+ hours: dedication level = "very dedicated"
150+ hours: dedication level = "really dedicated"
120+ hours: dedication level = "dedicated"
90+ hours: dedication level = "average dedication"
50+ hours: dedication level = "un-dedicated"
else: dedication level = "Eamon"

Good Luck Completing the exercise!
*/

/*
 * @author Surya
 */

public class ExerciseOne 
{
	public static void main(String[] args) 
	{
		String name = "dedicationLevel ";
	int hours = 143;
	String status;
	
	if(hours < 50)
	{
		status = "un-dedicated";
	}
	else if(hours < 90)
	{
		status = "average dedication";
	}
	else if(hours < 120)
	{
		status = "dedicated";
	}
	else if(hours < 150)
	{
		status = "really dedicated";
	}
	else if(hours < 200)
	{
		status = "very dedicated";
	}
	else if(hours < 300)
	{
		status = "dedication on steroids";
	}
	else
	{ 
		status= "Eamon";
	}
	System.out.println(name + status);
	}
	}

	
