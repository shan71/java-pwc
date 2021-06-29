package com.demo.rest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestEmpService {

	@Mock
	EmpDao dao;
	
	@InjectMocks
	EmpService service=spy(EmpService.class);
	
	@Test
	public void testDelete() throws EmpNotFoundException {
		when(dao.delete(100)).thenReturn("deleted");
		Assertions.assertEquals("deleted", service.deleteEmp(100).getEntity().toString());
	}
	
}
