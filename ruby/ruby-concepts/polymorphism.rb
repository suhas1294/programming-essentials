class Car
  def start
    p "starting"
  end
end
class Benz < Car
  def start
    p "starting benz"
  end
end
class Maruthi < Car
  def start
    p "starting maruthi"
  end
end
puts "Enter car brand"
car = gets.chomp
c = Car.new
if (car == 'maruthi')

end