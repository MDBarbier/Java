package matt.barbier.mockito.com;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class MockitoTest  {

    @Mock
    Game gameMock; 

    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule(); 

    @Test
    public void testQuery()  {
        
        when(gameMock.GetName()).thenReturn("testName");
        Deck t  = new Deck(gameMock); 
        String name = t.OutputGameName(); 
        assertTrue(name == "testName"); 
        verify(gameMock).GetName(); 
    }
}