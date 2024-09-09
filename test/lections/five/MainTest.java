package lections.five;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import lections.five.number.MaxNumberModule;
import lections.five.number.RandomNumberModule;
import lections.five.order.OrderService;
import lections.five.order.PaymentService;
import lections.five.user.UserRepository;
import lections.five.user.UserService;

class MainTest {
    MainTest() {
    }

    @Test
    public void testGenerateRandomNumbers() {
        RandomNumberModule generator = new RandomNumberModule();
        int[] numbers = generator.generateRandomNumbers(10);
        assertEquals(10, numbers.length);
    }

    @Test
    public void testFindMaxNumber() {
        MaxNumberModule finder = new MaxNumberModule();
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        assertEquals(5, finder.findMaxNumber(numbers));
    }

    @Test
    public void testGetUserName() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        String result = userService.getUserName(1);
        assertEquals("User 1", result);
    }

    @Test
    public void testPlaceOrder() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);
        boolean result = orderService.placeOrder("order1", 100.0);
        assertTrue(result);
    }
}