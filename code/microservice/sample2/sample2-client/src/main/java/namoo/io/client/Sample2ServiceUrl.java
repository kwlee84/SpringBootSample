package namoo.io.client;

import javax.ws.rs.HttpMethod;

public enum Sample2ServiceUrl {
	
	URL_REP_ACCOUT_FIND("/ws/users", HttpMethod.GET)
	;
	
	private String serviceUrl;
    private String method;

    Sample2ServiceUrl(String serviceUrl, String httpMethod) {
        //
        this.serviceUrl = serviceUrl;
        this.method = httpMethod;
    }

    public String getUrl() {
        return this.serviceUrl;
    }

    public String getMethod() {
        return this.method;
    }

}
