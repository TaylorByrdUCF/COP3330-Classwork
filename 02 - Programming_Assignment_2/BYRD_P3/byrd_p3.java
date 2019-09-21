import java.util.Scanner;
public class byrd_p3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] topics = {"Video Games", "Sleep", "Work", "Food", "Family"};
		int[][] survey = new int[5][10];
		float[] survey_average = new float[5];
		int[] survey_point_sum = new int[5];
		int answer;
		char yn = 'N';
		System.out.printf("[--- Survey of Important Stuff ---]\n\n");
		System.out.printf("Listed below are five topics of great importance. \nYour goal is to rate each topic from least to most important via a scale of 1 to 10.\n");
		System.out.printf("Each rating can only be used once per person per survey. \nExample, you cannot assign the rank of 10 to two different topics.\n\n");
		
		System.out.printf("Todays Topics: \n");
		for(int i = 0; i < topics.length; i++) {
			System.out.println((i + 1) + ". " + topics[i]);
		}
		
		System.out.printf("\nHow many people are taking the Survey? \nPeople: ");
		int people = scnr.nextInt();
		
		for(int i = 1; i <= people; i++) {
			yn = 'N';
			while(yn != 'Y'){
				System.out.printf("\nPerson #%d are your ready? (Y/N): ", i); 
				yn = scnr.next().charAt(0);
				yn = Character.toUpperCase(yn);
			}
			for(int t = 0; t < topics.length ; t++){  //Survey starts here.
					answer = 11;
					while(answer < 1 || answer > 10) {
						System.out.printf("\n%s (1-10): ", topics[t]);
						answer = scnr.nextInt();
					}
					survey[t][answer-1]++;
			}
			System.out.printf("\nPerson #%d, Thank you for taking the survey. \nPlease wait till the end to see the results.\n", i);
		}
		
		System.out.printf("\n[----Results----]\n\n");
		for(int i = -1; i < topics.length; i++) {
			if (i == -1) {
				System.out.printf("|%11s|", "RATINGS");
				for(int num = 1; num <= 10; num++){
						System.out.printf("%3d|", num);
					}
				System.out.printf("%12s|\n", "Average Rate");
				}
			else {
				System.out.printf("|%11s|", topics[i]);
				for(int num = 0; num < 10; num++) { //displays number of occurrences of a rate for a topic here.
					if(num == 9) {
						System.out.printf("%3d|", survey[i][num]);
						survey_average[i] += survey[i][num] * (num+1);
						survey_average[i] /= people;
						System.out.printf("%12.2f|\n", survey_average[i]);
						survey_point_sum[i] += survey[i][num] * (num+1);
					}
					else { 
					System.out.printf("%3d|", survey[i][num]);
					survey_average[i] += survey[i][num] * (num+1);
					survey_point_sum[i] += survey[i][num] * (num+1);
					}
				}

			}
		}
		
		for(int i = 0, min = 0, max = 0; i <= 5; i++) {			// Min and Max Point RATING starts here.
			if(i != 5) {
				if(survey_point_sum[max] <= survey_point_sum[i]) {
					max = i;
				}
				if(survey_point_sum[min] >= survey_point_sum[i]) {
					min = i;
				}
			}
			else {
				System.out.printf("\n\nTopic with the Highest point total: %s with %d total points.\n", topics[max], survey_point_sum[max]);
				System.out.printf("Topic with the Lowest point total: %s with %d total points.\n", topics[min], survey_point_sum[min]);
			}
		}
	
		char quit = 'N';
            while(quit != 'Q') {
                System.out.println("\nPress Q to Quit: ");
                quit = scnr.next().charAt(0);
                quit = Character.toUpperCase(quit);;
            }
		
	}
}


