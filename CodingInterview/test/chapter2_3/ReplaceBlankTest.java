package chapter2_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceBlankTest {

	@Test
	public void testReplaceMiddle() {//����ո����м�
		assertEquals("We%20are%20happy", new ReplaceBlank().Replace("We are happy"));
	}

	@Test
	public void testReplaceStart() {//����ո�λ���ַ�������ǰ��
		assertEquals("%20We%20are%20happy", new ReplaceBlank().Replace(" We are happy"));
	}
	
	@Test
	public void testReplaceEnd() {//����ո�λ���ַ����������
		assertEquals("We%20are%20happy%20", new ReplaceBlank().Replace("We are happy "));
	}
	
	@Test
	public void testReplacemoreBlank() {//�����ַ���������������ո�
		assertEquals("We%20are%20%20happy%20", new ReplaceBlank().Replace("We are  happy "));
	}
	
	@Test
	public void testReplaceNoBlank() {//����û�пո��
		assertEquals("Wearehappy", new ReplaceBlank().Replace("Wearehappy"));
	}
	
	@Test
	public void testReplaceAllBlank() {//����û�пո��
		assertEquals("%20%20%20", new ReplaceBlank().Replace("   "));
	}
	
	@Test
	public void testReplaceNull() {//�����ַ���Ϊ��
		assertEquals(null, new ReplaceBlank().Replace(null));
	}
	
}
