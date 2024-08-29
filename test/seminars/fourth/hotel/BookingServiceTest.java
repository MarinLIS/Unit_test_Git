package seminars.fourth.hotel;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

class BookingServiceTest {

    @Test
    public void testBookingService() {
        // создание мока
        HotelService mockHotelService = mock(HotelService.class);

        // определяем поведение мока
        when(mockHotelService.isRoomAvailable(anyInt())).thenAnswer(i -> (Integer) i.getArgument(0) % 2 == 0);

        //создание экземпляра тестируемого класса с подставленным моком
        BookingService bookingService = new BookingService(mockHotelService);

        // проверка метода bookRoom с номером комнаты, котрый является доступным(четным)
        assertTrue(bookingService.bookRoom(2));

        // проверка метода bookRoom с номером комнаты, котрый является доступным(четным)
        assertFalse(bookingService.bookRoom(3));

        // проверка что методы isRoomavailable вызываются два раза
        verify(mockHotelService, times(2)).isRoomAvailable(anyInt());
    }
}