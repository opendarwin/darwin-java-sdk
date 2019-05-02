package com.viglet.darwin.client.sample;

import com.viglet.darwin.client.annotation.DarwinFunction;
import com.viglet.darwin.client.annotation.DarwinTarget;
import com.viglet.darwin.client.annotation.EnableDarwin;

@EnableDarwin(name="SOURCE01")  
public class DarSampleSource {

	@DarwinFunction(function="importDataSAP", description="Access the data from SAP")
	public void importDataSAP() {
		// Method
	}
	
	@DarwinFunction(function="importDataOracle", description="Access the data from Oracle")
	public void importDataOracle() {
		// Method
	}

	@DarwinTarget(name="SERVER01", function="processData")
	@DarwinFunction(function="mergeData", description="Send data to SERVER01")
	public void mergeData() {
		this.importDataSAP();
		this.importDataOracle();
	}
}
