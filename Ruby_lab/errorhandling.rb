begin
    number_array = [1,2,3,4,5,6,7]
    puts number_array[4]
rescue
    puts "there was an error"
else
    puts "not an error"
ensure
puts "Ensure always runs"    
end

# Example 2
begin
num 10/4
rescue ZeroDivisionError
puts "there was an ZeroDivisionError"
# ensure
# puts "Ensure always runs"
end