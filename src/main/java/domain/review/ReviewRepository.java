package domain.review;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

public interface ReviewRepository extends JpaAttributeConverter<Review, Integer> {
}
