package democurrency;

import java.util.Currency;
import java.util.Locale;

public class currencydemo {

	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		int amount=10000;
		Currency c=Currency.getInstance(locale);
		System.out.println("using currency code :"+ amount+" "+c.getCurrencyCode());
		System.out.println("using currency symbol :"+ amount+" "+c.getSymbol());
		System.out.println("using currency name :"+ amount+" "+c.getDisplayName());
		 
		
	}

}
