package com.jsb.rest.comm.auth;



/**
 * 鉴权信息
 * @author Administrator
 *
 */
public class JSBAuthInfo {
	private String canonRequest; //原始请求拼装的字符串
	private String signedHeader; //头部拼装的字符串
	private String accessKey;    //accessKey
	private String signature;    //请求的签名
	
	public String getCanonRequest() {
		return canonRequest;
	}

	public void setCanonRequest(String canonRequest) {
		this.canonRequest = canonRequest;
	}

	public String getSignedHeader() {
		return signedHeader;
	}

	public void setSignedHeader(String signedHeader) {
		this.signedHeader = signedHeader;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * <p>生成含鉴权信息的头部,例如：
	 * <p>PUT
	 * <p>http%3A%2F%2Flocalhost%3A9905%2FJSBRestful%2Frest%2Ftaobao
	 * <p>Accept:application/xml
	 * <p>x-jsb-sdk-req-timestamp:20160606163202+0000
	 * <p>x-jsb-sdk-req-uuid:2a8eb8e1-0383-4461-a677-54a2fee1427d
	 * <p>Credential=testak,SignedHeaders=Accept;x-jsb-sdk-req-timestamp;x-jsb-sdk-req-uuid,Signature=4acbf79525358cb869cfd95a6f558e0b80bb30591a41e843985f6c69a199e43d

	 * @return
	 */
	public String getAuthorizationContent(){
		StringBuffer sb = new StringBuffer();
		sb.append("Credential="+this.accessKey+",");
		sb.append("SignedHeaders="+this.signedHeader+",");
		sb.append("Signature="+this.signature);
		return sb.toString();
	}
}
