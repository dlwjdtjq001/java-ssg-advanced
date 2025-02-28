package day11.jdbc.board;

import lombok.Data;

@Data
public class Board {
    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private String bdate;
    private String bfilename;
    private String bfiledata;
}
