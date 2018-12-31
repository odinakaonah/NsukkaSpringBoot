/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsk.cath.com.nsukka.repo.auth;

import nsk.cath.com.nsukka.model.auth.PasswordRecoveryCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface PasswordRecoveryCodeRepo extends JpaRepository<PasswordRecoveryCode, Long> {
    @Query("SELECT r FROM PasswordRecoveryCode r WHERE r.recoveryCode = ?1")
    public PasswordRecoveryCode findRecoveryCode(String recoveryCode);
}
