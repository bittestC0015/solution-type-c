package problem04;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
	public static void main(String[] args) {

		// 문제 생성
		String[][] problem = new String[2][9];
		String saveText = "";
			for(int i=0; i<9; i++) {
				for(int j=0; j<2; j++) {
					problem[j][i] = ""+(i+1)+"x"+((int)(Math.random()*9)+1);
				}
			}
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(problem[j][i]);
				if(j==0)System.out.print(", ");
			}
			System.out.println();
		}
		// 푸는 시간 계산
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		long time = end - start;
		// 푸는시간 텍스트 입력
		saveText += time+"\n";
		
		// 파일 출력
		try {
		    OutputStream output = new FileOutputStream("C:/Users/BIT/test/GUGU.txt");
		    byte[] by=saveText.getBytes();
		    output.write(by);
		} catch (Exception e) {
	            e.getStackTrace();
		}
	}
}