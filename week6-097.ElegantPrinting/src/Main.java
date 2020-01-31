
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {

     
for (int buffer = 0; buffer < array.length - 1; buffer++) {
    System.out.print(array[buffer] + ", ");
}
        System.out.print(array[array.length - 1]);
     
     
    }
}
