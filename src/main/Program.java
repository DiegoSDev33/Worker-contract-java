package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		
		
		// formatar a minha data com o padrao BR
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Department dep = new Department("Musica");
		
		
		Worker tab1 = new Worker("Diego", WorkerLevel.JUNIOR, 1200.0, dep);
		Date data;
	try { data =	sdf.parse("22/09/2023");
	
		HourContract test = new HourContract(data, 70.0,12);
		
	}catch(ParseException e) {
		System.out.println(e.getMessage());
	}
		
		
		
		
		
	}

}
