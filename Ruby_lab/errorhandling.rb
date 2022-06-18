# begin
#     number_array = [1,2,3,4,5,6,7]
#     puts number_array[4]
# rescue
#     puts "there was an error"
# else
#     puts "not an error"
# ensure
# puts "Ensure always runs"    
# end

# # Example 2
# begin
# num 10/4
# rescue ZeroDivisionError
# puts "there was an ZeroDivisionError"
# ensure
# puts "Ensure always runs"
# end

# puts "Enter your age"
# age =gets.chomp.to_i

# ages = (age>18) ? "you are eligible for voting" : "you are not eligible"
# puts ages
puts "Enter the activity"
charcter = gets.chomp
unless charcter="hungry"
    puts "continue studying"
else
    puts "you are hungry"
end