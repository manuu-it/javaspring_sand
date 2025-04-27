package models;

public interface record_wk_Interface {

//	public interface Test {
//		default String value() {
//
//			return "A";
//		}
//	}
	
	public interface Test {
		default void value() {

			System.out.println("test");
		}
	}
}
