* How to add dependency in node file ?
  ```javascript
    const fs = require('fs');
  ```

* Write file synchonously
  ```javascript
     fs.writeFileSync('<path_to_file_inclusing_file_name>', '<content_of_file>') // writes a file to our hard drive
  ```

* what is REPL
  1. Read user input
  2. evaluate user input
  3. print user input
  4. loop

* Concept of Event-Loop\
  [What the heck is event loop](https://www.youtube.com/watch?v=8aGhZQkoFbQ&vl=en)

* Node js routing
  ```javascript
    const express = require('express');
    const app = express();

    app.use( '/books', (req, res, next) = {
        res.send('<h1>Books page</h1>');
    } );
    app.use( '/users', (req, res, next) = {
        res.send('<h1>User page</h1>');
    } );

    app.listen(3000);
  ```

* Exporting and importing modules in nodejs
  ```javascript
    // 1st way
    const requestHandler = (req, res) => {<buisness_logic>};
    // at the end of the file:
    module.exports = requestHandler;

    // importing:
    const routes = require('./route');
    const server = http.createServer(routes); // its a callback, dont execute function.
    
    
    // 2nd way
    const requestHandler = (req, res) => {<buisness_logic>};
    // at the end of the file:
    module.exports = {
        handler: requestHandler,
        "someText": "some hard coded value"
    };
    
    // importing:
    const routes = require('./route');
    const server = http.createServer(routes.handler); // its a callback, dont execute function.


    // 3rd way:
    module.exports.handler = requestHandler;
    module.exports.someText = "some hard coded value";

    // 4th way:
     exports.handler = requestHandler;
     exports.someText = "some hard coded value";
  ```

* what is differece between a callback function and a event listner
  1. event loop is where all the application code that is inside call back function (NON top level) that gets executed.\
  some part might get offloaded to thread pool.
  2. callback functions: is the functions that are called as soon as some work is finished.
  3. Things like 
     1. our application receiving http request on our server
     2. timer expring
     3. file finishing to read
  4. All these will emit events as soon as they are done and then our event loop will pick them up these events and call the call back functions that are associated with each event.
  5. event loops picks up events each time something important happens then call necessary callbacks that are defined in our code
  6. event loop does the orchestration.
  7. event loop receives events - call theirs call back function and offloads more expensive tasks to OS thread pool

* __Phases in event loop__\
eventloop has a multiple phases - each phase has a callback queue which are the callbacks coming from events that the event loop receives.
  1. 1st phase takes cares of callbacks of expired timeouts (ex: setTimeout() function) call backs in each queue are processed one by one until there are no ones left in the queue.
  2. 2nd  IO calling : io events : networking / file operations
  3. 3rd setImmediate callbacks : used for immediatetly calling after io operations
  4. 4th : closed callbacks.
  5. 5th : nextTick() queue
  6. 6th: other micro tasks queue (for resolved promises)