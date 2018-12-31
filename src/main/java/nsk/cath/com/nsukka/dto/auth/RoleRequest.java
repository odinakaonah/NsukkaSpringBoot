package nsk.cath.com.nsukka.dto.auth;

import lombok.Data;
import nsk.cath.com.nsukka.enums.RoleName;
import nsk.cath.com.nsukka.enums.RoleType;

import javax.validation.constraints.NotNull;

@Data
public class RoleRequest {

    private Long id;

    @NotNull(message = "RoleRequest nameRequest is required")
    private RoleName name;

    @NotNull(message = "RoleRequest nameRequest is required")
    private RoleType roleType;

    private String description;

}
