## A Byte of python !

Printing a statement : `print("Hello World")`

__Note__ : 
1. Python is case sensitive
2. how to get help : `help('len')` in termianl (inside python prompt).

__Comments__ : `print('hello world') # Note that print is a function
`

__Literal Constants__ : ex : `1`, `3.14`, `'this is sample'`, `"sample with double quotes"`

__Numbers__ : There are only __int__ and __floats__ : `52.3E-4` means `52.3 * 10^-4`
(_There is no separate long type. The int type can be an integer of any size_)

__Triple Quotes__ :  specify multi-line strings using triple quotes

```python
'''This is a multi-line string. This is the first line.
This is the second line.
"What's your name?," I asked.
He said "Bond, James Bond."
'''
```

__Note__: Strings Are __Immutable__

***

#### String format:
```python
age = 20
name = 'Swaroop'

print('{0} was {1} years old when he wrote this book'.format(name, age))
print('{0} was {1} years old when he wrote this book\nauthor name is {1}'.format(name, age, name))
print('Why is {0} playing with that python?'.format(name))
print('Perimeter is', 2 * (length + breadth))
# equivalent : name + ' is ' + str(age) + ' years old' (we need to explicitly format!)
```
Other syntaxes which means the same thing : 
1. `print('{} was {} years old when he wrote this book'.format(name, age))` (Numbers are optional )
2. `print('{name} was {age} years old when he wrote this book'.format(name=name, age=age))` (naming the parameters)
3. `print('{name} wrote {book}'.format(name='Swaroop', book='A Byte of Python'))`
***
#### f-strings: (Python 3.6 introduced a shorter way to do named parameters)
```python
age = 20
name = 'Swaroop'

print(f'{name} was {age} years old when he wrote this book')  # notice the 'f' before the string
print(f'Why is {name} playing with that python?')  # notice the 'f' before the string
```
***

__Note__: print always prints `\n` by default. To avoid it, we need to give like this : `print('a', end='')` or print end with space : `print('a', end=' ')`

One thing to note is that in a string, a single backslash at the end of the line indicates that the string is continued in the next line, but no newline is added : 
```python
"This is the first sentence. \
This is the second sentence."
```
is __equivalent__ to
`"This is the first sentence. This is the second sentence."`
***

#### Raw String
```python
r"Newlines are indicated by \n"
```
1. If you need to specify some strings where no special processing such as escape sequences are handled, then what you need is to specify a raw string by prefixing r or R to the string
2. Always use raw strings when dealing with regular expressions

***

#### Variables in python : 
```python
# Filename : var.py
i = 5
print(i)
i = i + 1
print(i)

s = '''This is a multi-line string.
This is the second line.'''
print(s)
```

__Note__ : A __physical line__ is what you see when you write the program. A __logical line__ is what Python sees as a single statement. Python implicitly assumes that each physical line corresponds to a logical line.

```python
i = \
5
```
is same as  `i = 5`

__implicit line joining__ example : braces start in one line and end in next line, we dont have to use `;` in that case.
```python
my_list = ["apple", "banana",
               "cherry", "date"]
```

If you want to use braces for representing coding block, refer `from __future__ import braces`

#### operators : 
1. `//` (divide and floor) : Divide x by y and round the answer down to the nearest integer value. Note that if one of the values is a float, you'll get back a float.
    1. `13 // 3` gives `4`
    2. `-13 // 3` gives `-5`
    3. `9//1.81` gives `4.0`
2. `not` : (boolean NOT)
3. `and` (boolean AND)
4. `or` (boolean OR)

__NOTE__: `a = a * 3` can be written as `a *= 3`

__Operator precedence__ (evaluation order) : [Refer this](http://docs.python.org/3/reference/expressions.html#operator-precedence)

***

### Control flow : 

__IF statement__ :

```python
number = 23
guess = int(input('Enter an integer : '))

if guess == number:
    # New block starts here
    print('Congratulations, you guessed it.')
    print('(but you do not win any prizes!)')
    # New block ends here
elif guess < number:
    # Another block
    print('No, it is a little higher than that')
    # You can do whatever you want in a block ...
else:
    print('No, it is a little lower than that')
    # you must have guessed > number to reach here

print('Done')
```


__Switch statement__ : There is no switch statement in Python. You can use an if..elif..else statement to do the same thing

__While statement__ : 
```python
magic_number = 50
running = True
max_attempts = 5
no_of_attempts = 0

while running:
    guess = int(input('Enter an integer : '))
    if guess == magic_number:
        print('Congratulations, you guessed it.\n(but you do not win any prizes!)')
        running = False
    elif guess < magic_number:
        no_of_attempts += 1
        print(f'No, it is a little higher than that\nNumber of attempts : {max_attempts - no_of_attempts}')
    else:
        no_of_attempts += 1
        print(f'No, it is a little lower than that\nNumber of attempts : {max_attempts - no_of_attempts}')

    if no_of_attempts >= max_attempts:
        print('You have exceeded the maximum number of attempts.')
        break
else:
    print('alert !! You can add a else in while loop')
    # Do anything else you want to do here

print('Done')
```

__Note__ : The `True` and `False` are called Boolean types and you can consider them to be equivalent to the value `1` and `0` respectively.

__For loop__
```python
for i in range(1, 5): # for step count : range(1,5,2)
    print(i)
else:
    print('The for loop is over')
```

1. `for (int i = 0; i < 5; i++)` in other programming languages is equal to `for i in range(0,5)` in python or simply `for i in range(5)`.
2. `range(5)` : This does not create a list of numbers [0, 1, 2, 3, 4] in memory. Instead, it returns a range object — a special kind of lazy iterable that generates numbers one by one as you loop over it. It generated each number on demand. This is more efficient, especially for large ranges like range(1_000_000).
`for i in range(5): print(i, end = ' ')`  : output `0 1 2 3 4`
If you actually want the whole list of numbers stored in memory — for example, to index or slice — you need to force it:
3. `list(range(5))` will give `[0, 1, 2, 3, 4]` : Now you've materialized the range into a list — an actual data structure in memory.

__continue__ statement : 
```python
while True:
    s = input('Enter something : ')
    if s == 'quit':
        break
    if len(s) < 3:
        print('Too small')
        continue
    print('Input is of sufficient length')
    # Do other kinds of processing here...
```

***

### Functions
```python
def say_hello():
    # block belonging to the function
    print('hello world')
# End of function

def print_max(a, b):
    if a > b:
        print(a, 'is maximum')
    elif a == b:
        print(a, 'is equal to', b)
    else:
        print(b, 'is maximum')

print_max(3, 4)
```

__Local vs Global variables__ : 
```python
x = 50

def func(x):
    print('x is', x)
    x = 2
    print('Changed local x to', x)

func(x)
print('x is still', x)

# output : 
# $ python function_local.py
# x is 50
# Changed local x to 2
# x is still 50

# ------------------------------------

x = 50
def func():
    global x
    print('x is', x)
    x = 2
    print('Changed global x to', x)

func()
print('Value of x is', x)

# $ python function_global.py
# x is 50
# Changed global x to 2
# Value of x is 2

# -------- initialising a global variable inside a function : ----------

x = 51
def some_method():
    global x, y #notice 'y' was not defined
    print("initial value of x:", x, "changing it to 100")
    x = 100
    print("after changing z value inside function : ", x)

some_method()
print("value of x after function call:", x, "value of y : ", y if 'y' in globals() else "y is not defined")

# output
# initial value of x: 51 changing it to 100
# after changing z value inside function :  100
# value of x after function call: 100 value of y :  y is not defined

```

#### Default Argument Values : 
```python
def say(message, times=1):
    print(message * times)

say('Hello')
say('World', 5)

# output
# Hello
# WorldWorldWorldWorldWorld
```
__note__: Only those parameters which are at the end of the parameter list can be given default argument values

#### Keyword Arguments (callee side)
```python

def func(a, b=5, c=10):
    print('a is', a, 'and b is', b, 'and c is', c)

func(3, 7)
func(25, c=24)
func(c=50, a=100)

# output
# a is 3 and b is 7 and c is 10
# a is 25 and b is 5 and c is 24
# a is 100 and b is 5 and c is 50
```

#### VarArgs parameters

```python
def total(a=5, *numbers, **phonebook):
    print('a', a)

    #iterate through all the items in tuple
    for single_item in numbers:
        print('single_item', single_item)

    #iterate through all the items in dictionary    
    for first_part, second_part in phonebook.items(): # here items() is a reserved keyword
        print(first_part,second_part)

total(10,1,2,3,Jack=1123,John=2231,Inge=1560)
```

#### return statements
```python
def maximum(x, y):
    if x > y:
        return x
    else:
        return y

print(maximum(2, 3))
```

__Note__ : 
1. Note that a return statement without a value is equivalent to return __None__
2. Every function implicitly contains a return None statement at the end unless you have written your own return statement.
```python
def some_function():
    pass
```
3. The pass statement is used in Python to indicate an empty block of statements.



#### Lambda functions
```python
def make_incrementor(n):
    return lambda x: x + n
increment_by_2 = make_incrementor(2)
print(increment_by_2(5))  # Output: 7
increment_by_10 = make_incrementor(10)
print(increment_by_10(5))  # Output: 15
``` 

#### Docstrings
```python
def my_function():
    """This is a docstring. It describes what the function does."""
    print("Hello, World!")
print(my_function.__doc__)  # Output: This is a docstring. It describes what the function does.
```

__Note__ : 
1. Docstrings are used to document functions, classes, and modules.
2. They are written as the first statement in a function, class, or module.


### Modules
There are two types of modules in Python:
1. __Built-in modules__ : These are the modules that come with Python, such as `math`, `os`, `sys`, etc.
2. __User-defined modules__ : These are the modules that you create yourself.

__Two ways to create modules__ : 
1. create a file with a .py extension that contains functions and variables
2.  write the modules in the native language in which the Python interpreter itself was written. 
For example, you can write modules in the C programming language and when compiled, they can be used from your Python code when using the standard Python interpreter

Example of using inbuilt modules :

```python
import sys
# from sys import argv #(to avoid typing the sys. everytime for it
from math import sqrt

print('The command line arguments are:')
for i in sys.argv:
    print(i)

print('\n\nThe PYTHONPATH is', sys.path, '\n')

# output : 
# $ python module_using_sys.py we are arguments    # each arg is separated by white space
# The command line arguments are:
# module_using_sys.py
# we
# are
# arguments

# 'module_using_sys.py' as sys.argv[0], 'we' as sys.argv[1], 'are' as sys.argv[2] and 'arguments' as sys.argv[3]

# The PYTHONPATH is ['/tmp/py',
# # many entries here, not shown here
# '/Library/Python/2.7/site-packages',
# '/usr/local/lib/python2.7/site-packages']
```

__Note__ : If it was not a compiled module i.e. a module written in Python, then the Python interpreter will search for it in the directories listed in its sys.path variable. If the module is found, then the statements in the body of that module are run and the module is made available for you to use. Note that the initialization is done only the first time that we import a module.

__Byte-compiled .pyc files__ : 
1. When you import a module, Python compiles the module to bytecode and stores it in a file with a .pyc extension.
2. The next time you import the same module, Python will use the bytecode file instead of recompiling the module.

__Note__ : Every module has a __name__ variable that is set to the name of the module. If you run a module as a script, then its __name__ variable is set to '__main__'. This is useful for writing code that can be used as both a module and a script.

```python
if __name__ == '__main__':
    print('This program is being run by itself')
else:
    print('I am being imported from another module')

# output : 
# $ python module_using_name.py
# This program is being run by itself

# $ python
# >>> import module_using_name
# I am being imported from another module
# >>>
```


```python
# Filename : mymodule.py
def say_hi():
    print('Hi, this is mymodule speaking.')

__version__ = '0.1'

# from another file : 
import mymodule

mymodule.say_hi()
print('Version', mymodule.__version__)

# output : 
# $ python mymodule_demo.py
# Hi, this is mymodule speaking.
# Version 0.1
```

#### The dir function : 
The built-in `dir()` function returns the list of names defined by an object. If the object is a module, this list includes functions, classes and variables, defined inside that module.
```python
>>> dir(sys) #get names of attributes in sys module
# ['__displayhook__', '__doc__', 'argv', 'builtin_module_names', 'version', 'version_info']

dir() #get names of attributes for current module
# ['__builtins__', '__doc__', '__name__', '__package__', 'sys']
a = 5
dir()
# ['__builtins__', '__doc__', '__name__', '__package__', 'sys', 'a']
del a #delete/remove a name
# ['__builtins__', '__doc__', '__name__', '__package__', 'sys']
```

#### Packages : 
Packages are just folders of modules with a special __init__.py file that indicates to Python that this folder is special because it contains Python modules.
```
- <some folder present in the sys.path>/
    - world/
        - __init__.py
        - asia/
            - __init__.py
            - india/
                - __init__.py
                - foo.py
        - africa/
            - __init__.py
            - madagascar/
                - __init__.py
                - bar.py
```

```python
import world.asia.india.indian_subpackage

print(world.asia.india.indian_subpackage.print_who_am_i())

```

### Data structures
There are four built-in data structures in Python:
1. List
2. Tuple
3. Set
4. Dictionary

#### List : 
```python
shoplist = ['apple', 'mango', 'carrot', 'banana']

print('I have', len(shoplist), 'items to purchase.')

print('These items are:', end=' ')
for item in shoplist:
    print(item, end=' ')

print('\nI also have to buy rice.')
shoplist.append('rice')
print('My shopping list is now', shoplist)

print('I will sort my list now')
shoplist.sort()
print('Sorted shopping list is', shoplist)

print('The first item I will buy is', shoplist[0])
olditem = shoplist[0]
del shoplist[0]
print('I bought the', olditem)
print('My shopping list is now', shoplist)

#  output : 
# $ python ds_using_list.py
# I have 4 items to purchase.
# These items are: apple mango carrot banana
# I also have to buy rice.
# My shopping list is now ['apple', 'mango', 'carrot', 'banana', 'rice']
# I will sort my list now
# Sorted shopping list is ['apple', 'banana', 'carrot', 'mango', 'rice']
# The first item I will buy is apple
# I bought the apple
# My shopping list is now ['banana', 'carrot', 'mango', 'rice']
```

#### Tuples
1. Tuples are used to hold together multiple objects
2. Tuples are immutable, meaning that once they are created, their contents cannot be changed.
3. __use case__ : Tuples are usually used in cases where a statement or a user-defined function can safely assume that the collection of values (i.e. the tuple of values used) will not change.
3. An empty tuple is constructed by an empty pair of parentheses such as myempty = (). However, a tuple with a single item is not so simple. You have to specify it using a comma following the first (and only) item so that Python can differentiate between a tuple and a pair of parentheses surrounding the object in an expression i.e. you have to specify `singleton = (2 , )` if you mean you want a tuple containing the item 2

```python
# I would recommend always using parentheses
# to indicate start and end of tuple
# even though parentheses are optional.
# Explicit is better than implicit.
zoo = ('python', 'elephant', 'penguin')
print('Number of animals in the zoo is', len(zoo))

new_zoo = 'monkey', 'camel', zoo    # parentheses not required but are a good idea
print('Number of cages in the new zoo is', len(new_zoo))
print('All animals in new zoo are', new_zoo)
print('Animals brought from old zoo are', new_zoo[2])
print('Last animal brought from old zoo is', new_zoo[2][2])
print('Number of animals in the new zoo is',
      len(new_zoo)-1+len(new_zoo[2]))

# $ python ds_using_tuple.py
# Number of animals in the zoo is 3
# Number of cages in the new zoo is 3
# All animals in new zoo are ('monkey', 'camel', ('python', 'elephant', 'penguin'))
# Animals brought from old zoo are ('python', 'elephant', 'penguin')
# Last animal brought from old zoo is penguin
# Number of animals in the new zoo is 5
```


#### Dictionary : (map)
1. key-value pairs in a dictionary are not ordered in any manner
2. keys should be unique and immutable (strings, numbers, tuples)
3. values can be of any type and can be duplicated
```python
ab = {
    'Swaroop': 'swaroop@swaroopch.com',
    'Larry': 'larry@wall.org',
    'Matsumoto': 'matz@ruby-lang.org',
    'Spammer': 'spammer@hotmail.com'
}

print("Swaroop's address is", ab['Swaroop'])

# Deleting a key-value pair
del ab['Spammer']

print('\nThere are {} contacts in the address-book\n'.format(len(ab)))

for name, address in ab.items():
    print('Contact {} at {}'.format(name, address))
    if name == 'Larry':
        address = "updated larry's address" # WONT WORK
        ab[name] = "updated larry's address" # WORKS!

# Adding a key-value pair
ab['Guido'] = 'guido@python.org'

if 'Guido' in ab:
    print("\nGuido's address is", ab['Guido'])

# output
# Swaroop's address is swaroop@swaroopch.com

# There are 3 contacts in the address-book

# Contact Swaroop at swaroop@swaroopch.com
# Contact Matsumoto at matz@ruby-lang.org
# Contact Larry at larry@wall.org

# Guido's address is guido@python.org

# ----------
# what item returns ? :  items method of the dictionary which returns a list of tuples 
# where each tuple contains a pair of items - the key followed by the value
[
    ('Swaroop', 'swaroop@swaroopch.com'),
    ('Larry', 'larry@wall.org'),
    ('Matsumoto', 'matz@ruby-lang.org'),
    ('Spammer', 'spammer@hotmail.com')
]
```

#### lists vs tuples :
| Feature                               | `tuple`                                 | `list`                                       |
| ------------------------------------- | --------------------------------------- | -------------------------------------------- |
| **Mutability**                        | Immutable                               | Mutable                                      |
| **Syntax**                            | `(1, 2, 3)`                             | `[1, 2, 3]`                                  |
| **Parentheses Optional**              | Yes (e.g., `1, 2, 3`) → tuple           | No                                           |
| **Performance**                       | Faster (less overhead)                  | Slower (more overhead)                       |
| **Memory Usage**                      | Uses less memory                        | Uses more memory                             |
| **Hashable** (can be a key in `dict`) | ✅ Yes, **if** all elements are hashable | ❌ No                                         |
| **Use Case**                          | Fixed data (e.g., coordinates, config)  | Dynamic data (e.g., user input)              |
| **Methods available**                 | Fewer (`count()`, `index()`)            | More (`append()`, `extend()`, `pop()`, etc.) |
| **Can be nested/mixed**               | Yes                                     | Yes                                          |


#### Membership tests:
Membership tests in Python refer to using the keywords `in` and `not in` to check if a value exists inside a container (like a list, string, tuple, dict, or set).
```python
value in container      # True if value is present
value not in container  # True if value is not present

# list : 
fruits = ['apple', 'banana', 'cherry']
print('banana' in fruits)     # True
print('mango' not in fruits)  # True

# tuple : 
colors = ('red', 'blue', 'green')
print('blue' in colors)       # True

# maps
text = "hello world"
print('world' in text)        # True
print('bye' not in text)      # True

# dictonary :
person = {'name': 'Alice', 'age': 25}
print('name' in person)       # True
print('Alice' in person)      # False (because 'Alice' is a value)

# set
ids = {101, 102, 103}
print(102 in ids)             # True

```

#### Sequence & Slicing operations :
__Lists__, __tuples__ and __strings__ are examples of sequences.

__slicing__ : `list[start:stop:step]`
step: how many items to skip (default is 1)

```python
shoplist = ['apple', 'mango', 'carrot', 'banana']
shoplist[::1] #step: 1 → take every element in order
# its same as shoplist[0:len(shoplist):1]
# output : ['apple', 'mango', 'carrot', 'banana']

shoplist[::2] # → every 2nd item:
# output : ['apple', 'carrot']

# REVERSE THE LIST  : 
shoplist[::-1]
# output : ['banana', 'carrot', 'mango', 'apple']

# COPYING A LIST :
newlist = shoplist[:]  # or newlist = list(shoplist)

# LIST TO STRING CONVERSION
source = ['/Users/swa/notes']
result = ' '.join(source)
```

#### Set :
1. A set is an unordered collection of unique items.
2. Sets are mutable, meaning that you can add or remove items from them.
```python
>>> bri = set(['brazil', 'russia', 'india'])
>>> 'india' in bri
True
>>> 'usa' in bri
False
>>> bric = bri.copy()
>>> bric.add('china')
>>> bric.issuperset(bri)
True
>>> bri.remove('russia')
>>> bri & bric # OR bri.intersection(bric)
{'brazil', 'india'}
```

#### simple project - files backup
```python
import os
import time

# 1. The files and directories to be backed up are
# specified in a list.
# Example on Windows:
# source = ['"C:\\My Documents"', 'C:\\Code']
# Example on Mac OS X and Linux:
source = ['/Users/swa/notes']
# Notice we had to use double quotes inside the string
# for names with spaces in it.

# 2. The backup must be stored in a
# main backup directory
# Example on Windows:
# target_dir = 'E:\\Backup'
# Example on Mac OS X and Linux:
target_dir = '/Users/swa/backup'
# Remember to change this to which folder you will be using

# Create target directory if it is not present
if not os.path.exists(target_dir):
    os.mkdir(target_dir)  # make directory

# 3. The files are backed up into a zip file.
# 4. The current day is the name of the subdirectory
# in the main directory.
today = target_dir + os.sep + time.strftime('%Y%m%d')
# The current time is the name of the zip archive.
now = time.strftime('%H%M%S')

# Take a comment from the user to
# create the name of the zip file
comment = input('Enter a comment --> ')
# Check if a comment was entered
if len(comment) == 0:
    target = today + os.sep + now + '.zip'
else:
    target = today + os.sep + now + '_' + \
        comment.replace(' ', '_') + '.zip'

# Create the subdirectory if it isn't already there
if not os.path.exists(today):
    os.mkdir(today)
    print('Successfully created directory', today)

# 5. We use the zip command to put the files in a zip archive
zip_command = 'zip -r {0} {1}'.format(target,
                                      ' '.join(source))

# Run the backup
print('Zip command is:')
print(zip_command)
print('Running:')
if os.system(zip_command) == 0:
    print('Successful backup to', target)
else:
    print('Backup FAILED')

# output
# $ python backup_ver4.py
# Enter a comment --> added new examples
# Zip command is:
# zip -r /Users/swa/backup/20140329/074122_added_new_examples.zip /Users/swa/notes
# Running:
#   adding: Users/swa/notes/ (stored 0%)
#   adding: Users/swa/notes/blah1.txt (stored 0%)
#   adding: Users/swa/notes/blah2.txt (stored 0%)
#   adding: Users/swa/notes/blah3.txt (stored 0%)
# Successful backup to /Users/swa/backup/20140329/074122_added_new_examples.zip
```

#### returning multiple values from a function using tuples : 
```python
def get_error_details():
     return (2, 'details')

errnum, errstr = get_error_details()
```

__swapping two variables in python :__
`a, b = b, a`

***

### Object oriented programming (OOP)

```python
class Person:
    pass  # An empty block

p = Person()
print(p)

# output
# $ python oop_simplestclass.py
# <__main__.Person instance at 0x10171f518>

# ---------------------------

class Person:
    def say_hi(self):
        print('Hello, how are you?')

p = Person()
p.say_hi()
# The previous 2 lines can also be written as
# Person().say_hi()

# Difference between methods & functions : 
# 1. Methods are functions that belong to an object (class)
# 2. Methods are called on an object, while functions are called independently
# 3. methods : they must have an extra first name that has to be added to the beginning of the parameter list, 
#   but you do not give a value for this parameter when you call the method, Python will provide it.  it is given the name 'self'

class Person:
    def say_hi(self):
        print('Hello, how are you?')

p = Person()
p.say_hi()
# The previous 2 lines can also be written as
# Person().say_hi()
```

__initialisation__ (constructor) : 
```python
class Person:
    def __init__(self, name):
        self.name = name

    def say_hi(self):
        print('Hello, my name is', self.name)

p = Person('Swaroop')
p.say_hi()
# The previous 2 lines can also be written as
# Person('Swaroop').say_hi()
```

__Demonstration of a class variable, instance variable, instance methods and class methods__ : 
```python
class Robot:
    """Represents a robot, with a name."""

    # A class variable, counting the number of robots
    population = 0

    def __init__(self, name):
        """Initializes the data."""
        self.name = name
        print("(Initializing {})".format(self.name))

        # When this person is created, the robot
        # adds to the population
        Robot.population += 1

    def die(self):
        """I am dying."""
        print("{} is being destroyed!".format(self.name))

        Robot.population -= 1

        if Robot.population == 0:
            print("{} was the last one.".format(self.name))
        else:
            print("There are still {:d} robots working.".format(
                Robot.population))

    def say_hi(self):
        """Greeting by the robot.

        Yeah, they can do that."""
        print("Greetings, my masters call me {}.".format(self.name))

    @classmethod
    def how_many(cls):
        """Prints the current population."""
        print("We have {:d} robots.".format(cls.population))


droid1 = Robot("R2-D2")
droid1.say_hi()
Robot.how_many()

droid2 = Robot("C-3PO")
droid2.say_hi()
Robot.how_many()

print("\nRobots can do some work here.\n")

print("Robots have finished their work. So let's destroy them.")
droid1.die()
droid2.die()

Robot.how_many()
```

__Note__ : 
1. An object variable with the same name as a class variable will hide the class variable!
2. Instead of `Robot.population`, we could have also used `self.__class__.population`
3. __Decorators__ can be imagined to be a shortcut to calling a wrapper function (i.e. a function that "wraps" around another function so that it can do something before or after the inner function), so applying the `@classmethod` decorator is the same as calling: `how_many = classmethod(how_many)`

__How to make members private?__
underscore prefix such as `__privatevar`


#### Inheritance
```python
class SchoolMember:
    '''Represents any school member.'''
    def __init__(self, name, age):
        self.name = name
        self.age = age
        print('(Initialized SchoolMember: {})'.format(self.name))

    def tell(self):
        '''Tell my details.'''
        print('Name:"{}" Age:"{}"'.format(self.name, self.age), end=" ")


class Teacher(SchoolMember):
    '''Represents a teacher.'''
    def __init__(self, name, age, salary):
        SchoolMember.__init__(self, name, age)
        self.salary = salary
        print('(Initialized Teacher: {})'.format(self.name))

    def tell(self):
        SchoolMember.tell(self)
        print('Salary: "{:d}"'.format(self.salary))


class Student(SchoolMember):
    '''Represents a student.'''
    def __init__(self, name, age, marks):
        SchoolMember.__init__(self, name, age)
        self.marks = marks
        print('(Initialized Student: {})'.format(self.name))

    def tell(self):
        SchoolMember.tell(self)
        print('Marks: "{:d}"'.format(self.marks))

t = Teacher('Mrs. Shrividya', 40, 30000)
s = Student('Swaroop', 25, 75)

# prints a blank line
print()

members = [t, s]
for member in members:
    # Works for both Teachers and Students
    member.tell()
```

__Note:__
1. Python does not automatically call the constructor of the parent class, you have to explicitly call it yourself.
2. if we have not defined an __init__ method in a subclass, Python will call the constructor of the base class automatically.
3. Python supports multiple inheritance, meaning that a class can inherit from more than one class. However, this can lead to complexity and ambiguity, so it is generally recommended to use single inheritance or composition instead of multiple inheritance.
4. The `super()` function can be used to call the parent class's methods, which is a cleaner way to call the parent class's methods than using the class name directly.
```python
class Parent:
    def __init__(self):
        print("Parent's constructor called")
class Child(Parent):
    def __init__(self):
        super().__init__()  # Calls Parent's constructor
        print("Child's constructor called")
child = Child()
# output
# Parent's constructor called
# Child's constructor called
```

__palindrome program__:
```python
input = "Rise to vote, sir."

def is_palindrome(input_string):
    special_chars = (" ",",", ".", "!", "$", "?", ":", ";", "'", '"', "-", "_", "(", ")", "[", "]", "{", "}", "<", ">")
    for char in special_chars:
        input_string = input_string.replace(char, "")
    reversed_string = input_string[::-1]
    return reversed_string == input_string

print("yes its palindrome" if is_palindrome(input.lower()) else "no its not palindrome")
```


__File Ops__ : 
```python
poem = '''\
Programming is fun
When the work is done
if you wanna make your work also fun:
    use Python!
'''

# Open for 'w'riting
f = open('poem.txt', 'w')
# Write text to file
f.write(poem)
# Close the file
f.close()

# If no mode is specified,
# 'r'ead mode is assumed by default
f = open('poem.txt')
while True:
    line = f.readline()
    # Zero length indicates EOF
    if len(line) == 0:
        break
    # The `line` already has a newline
    # at the end of each line
    # since it is reading from a file.
    print(line, end='')
# close the file
f.close()
```

#### Pickle :
Python provides a standard module called pickle which you can use to store any plain Python object in a file and then get it back later. This is called storing the object persistently. 
```python
import pickle

# The name of the file where we will store the object
shoplistfile = 'shoplist.data'
# The list of things to buy
shoplist = ['apple', 'mango', 'carrot']

# Write to the file
f = open(shoplistfile, 'wb')
# Dump the object to a file
pickle.dump(shoplist, f)
f.close()

# Destroy the shoplist variable
del shoplist

# Read back from the storage
f = open(shoplistfile, 'rb')
# Load the object from the file
storedlist = pickle.load(f)
print(storedlist)
f.close()
```


#### Unicode and utf-8
1. Python uses unicode to represent characters.
2. We send bytes for communication over network.
3. encoding = converting unicode to bytes
4. utf-8 is one of the encoding technique.
5. __Note__ that we should only use encoding in the open statement when in text mode.

```python
# encoding=utf-8
import io

f = io.open("abc.txt", "wt", encoding="utf-8")
f.write(u"Imagine non-English language here")
f.close()

text = io.open("abc.txt", encoding="utf-8").read()
print(text)
```

#### Exception handling 
__using try-catch__ : 
1. The except clause can handle a __single specified__ error or exception, or a __parenthesized list of errors/exceptions__
2.  using Exception is the safer, more recommended way then bare except.
3. The `else clause` is executed if no exception occurs

```python
try:
    text = input('Enter something --> ')
except EOFError:
    print('Why did you do an EOF on me?')
except KeyboardInterrupt:
    print('You cancelled the operation.')
else:
    print('You entered {}'.format(text))

# Handle all exception
try:
    # risky code goes here
    result = 10 / 0  # just an example that will raise ZeroDivisionError
except Exception as e:
    print("An error occurred:", e)

# ----------------------------------------

# ⚠️ Optional: Using bare except : But this will also catch system-exiting exceptions like KeyboardInterrupt, 
# which is usually not desired.
try:
    # risky code
    risky_thing()
except:
    print("Some error happened")

# ----------------------------------------
# Try-catch with finally : 
try:
    # risky code
    risky_function()
except Exception as e:
    print("Caught exception:", e)
finally:
    print("Cleanup or always-run code here.")
    if f:
        f.close()
```

__why else block is present in try__ : 
1. We should plan our code in such a way, try block should contains only that code which might raise an exception - rest everything can be continued in else block.
2. it exists to keep the try block clean and focused only on risky operations.

```python
try:
    file = open("myfile.txt", "r")  # might raise FileNotFoundError
except FileNotFoundError:
    print("File not found!")
else:
    content = file.read()
    print("File content:", content)
    file.close()
```

__Without else, you'd have to do:__
```python
try:
    file = open("myfile.txt", "r")
    content = file.read()  # Unnecessarily in try block
    print("File content:", content)
    file.close()
except FileNotFoundError:
    print("File not found!")
```

#### Custom Exceptions : 
```python
class ShortInputException(Exception):
    '''A user-defined exception class.'''
    def __init__(self, length, atleast):
        Exception.__init__(self)
        self.length = length
        self.atleast = atleast

try:
    text = input('Enter something --> ')
    if len(text) < 3:
        raise ShortInputException(len(text), 3)
    # Other work can continue as usual here
except EOFError:
    print('Why did you do an EOF on me?')
except ShortInputException as ex:
    print(('ShortInputException: The input was ' +
           '{0} long, expected at least {1}')
          .format(ex.length, ex.atleast))
else:
    print('No exception was raised.')
```


#### The with statement : 
Acquiring a resource in the try block and subsequently releasing the resource in the finally block is a common pattern.
Hence, there is also a with statement that enables this to be done in a clean manner:
```python
# we leave the closing of the file to be done automatically by with 'open'
with open("poem.txt") as f:
    for line in f:
        print(line, end='')
```

***

### Standard library

1. #### sys module
   - `sys.argv` : list of command line arguments passed to the script
   - `sys.exit()` : exit the script with a status code
   - `sys.path` : list of directories where Python looks for modules
   - `sys.version` : get the version of Python being used
   - `sys.platform` : get the platform on which Python is running
   - `sys.modules` : dictionary of loaded modules
   - `sys.getsizeof()` : get the size of an object in bytes
   - `sys.getdefaultencoding()` : get the default encoding used by Python
   - `sys.stdin`, `sys.stdout`, `sys.stderr` : standard input, output, and error streams

2. #### logging module
```python
import os
import platform
import logging

if platform.platform().startswith('Windows'):
    logging_file = os.path.join(os.getenv('HOMEDRIVE'),
                                os.getenv('HOMEPATH'),
                                'test.log')
else:
    logging_file = os.path.join(os.getenv('HOME'),
                                'test.log')

print("Logging to", logging_file)

logging.basicConfig(
    level=logging.DEBUG,
    format='%(asctime)s : %(levelname)s : %(message)s',
    filename=logging_file,
    filemode='w',
)

logging.debug("Start of the program")
logging.info("Doing something")
logging.warning("Dying now")
```

Logging levels in python : 
| Level Name | Numeric Value |
| ---------- | ------------- |
| `DEBUG`    | 10            |
| `INFO`     | 20            |
| `WARNING`  | 30            |
| `ERROR`    | 40            |
| `CRITICAL` | 50            |

__NOTE__: 
1. The reason to use a special function (`os.path.join`) rather than just adding the strings together is because this function will ensure the full location matches the format expected by the operating system. 
2. the `join()` method we use here that's part of the os module is different from the string method `join()` that we've used elsewhere in this book.

***

#### Special methods
1. `__init__(self, ...)` : This method is called just before the newly created object is returned for usage.
2. `__del__(self)` : Called just before the object is destroyed (which has unpredictable timing, so avoid using this)
3. `__str__(self)` : Called when we use the print function or when str() is used.
4. `__lt__(self, other)` : Called when we use the less than operator (<) to compare two objects.
5. `__getitem__(self, key)` : Called when we use the square brackets ([]) to access an item in a collection.
6. `__len__(self)` : Called when we use the len() function to get the length of an object.

__Simple demonstration__ of `__getitem__` : 
```python
class MyClass:
    def __init__(self):
        self.data = [10, 20, 30]

obj = MyClass()
print(obj[0])  # ❌ TypeError: 'MyClass' object is not subscriptable
# Python doesn't know what to do when you say obj[0].

# --------------------------------------------------------
# With __getitem__:

class MyClass:
    def __init__(self):
        self.data = [10, 20, 30]
    
    def __getitem__(self, key):
        return self.data[key]  # delegate to internal list

obj = MyClass()
print(obj[0])  # ✅ Output: 10
```

__Single Statement Blocks__ : `if flag: print('Yes')`

*** 
#### Lambda  : 
1. Its way to define an anonymous function
2. __Use-case__: when you need a quick throwaway function (especially for sorting, filtering, etc.).
3. example : `key=lambda w: len(w)` : read it like this : key is a variable, which holds a lambda function. that lambda function takes a parameter called 'w' and returns the length of that parameter.

```python
f = lambda x: x * 2
print(f(5))  # Output: 10

# its same as
def f(x):
    return x * 2
```

__lambda as a callback__ : 
```python
def greet(callback):
    print("Hello!")
    callback()

greet(lambda: print("This is a callback"))
# Output:
# Hello!
# This is a callback
```

__lambda for sorting__ : 
example-1 : sort by score by passing list of tuples :
```python
students = [
    ("Alice", 88),
    ("Bob", 75),
    ("Charlie", 95),
]

students.sort(key=lambda x: x[1])
print(students)
# [('Bob', 75), ('Alice', 88), ('Charlie', 95)]

# ----------------------------

# without lambda, it would hav looked like this :
def get_score(student):
    return student[1]

students = [
    ("Alice", 88),
    ("Bob", 75),
    ("Charlie", 95),
]

students.sort(key=get_score)
print(students)
```

example-2 : Sorting words by string length
```python
words = ["apple", "banana", "kiwi", "fig", "grapefruit"]

sorted_words = sorted(words, key=lambda w: len(w))
print(sorted_words)
# ['fig', 'kiwi', 'apple', 'banana', 'grapefruit']

# ----------------------------

# without lambda, it would hav looked like this :
def get_length(word):
    return len(word)

words = ["apple", "banana", "kiwi", "fig", "grapefruit"]

sorted_words = sorted(words, key=get_length)
print(sorted_words)
```

***

#### List comprehensions : 
1. similar to `map() + filter()` in Javascript.

| Concept            | JavaScript             | Python                             |
| ------------------ | ---------------------- | ---------------------------------- |
| Transform (map)    | `array.map()`          | `[x for x in iterable]`            |
| Filter             | `array.filter()`       | `[x for x in iterable if cond]`    |
| Map + Filter combo | `array.filter().map()` | `[f(x) for x in iterable if cond]` |

__Example 1: Square all even numbers from a list__
```python
nums = [1, 2, 3, 4, 5]
result = [n * n for n in nums if n % 2 == 0]
print(result)  # [4, 16]
```

__Example 2 : Just map (double all elements)__
```python
nums = [1, 2, 3]
doubled = [n * 2 for n in nums]
print(doubled)  # [2, 4, 6]
```

__Example 3: Just filter (keep only positive numbers)__
```python
nums = [-2, 5, -1, 0, 3]
positive = [n for n in nums if n > 0]
print(positive)  # [5, 3]

# ----------------------------
# One more example : 

users = [
    {"name": "Alice", "age": 25, "active": True},
    {"name": "Bob", "age": 17, "active": True},
    {"name": "Charlie", "age": 30, "active": False},
    {"name": "David", "age": 22, "active": True}
]
result = [user["name"].upper() for user in users if user["active"] and user["age"] > 18]
print(result)  # ['ALICE', 'DAVID']

# user["name"].upper() → that's the f(x) (transformation logic)
# if user["active"] and user["age"] > 18 → that's the filter condition

# ----------------------------

# another example : 
nums = [1, 2, 3, 4, 5, 6]
result = [str(n * n) for n in nums if n % 2 == 0]
print(result)  # ['4', '16', '36']
```

__Receiving Tuples and Dictionaries in Functions__ (_already covered previously_)
```python
def powersum(power, *args):
    '''Return the sum of each argument raised the specified power.'''
    total = 0
    for i in args:
        total += pow(i, power)
    return total

powersum(2, 3, 4) # output : 25
powersum(2, 10) # output : 100
```
__NOTE__ : We use `**args` to accept a variable number of keyword arguments, which are passed as a dictionary. This allows us to handle named parameters flexibly.

```python
def powersum(power, **kwargs):
    '''Return the sum of each argument raised the specified power.'''
    total = 0
    for key, value in kwargs.items():
        total += pow(value, power)
    return total
print(powersum(2, a=3, b=4))  # output : 25
```

__The assert statement__ : 
```python
mylist = ['item']
assert len(mylist) >= 1
mylist.pop() # 'item'
assert len(mylist) >= 1

# Traceback (most recent call last):
#   File "<stdin>", line 1, in <module>
# AssertionError
```
***

### Decorators

__case-1__ : decorators without parameters

```python
from time import sleep
from functools import wraps
import logging
logging.basicConfig()
log = logging.getLogger("retry")


def retry(f):
    @wraps(f)
    def wrapper_function(*args, **kwargs):
        MAX_ATTEMPTS = 5
        for attempt in range(1, MAX_ATTEMPTS + 1):
            try:
                return f(*args, **kwargs)
            except Exception:
                log.exception("Attempt %s/%s failed : %s",
                              attempt,
                              MAX_ATTEMPTS,
                              (args, kwargs))
                sleep(10 * attempt)
        log.critical("All %s attempts failed : %s",
                     MAX_ATTEMPTS,
                     (args, kwargs))
    return wrapper_function


counter = 0


@retry
def save_to_database(arg):
    print("Write to a database or make a network call or etc.")
    print("This will be automatically retried if exception is thrown.")
    global counter
    counter += 1
    # This will throw an exception in the first call
    # And will work fine in the second call (i.e. a retry)
    if counter < 2:
        raise ValueError(arg)


if __name__ == '__main__':
    save_to_database("Some bad value")
```

explanaition : 
1. here, `retry()` methods takes in a function `f` and wraps it in another function and returns that wrapper function. 
2. The wrapper function will retry the original function `f` up to 5 times if it raises an exception. 
3. If all attempts fail, it logs a critical error message.

__Q1__ : Why is the wrapper signature `*args`, `**kwargs` when the decorated function(`save_to_database`) takes only one argument ?
__Answer__ : 
Even though save_to_database(arg) accepts a single argument, the decorator is written generically to handle any function, regardless of how many arguments it takes.

example : 
```python
@retry
def say_hello(name, greeting="Hello"):
    print(f"{greeting}, {name}!")
```
***
__case-2__ : decorators with parameters (this is a __decorator factory__).
```python
import logging
from time import sleep
from functools import wraps
import random

logging.basicConfig(level=logging.INFO)
log = logging.getLogger("retry")

def retry(max_attempts=3, delay=2):
    def decorator(func):
        @wraps(func)
        def wrapper(*args, **kwargs):
            for attempt in range(1, max_attempts + 1):
                try:
                    return func(*args, **kwargs)
                except Exception as e:
                    log.warning(f"Attempt {attempt}/{max_attempts} failed: {e}")
                    if attempt < max_attempts:
                        sleep(delay * attempt)
                    else:
                        log.error("All attempts failed.")
                        raise
        return wrapper
    return decorator


@retry(max_attempts=5, delay=1)
def fetch_data_from_api(url):
    if random.random() < 0.7:
        raise ConnectionError("Failed to connect!")
    return f"Success from {url}"


if __name__ == '__main__':
    print(fetch_data_from_api("https://example.com"))
```

__Followup__ : Comparing case-1 and case-2, 
1. why there are two nested functions in case-2 and three nested functions in case-1?

__Two level nesting__ : This form is used when you don’t need parameters for the decorator itself — you just decorate a function directly.
__Three level nesting__ : This form is used when you want to pass arguments to your decorator — like how many times to retry, or how long to delay, etc

2. then why not do like this :
```python
def retry(func, max_attempts=3, delay=2): 
@wraps(f)
    def wrapper_function(*args, **kwargs):  # Level 2
        ...
        return f(*args, **kwargs)
    return wrapper_function
```
Answer : You'd now face a deeper design problem:

- `retry(max_attempts=3, delay=2)` is executed before `save_to_db()` even enters the picture.
- At that moment, Python has no idea what function is going to be decorated yet.
- What happens when we write :
```python
@retry(max_attempts=3, delay=2)
def save():
    ...
``` 
- Behind the scenes : `save = retry(max_attempts=3, delay=2)(save)` will be called.
- his means that `retry(max_attempts=3, delay=2)` must return a decorator, which is a function that accepts `save`.
- That’s why we need 3 levels.

1. `@retry(max_attempts=3, delay=10)` cannot work with the signature: `def retry(func, max_attempts=3, delay=2):`
2. 🛑 Why `def retry(func, max_attempts=3)` doesn’t work? : That works only when you're using the decorator without parentheses:
3. when python sees  : 
```python
@retry(max_attempts=3, delay=10)
def save_to_db():
    ...
```
It treats `@retry(max_attempts=3, delay=10)` as a decorator factory — a function that returns a decorator. So in reality: python translated it to `save_to_db = retry(max_attempts=3, delay=10)(save_to_db)` : __IT EXPECTES A DECORATOR TO BE RETURNED, NOT A FUNCTION.__


***

Other real world examples of decorators:

1. __logging__ : 
```python
def log_args(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        print(f"Calling {func.__name__} with {args} and {kwargs}")
        return func(*args, **kwargs)
    return wrapper
```
2. __Authentication & Authorization__
```python
def login_required(func):
    @wraps(func)
    def wrapper(user, *args, **kwargs):
        if not user.is_authenticated:
            raise PermissionError("You must be logged in.")
        return func(user, *args, **kwargs)
    return wrapper
```

3. __Timing / Benchmarking__
```python

import time

def timer(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)
        print(f"{func.__name__} took {time.time() - start:.4f}s")
        return result
    return wrapper
```

4. Input validation / caching / rate limiting
    1. Flask/Django route handlers
    2. FastAPI dependencies
    3. Click/argparse command-line tools
    4. Machine Learning: @cache decorators on data loaders

***

#### closures : 
```python
def outer(message):
    def inner():
        print("Message:", message)
    return inner

say_hello = outer("Hello")
say_hello()  # Output: Message: Hello
```

#### function expressions (also known as lambda functions) :
multi parameter lambda function :
```python

# example-1
add = lambda a, b: a + b
print(add(2, 3))  # Output: 5

# example-2
def add_fn(a, b):
    return a + b

add = add_fn  # Function expression-like behavior
print(add(2, 3))
```

#### callback functions : 
```python
def greet(name):
    return f"Hello, {name}!"

def run_callback(cb):
    result = cb("Alice")
    print(result)

run_callback(greet)  # Output: Hello, Alice!
```

***

### Generators

A generator is a special type of function in Python that yields values one at a time instead of returning them all at once.
It uses the `yield` keyword instead of `return`.

1. Lazy evaluation: Generates values on the fly.
2. Saves memory: Doesn’t store the whole result in memory.
3. Stateful: Remembers where it left off between iterations.

__Normal function__ : 
```python
def get_numbers():
    return [1, 2, 3]

print(get_numbers())  # Output: [1, 2, 3]
```
_(This returns all numbers at once in a list.)_

__Generator function:__
```python
# example-1
def gen_numbers():
    yield 1
    yield 2
    yield 3

for num in gen_numbers():
    print(num)

# example-2
def count_up_to(n):
    count = 1
    while count <= n:
        yield count
        count += 1
# usage of example-2
for num in count_up_to(5):
    print(num)
```
_(This yields numbers one at a time — only when needed.)_

__use cases__ : 
1. Processing large data
2. Streaming APIs or logs
3. Infinite sequences

Real world examples : 
1. __Reading large files__
```python
def read_large_file(filename):
    with open(filename) as f:
        for line in f:
            yield line.strip()

for line in read_large_file("bigdata.log"):
    print(line)
```
_(Saves memory by reading one line at a time.)_

2. __Fibonacci sequence generator__
```python
def fibonacci():
    a, b = 0, 1
    while True:
        yield a
        a, b = b, a + b

fib = fibonacci()
for _ in range(10):
    print(next(fib))
```
_(Useful for streaming data or infinite sequences.)_

3. __Paginated API results__ _(Works well when data comes in chunks.)_
```python
def fetch_paginated_data(api_client):
    page = 1
    while True:
        data = api_client.get_page(page)
        if not data:
            break
        yield from data
        page += 1
```

***

### Next function on iterators/generators : `next()`
`next()` is a built-in function used to get the next value from an iterator or generator.

```python
nums = iter([10, 20, 30])
print(next(nums))  # Output: 10
print(next(nums))  # Output: 20
```

#### yield from iterable : 
`yield from iterable` : 
1. It delegates to another iterable or generator — like saying:
2. yield from allows you to flatten nested generators into a single stream. (refer nested generator example below)

> "Hey, yield everything from this other generator or list for me."

```python
def outer():
    yield 1
    yield from [2, 3]
    yield 4

for x in outer():
    print(x)
```

#### Nested generators : 
```python
def inner():
    yield "A"
    yield "B"

def outer():
    yield "Start"
    yield from inner()
    yield "End"

for x in outer():
    print(x)

# output
# Start
# A
# B
# End
```

***

#### Working with python projects : 
```sh
# default python version
python --version #2.7.18
python3 --version #3.9.6

# install pyenv 
brew install pyenv
pyenv install 3.13.0 # install python 3.13.0

# workspace setup
cd workspace
mkdir test-python
cd test-python
pyenv local 3.13.0 # use 3.13.0 for this project(folder)
python -m venv .venv # create virtual environment - this will create a .venv folder and use 3.13.0
source .venv/bin/activate # activate the virtual environment
# inside this folder, even pip uses the one compatible with python 3.13.0
```

__Note__ : 
1. Every Python installation (whether system, pyenv-managed, or within a venv) comes with its own pip (or pip3) executable.
2. When you run pip install <package>, it installs the package into the site-packages directory associated with the Python interpreter that the currently active pip command belongs to.
3. If you have multiple Python versions installed, you can specify which pip to use by calling it directly, e.g., python3.13 -m pip install <package>.

***
####  DEPENDENCY MANAGEMENT

```
# requirements.txt
requests==2.31.0
numpy>=1.26.0,<2.0.0
pandas~=2.2.0
scikit-learn

# install packages
pip install -r requirements.txt
```

***

Modern tools or Project Managers: `Poetry`, `PDM`, `Rye`
They use a single `pyproject.toml` (similar to `package.json` or `pom.xml`)

example usage : 
```toml
#pyproject.toml
[tool.poetry]
name = "my_awesome_project"
version = "0.1.0"
description = "A great project"
authors = ["Your Name <you@example.com>"]

[tool.poetry.dependencies]
python = "^3.10"
requests = "^2.31"
numpy = "^1.26"
pandas = { extras = ["excel"], version = "^2.2.0" } # example with extras
```

__Poetry__: `poetry add requests`, `poetry install,` `poetry run python your_script.py`
__PDM__: `pdm add requests`, `pdm install,` `pdm run python your_script.py`
__Rye__: `rye add requests`, `rye install,` `rye run python your_script.py`

***
#### Using `'uv'` for dependency management

uv does jobs of following : 
1. `pip`: For installing packages.
2. `pip-tools` (or pipdeptree): For resolving dependencies and creating lock files.
3. `venv`: For creating isolated environments.

Installation : 
```sh
curl -LsSf https://astral.sh/uv/install.sh | sh
```

Usage : 
```sh
uv venv #Creating a virtual environment:
source .venv/bin/activate #Activating the virtual environment
uv pip install <package_name>

# installing from requirements.txt
uv pip install -r requirements.txt
# to generate a lock file
uv pip compile requirements.in -o requirements.lock 

# You'd typically put your direct dependencies (e.g., requests, numpy) in requirements.in and uv will resolve all their sub-dependencies and write them to requirements.lock. Then, to install:
uv pip install -r requirements.lock

# Syncing an environment (installing and removing packages to match a lock file):
uv pip sync requirements.lock
```
