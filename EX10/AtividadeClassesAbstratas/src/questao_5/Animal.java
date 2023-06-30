package questao_5;

public abstract class Animal {
	public Animal() {
		System.out.println("Animal nasce");
	}
	
	public abstract void locomover();
	public abstract void alimentar();
}
