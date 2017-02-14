public class ArraysUse {
    public static void main(String[] args) {

        int[] array1 = {1, 1,2,7,11,31, 3};
        int sum = 0;
        for (int number : array1)
            sum += number;



     int [] array2 = {1,-2,5,110,66,73,13,54,13};
        int max = 0;
        for(int number : array2)
            if(number>0 && max<number)
                max = number;




        int [] array3 = {1,2,3,4,5,8,2,6,45,1};
        int product = 1;
        for(int number : array3)
            product *= number;


        int [] array4 = {1,56,32,5,42,56};
        int first = array4[0];
        int last = array4[array4.length - 1];




        int [] array5 = {1,5,15,54,23,12,61,62};
        int largest = array5[0];
        int secondLargest = array5[0];
        for (int number : array5)
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest)
                secondLargest = number;





        System.out.println(sum);

        System.out.println(max);

        System.out.println("Multiplication: " + product);

        System.out.println("First: " + Math.abs(first));

        System.out.println("Last: " + Math.abs(last));

        System.out.println("Second largest: " + secondLargest);



    }

}
