package com.supplements.api;

import com.supplements.api.service.SupplementService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SupplementsTest {
    @Test
    public void when_get_all_supplements_shoud_return3(){
        Assertions.assertEquals(3, SupplementService.getAll().size());
    }

}
