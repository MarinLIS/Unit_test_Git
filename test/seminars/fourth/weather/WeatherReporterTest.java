package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherReporterTest {

    @Test
    public void testWeatherReporter() {
        //создаем мок сервис для WeatherService
        WeatherService mockWeatherService = mock(WeatherService.class);

        //определяем поведение мока. Когда метод getCurrentTemperature будет вызван, он вернет 30
        when(mockWeatherService.getCurrentTemperature()).thenReturn(30);

        //создаем объект класса Weatherreport, передаем ему в конструктор наш мок
        WeatherReporter weatherReport = new WeatherReporter(mockWeatherService);

        //вызываем метод generateReport
        String report = weatherReport.generateReport();

        // проверяем, что отчет содержит правильную информацию 30
        assertEquals("Текущая температура: 30 градусов.", report);
    }

}