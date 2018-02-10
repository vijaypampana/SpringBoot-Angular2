package com.vijay.learn.unit

import com.vijay.learn.Controller.Shipwreck
import com.vijay.learn.Controller.ShipwreckController
import com.vijay.learn.Repository.ShipWreckRepository
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations


import static org.mockito.Mockito.verify
import static org.mockito.Mockito.when
import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*

class ShipWreckControllerTestUsingHamcrest {

    @InjectMocks
    private ShipwreckController sc

    @Mock
    private ShipWreckRepository shipWreckRepository

    @Before
    void init() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    void testShipWreckGet() {
        Shipwreck shipwreck = new Shipwreck()
        shipwreck.setId(1l)
        when(shipWreckRepository.findOne(1l)).thenReturn(shipwreck)

        Shipwreck S1 = sc.get(1L)
        verify(shipWreckRepository).findOne(1l)

        //assertEquals(1l,S1.getId().longValue())
        assertThat(S1.getId(), is(1l))
    }

}
