package com.deloitte.lab9.ex3;


@FunctionalInterface
public interface Accept {
	public abstract boolean accept(String userName, String password);
}