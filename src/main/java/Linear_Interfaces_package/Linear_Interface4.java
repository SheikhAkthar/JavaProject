package Linear_Interfaces_package;

import java.util.Locale;

import org.openqa.selenium.support.events.WebDriverEventListener;

public  interface Linear_Interface4 extends WebDriverEventListener {
	
	public boolean eqluals(Object anObj);
	public String indexOf(int nm);
	public int length();
	public String  subString();
	public String subString(int begin, int end);
	public String trim();
	public String charAt();
	public String codePointAt();
	public String codePointbefore();
	public int codePointCount();
	public String compareTo(String cmpt);
	public String compareToIgnoreCase(String ctic);
	public String concat(String con);
	public String contains(CharSequence sh);
	public boolean equalIgnoreCase();
	public String getBytes();
	public String getChars();
	public String isEmpty();
	public String replace();
	public String replaceAll();
	public String spilit(String splt);
	public String subSequence(int a ,int b);
	public String toCharArray();
	public String toLowerCase(Locale locale);
	//public Object wait();
	public void toUpperCase(Locale loacl);
	public String format();

	
	

}
