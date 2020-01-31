
public class Main {

    public static void main(String[] args) {
        MyDate first = new MyDate(15,11,2015);
        MyDate second = new MyDate(15,10,2016);
        MyDate third = new MyDate(25,12,2010);

      
        System.out.println(first.differenceInYears(second));
       
    }
}
