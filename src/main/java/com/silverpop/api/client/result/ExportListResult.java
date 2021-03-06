package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RESULT")
public class ExportListResult implements ApiResult {
	
    @XStreamAlias("SUCCESS")
    private boolean successElement;
    
    @XStreamAlias("JOB_ID")
    private String jobId;
    
    @XStreamAlias("FILE_PATH")
    private String filePath;

	public boolean isSuccessElement() {
		return successElement;
	}

	public String getJobId() {
		return jobId;
	}

	public String getFilePath() {
		return filePath;
	}
}
