import java.util.Scanner;
public class byrd_p2 {

	public static void main(String[] args) {
		double weight, height, BMI=0;
		char measure_system , Re = 'Y';
		Scanner sc = new Scanner(System.in);
		
		//Setting up a repeatable program loop.
		while(Re == 'Y' || Re == 'y') {
		
		System.out.printf("[------BMI CALCULATOR------]\n\n");
		System.out.printf("Do you use the Metric or Imperial \nSystem of measurements? ");
		measure_system = 'N';
		
		//Making sure the user selects the correct measuring system.
		while(measure_system == 'N') {
		measure_system = sc.next().charAt(0);
		if(measure_system == 'M' || measure_system == 'm') {
			System.out.print("Enter weight in Kilograms: ");
				weight = sc.nextDouble();
			System.out.print("Enter height in Meters: ");
				height = sc.nextDouble();
				
			BMI = weight/(Math.pow(height, 2));
		}
		
		else if(measure_system == 'I' || measure_system == 'i'){
			System.out.print("Enter weight in Pounds: ");
				weight = sc.nextDouble();
			System.out.print("Enter height in Inches: ");
				height = sc.nextDouble();
				
			BMI = (703 * weight)/(Math.pow(height, 2));	
		}
		else{
			System.out.print("Not a valid input. Try again ");
			measure_system = 'N';
		}
		}
		
			System.out.printf("\n\n");
			
		//Printing things out and making them look pretty.
			System.out.printf("[------RESULTS------]\n");
			System.out.printf("Your BMI: %.1f\n\n", BMI);
		
			System.out.printf("BMI Categories: \n");
		
			if(BMI < 18.5) {
				System.out.printf("Underweight = <18.5  <----- Yours\n");
				System.out.printf("Normal weight = 18.5 - 24.9 \nOverweight = 25-29.9 \nObesity = BMI  of 30 or greater\n");
			}
			else if(BMI >= 18.5 && BMI <=24.9) {
				System.out.printf("Underweight = <18.5 \nNormal weight = 18.5 - 24.9 <---- Yours\n");
				System.out.printf("Overweight = 25-29.9 \nObesity = BMI of 30 or greater\n");
			}
			else if(BMI >24.9 && BMI <= 29.9) {
				System.out.printf("Underweight = <18.5 \\nNormal weight = 18.5 - 24.9 \nOverweight = 25-29.9  <---- Yours\n");
				System.out.printf("Obesity = BMI of 30 or greater\n");
			}
			else {
				System.out.printf("Underweight = <18.5 \\nNormal weight = 18.5 - 24.9 \nOverweight = 25-29.9 \nObesity = BMI of 30 or greater <---- Yours\n");
			}
		
			System.out.printf("\nWould you like to Calculate another BMI? (Y/N): ");
			Re = sc.next().charAt(0);
			}
		}
	}
		
		
		
		
