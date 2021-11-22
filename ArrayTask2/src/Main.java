
//        •Create another array holds 10 positions, give each index
//        a random value between 1 and 100, then find the average
//        of all the values in the array
//        •Take the last array you made and swap 2 different index
//        positions
//        •Take the last array you made and completely reverse the
//        order of the array

public class Main {

    public static void main(String[] args) {

        int SUM = 0;

        //generate a 10-element array with random integers between 1 - 100, inclusive.
        System.out.println("Original Array: ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) ((Math.random() * 100) + 1);
            System.out.print(list[i] + ", ");
            SUM+=list[i];
        }


        System.out.println("average = " + (SUM/list.length));
        //swapping 2 index positions.
        System.out.println("\tAfter swapping the first two elements:");
        int temp = list[0];
        list[0] = list[1];
        list[1] = temp;


        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
        //Reversing the order of the Array.

        System.out.println("");
        for (int i = 0; i < list.length/2; i++) {

            int temp2 = list[i];
            list[i] = list[list.length-1-i];
            list[list.length-1-i] = temp2;
        }
        System.out.println("\tReversed Array:");
        //prints out the reversed list.
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }
}


