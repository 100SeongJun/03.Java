package blood.transfusion.service;

public class NotExistException extends Exception {
	public NotExistException() {

	}

	public NotExistException(String msg) {
		super(msg);
	}

}
