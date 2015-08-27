package 多线程;

public class Thread与Runnable的区别 {

	/**
	 * Thread是一个类，一个实现了Runnable接口的的类，调用Thread.run()实际上是调用了Runnable.run() (java代理模式)
	 * 如果一个类继承Thread，则不适合资源共享。但是如果实现了Runable接口的话，则很容易的实现资源共享。
	 * */
}
