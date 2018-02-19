import com.qa.domain.Account;
import com.qa.service.Service;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AccountTest {

    private Service service;
    private Account johnBloggs;
    private Account janeBloggs;
    private Account johnGordon;
    private Map<Integer, Account> map = new HashMap<Integer, Account>();

    @Before
    public void init() {
        service = new Service(map);
        johnBloggs = new Account("John", "Bloggs", "1234");
        janeBloggs = new Account("Jane", "Bloggs", "1235");
        johnGordon = new Account("John", "Gordon", "1236");
    }

    @Test
    public void getCountForFirstNameInAccount() {
        Assert.assertEquals(service.getCountForFirstName("John"), 0);
        service.addAccount(johnBloggs);
        service.addAccount(janeBloggs);
        Assert.assertEquals(service.getCountForFirstName("John"), 1);
        service.addAccount(johnGordon);
        Assert.assertEquals(service.getCountForFirstName("John"), 2);
    }
}
