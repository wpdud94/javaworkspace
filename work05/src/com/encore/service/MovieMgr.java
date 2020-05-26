package com.encore.service;

import com.encore.vo.Movie;

public interface MovieMgr {
	public void add(Movie m);
	public Movie[] search();
	public Movie[] search(String title);
	public Movie[] searchDirector(String name);
	public Movie[] searchGenre(String genre);
	public void delete(String title);
	public int getSize();
	

}
