package com.geor;

public class SetKeys {
	
	private String key ;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	@Override
	public int hashCode() {
		return 0 ;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

	@Override
	public String toString() {
		return "{\"key\":\"" + key + "\"}";
	}
	
	
}
