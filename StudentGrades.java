import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

/**
 * Created by sagarayi on 31/05/17.
 */
public class StudentGrades {
    public static  void main(String []args)throws IOException
    {
        StudentGrades studentGrades = new StudentGrades();
        int gradeList[] = studentGrades.takeGradeInput();
        int finalGradeList[]= studentGrades.processGradesSubmitted(gradeList);
        studentGrades.displayFinalGrades(finalGradeList);

    }
    public int[] takeGradeInput()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int grades[]=new int[n];
        for(int i =0;i<n;i++)
        {
            grades[i]= Integer.parseInt(br.readLine());
        }
        return grades;
    }
    public int[] processGradesSubmitted(int [] gradeList)
    {
        for(int i = 0;i< gradeList.length ; i++)
        {
            int closestValue = (gradeList[i]+2)%5 ==0  ? 2:1;

            if(gradeList[i]>=38 &&
                    gradeList[i]%5 != 0 &&
                    ((gradeList[i]+2)%5 ==0  ||
                    (gradeList[i]+1)%5 ==0)
                    )
            {
                gradeList[i] = gradeList[i] + closestValue;
            }
        }
        return gradeList;
    }
    public void displayFinalGrades(int []finalGrades)
    {
        for(int i = 0;i<finalGrades.length ; i++)
        {
            System.out.println(finalGrades[i]);
        }
    }

}
