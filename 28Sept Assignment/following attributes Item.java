
import java.io.Serializable;

public class Items implements Serializable {
	
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int itemId;
	   private String itemDescription;
	   private int itemQuantityAvailable; 
	   private double itemUnitPrice;
	   private int itemDiscountPercentage;
	   
	   public Items() {}

	public Items(int itemId, String itemDescription, int itemQuantityAvailable, double itemUnitPrice,
			int temDiscountPercentage) {
		super();
		this.itemId = itemId;
		this.itemDescription = itemDescription;
		this.itemQuantityAvailable = itemQuantityAvailable;
		this.itemUnitPrice = itemUnitPrice;
		this.itemDiscountPercentage = temDiscountPercentage;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getItemQuantityAvailable() {
		return itemQuantityAvailable;
	}

	public void setItemQuantityAvailable(int itemQuantityAvailable) {
		this.itemQuantityAvailable = itemQuantityAvailable;
	}

	public double getItemUnitPrice() {
		return itemUnitPrice;
	}

	public void setItemUnitPrice(double itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public int getTemDiscountPercentage() {
		return itemDiscountPercentage;
	}

	public void setTemDiscountPercentage(int temDiscountPercentage) {
		this.itemDiscountPercentage = temDiscountPercentage;
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemDescription=" + itemDescription + ", itemQuantityAvailable="
				+ itemQuantityAvailable + ", itemUnitPrice=" + itemUnitPrice + ", temDiscountPercentage="
				+ itemDiscountPercentage + "]";
	}
	   
	   

}

//Serialization of Items------------------------------------
package com.yash.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ItemSerialization {

	public static void main(String[] args) {
		
		Items item = new Items();
	
		item.setItemId(1);
		item.setItemDescription("LAPTOP");
		item.setItemQuantityAvailable(5);
		item.setItemUnitPrice(900000);
		item.setTemDiscountPercentage(10);
		
		try (OutputStream os = new FileOutputStream("C:\\Users\\himanshu.kulshrestha\\Documents\\Others\\items.ser");
			ObjectOutputStream oos = new ObjectOutputStream(os);) {
			oos.writeObject(item);
			System.out.println("Serialization : Successfully DONE");

		} catch (IOException e) {
			System.out.println("Serialization : Fail");
			e.printStackTrace();
		}
		System.out.println();
		System.out.println(item);

	}

}

//De-serialization of items

package com.yash.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ItemDeserialization {
	public static void main(String[] args) {

		

		try (InputStream fis = new FileInputStream("C:\\Users\\himanshu.kulshrestha\\Documents\\Others\\items.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
			) 
		{
			Items item = (Items)ois.readObject();
			System.out.println(item);

		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
