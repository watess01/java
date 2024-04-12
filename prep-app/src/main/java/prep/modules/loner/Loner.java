package prep.modules.loner;


public class Loner {
	private static int getCount(int[] student_list, int n) {
		int count =0;
		System.out.printf("check %d: ", n);
        for (int j : student_list) {
            if (j == n) {
                count++;
                System.out.printf("%d...", count);
            }
        }
		System.out.printf("count %d.\n", count);
		return count;
	}

	public static int findLoner(int[] student_list) {


		// loop through the array and find the number that doesnt repeat		
		
		int single_student_number = 0;

        for (int j : student_list) {
            int count = getCount(student_list, j);
            if (count == 1) {
                single_student_number = j;
                break;
            }
        }
		return single_student_number;
	}
}
