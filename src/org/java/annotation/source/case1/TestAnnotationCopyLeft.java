package org.java.annotation.source.case1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestAnnotationCopyLeft {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void readCopyLeft() {
		 // read the value from @CopyLeft Annotation
		 System.out.println("CopyLeft info:" + Book.class.getAnnotation(CopyLeft.class).value());
	}

}
