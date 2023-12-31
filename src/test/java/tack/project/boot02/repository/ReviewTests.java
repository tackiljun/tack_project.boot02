package tack.project.boot02.repository;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tack.project.boot02.entity.Product;
import tack.project.boot02.entity.ProductReview;


@SpringBootTest
public class ReviewTests {

    ///////////////////////////////////////////////////////////////
    @Autowired
    ProductReviewRepository repository;

    ///////////////////////////////////////////////////////////////
    @Test
    public void insertReview() {

        Long[] pnoArr = {200L, 195L, 190L, 185L};

        for(Long pno : pnoArr) {

            int score = (int)(Math.random() * 5) + 1;

            Product product = Product.builder().pno(pno).build();

            for(int i = 0; i < 10; i++) {

                ProductReview review = ProductReview.builder()
                .content("abcdefg")
                .reviewer("user"+i)
                .score(score)
                .product(product)
                .build();

                repository.save(review);

            } // end for.
            
        }

    }
    
}
