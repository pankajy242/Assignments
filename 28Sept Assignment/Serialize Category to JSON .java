package com.yash.serialization.json;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import org.codehaus.jackson.map.ObjectMapper;

public class CategoryJson {

	public static void main(String[] args) {

		
		ObjectMapper mapper=new ObjectMapper();
		try {
			
			
			Item item1=new Item();
			item1.setItemId("ITEM001");
			item1.setItemDescription("ITEM 1 description");
			item1.setItemPrice(45000);
			
			Item item2=new Item();
			item2.setItemId("ITEM002");
			item2.setItemDescription("ITEM 2 description");
			item2.setItemPrice(25000);
			
			Item item3=new Item();
			item3.setItemId("ITEM003");
			item3.setItemDescription("ITEM 3 description");
			item3.setItemPrice(7000);
			
			Product product1=new Product();
			product1.setProductId("PROD001");
			product1.setProductDescription("PROD 001 description");
			product1.setItems(Arrays.asList(new Item[] {item1,item2}));
			
			Product product2=new Product();
			product2.setProductId("PROD002");
			product2.setProductDescription("PROD 002 description");
			product2.setItems(Arrays.asList(new Item[] {item3}));
			
			
			SubCategory subCategory1=new SubCategory();
			subCategory1.setSubCategoryId("SubCategory001");
			subCategory1.setSubCategoryDescription("SubCategory 1 description");
			subCategory1.setProducts(Arrays.asList(new Product[] {product1}));
			
			SubCategory subCategory2=new SubCategory();
			subCategory2.setSubCategoryId("SubCategory002");
			subCategory2.setSubCategoryDescription("SubCategory 2 description");
			subCategory2.setProducts(Arrays.asList(new Product[] {product2}));
			
			Category category1=new Category();
			category1.setCategoryId("Category001");
			category1.setCategoryDescription("Category 1 description");
			category1.setCategories(Arrays.asList(new SubCategory[] {subCategory1}));
			
//			Category category2=new Category();
//			category2.setCategoryId("Category002");
//			category2.setCategoryDescription("Category 2 description");
//			category2.setCategories(Arrays.asList(new SubCategory[] {subCategory2}));
			try {	
		//mapper.writeValue(System.out, company);
		
		}catch(Exception e) {}
		finally {
			System.out.close();		}
		
		
		//serialization
		OutputStream os=new FileOutputStream("C:\\\\Users\\\\himanshu.kulshrestha\\\\Documents\\\\Others\\\\category.json");
		mapper.writeValue(os, category1);
		
		InputStream is=new FileInputStream("C:\\\\\\\\Users\\\\\\\\himanshu.kulshrestha\\\\\\\\Documents\\\\\\\\Others\\\\\\\\category.json");
		Category categoryFromJson=mapper.readValue(is, Category.class);
		System.out.println(categoryFromJson);
		PrintStream ps=new PrintStream(System.out);
		ps.printf("Test");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
