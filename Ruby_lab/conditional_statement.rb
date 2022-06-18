#IF STATEMENT
#age = gets.chomp.to_i
# if age >=18
#     puts "you are eligible"
# end


# IF ELSE STATEMENT

# name =gets.chomp
# if name=="vaish"
#     puts "nice name"
# else
#     puts "not nice name"
# end


#else-if statement

# mark =gets.chomp.to_i
# if mark ==  35
#     puts "you are pass"
# elsif mark>36 && mark<90
#     puts"nice mark"
# else 
#     puts "keep it up" 
# end


#ternary statement
# number= gets.chomp.to_i
# a=(number>22?true:false)
# puts a


#unless statement
# a=gets.chomp.to_i
# unless a >=22
#     puts "number less than 22"
# else 
#     puts "number greater than 22"
# end


#case statement

$age=gets.chomp.to_i
case $age
when 0..2
    puts "baby"
when 3..5
    puts "child"
when 6..10
    puts "young"
else 
    puts "adult"
end


#if modifier
$age=gets.chomp.to_i
puts "debug" if $age
