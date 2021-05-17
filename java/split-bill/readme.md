#Split Bill

This is a Java pojo which implements the split-bil logic (similar to splitwise)

Logic is taken from [here](https://www.quora.com/What-is-the-algorithm-to-calculate-the-expense-among-the-group-using-Java-JavaScript-or-Python-Something-similar-to-a-group-expense-calculator-like-Splitwise/answer/Ankit-Deshmukh-16?ch=3&share=ebff61cc&srid=sSSc).

This is a very crude logic to understand how sharing of bills work.
Optimisation of code is not considered while writing this code.

There are Two models: `Event` and `Person`
Whenever/Everytime a new event is created, sharable of each person is recalculated and modified in the Event model constructor: `public Event(String name, Map transaction)` 

When `settle()` is called, Money will be shared based no below logic:

1. Calculate the sum.
2. Calculate mean i.e. expense per person.
3. Calculate the difference of mean and amount spent by each person.
4. Positive difference will tell the person will owe that much of money and Negative difference will tell the person will get that much of money.
5. Start with the least +ve amount. Allocate it to the -ve amount.
6. Repeat step 5 until -ve amount runs out.
7. Now, go to next +ve number. Repeat steps 5 and 6 until there are +ve numbers.

Also refer [split_bill_logic.txt](split_bill_logic.txt) file.