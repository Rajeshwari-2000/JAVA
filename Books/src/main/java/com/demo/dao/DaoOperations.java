package com.demo.dao;

import java.util.List;

import com.demo.beans.Book;

public interface DaoOperations {

	boolean getuser(String username, String password);

	List<Book> getBooks(String b);

}
