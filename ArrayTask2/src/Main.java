
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


        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) ((Math.random() * 100) + 1);
            System.out.println(list[i]);
            SUM+=list[i];
        }
        System.out.println("average = " + (SUM/list.length));



    }




}


