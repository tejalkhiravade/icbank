package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor {

	public static void main(String[] args) 
	{
		//browser Launch
		Object[] input=new Object[2];
		input[0]="gecko";
		input[1]="D:\\banking project\\icBank\\src\\test\\resources\\DRIVERS\\geckodiver.exe";
		SeleniumOperations.browserLaunch(input);
		//application launch
		
		Object[] input1=new Object[1];
		

	}

}
