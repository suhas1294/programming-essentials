class Car
  attr_accessor :attribute
  @@class_variable = "Hello"
  @instance_variable = "world"
  # constructor in ruby
  def initialize
    print "Class initialised\n"
  end
  def instance_method
    print "instance\n"
  end
  class << self
    def staticMethod
      print "this is a static method\n"
    end
  end
end
audi = Car.new;
audi.instance_method()
Car.staticMethod
# accessing class variable
p Car.class_variable_get(:@@class_variable)
# accessing instance variable
p Car.instance_variable_get(:@instance_variable)
# attr_accessor is a way to get and set instance variables
audi.attribute = "Mercedes"
p audi.attribute