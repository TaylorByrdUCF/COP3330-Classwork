import java.util.Scanner;
	
public class byrd_p1_encrypt {
		public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int Num, Num_e, N_1, N_2, N_3, N_4;
		
		System.out.println("Enter a four digit integer: ");
			Num = scnr.nextInt();
			
			N_1 = Num / 1000;
				N_1 = (N_1 + 7) % 10;
			N_2 = (Num % 1000) / 100;
				N_2 = (N_2 + 7) % 10;
			N_3 = (Num % 100) / 10;
				N_3 = (N_3 + 7) % 10;
			N_4 = Num % 10;
				N_4 = (N_4 + 7) % 10;
				
			
			Num_e = (N_3*1000 + N_4*100 + N_1*10 + N_2);
			
			System.out.printf("The Encrypted integer is: %d", Num_e); 
		
		
 }
}
