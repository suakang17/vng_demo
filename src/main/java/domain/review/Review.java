package domain.review;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reviewId")
    private int reviewId;


}
