import java.util.ArrayList;

public class MyStack {

	ArrayList<Object> y�g�n = new ArrayList<Object>();
	int lenght;

	public Object push(Object ekle) {

		y�g�n.add(ekle);
		return ekle;
	}

	public Object pop() {
		int lenght = y�g�n.size();
		Object a = y�g�n.get(lenght - 1);
		y�g�n.remove(lenght - 1);
		return a;

	}

	public Object peek() {

		lenght = y�g�n.size();
		return y�g�n.get(lenght - 1);
	}

	public void search(Object ara) {

		if (y�g�n.contains(ara))
			System.out.println("Arad���n�z "+" ' "+ara +" ' "+" eleman� Stack'in "+y�g�n.indexOf(ara)+". indexinde bulunmaktad�r.");
		else
			System.out.println("Arad���n�z "+" ' "+ara +" ' "+" eleman� Stack'te bulunmamaktad�r.");

	}

	public boolean isEmpty() {
		return y�g�n.size() == 0;
	}
	
	public int lenght() {
		return y�g�n.size();
	}
}
