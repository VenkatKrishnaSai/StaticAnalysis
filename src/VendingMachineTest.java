import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineTest {

    @Test
    public void Test1(){
        VendingMachine vendingMachine = new VendingMachine();
        String returnValue = vendingMachine.dispenseItem(25,"coke");
        assertTrue(returnValue.equals("Item dispensed."));
    }

    @Test
    public void Test2(){
        VendingMachine vendingMachine = new VendingMachine();
        String returnValue = vendingMachine.dispenseItem(45,"coffee");
        assertTrue(returnValue.equals("Item dispensed."));
    }

    @Test
    public void Test3(){
        VendingMachine vendingMachine = new VendingMachine();
        String returnValue = vendingMachine.dispenseItem(20,"candy");
        assertTrue(returnValue.equals("Item dispensed."));
    }

    @Test
    public void Test4(){
        VendingMachine vendingMachine = new VendingMachine();
        String returnValue = vendingMachine.dispenseItem(40,"candy");
        assertTrue(returnValue.equals("Item dispensed."));
    }

}