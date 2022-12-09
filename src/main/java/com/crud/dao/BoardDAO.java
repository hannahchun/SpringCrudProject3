package com.crud.dao;

import com.crud.bean.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BoardDAO {
    @Autowired
    SqlSession sqlSession;

    // 글 추가
    public int insertBoard(BoardVO vo) {
        int result = sqlSession.insert("Board.insertBoard", vo);
        return result;
    }

    // 글 삭제
    public int deleteBoard(int id) {
        return sqlSession.delete("Board.deleteBoard", id);
    }

    // 글 수정
    public int updateBoard(BoardVO vo) {
        int result = sqlSession.update("Board.updateBoard", vo);
        return result;
    }

    // 글 가져오기
    public BoardVO getBoard(int id) {
        BoardVO one = sqlSession.selectOne("Board.getBoard", id);
        return one;
    }

    // 글 목록 가져오기
    public List<BoardVO> getBoardList() {
        List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
        return list;
    }
}