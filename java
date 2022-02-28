


import java.util.*;

public class student
{
    int rollno,age;
    float cgpa;
    String name = new String();
    String phno = new String();
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        student std[] = new student[10];

        for(int i=0;i<3;i++)
        {
            std[i] = new student();
            System.out.println("Enter Roll No. : ");
            std[i].rollno = sc.nextInt();
            System.out.println("Enter Name : ");
            std[i].name = sc.next();
            System.out.println("Enter Phone No. : ");
            std[i].phno = sc.next();
            System.out.println("Enter Age : ");
            std[i].age = sc.nextInt();
            System.out.println("Enter CGPA : ");
            std[i].cgpa = sc.nextFloat();
            System.out.println();
        }

        float l = std[0].cgpa;
        int s = std[0].age;
        int j=0,k=0;

        for(int i=0;i<3;i++)
        {
            if(std[i].cgpa>l)
            {
                l = std[i].cgpa;
                j=i;
            }
        }

        for(int i=0;i<3;i++)
        {
            if(std[i].name.equals("ANU"))
            {
                System.out.println("Phone number of the student whose name is ANU : "+ std[i].phno );
            }
        }
        for(int i=0;i<3;i++)
        { 
            if(std[i].age<s)
            {
                s = std[i].age;
                k=i;
            }
        }

        System.out.println("Name of the student with highest cgpa : "+ std[j].name);
        
        System.out.println("Roll no. of youngest student in the class : "+ std[k].rollno);


    }
}
