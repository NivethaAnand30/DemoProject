package org.junit.demo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class Sample {
	@Test
	public void test1() {
		System.out.println("test1");
		Assert.assertEquals(true, true);
		System.out.println("Done test1");

	}

	@Test
	public void test2() {
		System.out.println("test2");
		Assert.assertEquals(true, false);
		System.out.println("Done test2");

	}

	@Test
	public void test3() {
		System.out.println("test3");
		Assert.assertEquals(false, true);

		System.out.println("Done test3");

	}

	@Test
	public void test4() {
		System.out.println("test4");
		Assert.assertEquals(false, false);
		System.out.println("Done test4");
	}
}
