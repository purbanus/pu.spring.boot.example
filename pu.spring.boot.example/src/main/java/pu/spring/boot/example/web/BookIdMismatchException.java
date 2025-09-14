package pu.spring.boot.example.web;

public class BookIdMismatchException extends RuntimeException
{
public BookIdMismatchException()
{
	super( "Book id mismatch" );
}
}
