package com.viglet.darwin.client.sample;

import com.viglet.darwin.client.annotation.DarwinFunction;
import com.viglet.darwin.client.annotation.DarwinTarget;
import com.viglet.darwin.client.annotation.EnableDarwin;

@EnableDarwin(name="SERVER01")  
public class DarSampleTarget {

	@DarwinFunction(function="processData", description="Process the data")
	public void processData() {
		this.normalizeData();
		
	}
	
	@DarwinTarget(name="SERVER02", function="savetoDatabase")
	@DarwinFunction(function="normalizeData", description="Normalize the data")
	public void normalizeData() {
		
	}
}
