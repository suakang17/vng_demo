package domain.member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "member")
@Getter @Setter
public class Member {
    //필드
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) //autoIncrement를 위한 필수 옵션
    @Column(name = "userId", nullable = false)
    private String userId;

    @Column(name = "name", columnDefinition = "nvarchar", nullable = false)
    private String name;

    @Column(name = "nickName", columnDefinition = "nvarchar", nullable = false)
    private String nickName;

    @Column(name = "gender", nullable = false)
    private char gender;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "standingHeight", nullable = false)
    private int standingHeight;

    @Column(name = "sittingHeight", nullable = false)
    private int sittingHeight;

    @OneToMany(mappedBy = "member")
    private List<Scrap> scrapList;

    public Member(String userId, String name, String nickName, char gender, int age, int standingHeight, int sittingHeight) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.nickName = nickName;
        this.sittingHeight = sittingHeight;
        this.standingHeight = standingHeight;
    }
}


