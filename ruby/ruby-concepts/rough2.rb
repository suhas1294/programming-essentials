require 'pry'
module Rough
  class Demo
    class << self
      def oc(str)
        a = str.chars
        r = {}
        a.each do |x|
          if (r.key?(x))
            r[x] = r[x] + 1
          else
            r[x] = 1
          end
        end
        return r
      end
      def largestPrime(n)
        upLimit = ""
        downLomit = ""
        n.times{upLimit += "9"}
        (n-1).times{downLomit += "9"}
        result_set = []
        for i in downLomit..upLimit
          if isPrime(i.to_i)
            result_set << i
          end
        end
        return result_set.last
      end

      def isPrime(n)
        count = 0
        for i in (1..(n/2))
          count += 1 if (n%i == 0)
        end
        count == 1 ? (return true) : (return false)
      end

      def printPrimeTill(n)
        result_set = []
        for i in 1..n
          x = 0
          for j in 1..i
            if (i%j == 0)
              x += 1
            end
          end
          if x == 2
            result_set << i
          end
        end
        return result_set
      end
    end
    # inheritance in ruby
    class Car
      def brake
        p "applying brakes"
      end
    end
    class Benz < Car
      def stop
        brake
      end
    end
    b = Benz.new
    b.stop #applying brakes
  end
  t = Demo.oc("username")
  p t
  g = Demo.isPrime(7)
  p g
  f = Demo.largestPrime(4)
  p f
  x = Demo.printPrimeTill(999)
  p x
end