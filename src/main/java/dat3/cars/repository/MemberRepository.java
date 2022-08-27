package dat3.cars.repository;

import dat3.cars.entity.Member;
import dat3.security.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, String> {

    Member findMemberByRoles(List<Role> roles);
}
