package mockito.examples;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
class PaymentServiceTest {
    @Mock   PaymentGateway gateway;
    @InjectMocks PaymentService service;

    @Test void paymentSuccess() {
        when(gateway.charge(100.0)).thenReturn(true);
        assertTrue(service.makePayment(100.0));
        verify(gateway).charge(100.0);
    }
}
    @Test void paymentFailure() {
        when(gateway.charge(50.0)).thenReturn(false);
        assertFalse(service.makePayment(50.0));
        verify(gateway).charge(50.0);
    }
}   