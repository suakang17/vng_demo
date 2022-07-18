package domain.review;

import domain.member.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Table(name = "review")
@Getter @Setter
public class Review {
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reviewId", nullable = false)
    private Long reviewId;

    @JoinColumn(name = "userId") //FK
    private Member writer;

    @JoinColumn(name = "placeId") //FK venue
    private Place place;

    @JoinColumn(name = "performanceId") //FK show
    private Performance performance;

    @JoinColumn(name = "artistId") //FK artist
    private Artist artist;

    //seat

    @Column(name = "rating") //evaluation
    private float rating;

    @Column(name = "writingTime")
    private LocalDateTime writingTime;

    @Column(name = "photoReview", columnDefinition = "varchar") //pictures
    private String photoReview;

    public Review (Long reviewId, float rating, LocalDateTime writingTime, String photoReview) {
        this.photoReview = photoReview;
        this.rating = rating;
        this.reviewId = reviewId;
        this.writingTime = writingTime;

    }
}
