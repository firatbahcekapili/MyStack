
public class test {

	public static void main(String[] args) {

		MyStack stack = new MyStack();

		stack.push("sada");
		stack.push(5);
		stack.push(',');
		stack.search(',');

		stack.pop(); // ',' elemaný silindi
		stack.search(',');

		System.out.println(stack.peek());

		System.out.println(stack.isEmpty());

		System.out.println(stack.lenght());
	}

}
