package de.be.rhi.crypto;

import java.math.BigDecimal;
import java.util.Calendar;

import org.junit.Test;

public class TransactionTest {

	@Test
	public void testTransaction() {
		Transaction transaction = createTransaction1();
		
		System.out.println(transaction.toString());
	}

	private Transaction createTransaction1() {
		Transaction transaction = new Transaction();
		transaction.setTransactionDate(Calendar.getInstance().getTime());
		transaction.setTransactionType(TransactionType.KAUF);
		
		transaction.setBasisWaehrung(Currency.EUR);
		transaction.setTransaktionsWaehrung(Currency.ETH);
		transaction.setDepotWaehrung(Currency.BTC);
		
		transaction.setKursBasiswaehrung(new BigDecimal("10000"));
		transaction.setKursTransaktionsWaehrung(new BigDecimal("40")); 
			
		transaction.setBetragTransaktionsWaehrung(new BigDecimal("100"));
		
		transaction.setProzentsatzTransactionsGebuehr(new BigDecimal("0.05"));
		
		transaction.setReferenz("rhi12356");
		transaction.setBeschreibung("Transaktion 1");
		return transaction;
	}

}
