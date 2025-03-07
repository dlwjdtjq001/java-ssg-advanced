package day13.collablestmt;

import lombok.Data;

@Data
public class DtoTest {
    private String m_seq;
    private String m_userid;
    private String m_pwd;
    private String m_email;
    private String m_hp;
    private String m_registdate;

    @Override
    public String toString() {
        return "m_seq='" + m_seq + '\'' +
                ", m_userid='" + m_userid + '\'' +
                ", m_pwd='" + m_pwd + '\'' +
                ", m_email='" + m_email + '\'' +
                ", m_hp='" + m_hp + '\'' +
                ", m_registdate='" + m_registdate + '\'';
    }
}
