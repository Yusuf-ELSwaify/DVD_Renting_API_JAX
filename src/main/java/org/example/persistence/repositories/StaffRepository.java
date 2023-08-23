package org.example.persistence.repositories;

import org.example.persistence.models.Staff;

public class StaffRepository extends CRUDRepository<Staff, Short> {
	public static final StaffRepository INSTANCE = new StaffRepository();
	private StaffRepository() {
		super(Staff.class);
	}
}
