import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new MyDate(day, month, year);
    }
    
    public Person(String name, MyDate birthday) {
        this.birthday = birthday;
        this.name = name;
    }
    
    public Person (String name) {
       this.name = name;
       MyDate CurrentDay = new MyDate((Calendar.getInstance().get(Calendar.DATE)), (Calendar.getInstance().get(Calendar.MONTH) + 1), (Calendar.getInstance().get(Calendar.YEAR)));
       this.birthday = CurrentDay;
    }
    
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int currentday = (Calendar.getInstance().get(Calendar.DATE));
        int currentmonth = (Calendar.getInstance().get(Calendar.MONTH) + 1);
        int currentyear = (Calendar.getInstance().get(Calendar.YEAR));
        
        MyDate CurrentDay = new MyDate(currentday, currentmonth, currentyear);
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        
        
        
        return this.birthday.differenceInYears(CurrentDay);
    }
    
    public boolean olderThan(Person compared) {
        // return true wenn "olderthan" älter ist!!
//        System.out.println(this.birthday);
//        System.out.println(compared.birthday);
//        System.out.println(this.birthday.differenceInYears(compared.birthday));

if (this.birthday.earlier(compared.birthday)) {
    return true;
} else {
    return false;
}

            
        
        // compare the ages based on birthdays
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
   
}
