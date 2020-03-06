package epam.task5;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class House {
	private static Logger logger = LogManager.getLogger(App.class);
	public double costCalculator(String standard_material_used,double area_of_house,String fully_automated_home) {
		double houseconstruction_cost=0;
		if(standard_material_used=="YES" && fully_automated_home=="NO") 
		{
			logger.info("This is STANDARD MATERIAL");
			houseconstruction_cost=area_of_house*1200;
			logger.debug("cost is : "+houseconstruction_cost);
		}
		else if(standard_material_used=="ABOVE_STANDARD_MATERIAL" && fully_automated_home=="NO") 
		{
			logger.info("This is ABOVE STANDARD MATERIAL");
			houseconstruction_cost=area_of_house*1500;
			logger.debug("cost is : "+houseconstruction_cost);
		}
		else if(standard_material_used=="HIGH_STANDARD_MATERIAL" && fully_automated_home=="NO") 
		{
			logger.info("This is HIGH STANDARD MATERIAL");
			houseconstruction_cost=area_of_house*1800;
			logger.debug("cost is : "+houseconstruction_cost);
		}
		else if(standard_material_used=="HIGH_STANDARD_MATERIAL" && fully_automated_home=="YES") 
		{
			logger.info("This is HIGH STANDARD MATERIAL With Fully Automated Home ");
			houseconstruction_cost=area_of_house*2500;
			logger.debug("cost is : "+houseconstruction_cost);
		}
		return houseconstruction_cost;
	}
}
