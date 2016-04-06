package com.alibaba.example.rest.api;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by dell on 2016/4/6.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UserEntity implements Serializable{
    @NotNull
    @Min(1L)
    private Long id;

    @JsonProperty("username")
    @XmlElement(name = "username")
    @NotNull
    @Size(min = 6, max = 50)
    private String name;

    @JsonProperty("gender")
    @XmlElement(name = "gender")
    private String gender;
    @JsonProperty("age")
    @XmlElement(name = "age")
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
