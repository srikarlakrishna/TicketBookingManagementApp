package com.infotech.book.ticket.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TicketNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 9070227800205123011L;

	public TicketNotFoundException(String exception) {
		super(exception);
	}

}