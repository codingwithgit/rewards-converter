import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
    }
}



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RewardValueTests {
	
	
	

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        double milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getCashValue());
    }

    @Test
    void convert_from_cash_to_miles() {
    	double cashValue = 100;
        double expectedMilesValue = cashValue / 0.0035; 
        var rewardValue = new RewardValue(cashValue);
        double actualMilesValue = rewardValue.getMilesValue();
        assertEquals(expectedMilesValue, actualMilesValue);
       // assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
    	    double milesValue = 10000;
    	    double expectedCashValue = milesValue * 0.0035; 
    	    var rewardValue = new RewardValue(expectedCashValue,milesValue);
    	    double actualCashValue = rewardValue.getCashValue();
    	    assertEquals(expectedCashValue, actualCashValue);
      //  assert false;
    }
}
