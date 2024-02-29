package cracking.thecoding.interview.chapter7.object.oriented.design;

public class SingletonClass {
	private static SingletonClass _instance = null;
	protected SingletonClass() {}
	public static SingletonClass getInstance() {
		if (_instance == null) {
			_instance = new SingletonClass();
		}
		return _instance;
	}
}
