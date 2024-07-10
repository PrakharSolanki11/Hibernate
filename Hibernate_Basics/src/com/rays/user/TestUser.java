package com.rays.user;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUser {

	public static void main(String[] args) {

		// testAdd();
		// testUpdate();
		// testDelete();
		 testFindByPk();
		//testAuth();
		 //testSearch();

	}

	private static void testSearch() {

		UserDTO dto = new UserDTO();

		// dto.setFirstName("Sanat Kumar");

		UserModel model = new UserModel();

		List list = model.search(dto);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			dto = (UserDTO) it.next();

			System.out.println();
			System.out.print(dto.getId() + " | ");
			System.out.print(dto.getFirstName() + " | ");
			System.out.print(dto.getLastName() + " | ");
			System.out.print(dto.getLoginId() + " | ");
			System.out.print(dto.getPassword() + " | ");
			System.out.print(dto.getDob() + " | ");
			System.out.println(dto.getAddress() + " | ");

		}

	}

	private static void testAuth() {

		UserModel model = new UserModel();

		UserDTO dto = model.authenticate("solankiprakhar11@gmail.com", "Prakhar@123");

		if (dto != null) {

			System.out.println();
			System.out.print(dto.getId() + " | ");
			System.out.print(dto.getFirstName() + " | ");
			System.out.print(dto.getLastName() + " | ");
			System.out.print(dto.getLoginId() + " | ");
			System.out.print(dto.getPassword() + " | ");
			System.out.print(dto.getDob() + " | ");
			System.out.println(dto.getAddress() + " | ");

		} else
			System.out.println("Authentication Failed...!!!");
	}

	private static void testFindByPk() {

		UserModel model = new UserModel();

		UserDTO dto = model.findByPk(5);

		if (dto != null) {

			System.out.println();
			System.out.print(dto.getId() + " | ");
			System.out.print(dto.getFirstName() + " | ");
			System.out.print(dto.getLastName() + " | ");
			System.out.print(dto.getLoginId() + " | ");
			System.out.print(dto.getPassword() + " | ");
			System.out.print(dto.getDob() + " | ");
			System.out.println(dto.getAddress() + " | ");

		} else {
			System.out.println("No Data Found...!!!!");
		}

	}

	private static void testDelete() {

		UserDTO dto = new UserDTO();

		dto.setId(2);

		UserModel model = new UserModel();

		model.delete(dto);
	}

	private static void testUpdate() {

		UserDTO dto = new UserDTO();

		dto.setId(1);
		dto.setFirstName("Prakhar");
		dto.setLastName("Solanki");
		dto.setLoginId("solankiprakhar11@gmail.com");
		dto.setPassword("Prakhar@123");
		dto.setDob(new Date());
		dto.setAddress("Indore");

		UserModel model = new UserModel();

		model.update(dto);

	}

	private static void testAdd() {

		UserDTO dto = new UserDTO();

		dto.setId(2);
		dto.setFirstName("Sanat Kumar");
		dto.setLastName("Chouhan");
		dto.setLoginId("sanatkumar@gmail.com");
		dto.setPassword("Sanat@123");
		dto.setDob(new Date());
		dto.setAddress("Bhopal");

		UserModel model = new UserModel();

		model.add(dto);

	}

}
