package com.VTiger.genericUtil;

import java.util.Random;

import com.github.javafaker.Faker;

public class JavaUtil {
	private JavaUtil()
	{
		
	}
	/**
	 * @author Deepthi
	 * Description : This method create object for JavaUtil
	 * @return objectforJavaUtil
	 */
	public static JavaUtil objectforJavaUtil() {
		JavaUtil js= new JavaUtil();
		return js;
	}
/**
 * @author Deepthi
 * Description : This method generates Random Number
 * 
 * @return random number
 */
	public int generateRandomNumber()
	{
		Random r= new Random();
		return r.nextInt(1000);		
				
	}
	/**
	 * @author Deepthi
	 * Description : This method generates Random FullName 
	 * 
	 * @return random fullname
	 */
	public String getFullName()
	{
	Faker faker=new Faker();
	return faker.name().fullName();
	}
	/**
	 * @author Deepthi
	 * Description :  This method generates Random FirstName
	 * 
	 * @return random firstname
	 */
	public String getFirstName() {
		Faker faker=new Faker();
		return faker.name().firstName();	
	}
	/**
	 * @author Deepthi
	 * Description : This method generates Random LastName
	 * 
	 * @return random Lastname
	 */
	
	public String getLastName() {
		Faker faker=new Faker();
		return faker.name().lastName();	
	}
	
	
	public String getPhoneNumber() {
		Faker faker=new Faker();
		return faker.phoneNumber().cellPhone();
	}
	/**
	 * @author Deepthi
	 * Description : this method selects random number from excel
	 * 
	 * @return random number
	 */
	public int generateRandomnumForInddd() {
		Random r=new Random();
		return r.nextInt(30);
	}
	/**
	 * @author Deepthi
	 * Description :this method selects random number from excel 
	 * @return random number
	 */
	public int generateRandomnumForRatedd() {
		Random r=new Random();
		return r.nextInt(4);
	}
	/**
	 * @author Deepthi
	 * Description :this method selects random number from excel
	 *  
	 * @return random number
	 */
	public int generateRandomnumForTypedd() {
		Random r=new Random();
		return r.nextInt(9);
	}
	/**
	 * @author Deepthi
	 * Description :this method selects random number from excel
	 * 
	 * @return random number
	 */
	public int generateRandomnumForIndd() {
		Random r=new Random();
		return r.nextInt(5);
	}
	/**
	 * @author Deepthi
	 * Description :this method selects random number from Salutation type excel
	 * 
	 * @return random number
	 */
	public int generateRandomnumForSaldd() {
		Random r=new Random();
		return r.nextInt(4);
	}
	
	/**
	 * @author Deepthi
	 * Description :this method selects random number for org from excel
	 * 
	 * @return random number
	 */
	public int generateRandomnumForOrg() {
		Random r=new Random();
		return r.nextInt(10);
	}
}
