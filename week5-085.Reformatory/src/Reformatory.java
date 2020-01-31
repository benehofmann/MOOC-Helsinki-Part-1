public class Reformatory {

    private int counter = 0;
    
    public int weight(Person person) {
        // return the weight of the person
       
        counter++;
         return person.getWeight();
    }

    public void feed(Person person) {
        int a = person.getWeight();
        a++;
        person.setWeight(a);
    }
    
    public int totalWeightsMeasured() {
        return counter;
    }
}
