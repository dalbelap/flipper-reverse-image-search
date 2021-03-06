package gal.udc.fic.muei.tfm.dap.flipper.web.rest.dto;


import gal.udc.fic.muei.tfm.dap.flipper.domain.User;

/**
 * A DTO extending the UserDTO, which is meant to be used in the user management UI.
 */
public class ManagedUserDTO extends UserDTO {

    private String id;

    public ManagedUserDTO() {
    }

    public ManagedUserDTO(User user) {
        super(user);
        this.id = user.getId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ManagedUserDTO{" +
            "id=" + id +
            "} " + super.toString();
    }
}
