import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testClass {
    bankAccount bankAccountForUnitTesting = new bankAccount();

    @Test()
    public void verifyDepositFeature() {
        bankAccountForUnitTesting.depositAmount(10000);
        Assert.assertEquals(10000, bankAccountForUnitTesting.seeBalance(), 0);
    }

    @Test()
    public void verifyWithdrawFeature() {
        bankAccountForUnitTesting.depositAmount(10000);
        bankAccountForUnitTesting.withdrawAmount(1000);
        Assert.assertEquals(9000, bankAccountForUnitTesting.seeBalance(), 0);
    }

    @Test()
    public void verifyInterestFeature() {
        bankAccountForUnitTesting.depositAmount(10000);
        bankAccountForUnitTesting.withdrawAmount(1000);
        bankAccountForUnitTesting.addInterest(6.5);
        Assert.assertEquals(9585, bankAccountForUnitTesting.seeBalance(), 0);
    }
}
