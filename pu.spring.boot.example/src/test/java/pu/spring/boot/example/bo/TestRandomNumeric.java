package pu.spring.boot.example.bo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pu.spring.boot.example.bo.RandomAlphabetic;
import pu.spring.boot.example.bo.RandomNumeric;

public class TestRandomNumeric
{
RandomNumeric randomNumeric;

@BeforeEach
public void setup()
{
	randomNumeric = new RandomNumeric();
	randomNumeric.setRandom( new Random( 1L ) );
}
@Test
public void testRandomAlphabetic()
{
	assertEquals(      5873, randomNumeric.randomNumeric( 4 ) );
	assertEquals(     44468, randomNumeric.randomNumeric( 5 ) );
	assertEquals(    893732, randomNumeric.randomNumeric( 6 ) );
	assertEquals( 422696209, randomNumeric.randomNumeric( 9 ) );
}
}
