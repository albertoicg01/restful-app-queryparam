package com.lordcodemx.springrest.springrest;
import java.text.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestApplication {

	public static void main(String[] args) throws ParseException {

		SpringApplication.run(SpringRestApplication.class, args);
		/*String sDate1="31/12/1998";
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		System.out.println(sDate1+"\t"+date1);*/
	}



}
