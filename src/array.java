public class array {
    public static void main(String[] args) {

        int[] new_array1 = {5, 1, 2, 1, 2, 1};// (приоритет багов)
        int max = new_array1[0];

        for (int i = 1; i < new_array1.length-1; i++) {
            if (new_array1[i] > new_array1[i + 1] && new_array1[i] > new_array1[i - 1]) max = new_array1[i];

        }
                System.out.println(max);
            }

        }


