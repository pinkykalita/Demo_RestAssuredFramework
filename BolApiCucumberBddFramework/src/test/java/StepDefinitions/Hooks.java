package StepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforScenario() throws IOException
	{
		if(ProcessingOptionsStepDefinitions.accessToken==null)
		{
			ProcessingOptionsStepDefinitions obj = new ProcessingOptionsStepDefinitions();
			obj.the_generate_access_token_api_is_available();
			obj.a_request_is_sent_to("generateTokenAPI");
			obj.the_response_should_contain_a_valid_access_token();
		}
		
	}
	

}
