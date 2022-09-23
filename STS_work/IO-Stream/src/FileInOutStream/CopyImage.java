package FileInOutStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args) throws IOException {

     FileInputStream fis = new FileInputStream("f://maa.jpg");
     
     FileOutputStream fos =new FileOutputStream("e://maa1.jpg");
     
     int i = fis.read();
     
     while(i != -1) {
    	 fos.write(i);
    	 i= fis.read();
     }
     
    fos.flush();
    fos.close();
    fis.close();
    System.out.println("Image copied...");
		
	}

}
