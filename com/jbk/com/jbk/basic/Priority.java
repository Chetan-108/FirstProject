package com.jbk.basic;

import org.testng.annotations.Test;


public class Priority {

		@Test
		public void b() {
			System.out.println("b");
		}
		@Test
		public void c() {
			System.out.println("c");
		}
		@Test
		public void a() {
			System.out.println("a");
		}
		@Test
		public void A() {
			System.out.println("A");
		}
		@Test
		public void D() {
			System.out.println("D");
		}
	
}
