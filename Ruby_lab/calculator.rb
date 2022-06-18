# puts "enter name"
# name=gets.chomp

# if name="vaishu"
#     puts "correct"
# elsif name="selva"
#     puts "crt"
# else 
#     puts "incrt"
# end

puts "enter symbol"
symbol = gets.chomp

puts "enter first number"
a = gets.chomp.to_i

puts "enter second number"
b= gets.chomp.to_i

if symbol == "+"
puts a+b  
elsif symbol =="-"
   puts  a-b 
elsif symbol =="*"
   puts a*b
else
   puts  a%b
end