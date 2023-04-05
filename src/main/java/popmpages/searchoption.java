package popmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_librarey.WebDriverUtility;

public class searchoption {
	@FindBy(xpath = "//img[@alt=\"SkillRary\"]")
	private WebElement logo1;
	@FindBy(xpath = "//a[text()=' Core Java For Selenium Trainin']")
	private WebElement javaselenium;
	
	@FindBy(xpath = "//img[@alt=\"SkillRary\"]")
	private WebElement logo2;
//	@FindBy(xpath = "//div[@class=\"vp-target hidden\"]")
//	private WebElement palybutton;
//	@FindBy(xpath = "//div[@class=\"vp-preview vp-preview-cover vp-preview-invisible\"]")
//	private WebElement playbutton;
//	@FindBy(xpath = "//*[name()='svg'][@class=\"PlayButton_module_playIcon__af9e9913\"]")
//	private WebElement palybutton;
//	@FindBy(xpath = "//*[name()='svg'][@class=\"PlayButton_module_pauseIcon__af9e9913\"]")
//	private WebElement pausebutton;
	@FindBy(xpath = "//span[text()=\"Add To Wishlist\"]")
	private WebElement Wishlist;
//	@FindBy(xpath = "//*[name()='svg'][@class=\"enter-fullscreen-icon\"]")
//	private WebElement fullscreen;//it is not work in finding xpath in full screen mode
	
@FindBy(xpath = "//div[@class='vp-video-wrapper transparent']")
private WebElement moseover;
	
	
	//intilization
	
	public searchoption(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getlogo1() {
		return logo1;

	}
	public WebElement getlogo2() {
		return logo2;

	}
	

//	public void clickjfullscreen() {
//		fullscreen.click();
//	}
	public void clickjavaselenium() {
		javaselenium.click();
	}
	

	public void moseover(WebDriverUtility web) {
	web.mouseHover(moseover);
	}
	public void clickmouseover() {
		moseover.click();
	}
	public void clickWishlist() {
		Wishlist.click();
	}

//	public void clickpausebutton() {
//		pausebutton.click();
//	}
	
}
