package dat3.cars.repository;

import dat3.cars.entity.Car;
import dat3.cars.entity.Member;
import dat3.security.entity.Role;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class MemberRepositoryTest {

    /*@Autowired
    MemberRepository memberRepository;

    static List<Role> m1;

    @BeforeAll
    public static void setupData(@Autowired MemberRepository memberRepository) {
        Member member = new Member("userxx", "1234", "a@b.dk", "Kurt", "Kurtsen", "tgv", "ishøj", "2635");
        member.addRole(Role.USER);
        memberRepository.save(member);
        m1 = member.getRoles();
    }

    @Test
    public void testFindByRoles() {
        Member found = memberRepository.findMemberByRolesIn(m1);
        assertEquals(m1, found.getRoles());
    }*/

}