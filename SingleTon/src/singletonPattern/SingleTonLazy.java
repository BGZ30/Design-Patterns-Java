package singletonPattern;

public class SingleTonLazy {

	private static SingleTonLazy lazyObject;
	
	private SingleTonLazy() {}
	
	public static SingleTonLazy getInstance() {
		if(lazyObject == null) {
			lazyObject = new SingleTonLazy();
			System.out.println("Created a single object");
		}
		
		else
			System.out.println("There is an objected already created, can't create a nother one.");
		
		return lazyObject;
	}

}
