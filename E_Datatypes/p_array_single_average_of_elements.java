package E_Datatypes;

public class p_array_single_average_of_elements {
    public static void main(String[] args) {
        int sum = 0, arrayLength;
        double avg = 0.0;
        int marks[] = { 23, 45, 22, 90, 67, 89, 45, 67, 12 };
        for (int mark : marks) {
            sum += mark; // sum = sum + mark;
        }
        arrayLength = marks.length;
        avg = (double) sum / arrayLength;
        System.out.println("Average of array elements = " + avg);
    }
}
