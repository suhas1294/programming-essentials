a = "hello"
b = "hello"

p (a.object_id == b.object_id)

v1 = :hello
v2 = :hello
p (v1.object_id == v2.object_id)

foo = "bar"
puts "string #{foo} with object id = #{foo.object_id}"
foo = "bar"
puts "string #{foo} with object id = #{foo.object_id}"


foo = :bar
puts "symbol #{foo} with object id = #{foo.object_id}"
foo = :bar
puts "symbol #{foo} with object id = #{foo.object_id}"

var = {:hello => 1, john: 2}
p var