package com.training.librarymanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity

public class Book {
	@Id
	private String bookid;
	private String bookname;
	private String bookdescription; 
	private Long bookprice;
	
}
