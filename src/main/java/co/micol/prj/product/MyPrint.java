package co.micol.prj.product;

import co.micol.prj.service.Pencil;
import co.micol.prj.service.RemoteController;

public class MyPrint implements RemoteController {
	private Pencil pencil; // toPrint 메소드에 더 추가하고 싶은 내용이 있을떄?? 그냥 implements 한다음엔 안되나 ?
	
	public MyPrint(Pencil pencil) {
		this.pencil = pencil;
	}

	@Override
	public void powerOn() {
		System.out.println("프린트 전원을 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("프린트 전원을 끈다.");
	}
	
	public void toPrint() {
		System.out.print("나는 ");
		pencil.selectPencil();
		
	}
	
	
	


}
