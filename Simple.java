package epam.task5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Simple {
	private static Logger logger = LogManager.getLogger(App.class);
	public double SimpleInterestCalculator(int principle_amount,int time,double rate){
		
		if(principle_amount<=0){
			logger.error("Amount value either 0 or negitive(-ve)");
			return 0;
		}
		
			logger.info("Simple_Interest Calculator");
			double simpleinterestcalculating=(principle_amount*time*rate)/100;
			logger.info("Total Amount: "+simpleinterestcalculating);
			return simpleinterestcalculating;
		
	}
}