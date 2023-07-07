package skill;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic_librarey.Baseclass;

public class testscript3 extends Baseclass{
	@Test
	public void test1 () {
		SoftAssert soft=new SoftAssert();
		home.clickgearTab();
		home.clickskillrarydemoapp();
		web.handleChildBrowser();
		
	
		soft.assertEquals(demoapp.getpageHeader(),"SkillRary-ECommerce");

//		web.scrollTillElement(demoapp.getcontactus(web));///may be worng
//		demoapp.clickcontactus();
		
		
		web.scrollTillElement(demoapp.scrollgetcontactus(web));
		demoapp.clickcontactus();
		
		soft.assertTrue(contact.getcontactUsicon().isDisplayed());
		
		
//Map<String, String>map	=excel.readdata("sheet1")
Map<String, String> map = excel.readdata("Sheet1");





		contact.senkeys(map.get("Full name"),map.get("Email"), map.get("Subject"), map.get("Message"));
		soft.assertAll();
		
		
		
		
		
		
		soft.assertAll();
		
		
	}

}
