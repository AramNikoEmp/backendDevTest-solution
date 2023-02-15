package com.backenddev.app.exception;

import org.springframework.http.HttpStatus;

public class ControllerCommonException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -65725476533391897L;
	
	private HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
	
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
    
    /**
     * Constructs a exception with detail message
     * @param httpStatus
     * @param message
     */
    public ControllerCommonException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
    }

}
