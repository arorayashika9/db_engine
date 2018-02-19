package pack_db_engine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@org.junit.jupiter.api.Test
	void test() {
		Goal1 g2=new Goal1();
		String result=g2.operator();
		assertEquals("hello",result);
		fail("Not yet implemented");
	}

}
