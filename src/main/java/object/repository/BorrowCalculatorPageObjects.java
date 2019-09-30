package object.repository;

public interface BorrowCalculatorPageObjects {
	public String PAGE_TITLE = "";

	// XPath - Element identifier by XPath: Place them here
	public String APPLICATION_TYPE = "//label[contains(.,'Single')]";
	public String NO_OF_DEPENDANTS = "//select";	
	public String BORROW_PROPERTY_TYPE = "//label[contains(.,'Home to live in')]";
	
	public String PRIMARY_INCOME = "//input[@value='0']";
	public String OTHER_INCOME = "(//input[@value='0'])[2]";	
	
	public String LIVING_EXPENSES = "//input[@id='expenses']";
	public String CURRENT_HL_PAYMENT = "//input[@id='homeloans']";
	public String OTHER_LOAN_PAYMENT = "//input[@id='otherloans']";
	public String OTHER_EXPENSES = "(//input[@value='0'])[8]";
	public String CREDIT_CARD_LIMIT = "//input[@id='credit']";
	
	public String BORROWING_CALCULATOR = "//button[contains(.,'Work out how much I could borrow')]";
	
	
	// CSS Selector - Element identifier by CSS Selector: Place them here
	public String BORROW_ESTIMATION_TEXT =".borrow__result__text";
	public String BORROW_ESTIMATION_AMOUNT = ".borrow__result__text__amount";
	public String BORROW_ESTIMATION_ERROR = ".borrow__error__text";
	public String START_OVER			= ".borrow__result >.box--right .icon";    
	public String BTN_START_OVER= "//div[2]/button/span";
	

}
