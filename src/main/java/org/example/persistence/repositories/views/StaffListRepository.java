package org.example.persistence.repositories.views;

import org.example.persistence.models.views.StaffList;
import org.example.persistence.repositories.ReadRepository;

public class StaffListRepository extends ReadRepository<StaffList, Integer> {
	public StaffListRepository() {
		super(StaffList.class);
	}
}
