public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
    int a = 0;
    while (a < amount) {
        System.out.print("*");
        ++a;
    } System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
    int b = 0;
    while (b < amount) {
        System.out.print(" ");
        ++b;
    }
    }

    public static void printTriangle(int size) {
        // 40.2
        int a = 0;
        int b = size;
        int c = size -1;
        int d = 1;
        while (a < size) {
            printWhitespaces(c);
            printStars(d);
            ++d;
            --c;
            ++a;
                    }
    }

    public static void xmasTree(int height) {
        // 40.3
        int start = 0;
        int e = height - 1;
        int d = 1;
        while (start < height) {
            
            printWhitespaces(e);
            printStars(d);
            d = d + 2;
            --e;   
            ++start;
        }
           printWhitespaces(height - 2);
           printStars(3);
           printWhitespaces(height - 2);
           printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(25); //10 ist der richtige Wert
    }
}
