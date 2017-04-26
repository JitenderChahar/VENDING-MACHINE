package com.java.vending;

import java.util.List;

import com.java.vending.domain.Coin;
import com.java.vending.domain.Item;
import com.java.vending.utils.Bucket;

/**
 * Decleare public API for Vending Machine
 * 
 */
public interface VendingMachine {
	public long selectItemAndGetPrice(Item item);

	public void insertCoin(Coin coin);

	public List<Coin> refund();

	public Bucket<Item, List<Coin>> collectItemAndChange();

	public void reset();
}
