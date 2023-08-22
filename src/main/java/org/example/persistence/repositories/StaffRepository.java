package org.example.persistence.repositories;

import org.example.persistence.models.Staff;

public class StaffRepository extends CRUDRepository<Staff, Short> {
	public StaffRepository() {
		super(Staff.class);
	}
}
