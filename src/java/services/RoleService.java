package services;

import dataaccess.RoleDB;
import java.util.List;
import models.Role;

public class RoleService {
    public List<Role> getAll(int roleID) throws Exception {
        RoleDB roleDB = new RoleDB();
        List<Role> roles = roleDB.getAll(roleID);
        return roles;
    }
}
