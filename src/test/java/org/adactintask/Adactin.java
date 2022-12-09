package org.adactintask;

import org.junit.Before;
import org.junit.Test;

public class Adactin extends Baseclass {
	@Before
	public void url() {
		driver.get("https://adactinhotelapp.com/");

	}
@Test
public void exe() {
Pagefac f = new Pagefac();
dataSend(f.getUsername(),"Saahib2020");
dataSend(f.getPassword(),"Saahib2020");
f.getLogin().click();

}
}
