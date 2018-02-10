package com.vijay.learn

import com.vijay.learn.Controller.Shipwreck
import com.vijay.learn.Repository.ShipWreckRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SBApplication.class)
class ShipWreckRepositoryIntTest {

    @Autowired
    private ShipWreckRepository shipWreckRepository

    @Test
    void testFindAll() {
        List<Shipwreck> wrecks = shipWreckRepository.findAll()
        assertThat(wrecks.size(), is(greaterThanOrEqualTo(0)))
    }

}