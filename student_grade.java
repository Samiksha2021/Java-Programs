import java.util.Scanner;
class student_grade
{
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Enter The Five Subject Marks :");
		int phy = n.nextInt();
		int chem = n.nextInt();
		int bio = n.nextInt();
		int maths = n.nextInt();
		int comp = n.nextInt();
		int tot = phy+chem+bio+maths+comp;
		float percentage = tot/5;
		System.out.println("Total :"+tot);
		System.out.println("Percentage :"+percentage);	
		if(percentage>=90)
			System.out.println("Grade A");
		else if(percentage>=80)
			System.out.println("Grade B");
		else if(percentage>=70)
			System.out.println("Grade C");
		else if(percentage>=60)
			System.out.println("Grade D");
		else if(percentage>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
    
}
}
