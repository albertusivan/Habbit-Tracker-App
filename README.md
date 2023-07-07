# Habbit-Tracker-App
1. What project have you worked about?

The project that Ive working on is completing a program regarding the Habbit Tracker application on Android. This application will show you list of habbit that have been add by the user. User also can delete the habbit by sliding it to the right. This aplication allow user to change theme into dark mode and can enable the notification feature. This aplication also have the countdown feature every habbit and if the countdown end the notification will apear.

For the architecture itself, this application uses sqlite, room with three main components including entity, DAO (Data Access Object) , and database. There is also view model to store and manage UI-related data, paging for displaying list of course, PendingIntent for noification, and espresso for ui testing.

2. Which part is hardest?

The hardest part from the project that Ive working on, is in the todo 12 and 13 where the task is that i need to make the notification with pending intent and Start and cancel One Time Request WorkManager to notify when time is up. Its not realy that hard, but its the hardest and more tricky rather than another todo. It need to make work manager first that wil call the notification worker. and for testing it i need to wait at least 1 minutes to get the notification result, it is appear or not

3. How is the flow of showing random habit using ViewPager2?

For showing the random habbit there are the component that i used to show it, there are ViewPager2 with the adapter, TabLayout for displays a horizontal row of tabs and the TabLayoutMediator onnect a ViewPager2 with a TabLayout. when the activity show it will call the adapter for showing the data of the habbit. The data will get from RandomHabitViewModel and get the data for each priority level. 

4. How does notification reminder work?

the notification will work if the user activates the notification in the settings of the habbit tracker application. after user enable the notification feature, application will send you a notification every time your countdown of the habbit ends. how does it work?, when the notification preference is on and user start the countdown of the habbit, sitem will build one time work request that wil call the Notification worker, with notification worker system will show pending intent notification, every time the timer of the habbit countdown stop. The notification will contain the habbit data, the data itslef including the habbit name, and a times up message.

5. Why do we need a ViewModel?

first of all we have to know what is a ViewModel in general. ViewModel class is a business logic that exposes state to the UI and encapsulates related business logic.  View models provide a simplified and structured view of data, which makes it easier for users or system components to understand and interact with the data. In this aplication ViewModel is usefull in every activity in this aplication, such as the add habbit activity which helped by add habbit view model  to separate the concerns of the UI code and the business logic or data access code. 


