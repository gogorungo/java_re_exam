package basic;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyer {

	public static void main(String[] args) {
		try {

//			FileReader fis = new FileReader("fff/aaa.txt");
//			FileWriter fos = new FileWriter("dst/ccc.txt");
			
			// 이미지를 2byte 씩 보내면 강제로 늘려버리기 때문에 이미지가 깨지고 용량이 비정상적이 된다
			FileReader fis = new FileReader("fff/dog1.jpg");
			FileWriter fos = new FileWriter("dst/개1.jpg");
			
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
