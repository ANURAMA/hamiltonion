/*2. Hamiltonian and Lagrangian  Students have become secret admirers of SEGP. They find the course exciting
 *  and the professors amusing. After a superb Mid Semester examination, it’s now time for the results.
 *   The TAs have released the marks of students in the form of an array, where arr[i] represents the marks 
 *   of the ith student. 
 
Since you are a curious kid, you want to find all the marks that are not smaller than those on its right side
 in the array. 
 
Input Format 
The first line of input will contain a single integer n denoting the number of students.
 The next line will contain n space separated integers representing the marks of students. 
 */




package github;
import java.util.*;
public class Hamiltonian {
	public static void main(String args[]) {
		int i,j,n;
		int A[]=new int[10];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(A[j]>A[i])
					break;
			}
			if(j==n)
				System.out.print(A[i]+" ");
		}
		sc.close();
	}
}
