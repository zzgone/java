package ��IO;

public class ������ {

	/**
	 * InputStream���������ֽ��������ĳ����࣬�������ֽ��������ĸ��ࡣ
	 * 
	 * InputStream������ľ����νṹ��
	 * 
	 * ����
	 * InputStream
	 * 
	 * ����
	 * AudioInputStream
	 * ByteArrayInputStream
	 * StringBufferInputStream
	 * FileInputStream
	 * FilterInputStream
	 * 		����
	 * 		BufferedInputStream
	 * 		DataInputSteam
	 * 		PushbackInputStream
	 * 		...
	 * InputStream
	 * ObjectInputStream
	 * SequenceInputStream
	 * PipedInputStream
	 * 
	 * ���������з����������󶼻�����IOException
	 * */
	
	/**
	 * ������
	 * 
	 * read();					���������ж�ȡ���ݵ���һ���ֽڡ�����0-255��Χ��int�ֽ�ֵ�������Ϊ�Ѿ�������ĩβ��û�п��õ��ֽڣ��򷵻�ֵ-1
	 * read(byte[] b);			���������ж���һ�����ȵ��ֽڣ�������������ʽ�����ֽ���
	 * mark(int readlimit);		���������ĵ�ǰλ�÷���һ����ǣ�readlimit������֪���������ڱ��λ��ʧЧ֮ǰ�����ȡ���ֽ���
	 * reset();					������ָ�뷵�ص���ǰ�����ı�Ǵ�
	 * skip(long n);			�����������ϵ�n���ֽڲ�����ʵ���������ֽ���
	 * markSupported();			�����ǰ��֧��mark()/reset()�����ͷ���true
	 * close();					�رմ����������ͷ���������������ϵͳ��Դ
	 * 
	 * 
	 * ע�⣺���������е�InputStream������඼֧��InputStream�ж�������з�������skip(),mark(),reset()�ȣ���Щ����ֻ��ĳЩ��������
	 * */
	
	/**
	 * �ַ���
	 * java�е��ַ���Unicode���룬��˫�ֽڵġ�
	 * InputStream�����������ֽڵģ��ڴ����ַ��ı�ʱ���Ǻܷ��㡣
	 * JavaΪ�ַ��ı��������ṩ��ר��һ�׵�����Reader����Reader�ಢ����InputStream����滻�ߣ�
	 * ֻ���ڴ����ַ���ʱ���˱�̡�Reader�����ַ��������ĳ����࣬�����ַ���������ʵ�ֶ����������ࡣ
	 * Reader���еķ�����InputStream�з������ƣ��ɲ鿴���JDK�ĵ���
	 * Reader��ľ����νṹ��
	 * 
	 * ���ࣺ������
	 * Reader
	 * 
	 * ���ࣺ
	 * CharArrayReader
	 * BufferedReader
	 * 		���ࣺ
	 * 		LineNumberReader
	 * FilterReader
	 * 		���ࣺ
	 * 		PushbackReader
	 * InputStreamReader
	 * 		���ࣺ
	 * 		FileReader
	 * PipedReader
	 * StringReader
	 * */
	
}
