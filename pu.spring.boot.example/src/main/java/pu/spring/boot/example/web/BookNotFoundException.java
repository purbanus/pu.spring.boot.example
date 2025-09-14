package pu.spring.boot.example.web;

public class BookNotFoundException extends RuntimeException
{
BookNotFoundException()
{
	super( "Book not found" );
}
}
