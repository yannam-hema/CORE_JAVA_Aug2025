package com.gqt.challenges.Interface;
interface Runnable{
	void run();
}
interface callable{
	void call();
}
class thread implements Runnable{
	@Override
	public void run() {
		System.out.println("thread is running");
	}
}
class task implements callable{
	@Override
	public void call() {
    System.out.println("task is called");
	}
}
public class Challenge31 {
public static void main(String[] args) {
	thread t = new thread();
	t.run();
	task tk = new task();
	tk.call();
}
}
