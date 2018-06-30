package com.etc.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, Date> {

	public SimpleDateFormat dsf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public Date convert(String arg0) {
		
		Date d = null;
		
		try {
			d = dsf.parse(arg0);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return d;
	}

	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dsf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String a  = "1991-2-1 19:07:15.666";
		// 字符串 to  Date
		Date d = dsf.parse(a);
		
		System.out.println(d);
		
		Date d1 = new Date();
		
		// Date to 字符串
		String str = dsf.format(d1);
		System.out.println(str);
				
		
		
	}
}
