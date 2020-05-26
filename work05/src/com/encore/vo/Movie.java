package com.encore.vo;

/**
 * 
 * @author KJY
 * @since JDK 1.8.5
 * @Version 1 :: 기본 활용
 * 
 *
 */

public class Movie {
	/**
	 * 영화 이름에 해당하는 변수
	 */
	private String title;
	/**
	 * 영화 감독에 해당하는 변수
	 */
	private String director;
	/**
	 * 영화 등급에 해당하는 변수
	 */
	private int grade;
	/**
	 * 영화 장르에 해당하는 변수
	 */
	private String genre;
	/**
	 * 영화 요약에 해당하는 변수
	 */
	private String summary;
	
	public Movie(){};
	
	public Movie(String title, String director, int grade, String genre, String summary) {
		super();
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
		this.summary = summary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "title=" + title + ", director=" + director + ", grade=" + grade + ", genre=" + genre
				+ ", summary=" + summary + "  ";
	}
		
	
}
