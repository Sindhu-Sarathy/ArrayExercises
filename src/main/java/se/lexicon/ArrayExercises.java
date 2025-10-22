package se.lexicon;

import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {


        //To store elements in an array type int
        int[] numbers={10,11,12,20};
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n");

        int[] numArray={1,3,5,7,9};
        int result=indexOf(numArray);
        System.out.println("The Index position of number 5 is : "+ result);

        System.out.println("\n");

        sortArray();
        System.out.println("\n");
        CopyOfArray();
        System.out.println("\n");
        twoDimensionalArray();
        System.out.println("\n");
        GetAnAverage();
        System.out.println("\n");
        OddAndEvenArray();
        System.out.println("\n");
        RemoveDuplicates();
        System.out.println("\n");
        MultiplicationTable();
    }


    //To find and return the index element of an array
    public static int indexOf(int[] numArray){
        int indexToFind=5;
        for(int i=0;i<numArray.length;i++){
            if(numArray[i]==indexToFind){
                return i;
            }

        }
        return -1;
    }

    public static void sortArray(){
        String[] countries={"Paris","London","New York","Stockholm"};
        Arrays.sort(countries);
        System.out.println("The sorted array of the countries are: "+ Arrays.toString(countries));
    }

    public static void CopyOfArray(){
        int[] firstArray={1,15,20};
        int[] secondArray=Arrays.copyOf(firstArray,firstArray.length);

       System.out.println("Elements from first Array: ");
       for(int number:firstArray){
           System.out.print(number + " ");
       }

        System.out.println("\n");

        System.out.println("Elements from second Array: ");
        for(int number:secondArray){
            System.out.print(number + " ");
        }

    }

    public static void twoDimensionalArray(){
        String[][] country=new String[2][2];

        country[0][0]="France";
        country[0][1]="Paris";

        country[1][0]="Sweden";
        country[1][1]="Stockholm";

        for(int i=0;i< country.length;i++){
            for(int j=0;j< country.length;j++){
                System.out.print(country[i][j] + "\t");
            }
        }
        System.out.println("\n");
    }

    public static void GetAnAverage(){
        int[] numbers={43, 5, 23, 17, 2, 14};
        double sum=0;
        int length=numbers.length;

        for(int num:numbers){
            sum +=num;
        }

        Double avg= sum / length;
        System.out.println("The Average is " + avg);
    }

    public static void OddAndEvenArray(){
        int[] allNumbers={1,2,4,6,7,8,9,10,12,14};
        System.out.println("The Array: ");
        for(int num:allNumbers){
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("The Odd Array");
        for(int Oddnum:allNumbers){
            if(Oddnum%2 !=0){
                System.out.print(Oddnum + " ");
            }
        }

    }

    public static void RemoveDuplicates(){
        int[] OriginalArray={20, 20, 40, 20, 30, 40, 50, 60, 50};
        System.out.println("The Original Array is: " );
        for(int num:OriginalArray){
            System.out.print(num + " ");
        }

        int[] unique=new int[OriginalArray.length];
        int uniqueCount=0;

        for(int i =0;i<OriginalArray.length;i++){
            boolean isDuplicate=false;
            for (int j=0;j<uniqueCount;j++){
                if(OriginalArray[i] == unique[j]){
                    isDuplicate=true;
                    break;
                }
            }

            if(!isDuplicate){
                unique[uniqueCount]= OriginalArray[i];
                uniqueCount++;
            }
        }

        System.out.println();
        System.out.println("The Array without duplicate values: ");
        for(int i=0;i<uniqueCount;i++){
            System.out.print(unique[i]+" ");
        }
    }

    public static void MultiplicationTable(){
        int[][] table=new int[10][10];
        int size=10;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                table[i][j]=(i+1)*(j+1);
            }
        }

        System.out.println("The multiplication table is: ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.printf("%4d",table[i][j]);
            }
            System.out.println();
        }
    }
}