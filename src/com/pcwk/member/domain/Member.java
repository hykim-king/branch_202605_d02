/**
 * 파일명: Member.java  <br>
 * 설명:  <br>
 * 작성자: user <br>
 * 작성일: 2026. 5. 13. <br>
 * 버전 : 1.0
 */
package com.pcwk.member.domain;


public class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
