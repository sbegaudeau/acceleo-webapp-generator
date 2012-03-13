package org.eclipse.acceleo.tutorial.webapp.services;

public class StringFormat {

	public static String convertInHtmlId(String s) {
		
		s = s.trim();
		if (s.length() > 0) {
			s = s.toLowerCase();
			s = s.replace(' ', '-');
			s = s.replace('_', '-');
		}
		return s;
	}
	
}