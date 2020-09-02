import java.util.*;

public class gradeCalculation {
	public static void main(String[] args) {
		int mark;
		Scanner sc = new Scanner(System.in);
		mark = sc.nextInt();
		if (mark >= 90)
			System.out.println("Grade A");
		else if ((70 <= mark)&&(mark< 90))
			System.out.println("Grade B");
		else if ((50 <= mark)&&(mark< 70))
			System.out.println("Grade C");
		else
			System.out.println("No grade assigned");
		
	}
}
