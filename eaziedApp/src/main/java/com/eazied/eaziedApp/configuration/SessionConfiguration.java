package com.eazied.eaziedApp.configuration;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionConfiguration implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("==== Session is created ====");
		event.getSession().setMaxInactiveInterval(30 * 60);
	}

	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("==== Session is destroyed ====");
		event.getSession().invalidate();
	}
}