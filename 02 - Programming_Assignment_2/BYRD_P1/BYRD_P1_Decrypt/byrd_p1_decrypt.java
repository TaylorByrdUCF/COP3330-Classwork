
import java.util.Scanner;
public class byrd_p1_decrypt {
	public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
			int Num, Num_e, N_1, N_2, N_3, N_4;
			
			System.out.println("Enter the encrypted number: ");
			Num_e = scnr.nextInt();
			
			N_1 = Num_e / 1000;
				N_1 = (N_1 + 3) % 10;
			N_2 = (Num_e % 1000) / 100;
				N_2 = (N_2 + 3) % 10;
			N_3 = (Num_e % 100) / 10;
				N_3 = (N_3 + 3) % 10;
			N_4 = Num_e % 10;
				N_4 = (N_4 + 3) % 10;
				
			Num = N_3*1000 + N_4*100 + N_1*10 + N_2;
			
			System.out.printf("The decrypted number is: %d", Num);
			
			
	
}
}
