import java.util.*;



/*
	Criado por Yuri Serrano
*/

public class Tridu{

	public static void main(String[] args){

		int A,B;
		Scanner scan = new Scanner(System.in);

		A = scan.nextInt();
		B = scan.nextInt();

		if(B > A){
			System.out.println(B);
		}else{
			System.out.println(A);
		}

	}
}