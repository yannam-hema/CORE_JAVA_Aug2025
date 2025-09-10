package com.gqt.challenges.ExceptionHandling;

import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

public class Challenge23 {
public static void main(String[] args) {
	try {
		ByteBuffer b = ByteBuffer.allocate(3);
		b.put((byte)12);
		b.put((byte)13);
		b.put((byte)14);
		b.put((byte)15);
	}catch (BufferOverflowException e) {
		System.out.println(e);
	}	
}
}
