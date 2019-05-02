package com.viglet.darwin.client.sample;

import com.viglet.darwin.client.annotation.DarwinFunction;
import com.viglet.darwin.client.annotation.EnableDarwin;

@EnableDarwin(name="SERVER02")  
public class DarSampleTarget2 {

	@DarwinFunction(function="savetoDatabase", description="Save to Database")
	public void savetoDatabase() {
		
	}
	
}
