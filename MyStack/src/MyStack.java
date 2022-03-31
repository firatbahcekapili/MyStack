import java.util.ArrayList;

public class MyStack {

	ArrayList<Object> yýgýn = new ArrayList<Object>();
	int lenght;

	public Object push(Object ekle) {

		yýgýn.add(ekle);
		return ekle;
	}

	public Object pop() {
		int lenght = yýgýn.size();
		Object a = yýgýn.get(lenght - 1);
		yýgýn.remove(lenght - 1);
		return a;

	}

	public Object peek() {

		lenght = yýgýn.size();
		return yýgýn.get(lenght - 1);
	}

	public void search(Object ara) {

		if (yýgýn.contains(ara))
			System.out.println("Aradýðýnýz "+" ' "+ara +" ' "+" elemaný Stack'in "+yýgýn.indexOf(ara)+". indexinde bulunmaktadýr.");
		else
			System.out.println("Aradýðýnýz "+" ' "+ara +" ' "+" elemaný Stack'te bulunmamaktadýr.");

	}

	public boolean isEmpty() {
		return yýgýn.size() == 0;
	}
	
	public int lenght() {
		return yýgýn.size();
	}
}
