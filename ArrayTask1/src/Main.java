//        •Create an array that holds 20 positions, give each index a
//        random value between 1-6, then use a for loop to count
//        how many 1's were randomly generated in  the array

public class Main {
    public static void main(String[] args) {

        int count1 = 0;

        int[] ints = new int[20];

        for (int i = 0; i < ints.length; i++) {


            //For this exercise one FOR loop is sufficient.
            ints[i] = (int) ((Math.random() * 6) + 1);
            if(ints[i] == 1){
                count1++;
            }
        }
        System.out.println("1 is found " + count1 + " time(s) in this array.");







    }
}
