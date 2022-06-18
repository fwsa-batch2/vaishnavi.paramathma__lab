

# puts "Enter the price number "
# i = gets.chomp.to_i
# if (i<=100)
#     puts "It is cheaper"
# elsif(i>100 && i<1000)
#     puts "It is moderate"
# elsif(i>1000 && i<10000)
#     puts "It is expensive"
# else
#     puts "It is very expensive
#     "
# end

def even?(number)
    
    if (number%2==0)
        puts "true"
    else 
        puts "false"
    end
    number.even?
end 

puts "Enter a number"
user_input = gets.to_i
puts even?(user_input)

=begin
puts "Enter a number"
bb = gets.to_i
puts bb.even?
=end
p "wait 212"
mum= 212
puts even?(mum)