package co.micol.prj;

import co.micol.prj.product.MyPrint;
import co.micol.prj.product.Pencil4B;
import co.micol.prj.tryexam.TryCatchTest;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		RemoteController tv = new SamsungTV();
//		tv.powerOn();
//		tv.powerOff();
//		
//		tv = new LgTV();
//		tv.powerOn();
//		tv.powerOff();
//		
//		Pencil pencil = null;
//		pencil = new Pencil4B();
//		pencil.selectPencil();
//		pencil.pencilInterface(); // pencil 인터페이스가 가지고 있는 기본 메소드
//		
//		pencil = new Pencil6B();
//		pencil.selectPencil();
//		
//		pencil = new Pencil4B();
//		pencil.selectPencil();
//		
//		MyPrint myPrint = new MyPrint();
//		myPrint.powerOn();
//		myPrint.selectPencil();
//		myPrint.powerOff();

//		RemoteController rc;
//		TestInterface ts = new TestInterface(new SamsungTV());
//		
//		rc = ts.rcReturn();
//		rc.powerOn();
//		rc.powerOff();

//		MyPrint myPrint = new MyPrint(new Pencil4B());
//		myPrint.toPrint();

		TryCatchTest trycatchTest = new TryCatchTest();
		try {
			trycatchTest.method1();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("항상 실행하는 구문");
		}

	}
}
