# ruby map vs each
# each does not returns resultant array where as map does.
require 'pry'

a = [1,2,3,4,5,6,7,8]

b = a.each{|x| x*x}
c = a.map{|x| x*x}

p b #[1, 2, 3, 4, 5, 6, 7, 8]
p c #[1, 4, 9, 16, 25, 36, 49, 64]

# ---------------------------------------------

# Both inject method and reduce method are same
# in below example 100 is an accumulator
inject_result = a.inject(100) {|accumulator, variable| accumulator += variable}
p inject_result

# ---------------------------------------------

# Ruby's select method -  selecting elements from an array based on boolean results
even = a.select{|var| (var%2 == 0)}
p even

# ---------------------------------------------

# Ruby Reject method is opposite of seelct method
odd =  a.reject{|var| (var%2==0)}
p odd

# ---------------------------------------------

# find or detect
# returns the first element for which expressions returns true

find_result = a.find{|var| (var == 2 || var == 5)}
p find_result

# ---------------------------------------------

#String methods
"Hello".length #=> 5
"Hello".size   #=> 5
"".empty?      #=> true
"HELLO".count('L') #=> 2
"Hello".insert(3, "hi5") #=> Helhi5lo
"  Hello  ".strip #=> Hello
"ruby is cool".gsub(/[aeiou]/, "*") #=> "r*by *s c**l"
"information".index(/[abc]/) #=> 6
"auhop"[0,2] #uh
"sunday saturday".include?("Saturday") #true
"ruby programming".start_with? "ruby"
"ruby programming".end_with? "programming"
"rubyguides".each_char { |ch| puts ch }
#upcase, downcase, capitalize, split, reverse, chop, chomp

#Array methods
['a', 'b', 'c'].join # "abc"
['a', 'b', 'c'].join("-") # "a-b-c"


#problem: sort keys of a hash by its length
h = { abc: 'hello', 'another_key' => 123, 4567 => 'third' }
g = h.keys.map{|v| v.to_s}
g = g.sort_by{|c| c.length}

#one line fibonacci
(1..20).inject( [0, 1] ) { | fib | fib << fib.last(2).inject(:+) }

# calling private methods in ruby
class Test
 private
 def method
   p "I am a private method"
 end
end
Test.new.send(:method) #"I am a private method"


def fact(num)
  return 1 if num <= 1
  num * fact(num-1)
end
fact 5

def fib(n)
  return n if n < 2
  fib(n-1) + fib(n-2)
end
fib 10

def rev(str)
  a = str.split("")
  result = ""
  a.reverse_each do |x|
    result = result + x
  end
  return result
end
rev("hello")

def oc(str)
  a = str.chars
  r = {}
  a.each do |x|
    if r.key? (:x)
      p "hh"
    else
      p "jj"
    end
  end
end
oc("hello")


















