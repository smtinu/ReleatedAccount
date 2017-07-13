package com.ReleatedAccounts.ReleatedAccounts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ReleatedAccounts.ReleatedAccounts.ReleatedAccountsController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReleatedAccountsApplicationTests {

	@Test
	public void connection(){
		String  msisdn = "966561732435";
		ReleatedAccountsController test= new ReleatedAccountsController();
		test.checkInfo(msisdn);

	}

}
