
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
     int sumEuros = this.euros + added.euros;
     int sumCents = this.cents + added.cents;
     
     if(sumCents > 100) {
         sumEuros = sumEuros + (sumCents / 100);
         sumCents %= 100;
     }
     Money Sum = new Money(sumEuros, sumCents);
     
     return Sum;
    }
    
    public boolean less(Money compared) {
        if(this.euros == compared.euros) {
            if(this.cents < compared.cents) {
                return true;
            }
        }
        if(this.euros < compared.euros) {
        return true;    
        } else {
            return false;
        }
        
    }
    
    public Money minus(Money decremented) {
        int decrementEuros = this.euros - decremented.euros;
        int decrementCents = this.cents - decremented.cents;
        
        if (decrementCents < 0) {
            decrementEuros--;
            decrementCents += 100;
        }
        if (decrementEuros < 0) {
            decrementEuros = 0;
            decrementCents = 0;
        }
        
        Money Difference = new Money(decrementEuros, decrementCents);
        return Difference;
    }

}
