package core_concepts.interface_examples;

interface CommonPageMethods{
	public void WaitForElement();
	public void clickOnElemrnt();
}

class BasePage implements  CommonPageMethods{
	@Override
	public void WaitForElement() {
		System.out.println("wait logic");
	}
	
	@Override
	public void clickOnElemrnt() {
		System.out.println("click logic");
	}
}

public class TestFramework {
}
