# block example
class ClosureDemo
  def customEven
    a = [1,2,3,4,5,6,7,8]
    a.each{|x| p yield x if x.even?}
  end
end

c = ClosureDemo.new
c.customEven{|i| "#{i} is an even"}

# ***************************
# proc example
square = Proc.new{|x| x**2}
p square.call(9)
p square[9]

def gen_fact (factor)
  return Proc.new {|n| n*factor }
end

class SampleProc
  def sample
    factor2 = gen_fact(2)
    factor4 = gen_fact(4)
    p factor2.call(9)
    p factor4.call(9)
  end
end
sp = SampleProc.new
sp.sample

# ***************************
