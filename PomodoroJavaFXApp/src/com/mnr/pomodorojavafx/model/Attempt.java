package com.mnr.pomodorojavafx.model;

public class Attempt {
	private String mMessage;

	private int mRemaingSeconds;
	
	private AttemptKind mKind;

	public Attempt(AttemptKind kind, String message) {
		this.mMessage = message;
		this.mKind = kind;
		this.mRemaingSeconds = kind.getTotalSeconds();
	}

	public String getMessage() {
		return mMessage;
	}

	public void setMessage(String mMessage) {
		this.mMessage = mMessage;
	}

	public int getRemaingSeconds() {
		return mRemaingSeconds;
	}

	public AttemptKind getKind() {
		return mKind;
	}
	
	
	
	
}
