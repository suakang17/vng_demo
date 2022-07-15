package domain.member;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table( name = "member")
public class Member {
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoIncrement를 위한 필수 옵션
    @Column(name = "userId")
    private int userId;

    @Column(name = "name", columnDefinition = "nvarchar")
    private String name;

    @Column(name = "nickName", columnDefinition = "nvarchar")
    private String nickName;

    private char gender;
    private int age;
    private int standingHeight;
    private int sittingHeight;



}
