## HTML-CSS concepts/ FAQs

* __inline vs inline-block__\
  __inline__:
  `only padding-left, padding-right, margin-left, margin-right`\
  __inline-block__: `margin, padding, width, height`\
  For inline elements : you cannot set height and width

* what is utf-8 meta tag ?
  ```html
  <!-- coding schema, which translates electronic switch pattern to something meaningful for user -->
  <meta charset="UTF-8" />
  ```

* what is body tag or View port
  ```html
  <body>
      <!-- whatever the user see in browser, technically this is called 'view port' -->
  </body>
  ```

* html structure
  ```html
  <body>
      <header></header>
      <section>
          <article></article>
      </section>
      <aside></aside>
      <footer></footer>
  </body>
  ```

* CSS syntax
  ```
  selector {
    property_name: property_value;
  }
  ```
---
* Display properties
  1. __inline__ (ex: image, span)
  2. __block__ (ex: div)
  3. __inline-block__
  4. __none__
---
* Box Model\
  Box Model : content -> padding -> border -> margin

---

* CSS Selectors
  1. __Element selectors__
     - `p {...}`
     - `a {...}`
     - `header {...}`
     - `div {...}`
     - `section, aside {...}`
     - `[target=_blank]{}`
     - `[contenteditable],[href] {}`
  2. __class selectors__
     - `.someCLassName {...}`
     - `.otherCLassName {...}`
  3. __id selectors__
     - `#someId{...}`
  4. __Attribute selectors__ (select elements based on their attributes)
     - [contenteditable]{...}  `<p contenteditable="true"> some paragraph...</p>`
     - `[src]{...}`
     - `body {...}`
     - `[href]{...}`
     - `[target=_blank]{...}`
  5. __Pseudo classes__ (can select multiple elements on a html page, NEED TO PUT THEM IN SAME ORDER - LVHA)
     - `a:link {color: red}`
     - `a:visited {color: green}`
     - `a:hover {color: yellow}`
     - `a:active {color: blue}`	// can be used interchangabiliy with focus, used for link more often
     - `a:focus {color: orange}`	// can be used interchangabiliy with active, used for form field properties
     - `[type=submit]:hover {...}`	// attribute selector with pseudo selector
     - `type=submit]:active{}`
     - `input:focus {...}`
     - `li:first-child {...}`
     - `li:last-child {...}`
     - `li:nth-child(even) {...}`
     - `li:nth-child(odd) {...}`
     - `tr:nth-child(even) {...}`
     - `tr:nth-child(odd) {...}`
     - `li:nth-child(3) {...}`
     - `li:nth-last-child(10) {...}`
     - `li:nth-child(an+b) {...}`	// ex: li:nth-chlid(3n+2){...} start from 2, color every 3rd element OR (3n+2 : start with second and every third element, after that should be applied with style)
     - `article:only-child {...}`
  6. __pseudo elements__ \(pseudo-class: single colon, pseudo-element :: double colon)
      - `p::first-letter {...}`		// pseudo class has one colon and pseudo element has two colons
     - `p::first-line {...}`		// pseudo class has one colon and pseudo element has two colons
     - `p#first::first-letter{}`
  7. __Nested selectors__
     - `div p` {}		: all p tag inside div - as , nested as possible | All(even nested) p tag under a specific div 
     - `div > p` {}		: all p tag IMMEDIATELY beneath div | Only direct p tag under specific div (not nested)
     - `div ~ p` {}		: all p tags that are sibilings following div | following siblings of a div
     - `div + p` {}		: all p tags that are an immediate sibiling following div | immediate siblings of a div
    ```html
        <style>
        /* every p tag that is within div */
        div p { border: 2px solid red;}
        </style>

        <div>
            <p>hi</p> <!-- WORKS !!! -->
            <div>
                <p>hello</p> <!-- WORKS !!! -->
            </div>
            <p>there !?</p> <!-- WORKS !!! -->
        </div>
        <p>html</p> <!-- THIS DOES NOT WORK -->
        <p>is</p> <!-- THIS DOES NOT WORK -->
        <p>markup</p> <!-- THIS DOES NOT WORK -->

        <!-- **************************************** -->

        <style>
            /* every IMMEDIATE p tag that is within div */
            div > p { border: 2px solid red;}
        </style>

        <div>
            <p>hi</p> <!-- WORKS !!! -->
            <div>
                <p>hello</p> <!-- THIS DOES NOT WORK -->
            </div>
            <p>there !?</p> <!-- WORKS !!! -->
        </div>
        <p>html</p> <!-- THIS DOES NOT WORK -->
        <p>is</p> <!-- THIS DOES NOT WORK -->
        <p>markup</p> <!-- THIS DOES NOT WORK -->

        <!-- **************************************** -->

        <style>
            /* any p tag that is a sibiling following a div */
            div ~ p { border: 2px solid red;}
        </style>

        <div>
            <p>hi</p> <!-- THIS DOES NOT WORK -->
            <div>
                <p>hello</p> <!-- THIS DOES NOT WORK -->
            </div>
            <p>there !?</p> <!-- THIS DOES NOT WORK -->
        </div>
        <p>html</p> <!-- WORKS !!! -->
        <p>is</p> <!-- WORKS !!! -->
        <article>is</article> <!-- THIS DOES NOT WORK -->
        <p>markup</p> <!-- WORKS !!! -->

        <!-- **************************************** -->

        <style>
            /* any p tag that is that is an immediate sibling following a div */
            div + p { border: 2px solid red;}
        </style>

        <div>
            <p>hi</p> <!-- THIS DOES NOT WORK -->
            <div>
                <p>hello</p> <!-- THIS DOES NOT WORK -->
            </div>
            <p>there !?</p> <!-- THIS DOES NOT WORK -->
        </div>
        <p>html</p> <!-- WORKS !!! -->
        <p>is</p> <!-- THIS DOES NOT WORK -->
        <article>is</article> <!-- THIS DOES NOT WORK -->
        <p>markup</p> <!-- THIS DOES NOT WORK -->
    ```
  8. __compond selectors__
     - `ul#some-id li{...}`    // we have multiple selectors, any list item which is descendent of an unordered list that has the id 'some-id'
     - `ul #some-id` 		    // any element which has 'some-id' and which is a descendent of ul
     - `ul#someId` 			// any ul element which has 'some-id'

* [css order and specificity](https://specificity.keegan.st/)

  | type    | score |
  | ------- |:-----:|
  | id                  | 100 |
  | class               | 10  |
  | elements            | 1   |
  | attribute selectors | 10  |
  | pseudo classes      | 10  |
  | pseudo elements     | 10  |

  __Example__ :
  | type    | score |
  | ------- |:-----|
  | p 										| 1 |
  | .someclass 								| 10 |
  | #anotherId								| 100 |
  | p .cls1 .cls2							| 1 + 10 + 10 |
  | ul#someId li 							| 1 + 100 + 1 |
  | ul#someId li.favourite					| 1 + 100 + 1 + 10 |
  | html body ul#someId li.favourite		| 1 + 1 + 1 + 100 + 1 + 10 |
  | [target=_blank] 						| 10 |

---
* How does order of writing css matters ?\
ordering of declaring in the html does not matter, ORDER OF DECLARATION IN CSS FILE matters

* __Font properties__
  1. font-style
  2. font-variant
  3. font-weight
  4. font-size
  5. font-height
  6. font-family

* __Font family syntax__
  ```css
  font-family: "some specific font familty", sans-serfif, <generic/fallback font>
  ```

* __CSS Units__
  1. px
  2. %
  3. rem
  4. em
  5. vh
  6. vw

* how to know if i can put `<video>` inside an `<article>` ?
  1. refer [Content categories](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/Content_categories)
  2. check for "permitted contents"
  3. ex: google 'permitted contents inside `<article>`'

* Immediate and not immediate children
  ```html
  <div>
      <p>first</p> <!-- immediate children -->
      <p>second</p> <!-- immediate children -->
      <section <p>third</p> <!-- Not an immediate child -->
      </section>
  </div>
  <p>forth</p> <!-- Not animmediate children -->
  <p>fifth</p> <!-- Not animmediate children -->
  ```

* Explain flex direction and axis
  1. if flex-direction is row, primary axis is horizontal, cross axis is perpendicular to primary axis
  2. if flex-direction is column, primary axis is vertical, cross axis is perpendicular to primary axis
  ```javascript
  if flection-direction == row {
    primary axis = row
    cross axis = column
  } else {
    primary axis = column
    cross axis = row
  }

  if primary_axis = row {
    justify_content = horizontal
    align-items = verticle
    align-content = verticle
  }else{
    justify_content = verticle
    align-items = horizontal
    align-content = horizontal
  }
  ```
* More on meta view port:
  ```html
    <!-- 
        width=device-width : set the width of of our view port to the device width
        initial scale represents how are we mapping css pixels to physical pixels/dip,
        if initial scale = 2 : for every 1 of my css pixels, take 2 device independent pixels
    -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  ```

* Types of pixels:
  1. __physical pixel__ : hysically how many pixles are there on screen\
          Ex: when we say Iphone 5's resolution is 1136x640 pixles (i.e., pixel density is 326ppi)\
          It means physically there are 640 pixles width wise and 1136 height wise.
  2. Device independent pixels
  3. CSS pixel

* __Position property__ :

  *(__offset properties__: top, right, bottom and left.)*

  __position__:
  1. static (default)
  2. relative : (relative to themselves or it's parent or the viewport respectively)
    * __relative__ : 
        the element's original space is left behind undisturbed.
        the element is a free soul now. we can give offset properties like top, left, right, bottom
        Basically the element is relative to its original position
    * __absolute__
        the element's original space is NOT left behind. It is pulled out of regular 
        DOM flow and other elements occupies this space as of this element is not there. 
        ('this element' refers to that element which has absolute property)
        the element is a free soul now. we can give offset properties like top, left, right, bottom
        The element's offset properties are relative to its nearest parent which has 'positio: relative' property.
    * __fixed__ :
        same as absolute, but The element's offset properties are relative 
        to the view port.


* How to center elements ?
  ```css
  img {
      /* adding margin and display property will center the element */
      margin: 0 auto;
      display: block;
  }

  /* centering div */
  #selector{
      margin-left: auto; 
      margin-right: auto;
  }

  /* using transform */
  #selector{
      position: absolute;
      width: 1140px;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%); /* translate element into half of its width and of its height up to the left. */
  }
  ```

* clearing floats:
  ```css
  .clearfix:after{
      content: "",
      display: table,
      clear: both
  }
  ```
  ```html
  <style>
      * {
          padding: 0; margin: 0; box-sizing: border-box;
      }
      div{ text-align: center; }
      #container{
          height: 100vh; font-size: 2rem;
      }
      #left{
          width: 70%; background: cornsilk; height: 35rem; float: left;
      }
      #right{
          width: 30%; float: left; background: lightsteelblue; height: 35rem;
      }
      #bottom{
          width: 100%; height: 15rem; background: lightcyan;
      }
      .clearfix:after{
          content: ''; display: table; clear: both;
      }
  </style>
  <body>
      <div id='container'>
          <div id='left'>
              Left
          </div>
          <div id='right'>
              Side
          </div>
          <div class='clearfix'></div>
          <div id='bottom'>bottom</div>
      </div>
  </body>
  ```

* __Absolute vs relative__:\
  Elements with absolute position can be positioned anywhere we want inside their parent element

  when making the position of a element as 'absolute', 
make sure its parent element has position as 'relative'

* __Transitions and animations__\
  `transition` : Do it between two points
  `animations` : Do it between two or more points

  ```css
      transition-property: color/font-size/all;
      transition-duration: 500ms; /* How long its going to last */
      transition-timing-function: ease-in-out;
      transition-delay: 1s; /* after how long should it start ?*/
  ```

* __css-animations__\
  Css animations are css properties which we can apply to an element to animate that element
  ```
    // property names
    animation-name: myCustomAnimation
    animation-duration: 500ms
    animation-timing-function: ease
    animation-delay: 300ms
    animation-iteration-count: infinite
    animation-direction: reverse // on alternate iteration,animation will reverse
    animation-fill-mode: forwards // if we stop animation, how do we want it to end up?, ex: forward means fill the screen with how animation ended.
    animation-play-state: running
  ```
  how to use ?
  ```css
    body{
      animation-name: myCustomAnimation
    }
    @keyframes myCustomAnimation{
        0%{
          color: red;
        }
        100%{
          color: green;
        }
    }
  ```
* __transform__\
  [mdn-reference](https://developer.mozilla.org/en-US/docs/Web/CSS/transform)\
  transform property takes a transform function. It is independent of transitions and animations.
  ```css
    img{
      transform:rotate(180deg)
    }
  ```
---

__External Resources:__
1. [HTML Validator](https://validator.w3.org/)
2. [html-css bootcamp](https://docs.google.com/document/d/1aBzcpuPE8iFxtrb9JUDgsNPt1Clr_B4V36pnzHc-KYE/edit) by Todd McLeod
---

__PDF Resources:__
1. [Css Notes from professionals](https://drive.google.com/file/d/1Bq9K5ZiXATqpeEH1VScq9aKeDNLAWwIJ/view?usp=sharing)
2. [Html Notes from professionals](https://drive.google.com/file/d/1y1bhkn0WiuIDtHoZ9wJxR-2JWUGOT8Sf/view?usp=sharing)
---
Credits:
1. [Todd McLeod](https://www.udemy.com/course/html-tutorial/)
