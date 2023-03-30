package studio7;

public class Die {
	private int n;
	
	public Die (int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int throwDice() {
		return (int)(Math.random()*n) + 1;
	}
	
	public static void main(String[] args) {
		Die trial = new Die(6);
		System.out.println(trial.throwDice());
	}
}
