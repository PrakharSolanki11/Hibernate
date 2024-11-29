package com.rays.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUpdate {

	@Test
	public void update() throws Exception {

		UserBean bean = UserModel.findByPk(13);

		bean.setSalary(250);

		UserModel.update(bean);

		bean = UserModel.findByPk(13);

		assertEquals(250, bean.getSalary());

	}

}
