package ru.nikonov.edu.hibernate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class AppTest extends AbstractContainerDbTest {

    @Test
    void test() {
        System.out.println("");
    }

}