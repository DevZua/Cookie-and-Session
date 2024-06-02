package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {

    private Long id; // 데이터베이스 ID

    @NotEmpty
    private String loginId;  // 사용자 로그인 ID
    @NotEmpty
    private String name; // 사용자 이름
    @NotEmpty
    private String password;

}
