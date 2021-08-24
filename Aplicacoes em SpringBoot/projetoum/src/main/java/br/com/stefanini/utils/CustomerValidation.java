package br.com.stefanini.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.stefanini.projetoum.interfaces.ICustomerValidation;

public class CustomerValidation implements ICustomerValidation {
	
	public Boolean isnameCustomer(String name) {
		if(name==null){
			return false;
		}
		if(name.length()<3) {
			return false;
		}
		return true;
	}
	
	public Boolean isEmail(String email) {
		Pattern p = Pattern.compile("[a-zA-z0-9]+@.+\\.[a-z]+");
		Matcher m = p.matcher(email);
		return m.matches();
	}

	@Override
	public Boolean isNameCustomer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
