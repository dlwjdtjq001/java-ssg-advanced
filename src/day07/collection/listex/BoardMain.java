package day07.collection.listex;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        //글을 보관 웅영하는 ArrayList 생성
        List<Board> boardList = new ArrayList<>();

        //객체 추가
        boardList.add(new Board("제복1","금또깡", "아ㅋ 오늘 너무 힘드네..."));
        boardList.add(new Board("제복2","은또깡", "아ㅋㅋ 오늘 너무 힘드네..."));
        boardList.add(new Board("제복3","동또깡", "아ㅋㅋㅋ 오늘 너무 힘드네..."));

        //전체 글 목록 수
        int size = boardList.size();
        System.out.println("총 글의 수 : " + size);

        //측정 인덱스의 객체 가져오기
        Board board = boardList.get(1);
        System.out.println(board.toString());

        //글 목록
        System.out.println("총 글의 수");
        boardList.forEach(x -> System.out.println(x.toString()));

        //글 삭제
        boardList.remove(1);
        System.out.println("삭제한 이후");
        boardList.forEach(x -> System.out.println(x.toString()));

        //한번 더 삭제
        boardList.remove(1);
        System.out.println("삭제한 이후");
        boardList.forEach(x -> System.out.println(x.toString()));
    }
}
