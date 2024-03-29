package org.xmdl.lib.bo;

/**
 * @author hd
 * @author mca
 */
public class ContextException extends Exception{

	/**
	 * serialization ID
	 */
	private static final long serialVersionUID = 6246770463251572875L;

	public ContextException() {
    }

    public ContextException(String message) {
        super(message);
    }

    public ContextException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContextException(Throwable cause) {
        super(cause);
    }
}
