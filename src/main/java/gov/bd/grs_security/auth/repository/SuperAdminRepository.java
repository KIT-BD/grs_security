package gov.bd.grs_security.auth.repository;

import gov.bd.grs_security.auth.model.SuperAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuperAdminRepository extends JpaRepository<SuperAdmin, Long> {
    public SuperAdmin findByUsername(String username);
    @Query(value = "select c.* from grs_users as c where c.user_role_id = ?1", nativeQuery = true)
    public List<SuperAdmin> findByUserRoleId(long role);

    public SuperAdmin findByPhoneNumber(String phoneNumber);
    public Integer countByUsername(String username);
}