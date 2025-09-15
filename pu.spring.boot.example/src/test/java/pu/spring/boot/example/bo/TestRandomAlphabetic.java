package pu.spring.boot.example.bo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestRandomAlphabetic
{
RandomAlphabetic randomAlphabetic;

@BeforeEach
public void setup()
{
	randomAlphabetic = new RandomAlphabetic();
	randomAlphabetic.setRandom( new Random( 1L ) );
}

@Test
public void testRandomAlphabetic()
{
	assertEquals( "rahjmyuwwk"     , randomAlphabetic.randomAlphabetic( 10 ) );
	assertEquals( "rxnfmqgeeb"     , randomAlphabetic.randomAlphabetic( 10 ) );
	assertEquals( "eoapezsdzspmqcx", randomAlphabetic.randomAlphabetic( 15 ) );
	assertEquals( "jtgdyxkrpvmwmmp", randomAlphabetic.randomAlphabetic( 15 ) );
}
}
