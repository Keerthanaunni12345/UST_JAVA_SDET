package com.junit.mockito;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Sample {

	@SuppressWarnings("unchecked")
	@Test
	public void SaveTest() {
		// using Mockito.mock() method
		List<String> mockList = mock(List.class);
	    

		when(mockList.size()).thenReturn(5);
		assertTrue(mockList.size()==5);
	}
	
}

