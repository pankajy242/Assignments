package com.yash.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.Scanner;

public class ExtensionFile {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter file extension : ");
		String extension = input.next();
		
		File file = new File("D:\\JavaTrainingIO");
		FileSystem fileSystem = FileSystems.getDefault();
		Iterable<FileStore> stores=fileSystem.getFileStores();
		
		File[] allTextFiles=file.listFiles(new FileFilter() {
			public boolean accept(FileSystem fileSystem) {
             if(fileSystem.getFileStores().endsWith("txt")) {
            	 return true;
             }
				return false;
			}

			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return false;
			}
		});
		for(File txtFile:allTextFiles) {
			System.out.println(txtFile);
		}

	}

}