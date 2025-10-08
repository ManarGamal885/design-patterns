package Chapter10.StateMachines;

public class GumballMachine {
    // Initializing states
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;
    int state = SOLD_OUT; // Initial state of the gumball machine
    int count = 0; // Number of gumballs in the machine

    // Constructor to initialize the gumball machine with a certain number of gumballs
    public GumballMachine(int count) {
        this.count = count;
        if( count > 0){
            state = NO_QUARTER;
        }
    }

    // Methods that represent actions on the gumball machine
    // 1 -  insertQuarter
    public void insertQuarter(){
        if(state == NO_QUARTER){
            System.out.println("Quarter inserted");
            state = HAS_QUARTER;
        } else if(state == HAS_QUARTER){
            System.out.println("You can't insert another quarter");
        } else if(state == SOLD){
            System.out.println("Please wait, we're already giving you a gumball");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert a quarter, the machine is sold out");
        }
    }

    // 2 - ejectQuarter
    public void ejectQuarter(){
        if(state == NO_QUARTER){
            System.out.println("You haven't inserted a quarter");
        } else if(state == HAS_QUARTER){
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if(state == SOLD){
            System.out.println("Sorry, you already turned the crank");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        }
    }

    // 3 - turnCrank
    public void turnCrank(){
        if(state == SOLD){
            System.out.println("Turning twice doesn't get you another gumball!");
        } else if(state == NO_QUARTER){
            System.out.println("You turned but there's no quarter");
        } else if(state == SOLD_OUT){
            System.out.println("You turned, but there are no gumballs");
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    // 4 - dispense
    public void dispense(){
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == HAS_QUARTER) {
            System.out.println("You need to turn the crank");
        } else if (state == SOLD_OUT) {
            System.out.println("The machine is sold out");
        }
    }
}
