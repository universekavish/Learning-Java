
public class Fish implements Prey,Predator{

	@Override
	public void hunt() {
		System.out.println("Fish hunting a smaller fish");
		
	}

	@Override
	public void flee() {
		System.out.println("Fish fleeing from a bigger fish");
		
	}

}
