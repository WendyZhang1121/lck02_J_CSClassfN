package lck02_J_CSClassfN;

import java.text.DateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

class Base {

	static DateFormat format = DateFormat.getDateInstance(DateFormat.MEDIUM);
	public Date parse(String str) throws ParseException, java.text.ParseException { 
		try {
			synchronized (Class.forName("Base")) { 
				return format.parse(str);
			}
		} catch (ClassNotFoundException x) {
			// "Base" not found; handle error 
			}
		return null; 
	}
}
