package com.cloudant;
/**
 * Represents optional configuration properties for connecting to CloudantDB.
 * @author Ganesh K Choudhary
 */
public class ConnectOptions {

	private int socketTimeout;
	private int connectionTimeout ;
	private int maxConnections ;
	
	private String proxyHost ;
	private int proxyPort ;
	
	public ConnectOptions(){
		// default constructor
	}

	public ConnectOptions setSocketTimeout(int socketTimeout) {
		this.socketTimeout = socketTimeout;
		return this ;
	}

	public ConnectOptions setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
		return this ;
	}

	public ConnectOptions setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
		return this ;
	}

	public ConnectOptions setProxyHost(String proxyHost) {
		this.proxyHost = proxyHost;
		return this ;
	}

	public ConnectOptions setProxyPort(int proxyPort) {
		this.proxyPort = proxyPort;
		return this ;
	}

	public int getSocketTimeout() {
		return socketTimeout;
	}

	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	public int getMaxConnections() {
		return maxConnections;
	}

	public String getProxyHost() {
		return proxyHost;
	}

	public int getProxyPort() {
		return proxyPort;
	}
	
	
	
	
}
