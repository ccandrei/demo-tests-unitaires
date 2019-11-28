package dev.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance1() {

		int resultat = StringUtils.levenshteinDistance("lhs", "rhs");
		assertEquals(1, resultat);
	}

	@Test
	public void testLevenshteinDistance2() {

		int resultat = StringUtils.levenshteinDistance("lfs", "rxs");
		assertEquals(2, resultat);
	}
	@Test
	public void testLevenshteinDistance3() {

		int resultat = StringUtils.levenshteinDistance("ldz", "rhs");
		assertEquals(3, resultat);
	}

	@Test
	public void testLevenshteinDistance4() {

		int resultat = StringUtils.levenshteinDistance("ldzf", "rhsd");
		assertEquals(4, resultat);
	}

	@Test
	public void testLevenshteinDistance5() {

		int resultat = StringUtils.levenshteinDistance(null, null);
		assertEquals(0, resultat);
	}

}
