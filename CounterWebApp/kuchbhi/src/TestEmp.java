import java.io.*;

		public class TestEmp{
			public static void main(String[] argv) throws Exception{
			FileOutputStream fos = new FileOutputStream("xx");
			for (byte b = 10; b < 50; b++)
			fos.write(b);
			fos.close();
			RandomAccessFile raf = new RandomAccessFile("xx", "r");
			raf.seek(10);
			int i = raf.read();
			raf.close();
			System.out.println("i = " + i);

	}
}