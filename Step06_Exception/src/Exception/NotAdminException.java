package Exception;

@SuppressWarnings("serial")
public class NotAdminException extends Exception {
	public NotAdminException() {

	}

	public NotAdminException(String msg) {
		super(msg);
	}
}
