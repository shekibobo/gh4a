package com.gh4a;

import java.io.IOException;

public class TwoFactorAuthException extends IOException {
    private static final long serialVersionUID = 1L;
    private IOException e;
	private String twoFactorAuthType;
	
	public TwoFactorAuthException(IOException e, String twoFactorAuthType) {
		this.e = e;
		this.twoFactorAuthType = twoFactorAuthType;
	}

	public IOException getE() {
		return e;
	}

	public void setE(IOException e) {
		this.e = e;
	}

	public String getTwoFactorAuthType() {
		return twoFactorAuthType;
	}

	public void setTwoFactorAuthType(String twoFactorAuthType) {
		this.twoFactorAuthType = twoFactorAuthType;
	}
	
}
