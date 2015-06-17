package chapter2_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceBlankTest {

	@Test
	public void testReplaceMiddle() {//输入空格在中间
		assertEquals("We%20are%20happy", new ReplaceBlank().Replace("We are happy"));
	}

	@Test
	public void testReplaceStart() {//输入空格位于字符串的最前面
		assertEquals("%20We%20are%20happy", new ReplaceBlank().Replace(" We are happy"));
	}
	
	@Test
	public void testReplaceEnd() {//输入空格位于字符串的最后面
		assertEquals("We%20are%20happy%20", new ReplaceBlank().Replace("We are happy "));
	}
	
	@Test
	public void testReplacemoreBlank() {//输入字符串中有连续多个空格
		assertEquals("We%20are%20%20happy%20", new ReplaceBlank().Replace("We are  happy "));
	}
	
	@Test
	public void testReplaceNoBlank() {//输入没有空格的
		assertEquals("Wearehappy", new ReplaceBlank().Replace("Wearehappy"));
	}
	
	@Test
	public void testReplaceAllBlank() {//输入没有空格的
		assertEquals("%20%20%20", new ReplaceBlank().Replace("   "));
	}
	
	@Test
	public void testReplaceNull() {//输入字符串为空
		assertEquals(null, new ReplaceBlank().Replace(null));
	}
	
}
