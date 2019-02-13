package com.study.annotations.database;

@DBTable(name = "MEMBER")
public class Member {
    @SQLString(30) private String firstName;
    @SQLString(50) private String lastName;
    @SQLInteger private Integer age;
    @SQLString(value = 30,
    constraints = @Constraints(primaryKey = true)) private String handle;
    static int memberCount;

    public String getHandle() {return handle;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String toString() {return handle;}
    public Integer getAge() {return age;}
}
