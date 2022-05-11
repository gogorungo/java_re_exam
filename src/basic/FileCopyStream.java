package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopyStream {

	public static void main(String[] args) {
		try {
//			FileInputStream fis = new FileInputStream("fff/aaa.txt");
//			FileOutputStream fos = new FileOutputStream("dst/bbb.txt");
			
			FileInputStream fis = new FileInputStream("fff/dog1.jpg");
			FileOutputStream fos = new FileOutputStream("dst/개.jpg");
			
			int i = 0;
			// 중간에 읽어들이는데는 깨짐. 하지만 outputstream 하면 정상
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
				fos.write(i);
			}
			
			
			fos.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
