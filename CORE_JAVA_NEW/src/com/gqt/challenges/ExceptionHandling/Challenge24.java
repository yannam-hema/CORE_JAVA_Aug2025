package com.gqt.challenges.ExceptionHandling;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public class Challenge24 {
public static void main(String[] args) {
	try {
	ByteBuffer b = ByteBuffer.allocate(2);
	b.put((byte)11);
	b.flip();
	System.out.println(b.get());
	System.out.println(b.get());
	}catch (BufferUnderflowException e) {
		System.out.println(e);
	}
}
}
