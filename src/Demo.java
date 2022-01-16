/* Q. Write a program to input the elements of a two- dimensional array. Then from this array,
 make two arrays one that stores all odd elements of the two-dimensional array and the other that
  stores all even elements of the array.

Note:-  Resulting arrays will be of ArrayList type*/
import java.util.ArrayList;
import java.util.Scanner;

class Test
{
    int arr[][];
    int row;
    int column;
    ArrayList<Integer> a1;
    ArrayList<Integer> a2;

    Test()
    {
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter the no. of row ");
        row=s.nextInt();
        System.out.print(" Enter the no. of column ");
        column=s.nextInt();
        arr=new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }

        a1=new ArrayList<>();
        a2=new ArrayList<>();



    }

    public void m1()
    {
        for(int i=0;i<row;i++)
        {
            for(int j:arr[i])
            {
                if(j % 2==0)
                {
                    a1.add(j);
                }
                else
                {
                    a2.add(j);
                }
            }
        }

        System.out.println("All even element of array " + a1);
        System.out.println("All odd element of array " + a2);
    }
}
public class Demo {
    public static void main(String[] args) {
        Test obj=new Test();
        obj.m1();
    }

}
