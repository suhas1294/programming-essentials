require 'pry'
class Post
  attr_accessor :title, :content, :author, :publish_date
  def initialize(title, content, author, publish_date)
    @title = title
    @content = content
    @author = author
    @publish_date = publish_date
  end
  def custom_block
    self.instance_variables.each do |instance_variable|
      stringified_instance_variable_name = instance_variable.to_s.sub('@', '')
      ss = stringified_instance_variable_name + "****"
      yield(stringified_instance_variable_name, self.instance_variable_get(instance_variable), ss)
    end
  end
  # usage of block_given? to avoid LocalJumpError
  def block_inspect
    self.instance_variables.each do |instance_variable|
      stringified_instance_variable_name = instance_variable.to_s.sub('@', '')
      if block_given?
        yield(stringified_instance_variable_name, self.instance_variable_get(instance_variable))
      end
    end
  end
  # much cleaner code :usage of block_given? to avoid LocalJumpError
  def block_inspector
    self.instance_variables.each do |instance_variable|
      stringified_instance_variable_name = instance_variable.to_s.sub('@', '')
      yield(stringified_instance_variable_name, self.instance_variable_get(instance_variable))if block_given?
    end
  end
  def proc_inspect(block)
    self.instance_variables.each do |instance_variable|
      stringified_instance_variable_name = instance_variable.to_s.sub('@', '')
      block.call(stringified_instance_variable_name, self.instance_variable_get(instance_variable))
    end
  end
  def lambda_inspect(lambda)
    self.instance_variables.each do |instance_variable|
      stringified_instance_variable_name = instance_variable.to_s.sub('@', '')
      lambda.call(stringified_instance_variable_name, self.instance_variable_get(instance_variable))
    end
  end
end
post = Post.new("Title", "Content", "Author", "Publish_Date")
#post.custom_block #`block in custom_block': no block given (yield) (LocalJumpError)
post.custom_block do |attribute, value, something|
  puts "#{attribute} = #{value} = #{something}"
end

post.block_inspect do |attribute, value|
  puts "#{attribute} = #{value}"
end

post.block_inspector

print  "***********************************\n"
proc_inspect = Proc.new do |attribute, value|
  puts "#{attribute} = #{value}"
end
post = Post.new("Title", "Content", "Author", "Publish_Date")
post.proc_inspect(proc_inspect)

print  "***********************************\n"
lambda_inspect = lambda do |attribute, value|
  puts "#{attribute} = #{value}"
end
post.lambda_inspect(lambda_inspect)