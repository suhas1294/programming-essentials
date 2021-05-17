## Concepts & FAQs
* __Diff b/w React and ReactDOM__
  1. Initially React and ReactDOM were the same, but later it was divided.
  2. ReactDOM is used to interact with dom, ReactDOM.findDOMNode() which we can use to gain direct access to a DOM element.
  3. We use React to define and create our elements, for lifecycle hooks.

---
__Note__:
1. Stateless / Dumb / Presentational components ( just receives props and renders them to the page)
2. Stateful / Container components / Smart components
---

* __state vs props__
  1. State is a data structure
  2. It has default value when components mounts
  3. Changes as a result of user events
  4. Props (short for properties) are a Component’s configuration
  5. Props are how components talk to each other
  6. Props are immutable
  7. Props are uni directional - passed from parent to children
  8. callback functions may be passed in as props.

* what is controlled component\
  When a component is being controlled by another component, then it is called controlled component.\
  Ex:  A input component imported in a form component is being controlled by form component callbacks

* Prop types validation in react js
  ```javascript
  // Used for data type validation of props
  // Npm install --save prop-types

    import PropTypes from 'prop-types';
    // Person is class (component) name
    Person.propTypes = {
        propName: PropTypes.string,
        click: PropTypes.func,
        age: PropTypes.number
    }

  ```

* what is __create-react-app__ ?
  1. create-react-app is the official CLI (Command Line Interface) for React to create React apps with no build configuration. (webpack and babel are pre configured)
  2. It also has a build script to bundle JS, CSS, and images for production.

* what is __pure component__ ?
  1.  It handles the shouldComponentUpdate() method for us
  2.  Components on the other hand won't compare (current props, current state) with (next props, next state) out of box.
  ```javascript
      class Person extends Component {
          shouldComponentUpdate(nextProps, nextState) {
              if (nextProps.persons.nameList !== this.props.persons) {
                  return true;
              }
          }
      }
  ```
  3. Here if keep comparing each props and state variables, its not efficient way since we need to evaluate so many conditions. Hence if we Extend PureComponent instead of Component, then we pure component automatically does the job of (shallow) comparison.
  4. If you are checking all the properties of prev and next, then you should use PureComponents.
  5. Pure components is just a normal components that implements shouldComponentUpdate with complete props check

* what is HOC/ __Higher order component__ ?
  1. They are not part of react api, they are just a pattern.
  2. A higher-order component is a function that takes a component and returns a new component
  3. In the return method - you have to either return components wrapped under one parent component or an array of components.
  4. They won’t modify or copy any behavior from their input components
  ```javascript
  // example-1
  const aux = props => props.children

  // example-2
  const withClass = props => (
      <div className={props.classes}> {props.children} </div>
  );
  export default withClass;

  // example-3
  // src/hoc/withClass.js
  export default withClass = (WrappedComponent, className) => {
      return props => {
          <div className={className}>
              <WrappedComponent />
          </div>
      }
   }
    
   // In src/components/App.js:
   import withClass from './../hoc/withClass';
   import classes from 'App.module.css';
   class App extends Component{ }
   export default withClass(App, classes.App);
  ```

* __Redux Life cycle__
  1. entire application state is kept in a single store
  2. store is simply a javascript object
  3. (change state) by (firing actions) and (action logic in reducers)
  4. THUNK: allows us to handle the asynchronous dispatching of actions
  5. THUNK:  inner function receives the store methods dispatch and getState as parameters
  6. __components of redux__:
     1. Action – It’s an object that describes what happened.
     2. Reducer –  It is a place to determine how the state will change.
     3. Store – State/ Object tree of the entire application is saved in the Store.
     4. View – Simply displays the data provided by the Store.

* React Component life-cycle
  1. `constructor()`
     - Receives props, used for initialization
  2. `static getDerivedStateFromProps(props, state)`
     - Should return updated state
     - When props change, use this to update state
  3. `render()`
     - Only after child's life cycles are executed, creation life cycle of this component will be completed
  4. `componentWillMount()`
     - __Deprecated__
  5. `componentDidMoun()t`
     - use it to setState, make http calls.
  6. `shouldComponentUpdate(nextProps, nextState)`
     - returns boolean
     - This helps in cancelling updating process
     - Here you can decide whether or not react should continue evaluating and re-rendering component
     - Mainly used for improving performance.
  7. `getSnapshotBeforeUpdate(preProps, prevState)`
     - Returns a snapshot object which u can call it as freely configure
     - Used for last minute DOM operation
     - Ex: getting current scrolling position of the user.
     - ex: return {scrollPosition: {x: 35, y: 45}}
  8. `componentDidUpdate(prevProp, prevState, snapShot)`
     - snapShot is received from getSnapshotBeforeUpdate
     - ex: snapShot = scrollPosition: {x: 35, y: 45}
  9. `componentWilUpdate()`
     - __Deprecated__

* React-routing : when to use switch ?\
    Even Though several routes are wrapped inside `<div>`, when there are conflicts among paths as to which one to be shown - the first matching route will be executed when <Switch> is used.

* how to set state in class based component ?
    ```javascript
    this.setState((state, props) => {
        return { counter: state.counter + props.increment };
    }, this.someCallBackFunc);
    ```
    With this callback function, we can do what we want immediately after state has been updated.

* view state vs session state
  1. View state: only that page in that particular session (form data)
  2. Session state: all pages in particular session ( authenticated info across pages)

## Important links:
1. [sample practice projects](https://github.com/suhas1294/react-adhoc-projects) 
2. [Redux implementation step by step](https://github.com/suhas1294/react-adhoc-projects/tree/main/redux-todo)
3. [React Hooks](https://github.com/suhas1294/react-quick-reference/tree/main/use-hooks)
4. [React Testing](https://github.com/suhas1294/react-quick-reference/tree/main/testing)

Credits:
1. [Bonnie Schulkin](https://www.udemy.com/course/react-testing-library/)
2. [Maximilian Schwarzmüllerm](https://www.udemy.com/course/react-the-complete-guide-incl-redux/)