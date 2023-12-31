package tack.project.boot02.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FileBoardImage {

    ////////////////////////////////////////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imgno;

    private String uuid;
    private String fname;
    private int ord;

    public void changeOrd(int ord) {
        this.ord = ord;
    }
    // 게시판에서 이미지 순번정하는 메소드.
    
}
