puts "enter symbol"
$symbol= gets.chomp
puts "enter first number"
$a=gets.chomp.to_i
puts "enter second number"
$b=gets.chomp.to_i
case $symbol
when "+" 
    puts $a + $b
when "-" 
    puts $a - $b
when "*" 
    puts $a * $b
when "%" 
    puts $a % $b
else 
    puts "please enter values"
end

puts "enter the number"
$i=gets.chomp.to_i
case $i
when (1..100)
    puts "It is cheaper" 
when (101..1000)
    puts "It is moderate"
when (1001..10000)
    puts "It is expensive"
else
    puts "It is very expensive"  
end