package com.excellence.apicallapp.services.impl;

import com.excellencefriendscorporation.services.impl.ContributorServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContributorServiceImplTest {

    @Test
    public void test_registerContributor() {
        ContributorServiceImpl service = new ContributorServiceImpl();
        String response = service.registerContributor(null);
        assertEquals("Success", response);
    }
}
