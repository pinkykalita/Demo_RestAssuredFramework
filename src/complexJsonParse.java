import org.testng.Assert;

import files.demoPayload;
import io.restassured.path.json.JsonPath;

public class complexJsonParse {

	public static void main(String[] args) {

	JsonPath jp = new JsonPath(demoPayload.coursePrice());
	
	/*Total course count returned by API*/
	int count = jp.getInt("courses.size()");
	System.out.println(count);
	
	
	/*Print purchase amount*/
	Float purchaseAmount = jp.getFloat("dashboard.purchaseAmount");
	System.out.println(purchaseAmount);
	
	
	/*print title of the first course*/
	String firstCourse = jp.getString("courses[0].title");
	System.out.println(firstCourse);
	
	
	/*Print all courses and their respective prices*/
	for(int i=0;i<count;i++)
	{
		String courseTitle = jp.getString("courses["+i+"].title");
		Float courseAmount = jp.getFloat("courses["+i+"].price");
		System.out.println("Course name: "+courseTitle+"\t\tCourse Amount: "+courseAmount);
	}
	
	
	/*print no of copies sold by RPA course*/
	for(int i=0;i<count;i++)
	{
		String courseTitle = jp.getString("courses["+i+"].title");
		if(courseTitle.equalsIgnoreCase("rpa"))
		{
			int RPAcopies = jp.get("courses["+i+"].copies");
			System.out.println("no of copies sold by RPA course: "+RPAcopies);
		}
	
	}
	
	/*Verify sum of all courses prices matches with purchase amount*/
	int sum = 0;
	for(int i=0;i<count;i++)
	{
		int price = jp.getInt("courses["+i+"].price");
		int copies = jp.get("courses["+i+"].copies");
		sum = sum + price*copies;
	}
	
	System.out.println("Total price of all the course: "+sum);
	Assert.assertEquals(purchaseAmount, sum,"Total price is not same as purchase amount");
	System.out.println("Purchase Amount: "+purchaseAmount);
	
	
	
}

	
}
