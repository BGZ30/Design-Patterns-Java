package singletonPattern;

public class SingleTonDoubleChecking {

	private volatile static SingleTonDoubleChecking uniqueObject;
	
	private SingleTonDoubleChecking() {}
	
	public static SingleTonDoubleChecking getInstance() {
			if(uniqueObject == null) {
				synchronized( SingleTonDoubleChecking.class) {
					if(uniqueObject == null) {
						uniqueObject = new SingleTonDoubleChecking();
						System.out.println("Created a single object");
					}
				}

			}
			
			else
				System.out.println("There is an objected already created, can't create a nother one.");
			
			return uniqueObject;
		}

}
