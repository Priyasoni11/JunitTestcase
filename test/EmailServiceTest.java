import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {
    private final EmailService emailService=EmailService.getInstance();
    private final Order order=new Order(8,"car",650000.0);

    @org.junit.jupiter.api.Test
    void getInstance() {
        assertEquals(EmailService.getInstance(),emailService);
    }

    @org.junit.jupiter.api.Test
    void sendEmail() {
        Executable executable=()->emailService.sendEmail(order);
        assertThrows(RuntimeException.class,executable);
    }

    @org.junit.jupiter.api.Test
    void testSendEmail() {
        assertTrue(emailService.sendEmail(order,"String"));
    }

}
