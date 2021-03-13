import java.util.Scanner;
public class Team {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int problems=sc.nextInt();
        int count=0,total=0;;
        int[][] canSolve=new int[problems][3];
        for(int i=0;i<problems;i++)
        {
            for(int j=0;j<3;j++)
            {
                canSolve[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<problems;i++)
        {
            count=0;
            for(int j=0;j<3;j++)
            {
                if(canSolve[i][j]==1)
                {
                    count++;
                }
            }
            if(count>=2)
            {
                total+=1;
            }
        }
        System.out.println(total);
    }
}
