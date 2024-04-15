package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter @Setter(value = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class Address {
    private String city;
    private String street;
    private String zipcode;

    //의미있는 메소드를 만들 수 있다.
    private String fullAddress(){
        return getCity() + getStreet() + getZipcode();
    }
}
