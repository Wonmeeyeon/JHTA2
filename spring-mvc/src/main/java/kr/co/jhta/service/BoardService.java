package kr.co.jhta.service;

import java.util.List;

import kr.co.jhta.vo.Board;

public interface BoardService {
	
	List<Board> getAllBoards();
	
	void addNewBoard(Board board);
	
	Board getBoardDetail(long boardNo);
	
	void inceraseBoardLikes(long boardNo);
	
	void modifyBoardDetail(Board board);
	
	void deleteBoard(long boardNo, String password);

}
