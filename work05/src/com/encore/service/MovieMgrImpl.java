package com.encore.service;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.encore.vo.Movie;
public class MovieMgrImpl implements MovieMgr {
	private Movie[ ] moviesi = new Movie[100];
	private Movie[] movies;
	private int index;

	//싱글톤...MovieMgr을 mgr이름으로 객체 생성...getInstance로 생성한 객체를 받아온다.
	private static MovieMgrImpl mgr = new MovieMgrImpl();  
	
	private MovieMgrImpl() {};
	
	/**
	 * 
	 * @return 싱글톤으로 객체 생성하기 위한 메소드
	 */
	public static MovieMgrImpl getInstance() {
		return mgr;
	};
	
	/**
	 * 영화를 MovieManager에 추가하는 메소드
	 * @param m Movie
	 * 추가한 size만큼 배열을 만듦
	 */
	public void add(Movie m) {
		System.out.println(m.getTitle()+" 을 추가합니다.");
		moviesi[index++] = m;
		movies = new Movie[index];
		System.arraycopy(moviesi, 0, movies, 0, index);
		
	}
	
	/**
	 * Movie Manager에 등롣된 모든 영화를 리턴하는 메소드
	 * @return nMovies 등록된 모든 영화가 있는 배열
	 */
	public Movie[] search() {
		System.out.println("모든 영화를 출력합니다.");
		Movie[] nMovies = new Movie[index];
		for(int i=0; i<index;i++){
			nMovies[i] = movies[i]; 
		}
		return nMovies;
	}
	
	/**
	 * @param title 영화 제목
	 * @return realMovies 파라미터를 포함한 영화제목을 가진 영화배열 리턴
	 */
	public Movie[] search(String title) {
		System.out.println("검색어 "+title+" 을(를) 포함한 이름을 가진 영화를 출력합니다.");
		Movie[] nMovies = new Movie[index];
		int temp = 0;
		for(Movie m : movies) {
			if(m==null) break;
			if(m.getTitle().contains(title)) {//포함되면 리턴
				nMovies[temp++]=m;
			}
		}
		//null값을 추리기 위해 다시 for문 동작
		Movie[] realMovies = new Movie[temp]; //이 방법은 array copy가 아닌 null 없애는 방법
		for(int i=0;i<temp;i++) {
			realMovies[i]=nMovies[i];
		}
		return realMovies;
	}
	
	/**
	 * @param name 영화감독 이름
	 * @return nMovies 해당 파라미터를 포함한 영화감독의 영화를 리턴
	 */
	public Movie[] searchDirector(String name) { //다른 방법으루
		System.out.println("감독이름에 "+name+" 이(가) 있는 영화를 출력합니다.");
		int size = 0;
		for(int i=0;i<index;i++) {
			if(movies[i].getDirector().contains(name)) size++;
			}
		// 위의 size만큼 동일 영화 찾음. size만큼으로 배열 만들어 내보내야 null 없이 보냄
		// 뒤에서부터 넣어주기
		Movie[] nMovies = new Movie[size];
		for(int i=0;i<index;i++) {
			if(movies[i].getDirector().contains(name)) {
				nMovies[--size]=movies[i]; 
			}
		}
		return nMovies;
	}
	
	/**
	 * @param genre 영화장르
	 * @return rMovies 해당 파라미터를 포함하는 영화장르의 영화를 리턴
	 */
	public Movie[] searchGenre(String genre) {
		System.out.println("장르에 "+genre+" 이(가) 있는 영화를 출력합니다.");
		int temp = 0;
		Movie[] nMovies = new Movie[index];
		for(Movie m : movies) {
			if(m.getGenre().contains(genre)) {
				nMovies[temp++] = m;
			}
		}
		Movie[] rMovies = new Movie[temp];
		for(int i=0;i<temp;i++) {
			rMovies[i] = nMovies[i];
		}
		return rMovies;
	}
	/**
	 * @param title 영화제목
	 * 해당 파라미타와 일치하는 영화를 MovieManger에서 삭제
	 */
	public void delete(String title) {
		System.out.println(title+" 과/와 일치하는 영화를 삭제합니다.");
		for(int i=0;i<index;i++) {
			if(movies[i]==null) continue;
			if(movies[i].getTitle().equals(title)) {
				
				for(int j=i;j<movies.length;j++) {
					if(j+1 == movies.length) continue;
					movies[j]=movies[j+1];
					}
				index--;
				
			}
		}
		}
		
		
	/**
	 * MovieManger에 등록된 영화 개수 리턴
	 */
	public int getSize() {
		return index;
	}
}







