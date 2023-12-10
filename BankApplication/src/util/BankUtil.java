package util;

 import com.hdfc.service.BankImpTwo;
 import com.hdfc.service.ibank;

public class BankUtil { // Factory


	public static ibank    getBankObj() { // Factory method


		return  new BankImpTwo();
	}

}
