package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;

public class LocatorsDemo extends BaseTest {
    @Test
	public void testAllLocators() {
		page.navigate("https://trytestingthis.netlify.app/");
        //using ID attribute
		page.locator("#fname").fill("sita");
		//using name attriute
		page.locator("input[name='lname']").fill("kumar");
		//using radio button-value type and index
        page.locator("input[value='male']").check();
        page.locator("input[type='radio']").nth(1).check();
       
    //  Dropdown using ID  page.locator("select#option").selectOption("option 3");
        page.locator("#option").selectOption("option 2");

        //  Option 1 checkbox   page.locator("input[type='checkbox'][value='Option 1']").check();
        page.locator("input[name='option1']").check();
        page.getByLabel("Option 1").check();

        //  Checkbox using name
        page.locator("input[name='option1']").check(); // Option 1
        page.locator("input[name='option2']").check(); // Option 2

        //  XPath (avoid if possible, but sometimes needed)
        page.locator("//input[@type='date']").fill("2023-12-25");

        //  Use visible text of buttons or links
        page.getByText("Click Me").click();

        //  Role Selector (for accessibility)
       // page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
        page.pause();
    
    }
}
