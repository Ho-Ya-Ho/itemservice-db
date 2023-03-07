package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

//@Entity 가 있어야 JPA 가 사용하는 객체라는 것을 JPA 에 알려줄 수 있다.
@Data
@Entity
@Table(name = "item")
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column 이 없어도 Spring boot 와 함꼐 JPA 를 사용하면 자동으로 카멜, 스네이크 케이스를 자동 변환해준다.
    //또한 Column 의 이름과 객체의 이름이 같을 경우 해당 객체의 이름으로 Column Name 이 생성된다.
    @Column(name = "item_name", length = 10)
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
