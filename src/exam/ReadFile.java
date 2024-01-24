package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	static Scanner scanner;
	static String path = "src\\config\\Words.txt";

	public static void main(String[] args) {
		ReadFile dr = new ReadFile();
		dr.readDictionary();
	}

	public boolean doesFileExist(String path){
		
    try{
        File file = new File(path);
        scanner = new Scanner(file);

      }catch (FileNotFoundException e){
        e.printStackTrace();
         return false;
        }
      return true;
       }
 
    public void readDictionary() {
      doesFileExist(path);
      String[] lineArr= null;
      String[] lineArrSplit = null;

         while ((scanner.hasNext())) {

    	 lineArr = scanner.nextLine().split("-");

    	 System.out.println(lineArr[0]);

    	 lineArrSplit = lineArr[lineArr.length - 1].split(",");

    	 System.out.println(lineArrSplit[0]);

    	 String lastline = lineArrSplit[lineArrSplit.length-1];

    	 System.out.println(lastline);

  }

  }

}