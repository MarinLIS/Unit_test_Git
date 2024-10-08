
**Юнит-тесты**

testAddContactPositive  
Проверяет успешное добавление нового контакта в список контактов.

testAddDoubleContact 
Проверяет, что приложение не позволяет добавлять дублирующиеся контакты с одинаковыми именами и телефонами.

testChangeContactPositive  
Проверяет успешное редактирование существующего контакта.

testChangeContactNotExisting  
Проверяет поведение при попытке редактирования контакта, который не существует.

testDeleteContactPositive  
Проверяет успешное удаление контакта из списка.

testDeleteContactNotExisting  
Проверяет поведение при попытке удаления контакта, который не существует.

testGetContactById  
Проверяет успешное получение контакта по его идентификатору.

testGetContactByIdNotExisting  
Проверяет поведение при попытке получения контакта, который не существует.

testGetAllContactsEmptyList  
Проверяет поведение метода для получения всех контактов, когда список контактов пуст.

tesGetAllContactsListPositive
Проверяет поведение метода для получения всех контактов, когда список контактов не пуст.

testAddInvalidPhoneNumber  
Проверяет, что приложение не позволяет добавлять контакты с некорректным форматом номера телефона.

testGetContactByName 
Проверяет успешный поиск контакта по имени.

testGetContactByNameNotExisting 
Проверяет поведение при попытке поиска контакта по имени, который не существует.

testGetContactByPhoneNumber 
Проверяет успешный поиск контакта по номеру телефона.

testGetContactByPhoneNumberNotExisting 
Проверяет поведение при попытке поиска контакта по номеру телефона, который не существует.

**Интеграционные тесты**

testAddGetContact  
Проверяет, что контакт можно добавить и затем успешно получить из базы данных.

testAddEditContact  
Проверяет, что контакт можно добавить, затем успешно отредактировать и получить обновленную информацию из базы данных.

testAddDeleteContact  
Проверяет, что контакт можно добавить и затем успешно удалить из базы данных.

testUpLoadFile  
Проверяет успешную загрузку контактов из файла при запуске приложения.

testSaveToFile  
Проверяет успешное сохранение контактов в файл при выходе из приложения.

testSaveToJSON
Проверяет, что файл сохраняется в верном формате


**Сквозные тесты**

testUserJourneyAddEditDeleteContact  
Проверяет полный путь пользователя: добавление контакта, его редактирование, и удаление через пользовательский интерфейс.

testUserJourneyFindContact  
Проверяет, что пользователь может успешно искать контакт по имени или телефону через пользовательский интерфейс.

testUserJourneyEmptyContactList  
Проверяет, что пользователь видит правильное сообщение при отсутствии контактов в списке.

testUserJourneyAddMultipleContacts  
Проверяет, что пользователь может добавить несколько контактов и увидеть их все в списке.

testUserJourneyEmptyFields  
Проверяет, что пользователь не может добавить контакт с пустыми обязательными полями (например, имя или телефон).

testUserJourneyEditContact 
Проверяет, что пользователь не может сохранить изменения контакта с некорректными данными (например, пустое имя).

testUserJourneyDeleteNonExistentContact  
Проверяет, что пользователь видит правильное сообщение об ошибке при попытке удаления несуществующего контакта.

testUserJourneyInvalidAddContact  
Проверяет, что пользователь видит корректное сообщение об ошибке при попытке добавить контакт с пустыми или некорректными данными.

testUserJourneyAddFindContact  
Проверяет, что пользователь может добавить контакт и затем успешно найти его по имени или номеру телефона.

testUserJourneySortContactsByName  
ОПроверяет, что пользователь может сортировать список контактов по имени.

testUserJourneySortContactsByPhoneNumber  
Проверяет, что пользователь может сортировать список контактов по номеру телефона.

testUserJourneyContactDetails  
Проверяет, что пользователь может просмотреть подробности контакта, нажав на контакт в списке.


testUserJourneyLogoutAndLogin  
Проверяет, что после выхода из системы и повторного входа все изменения (добавление, редактирование, удаление контактов) сохраняются и корректно отображаются.

